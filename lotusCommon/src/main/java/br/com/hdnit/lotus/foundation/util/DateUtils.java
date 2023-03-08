/*
 * 
 */

package br.com.hdnit.lotus.foundation.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.log4j.Logger;

import br.com.hdnit.lotus.foundation.util.exception.ValidacaoCampoException;

// TODO: Auto-generated Javadoc
/**
 * The Class DateUtils.
 */
public class DateUtils {

	/** The logger. */
	private static Logger logger = Logger.getLogger(DateUtils.class);

	/** The jgreg. */
	public static int JGREG = 15 + 31 * (10 + 12 * 1582);

	/** The halfsecond. */
	public static double HALFSECOND = 0.5;

	/** The Constant FORMAT_ATUALIZACAO_TIMESTAMP. */
	private static final String FORMAT_ATUALIZACAO_TIMESTAMP = "format.atualizacao.timestamp";

	/** The tz. */
	private static TimeZone tz;

	/** The default locale. */
	public static Locale defaultLocale;

	/** The me. */
	private static DateUtils me;

	/** The formata decimal. */
	private static DecimalFormat FORMATA_DECIMAL;

	/**
	 * Gets the single instance of DateUtils.
	 *
	 * @return single instance of DateUtils
	 */
	public static DateUtils getInstance() {
		// TODO Auto-generated method stub
		if (me == null) {
			me = new DateUtils();

			tz = TimeZone.getTimeZone(BundleUtils.getMessage("timeZone"));
			defaultLocale = new Locale("pt", "BR");
			TimeZone.setDefault(tz);
			Locale.setDefault(defaultLocale);

			NumberFormat df = NumberFormat.getCurrencyInstance(Locale.getDefault());

			FORMATA_DECIMAL = (DecimalFormat) df; // new
													// DecimalFormat("#.##0,00",
													// otherSymbols);

		}
		return me;
	}

	/**
	 * Instantiates a new date utils.
	 */
	private DateUtils() {

	}

	/**
	 * Formata decimal.
	 *
	 * @param valor
	 *            the valor
	 * @return the string
	 */
	public String formataDecimal(BigDecimal valor) {
		String strValor = FORMATA_DECIMAL.format(valor);
		return strValor.replace("R$", "").trim();

	}

	/**
	 * Formata big decimal.
	 *
	 * @param valor
	 *            the valor
	 * @return the double
	 */
	public double formataBigDecimal(BigDecimal valor) {
		return valor.doubleValue();
	}

	/**
	 * To data jde.
	 *
	 * @param ymd
	 *            the ymd
	 * @param data
	 *            the data
	 * @return the double
	 */

	public double toDataJDE(int[] ymd, Calendar data) {
		int year = ymd[0];
		int month = ymd[1]; // jan=1, feb=2,...
		int day = ymd[2];
		int julianYear = year;
		if (year < 0)
			julianYear++;
		int julianMonth = month;

		Calendar dataAno = DateUtils.getInstance().getCalendar();
		dataAno.set(Calendar.YEAR, year);
		dataAno.set(Calendar.MONTH, 0);
		dataAno.set(Calendar.DAY_OF_MONTH, 1);

		long diferenca = data.getTimeInMillis() - dataAno.getTimeInMillis();

		long constante = 1000 * 60 * 60 * 24;
		BigDecimal bd = new BigDecimal(diferenca);
		BigDecimal value = bd.divide(new BigDecimal(constante), RoundingMode.UP);

		int anoK = (year - 1900) * 1000 + Double.valueOf(value.doubleValue() + 1).intValue();

		return anoK;

		// if (month > 2) {
		// julianMonth++;
		// } else {
		// julianYear--;
		// julianMonth += 13;
		// }
		//
		// double julian = (java.lang.Math.floor(365.25 * julianYear)
		// + java.lang.Math.floor(30.6001 * julianMonth) + day + 1720995.0);
		// if (day + 31 * (month + 12 * year) >= JGREG) {
		// // change over to Gregorian calendar
		// int ja = (int) (0.01 * julianYear);
		// julian += 2 - ja + (0.25 * ja);
		// }
		// return java.lang.Math.floor(julian - 2343293);
	}

	/**
	 * Calculos jde.
	 *
	 * @param dataSubtraida
	 *            the data subtraida
	 * @return the string
	 */
	public static String calculosJDE(Date dataSubtraida) {

		String dataformatada = DateUtils.getInstance().formatarData(dataSubtraida, "YYYY/MM/dd");
		String spltData[] = dataformatada.split("/");
		int[] ints = new int[spltData.length];
		for (int i = 0; i < spltData.length; i++) {
			ints[i] = Integer.parseInt(spltData[i]);
		}

		Calendar today = DateUtils.getInstance().getCalendar();
		today.setTimeInMillis(dataSubtraida.getTime());

		double dataJDEInicial = DateUtils.getInstance().toDataJDE(new int[] { ints[0], ints[1], ints[2] }, today);
		String dataInicial = String.valueOf(dataJDEInicial);
		String dataInicialSplit[] = dataInicial.split("\\.");

		return dataInicialSplit[0];
	}

	/**
	 * From julian.
	 *
	 * @param injulian
	 *            the injulian
	 * @return the int[]
	 */
	public static int[] fromJulian(double injulian) {
		int jalpha, ja, jb, jc, jd, je, year, month, day;
		injulian = injulian + 2343293;
		double julian = injulian + HALFSECOND / 86400.0;
		ja = (int) julian;
		if (ja >= JGREG) {
			jalpha = (int) (((ja - 1867216) - 0.25) / 36524.25);
			ja = ja + 1 + jalpha - jalpha / 4;
		}

		jb = ja + 1524;
		jc = (int) (6680.0 + ((jb - 2439870) - 122.1) / 365.25);
		jd = 365 * jc + jc / 4;
		je = (int) ((jb - jd) / 30.6001);
		day = jb - jd - (int) (30.6001 * je);
		month = je - 1;
		if (month > 12)
			month = month - 12;
		year = jc - 4715;
		if (month > 2)
			year--;
		if (year <= 0)
			year--;

		return new int[] { year, month, day };
	}

	/**
	 * Soma valor data.
	 *
	 * @param dataParaSoma
	 *            the data para soma
	 * @param valor
	 *            the valor
	 * @param tipoValor
	 *            the tipo valor
	 * @return the date
	 */
	public Date somaValorData(Date dataParaSoma, int valor, int tipoValor) {
		Calendar calendar = getCalendar();
		calendar.setTime(dataParaSoma);

		calendar.add(tipoValor, valor);

		return calendar.getTime();
	}

	/**
	 * Somar hora na data.
	 *
	 * @param dataParaSoma
	 *            the data para soma
	 * @param horaParaSoma
	 *            the hora para soma
	 * @return the date
	 */
	public Date somarHoraNaData(Date dataParaSoma, String horaParaSoma) {
		Calendar calendar = getCalendar();
		calendar.setTime(dataParaSoma);

		Integer hora = new Integer(horaParaSoma.split(":")[0]);
		Integer minuto = new Integer(horaParaSoma.split(":")[1]);
		Integer segundos = new Integer(horaParaSoma.split(":")[2]);

		calendar.add(Calendar.HOUR, hora);
		calendar.add(Calendar.MINUTE, minuto);
		calendar.add(Calendar.SECOND, segundos);

		return calendar.getTime();
	}

	/**
	 * Formatar data.
	 *
	 * @param data
	 *            the data
	 * @param formatoData
	 *            the formato data
	 * @return the string
	 */
	public String formatarData(Date data, String formatoData) {
		Calendar calDataInicial = getCalendar();
		calDataInicial.setTime(data);
		String dataFormatada = "";
		if (data != null) {
			SimpleDateFormat fmt = new SimpleDateFormat(formatoData);
			fmt.setTimeZone(tz);
			dataFormatada = fmt.format(calDataInicial.getTime());
		}
		return dataFormatada;
	}

	/**
	 * Cria data com string.
	 *
	 * @param data
	 *            the data
	 * @param formatoData
	 *            the formato data
	 * @return the date
	 * @throws ValidacaoCampoException
	 *             the validacao campo exception
	 */
	public Date criaDataComString(String data, String formatoData) throws ValidacaoCampoException {
		try {
			SimpleDateFormat fmt = new SimpleDateFormat(formatoData);
			fmt.setTimeZone(tz);
			Date dataConvertida = fmt.parse(data);
			return dataConvertida;
		} catch (ParseException pex) {
			throw new ValidacaoCampoException(BundleUtils.getMessage("aviso.mensagem.campo.data.invalido"));
		}
	}

	/**
	 * Calcula tempo horas entre datas.
	 *
	 * @param dataInicial
	 *            the data inicial
	 * @param dataFinal
	 *            the data final
	 * @return the double
	 */
	public Double calculaTempoHorasEntreDatas(Date dataInicial, Date dataFinal) {

		Calendar calDataInicial = getCalendar();
		calDataInicial.setTime(dataInicial);

		Calendar calDataFinal = getCalendar();
		calDataFinal.setTime(dataFinal);

		Double direfencaHoras = (double) (calDataFinal.getTimeInMillis() - calDataInicial.getTimeInMillis());

		Double diferenca = new Double(direfencaHoras / (1000 * 3600));

		return diferenca;

	}

	/**
	 * Diferenca em minutos.
	 *
	 * @param dataInicial
	 *            the data inicial
	 * @param dataFinal
	 *            the data final
	 * @return the double
	 */
	public double diferencaEmMinutos(Date dataInicial, Date dataFinal) {
		double result = 0;
		long diferenca = dataFinal.getTime() - dataInicial.getTime();
		double diferencaEmMinutos = (diferenca / 1000) / 60; // resultado Ã©
																// diferenÃ§a
																// entre as
																// datas em
																// minutos
		result = diferencaEmMinutos; // transforma os segundos restantes em
										// minutos

		return result;
	}

	/**
	 * Subtrai datas.
	 *
	 * @param dataFinal
	 *            the data final
	 * @param dataInicial
	 *            the data inicial
	 * @return the long
	 */
	public long subtraiDatas(Date dataFinal, Date dataInicial) {
		long tempo = 0;
		if (dataFinal != null && dataInicial != null) {
			tempo = dataFinal.getTime() - dataInicial.getTime();
		}
		return tempo;
	}

	/**
	 * Soma datas.
	 *
	 * @param datas
	 *            the datas
	 * @return the long
	 */
	public long somaDatas(List<Long> datas) {
		long result = 0;
		for (long tempo : datas) {
			result += tempo;
		}
		return result;
	}

	/**
	 * Converte tempo em hms.
	 *
	 * @param tempo
	 *            the tempo
	 * @return the long[]
	 */
	public long[] converteTempoEmHms(long tempo) {
		// array de hora,minuto,segundo
		long[] result = { 0, 0, 0 };

		long secs = (int) tempo / 1000L;
		if (tempo > 0) {
			// calcula nmero de horas, minutos e segundos
			result[0] = secs / 3600;
			secs = secs % 3600;
			result[1] = secs / 60;
			secs = secs % 60;
			result[2] = secs;

		}
		return result;
	}

	/**
	 * Diferenca em horas.
	 *
	 * @param dataInicial
	 *            the data inicial
	 * @param dataFinal
	 *            the data final
	 * @return the double
	 */
	public double diferencaEmHoras(Date dataInicial, Date dataFinal) {
		double diferenca = dataFinal.getTime() - dataInicial.getTime();
		double diferencaEmHoras = (((diferenca / 1000) / 60) / 60); // resultado
																	// da
																	// diferenca
																	// entre as
																	// datas em
																	// horas
		return diferencaEmHoras;
	}

	/**
	 * Diferenca em horas.
	 *
	 * @param dataInicial
	 *            the data inicial
	 * @param dataFinal
	 *            the data final
	 * @return the double
	 */
	public int diferencaEmDias(Date dataInicial, Date dataFinal) {
		double diferenca = dataFinal.getTime() - dataInicial.getTime();
		Double diferencaEmHoras = Math.ceil(((((diferenca / 1000) / 60) / 60) / 24)); // resultado
		// da
		// diferenca
		// entre as
		// datas em
		// horas
		return diferencaEmHoras.intValue();
	}

	/**
	 * Gets the calendar.
	 *
	 * @return the calendar
	 */
	public Calendar getCalendar() {

		Calendar calendar = GregorianCalendar.getInstance(tz);
		return calendar;
	}

	/**
	 * Calcular dias restantes mes.
	 *
	 * @param dataProcessamento
	 *            the data processamento
	 * @return the int
	 */
	public int calcularDiasRestantesMes(Date dataProcessamento) {
		Calendar calstartDate = DateUtils.getInstance().getCalendar();
		calstartDate.setTime(dataProcessamento);
		int numeroDias = calstartDate.getActualMaximum(Calendar.DAY_OF_MONTH);
		int numeroDiaAtual = calstartDate.get(Calendar.DAY_OF_MONTH);

		int qtdDiasFaltantes = numeroDias - numeroDiaAtual;
		return qtdDiasFaltantes;
	}

	/**
	 * Calcular dias ate atual.
	 *
	 * @param dataProcessamento
	 *            the data processamento
	 * @return the int
	 */
	public int calcularDiasAteAtual(Date dataProcessamento) {
		Calendar calstartDate = DateUtils.getInstance().getCalendar();
		calstartDate.setTime(dataProcessamento);
		int numeroDiaAtual = calstartDate.get(Calendar.DAY_OF_MONTH);
		return numeroDiaAtual;
	}

	/**
	 * Recuperar quantidade dias mes.
	 *
	 * @param dataProcessamento
	 *            the data processamento
	 * @return the int
	 */
	public int recuperarQuantidadeDiasMes(Date dataProcessamento) {
		Calendar calstartDate = DateUtils.getInstance().getCalendar();
		calstartDate.setTime(dataProcessamento);
		int numDays = calstartDate.getActualMaximum(Calendar.DAY_OF_MONTH);

		return numDays;
	}

	/**
	 * Gets the dias mes.
	 *
	 * @param dataProcessamento
	 *            the data processamento
	 * @return the dias mes
	 */
	public int getDiasMes(Date dataProcessamento) {
		Calendar calstartDate = DateUtils.getInstance().getCalendar();
		calstartDate.setTime(dataProcessamento);
		int numeroDias = calstartDate.getActualMaximum(Calendar.DAY_OF_MONTH);
		return numeroDias;
	}

	/**
	 * Gets the dif mes.
	 *
	 * @param startDate
	 *            the start date
	 * @param endDate
	 *            the end date
	 * @return the dif mes
	 */
	public int getDifMes(Date startDate, Date endDate) {
		Calendar sDate = DateUtils.getInstance().getCalendar();
		Calendar eDate = DateUtils.getInstance().getCalendar();
		sDate.setTimeInMillis(startDate.getTime());
		eDate.setTimeInMillis(endDate.getTime());
		int difInMonths = sDate.get(Calendar.MONTH) - eDate.get(Calendar.MONTH);
		return difInMonths;
	}

	/**
	 * Gets the dates between.
	 *
	 * @param d1
	 *            the d1
	 * @param d2
	 *            the d2
	 * @return the dates between
	 */
	public List<Date> getDatesBetween(Date d1, Date d2) {
		List<Date> ret = new ArrayList<Date>();
		Calendar c = DateUtils.getInstance().getCalendar();
		c.setTimeInMillis(d1.getTime());
		while (c.getTimeInMillis() <= d2.getTime()) {
			ret.add(c.getTime());
			c.add(Calendar.MONTH, 1);
		}
		return ret;
	}

	public boolean isSameDay(Date data1, Date data2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(data1).equals(sdf.format(data2));
	}

	/**
	 * Converte uma string de uma data em juliano padrao JDE Galvani para um
	 * tipo Date
	 * 
	 * @author Fernando P.
	 * @param dataJuliana
	 * @return dataResult
	 * @throws ParseException
	 */
	public static Date julianaParaDate(String dataJuliana) throws ParseException {
		int dataCalculada;
		Date dataResult;

		dataCalculada = Integer.valueOf(dataJuliana) + 1900000;

		dataJuliana = String.valueOf(dataCalculada);

		dataResult = new SimpleDateFormat("yyyyD").parse(dataJuliana);

		return dataResult;
	}

	/**
	 * Retorna uma data Juliana padrao JDE galvani a partir de um date
	 * 
	 * @author Fernando P.
	 * @param data
	 * @return
	 * @throws ParseException
	 */
	public static String dateParaJuliana(Date data) throws ParseException {
		String result;
		int dataResult;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyDDD");

		String g = sdf.format(data);

		dataResult = Integer.valueOf(g) - 1900000;
		result = String.valueOf(dataResult);

		return result;
	}

	
	
	public static String getDateFormat(long milliseconds) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", new Locale("pt", "BR"));

		Date myDate = new Date(milliseconds);

		String date = sdf.format(myDate);

		return date;
	}

	public static String converteDataSAP(String value) {
		String ano = value.substring(0, 4);
		String mes = value.substring(4, 6);
		String dia = value.substring(6, 8);

		StringBuffer data = new StringBuffer();

		data.append(dia).append("/").append(mes).append("/").append(ano);
		return data.toString();
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		try {

			Date startDate;
			startDate = DateUtils.getInstance().criaDataComString("01/01/2013 00:00", "dd/MM/yyyy HH:mm");

			Date endDate = DateUtils.getInstance().criaDataComString("01/10/2013 23:59", "dd/MM/yyyy HH:mm");

			List<Date> datas = DateUtils.getInstance().getDatesBetween(startDate, endDate);

			System.out.println(datas);
		} catch (ValidacaoCampoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Converte uma stringo no formato yyyy-mm-dd para dd/mm/yyyy @author Marcos
	 * Tozzi @param String @return @throws
	 */
	public String changeFormatMySqlToBrazilFormat(String mysqlformat) {
		String formatoBrasileiro;

		formatoBrasileiro = mysqlformat.substring(8, 10) + "/" + mysqlformat.substring(5, 7) + "/"
				+ mysqlformat.substring(0, 4);

		return formatoBrasileiro;
	}

}
