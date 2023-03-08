/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hdnit.lotus.domain.entity.corporativo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.envers.NotAudited;
import org.opentravel.ota._2003._05.GuestCountType;
import org.opentravel.ota._2003._05.HotelReservationType;
import org.opentravel.ota2010a.FormattedTextTextType;
import org.opentravel.ota2010a.OTA_HotelResNotifRQ;
import org.opentravel.ota2010a.ResGuestType;
import org.opentravel.ota2010a.RoomStaysType.RoomStay;

import com.belaviagem.www.wsdl.hotelService.Guest;
import com.belaviagem.www.wsdl.hotelService.Room;

import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.domain.entity.enums.StatusReservaEnum;
import br.com.hdnit.lotus.domain.entity.enums.TipoGarantiaEnum;
import br.com.hdnit.lotus.foundation.util.DateUtils;
import br.com.hdnit.lotus.foundation.util.TextUtils;
import br.com.lotus.connector.services.Order;
import br.com.lotus.connector.services.OrderRoom;
import br.com.novaxs.rest.data.Reservation;

/**
 * 
 * @author hdn
 */
@Entity
@Table(name = "reserva")
//@Audited
@XmlRootElement
public class Reserva extends AuditTrail {
	
	 protected static Logger logger = Logger.getLogger(Reserva.class);
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reserva [id=");
		builder.append(id);
		builder.append(", idReservaOriginal=");
		builder.append(idReservaOriginal);
		builder.append(", dataChegada=");
		builder.append(dataChegada);
		builder.append(", dataSaida=");
		builder.append(dataSaida);
		builder.append(", localizador=");
		builder.append(localizador);
		builder.append(", localizadorExtras=");
		builder.append(localizadorExtras);
		builder.append(", uniqueIDParceiro=");
		builder.append(uniqueIDParceiro);
		builder.append(", uniqueIDReservaParceiro=");
		builder.append(uniqueIDReservaParceiro);
		builder.append(", uniqueIDReservaCanal=");
		builder.append(uniqueIDReservaCanal);
		builder.append(", codigoParceiro=");
		builder.append(codigoParceiro);
		builder.append(", nomeParceiro=");
		builder.append(nomeParceiro);
		builder.append(", codigoCanal=");
		builder.append(codigoCanal);
		builder.append(", nomeCanal=");
		builder.append(nomeCanal);
		builder.append(", reservaItens=");
		builder.append(reservaItens);
		builder.append(", tipoGarantia=");
		builder.append(tipoGarantia);
		builder.append(", tpGarantia=");
		builder.append(tpGarantia);
		builder.append(", dataOperacao=");
		builder.append(dataOperacao);
		builder.append(", nomeCliente=");
		builder.append(nomeCliente);
		builder.append(", apelidoCliente=");
		builder.append(apelidoCliente);
		builder.append(", tratamentoCliente=");
		builder.append(tratamentoCliente);
		builder.append(", email=");
		builder.append(email);
		builder.append(", dataModificada=");
		builder.append(dataModificada);
		builder.append("]");
		return builder.toString();
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;
		
	@Column(name = "ID_RESERVA_ORIGINAL", nullable = true)
	private Integer idReservaOriginal;

	/*
	 * CABEÇALHO
	 */

	public Integer getIdReservaOriginal() {
		return idReservaOriginal;
	}

	public void setIdReservaOriginal(Integer idReservaOriginal) {
		this.idReservaOriginal = idReservaOriginal;
	}

	@Column(name = "ID_TRANSACTION", nullable = false)
	private String transactionIdentifier;

	/*
	 * @Column(name = "ID_RESERVA_PMS", nullable = true) private String
	 * idReservaPms;
	 * 
	 * @Column(name = "NUMERO_RESERVA_PMS", nullable = true) private String
	 * numeroReservaPms;
	 */
	@Column(name = "VERSAO", nullable = false)
	private BigDecimal versao;

	@Column(name = "DT_CHEGADA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataChegada;

	@Column(name = "DT_SAIDA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataSaida;

	@Column(name = "LOCALIZADOR", nullable = false)
	private String localizador;

	@Column(name = "LOCALIZADOR_EXTRAS", nullable = false)
	private String localizadorExtras;

	@Column(name = "UNIQUE_ID_PARCEIRO", nullable = false)
	private String uniqueIDParceiro;

	@Column(name = "UNIQUE_RESERVA_PARCEIRO", nullable = false)
	private String uniqueIDReservaParceiro;

	@Column(name = "UNIQUE_RESERVA_CANAL", nullable = false)
	private String uniqueIDReservaCanal;

	@Column(name = "MOEDA_RESERVA", nullable = false)
	private String moedaReserva;

	/*
	 * CLIENTE
	 */

	@Column(name = "CODIGO_PARCEIRO", nullable = false)
	private String codigoParceiro;

	@Column(name = "NOME_PARCEIRO", nullable = false)
	private String nomeParceiro;

	@Column(name = "CODIGO_CANAL", nullable = false)
	private String codigoCanal;

	@Column(name = "NOME_CANAL", nullable = false)
	private String nomeCanal;

	@Column(name = "CODIGO_AGENCIA", nullable = true)
	private String codigoAgencia;

	@Column(name = "NOME_AGENCIA", nullable = true)
	private String nomeAgencia;

	@Column(name = "TIPO_AGENCIA", nullable = true)
	private String tipoAgencia;

	@Column(name = "CODIGO_HOTEL", nullable = false)
	private String codigoHotel;

	@Column(name = "XML", nullable = false, length = 255)
	private String xmlReserva;

	@Column(name = "XML_CANC", nullable = true, length = 255)
	private String xmlCancelamento;

	@Column(name = "XML_CONFIRMA", nullable = true, length = 255)
	private String xmlReservaConfirma;

	/*
	 * @Column(name = "NR_HOSP_ADULTOS", nullable = false) private Integer
	 * numeroHopedes; R
	 * 
	 * @Column(name = "NR_HOSP_MENOR", nullable = false) private Integer
	 * numeroHopedesMenor;
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva", orphanRemoval = true, cascade = {
			javax.persistence.CascadeType.ALL })
	private List<ReservaItem> reservaItens;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reserva", orphanRemoval = true, cascade = {
			javax.persistence.CascadeType.ALL })
	private List<ReservaHospede> reservaHospedes;

	@ManyToOne
	@JoinColumn(name = "ID_PARCEIRO", nullable = true)
	@Fetch(FetchMode.SELECT)
	@NotAudited
	private Parceiro parceiro;

	/**
	 * TARIFA
	 * 
	 */

	@Column(name = "COD_TARIFA", nullable = false)
	private String codigoTarifa;

	@Column(name = "VALOR_TOTAL", nullable = false)
	private String valorTotal;

	@Column(name = "VALOR_BRUTO", nullable = false)
	private String valorBruto;

	@Column(name = "MOEDA_TARIFA", nullable = false)
	private String moedaTarifa;

	@Column(name = "PERCETUAL_IMPOSTO", nullable = true)
	private String percImposto;

	@Column(name = "OUTRO_IMPOSTO", nullable = true)
	private String outroImposto;

	@Column(name = "TIPO_GARANTIA", nullable = false)
	private String tipoGarantia;

	@Column(name = "TIPO_CARTAO", nullable = false)
	private String tipoCartao;

	@Column(name = "NUMERO_CARTAO", nullable = false)
	private String numeroCartao;

	@Column(name = "VALIDADE_CARTAO", nullable = false)
	private String validadeCartao;

	@Column(name = "CV_CARTAO", nullable = false)
	private String codigoVerificacaoCartao;

	@Column(name = "NOME_CARTAO", nullable = false)
	private String nomeCartao;

	@Column(name = "COMP_FATURAMENTO", nullable = true)
	private String companhiaFaturamento;

	@Column(name = "IDENTICADOR_PAGAMENTO", nullable = false)
	private String identificadorPagamento;

	@Column(name = "TIPO_PAGAMENTO", nullable = true)
	private String tipoPagamento;

	@Column(name = "PERC_DEPOSITO", nullable = true)
	private String percentualDeposito;

	@Column(name = "VALOR_CALCAO", nullable = true)
	private String valorCalcao;

	@Column(name = "GARANTIA_RESERVA", nullable = true)
	private String garantiaReserva;

	@Column(name = "TIPO_ACAO", nullable = true)
	private String tipoAcao;

	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = true)
	private StatusReservaEnum status = StatusReservaEnum.SOLICITADA;

	@Enumerated(EnumType.STRING)
	@Column(name = "GARANTIA", nullable = true)
	private TipoGarantiaEnum tpGarantia = TipoGarantiaEnum.NAO_DEFINIDA;

	@Column(name = "DT_OPERACAO", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataOperacao;

	@Column(name = "COMENTARIO", nullable = true, length = 2000)
	private String comentario;
		
	@Column(name = "COD_PROMOCIONAL", nullable = true)
	private String codPromocional;

	@Column(name = "NOME_CLIENTE", nullable = false)
	private String nomeCliente;

	@Column(name = "SOBRE_NOME", nullable = true)
	private String apelidoCliente;

	@Column(name = "TRATAMENTO_CLIENTE", nullable = true)
	private String tratamentoCliente;

	@Column(name = "DOCUMENTO", nullable = true)
	private String documento;

	@Column(name = "EMAIL", nullable = true)
	private String email;

	@Column(name = "TELEFONE", nullable = true)
	private String telefone;

	@Column(name = "DDD", nullable = true)
	private String ddd;
	
	@Column(name = "DT_MODIFICADA", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataModificada;
	
	@Transient
	private ArrayList<Long> idadeCrianca;
	
	@Transient
	private ArrayList<Long> faixaEtariaCriancaDummy;
	
	@Transient
	private String servico;
	
	@Transient
	private String observacao;
	
	// Informacoes B2pay	
	@Transient
	private String bee2payCodigoAutorizacao;
	
	@Transient
	private String bee2payNSU;
	
	@Transient
	private String bee2payIdentificador;
	
	@Transient
	private String bee2payValor;
	
	@Transient
	private String bee2payMoeda;
	
	@Transient
	private String bee2payFornecedor;

	/*
	 * @Column(name = "TIPO_APTO", nullable = false) private String tipoApto;
	 * 
	 * @Column(name = "QTD_APTO", nullable = false) private String qtdApto;
	 * 
	 * @Column(name = "QTD_ADULTOS", nullable = false) private String qtdAdultos;
	 * 
	 * @Column(name = "QTD_CRIANCAS", nullable = false) private String qtdCriancas =
	 * "0";
	 * 
	 * @Column(name = "FUMANTE", nullable = false) private Integer fumante = 0;
	 */
	
	public ArrayList<Long> getFaixaEtariaCriancaDummy() {
		return faixaEtariaCriancaDummy;
	}

	public void setFaixaEtariaCriancaDummy(ArrayList<Long> faixaEtariaCriancaDummy) {
		this.faixaEtariaCriancaDummy = faixaEtariaCriancaDummy;
	}

	public ArrayList<Long> getIdadeCrianca() {
		return idadeCrianca;
	}

	public void setIdadeCrianca(ArrayList<Long> idadeCrianca) {
		this.idadeCrianca = idadeCrianca;
	}
	
	public String getTelefone() {
		return telefone;
	}

	@Transient
	public String getTelefoneCompleto() {
		StringBuffer buffer = new StringBuffer();

		if (ddd != null)
			buffer.append(ddd).append("-");

		if (telefone != null)
			buffer.append(telefone);
		return buffer.toString();
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTransactionIdentifier() {
		return transactionIdentifier;
	}

	public void setTransactionIdentifier(String transactionIdentifier) {
		this.transactionIdentifier = transactionIdentifier;
	}

	public BigDecimal getVersao() {
		return versao;
	}

	public void setVersao(BigDecimal versao) {
		this.versao = versao;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getLocalizador() {
		return localizador;
	}

	public void setLocalizador(String localizador) {
		this.localizador = localizador;
	}

	public String getMoedaReserva() {
		return moedaReserva;
	}

	public void setMoedaReserva(String moedaReserva) {
		this.moedaReserva = moedaReserva;
	}

	public String getCodigoAgencia() {
		return codigoAgencia;
	}

	public void setCodigoAgencia(String codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getTipoAgencia() {
		return tipoAgencia;
	}

	public void setTipoAgencia(String tipoAgencia) {
		this.tipoAgencia = tipoAgencia;
	}

	public String getCodigoTarifa() {
		return codigoTarifa;
	}

	public void setCodigoTarifa(String codigoTarifa) {
		this.codigoTarifa = codigoTarifa;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(String valorBruto) {
		this.valorBruto = valorBruto;
	}

	public String getMoedaTarifa() {
		return moedaTarifa;
	}

	public void setMoedaTarifa(String moedaTarifa) {
		this.moedaTarifa = moedaTarifa;
	}

	public String getPercImposto() {
		return percImposto;
	}

	public void setPercImposto(String percImposto) {
		this.percImposto = percImposto;
	}

	public String getOutroImposto() {
		return outroImposto;
	}

	public void setOutroImposto(String outroImposto) {
		this.outroImposto = outroImposto;
	}

	public String getTipoGarantia() {
		return tipoGarantia;
	}

	public void setTipoGarantia(String tipoGarantia) {
		this.tipoGarantia = tipoGarantia;
	}

	public String getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(String tipoCartao) {
		this.tipoCartao = tipoCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public String getCodigoVerificacaoCartao() {
		return codigoVerificacaoCartao;
	}

	public void setCodigoVerificacaoCartao(String codigoVerificacaoCartao) {
		this.codigoVerificacaoCartao = codigoVerificacaoCartao;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getPercentualDeposito() {
		return percentualDeposito;
	}

	public void setPercentualDeposito(String percentualDeposito) {
		this.percentualDeposito = percentualDeposito;
	}

	public String getValorCalcao() {
		return valorCalcao;
	}

	public void setValorCalcao(String valorCalcao) {
		this.valorCalcao = valorCalcao;
	}

	public String getGarantiaReserva() {
		return garantiaReserva;
	}

	public void setGarantiaReserva(String garantiaReserva) {
		this.garantiaReserva = garantiaReserva;
	}

	public String getTipoAcao() {
		return tipoAcao;
	}

	public void setTipoAcao(String tipoAcao) {
		this.tipoAcao = tipoAcao;
	}

	public Date getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public Date getDataModificada() {
		return dataModificada;
	}

	public void setDataModificada(Date dataModificada) {
		this.dataModificada = dataModificada;
	}
	
	public String getCodPromocional() {
		return codPromocional;
	}

	public void setCodPromocional(String codPromocional) {
		this.codPromocional = codPromocional;
	}
	
	public String getBee2payCodigoAutorizacao() {
		return bee2payCodigoAutorizacao;
	}

	public void setBee2payCodigoAutorizacao(String bee2payCodigoAutorizacao) {
		this.bee2payCodigoAutorizacao = bee2payCodigoAutorizacao;
	}

	public String getBee2payNSU() {
		return bee2payNSU;
	}

	public void setBee2payNSU(String bee2payNSU) {
		this.bee2payNSU = bee2payNSU;
	}

	public String getBee2payIdentificador() {
		return bee2payIdentificador;
	}

	public void setBee2payIdentificador(String bee2payIdentificador) {
		this.bee2payIdentificador = bee2payIdentificador;
	}

	public String getBee2payValor() {
		return bee2payValor;
	}

	public void setBee2payValor(String bee2payValor) {
		this.bee2payValor = bee2payValor;
	}

	public String getBee2payMoeda() {
		return bee2payMoeda;
	}

	public void setBee2payMoeda(String bee2payMoeda) {
		this.bee2payMoeda = bee2payMoeda;
	}

	public String getBee2payFornecedor() {
		return bee2payFornecedor;
	}

	public void setBee2payFornecedor(String bee2payFornecedor) {
		this.bee2payFornecedor = bee2payFornecedor;
	}

	public Reserva() {

	}

	public Reserva(OTA_HotelResNotifRQ rq, Date checkInTime, Date checkOutTime) {

		this.setTransactionIdentifier(rq.getTransactionIdentifier());
		this.setVersao(rq.getVersion());

		String datas[] = rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getTimeSpan()
				.getStart().split("-");

		Calendar c = DateUtils.getInstance().getCalendar();

		c.set(Calendar.YEAR, Integer.parseInt(datas[0]));
		c.set(Calendar.MONTH, Integer.parseInt(datas[1]) - 1);
		c.set(Calendar.DAY_OF_MONTH, Integer.parseInt(datas[2]));

		Calendar cAux = DateUtils.getInstance().getCalendar();

		cAux.setTime(checkInTime);

		c.set(Calendar.HOUR_OF_DAY, cAux.get(Calendar.HOUR_OF_DAY));
		c.set(Calendar.MINUTE, cAux.get(Calendar.MINUTE));
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);

		this.setDataChegada(c.getTime());

		datas = rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getTimeSpan().getEnd()
				.split("-");

		Calendar c1 = DateUtils.getInstance().getCalendar();

		c1.set(Calendar.YEAR, Integer.parseInt(datas[0]));
		c1.set(Calendar.MONTH, Integer.parseInt(datas[1]) - 1);
		c1.set(Calendar.DAY_OF_MONTH, Integer.parseInt(datas[2]));

		cAux = DateUtils.getInstance().getCalendar();

		cAux.setTime(checkOutTime);

		c1.set(Calendar.HOUR_OF_DAY, cAux.get(Calendar.HOUR_OF_DAY));
		c1.set(Calendar.MINUTE, cAux.get(Calendar.MINUTE));
		c1.set(Calendar.SECOND, 0);
		c1.set(Calendar.MILLISECOND, 0);

		this.setDataSaida(c1.getTime());

		this.setLocalizador(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo()
				.getHotelReservationIDs().getHotelReservationID().get(0).getResID_Value());

		this.setMoedaReserva(rq.getPOS().getSource().get(0).getISOCurrency());

		this.setCodigoParceiro(rq.getPOS().getSource().get(0).getBookingChannel().getCompanyName().getCodeContext());

		this.setNomeParceiro(rq.getPOS().getSource().get(0).getBookingChannel().getCompanyName().getCodeContext());

		this.setCodigoCanal(rq.getPOS().getSource().get(0).getBookingChannel().getCompanyName().getCode());
		this.setNomeCanal(rq.getPOS().getSource().get(0).getBookingChannel().getCompanyName().getValue());

		for (ResGuestType resGuest : rq.getHotelReservations().getHotelReservation().get(0).getResGuests()
				.getResGuest()) {
			ReservaHospede rHospede = new ReservaHospede(resGuest);

			if (rHospede.getPrincipal() == 1) {

				this.setNomeCliente(rHospede.getNomeCliente());
				this.setApelidoCliente(rHospede.getApelidoCliente());
				this.setTratamentoCliente(rHospede.getTratamentoCliente());

				this.setDocumento(rHospede.getDocumento());

				this.setEmail(rHospede.getEmail());

				this.setDdd(rHospede.getDdd());

				this.setTelefone(rHospede.getTelefone());

			}

			rHospede.setReserva(this);
			this.getReservaHospedes().add(rHospede);

		}

		this.setCodigoHotel(rq.getHotelReservations().getHotelReservation().get(0).getRoomStays().getRoomStay().get(0)
				.getBasicPropertyInfo().getHotelCode());

		for (RoomStay roomStay : rq.getHotelReservations().getHotelReservation().get(0).getRoomStays().getRoomStay()) {
			ReservaItem reservaItem = new ReservaItem(roomStay);
			reservaItem.setReserva(this);
			this.getReservaItens().add(reservaItem);
		}

		this.setCodigoTarifa(rq.getHotelReservations().getHotelReservation().get(0).getRoomStays().getRoomStay().get(0)
				.getRatePlans().getRatePlan().get(0).getRatePlanCode());

		this.setValorTotal(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getTotal()
				.getAmountAfterTax().toString());

		this.setValorBruto(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getTotal()
				.getAmountBeforeTax().toString());
		this.setMoedaTarifa(
				rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getTotal().getCurrencyCode());
		/*
		 * this.setPercImposto(rq.getHotelReservations().getHotelReservation
		 * ().get(0).getResGlobalInfo().getTotal()
		 * .getTaxes().getTax().get(0).getPercent().toString());
		 */
		// this.setOutroImposto(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getTotal().getTaxes().getTax().get(0).getPercent().toString());
		this.setTipoGarantia(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getGuarantee()
				.getGuaranteeType());
		this.setTipoCartao(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getGuarantee()
				.getGuaranteesAccepted().getGuaranteeAccepted().get(0).getPaymentCard().getCardType());

		this.setNumeroCartao(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getGuarantee()
				.getGuaranteesAccepted().getGuaranteeAccepted().get(0).getPaymentCard().getCardNumber());
		this.setValidadeCartao(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getGuarantee()
				.getGuaranteesAccepted().getGuaranteeAccepted().get(0).getPaymentCard().getExpireDate());
		this.setCodigoVerificacaoCartao(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo()
				.getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().get(0).getPaymentCard().getSeriesCode());
		this.setTipoPagamento(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getGuarantee()
				.getGuaranteesAccepted().getGuaranteeAccepted().get(0).getPaymentCard().getExpireDate());

		this.setNomeCartao(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo().getGuarantee()
				.getGuaranteesAccepted().getGuaranteeAccepted().get(0).getPaymentCard().getCardHolderName());
		this.setIdentificadorPagamento(rq.getHotelReservations().getHotelReservation().get(0).getResGlobalInfo()
				.getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().get(0).getVoucher().getIdentifier());

		this.setDataOperacao(rq.getTimeStamp().toGregorianCalendar().getTime());

		FormattedTextTextType comentarioStr = (FormattedTextTextType) rq.getHotelReservations().getHotelReservation()
				.get(0).getResGlobalInfo().getComments().getComment().get(0).getTextOrImageOrURL().get(0).getValue();

		// String obsClean =
		// comentarioStr.getValue().replaceAll("(\r\n|\r|\n|\n\r)","");
		String obsClean = TextUtils.removerNonAscii(comentarioStr.getValue());
		this.setComentario(obsClean);

	}

	public Reserva(com.belaviagem.www.wsdl.hotelService.Booking booking, Parceiro parceiroParam) {

		super();

		this.setTransactionIdentifier(booking.getId().toString());

		this.setVersao(new BigDecimal("3"));

		this.setUniqueIDParceiro(booking.getId().toString());

		String hour[] = booking.getArrivalTime().toString().split(":");

		Calendar c = DateUtils.getInstance().getCalendar();
		c.setTime(booking.getArrivalDate());
		c.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hour[0]));
		c.set(Calendar.MINUTE, Integer.parseInt(hour[1]));

		Calendar c1 = DateUtils.getInstance().getCalendar();
		c1.setTime(booking.getDepartureDate());

		this.setDataChegada(c.getTime());

		Calendar c2 = DateUtils.getInstance().getCalendar();
		c2.setTime(booking.getDate());

		this.setDataOperacao(c2.getTime());
		this.setDataSaida(c1.getTime());

		this.setLocalizador(booking.getCodReserva());

		// this.setMoedaReserva(rq.getPOS().getSource().get(0).getISOCurrency());

		this.setCodigoParceiro(parceiroParam.getCodParceiro());

		this.setNomeParceiro(parceiroParam.getNomeParceiro());

		this.setCodigoCanal(parceiroParam.getCodParceiro());
		this.setNomeCanal(TextUtils.removerNonAscii(parceiroParam.getNomeParceiro()));
		this.setMoedaReserva("BRL");

		this.setUniqueIDReservaParceiro(booking.getCodReserva());

		this.setUniqueIDReservaCanal(parceiroParam.getCodParceiro());

		for (Room room : booking.getRooms()) {
			for (Guest resGuest : room.getGuests()) {

				ReservaHospede rHospede = new ReservaHospede(resGuest);
				if (rHospede.getNomeCliente() == null) {
					continue;
				}

				rHospede.setReserva(this);

				this.getReservaHospedes().add(rHospede);
			}
		}

		this.setNomeCliente(TextUtils.removerNonAscii(booking.getCustomer().getFullName()));
		this.setApelidoCliente(TextUtils.removerNonAscii(booking.getCustomer().getLastName()));

		this.setDocumento(booking.getCustomer().getCpf());

		this.setEmail(booking.getCustomer().getEmail());

		this.setTelefone(booking.getCustomer().getTelephone());

		this.setCodigoHotel(parceiroParam.getCodigoHotel());

		for (Room roomStay : booking.getRooms()) {
			ReservaItem reservaItem = new ReservaItem(roomStay);
			if (reservaItem.getCodigoHotel() == null) {
				continue;
			}
			reservaItem.setReserva(this);
			this.getReservaItens().add(reservaItem);
		}

		this.setCodigoTarifa("-");
		this.setIdentificadorPagamento("-");
		this.setLocalizadorExtras("-");
		this.setMoedaTarifa("-");
		this.setTipoGarantia("-");
		this.setXmlReserva("-");
		this.setXmlReservaConfirma("-");

		this.setValorTotal(booking.getTotalPrice().toString());

		this.setValorBruto(booking.getRoomsPrice().toString());
		this.setTipoCartao(booking.getPayment().getType());

		this.setNumeroCartao(booking.getPayment().getCcNumber());

		this.setValidadeCartao("-");
		this.setCodigoVerificacaoCartao("-");
		this.setTipoPagamento("-");

		this.setNomeCartao(TextUtils.removerNonAscii(booking.getPayment().getCcName()));

	}

	public static Date toDate(XMLGregorianCalendar calendar) {
		if (calendar == null) {
			return null;
		}
		return calendar.toGregorianCalendar().getTime();
	}

	public Reserva(Order od, Date checkInTime, Date checkOutTime, Double markUp, Parceiro parceiro) {

		this.setTransactionIdentifier("" + od.getId());
		this.setVersao(new BigDecimal("1"));

		this.setUniqueIDParceiro("" + od.getPartnerId());
		// Date data = new Date(od.getArrival().getTimeInMillis());
		Calendar c = DateUtils.getInstance().getCalendar();

		c.setTimeInMillis(od.getArrival().getTimeInMillis());
		c.add(Calendar.DAY_OF_MONTH, 1);
		/*
		 * c.set(Calendar.YEAR, od.getArrival().get(Calendar.YEAR));
		 * c.set(Calendar.MONTH, od.getArrival().get(Calendar.MONTH));
		 * c.set(Calendar.DAY_OF_MONTH, od.getArrival().get(Calendar.DAY_OF_MONTH));
		 */
		Calendar cAux = DateUtils.getInstance().getCalendar();

		cAux.setTime(checkInTime);

		c.set(Calendar.HOUR_OF_DAY, cAux.get(Calendar.HOUR_OF_DAY));
		c.set(Calendar.MINUTE, cAux.get(Calendar.MINUTE));
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		this.setDataChegada(c.getTime());

		Calendar c1 = DateUtils.getInstance().getCalendar();

		c1.setTimeInMillis(od.getDeparture().getTimeInMillis());
		c1.add(Calendar.DAY_OF_MONTH, 1);

		/*
		 * c1.set(Calendar.YEAR, od.getDeparture().get(Calendar.YEAR));
		 * c1.set(Calendar.MONTH, od.getDeparture().get(Calendar.MONTH));
		 * c1.set(Calendar.DAY_OF_MONTH, od.getDeparture().get(Calendar.DAY_OF_MONTH));
		 */
		cAux.setTime(checkOutTime);

		/*
		 * c.set(Calendar.HOUR_OF_DAY, cAux.get(Calendar.HOUR_OF_DAY));
		 * c.set(Calendar.MINUTE, cAux.get(Calendar.MINUTE)); c.set(Calendar.SECOND, 0);
		 * c.set(Calendar.MILLISECOND, 0);
		 */

		c1.set(Calendar.HOUR_OF_DAY, cAux.get(Calendar.HOUR_OF_DAY));
		c1.set(Calendar.MINUTE, cAux.get(Calendar.MINUTE));
		c1.set(Calendar.SECOND, 0);
		c1.set(Calendar.MILLISECOND, 0);
		this.setDataSaida(c1.getTime());

		this.setLocalizador(od.getId() + "");

		this.setUniqueIDReservaParceiro(od.getId() + "");

		this.setUniqueIDReservaCanal("" + od.getCode());

		this.setCodigoHotel("" + od.getHotelId());

		this.setMoedaReserva(od.getCurrency());

		this.setDataOperacao(od.getOrderDate().getTime());

		this.setCodigoParceiro(parceiro.getCodParceiro());
		this.setNomeParceiro(parceiro.getNomeParceiro());

		this.setCodigoCanal(String.valueOf(od.getPartnerId()));
		this.setNomeCanal(TextUtils.removerNonAscii(od.getPartnerName()));

		this.setNomeCliente(TextUtils.removerAcentos(od.getCustomerFirstName()));
		this.setApelidoCliente(TextUtils.removerAcentos(od.getCustomerName()));

		ReservaItem rHospedeCurr = null;
		for (OrderRoom room : od.getRooms()) {
			if (rHospedeCurr != null) {
				if (rHospedeCurr.getIndexApto() != null && room.getSequence() != null
						&& Integer.valueOf(rHospedeCurr.getIndexApto()).intValue() == room.getSequence().intValue()) {
					rHospedeCurr.buildDiarias(room);
				} else {
					rHospedeCurr = addReservaItem(od, room);
		
				}
			} else {
				rHospedeCurr = addReservaItem(od, room);

			}

		}
		
		//HsLatam não informa a idade da criança no xml 
		this.idadeCrianca = null;

		ReservaHospede rHospede = new ReservaHospede();

		rHospede.setNomeCliente(TextUtils.removerAcentos(od.getCustomerFirstName()));
		rHospede.setApelidoCliente(TextUtils.removerAcentos(od.getCustomerName()));
		rHospede.setPrincipal(1);
		rHospede.setAdulto(1);

		this.getReservaHospedes().add(rHospede);

		/*
		 * for (OrderRoom room : od.getRooms()) {
		 * 
		 * ReservaHospede rHospede = new ReservaHospede(room); if
		 * (rHospede.getNomeCliente() == null) { continue; } rHospede.setReserva(this);
		 * 
		 * this.getReservaHospedes().add(rHospede); }
		 */

		this.setEmail(od.getCustomerEmail());

		this.setTelefone(od.getCustomerPhone());

		this.setValorTotal(od.getTotalPrice().toString());

		this.setMoedaTarifa(od.getCurrency());

		this.setDocumento("-");
		this.setCodigoTarifa("-");
		this.setIdentificadorPagamento("-");
		this.setLocalizadorExtras(od.getCode());
		this.setTipoGarantia("-");
		this.setXmlReserva("-");
		this.setXmlReservaConfirma("-");

		this.setValorBruto(od.getTotalPrice().toString());
		this.setTipoPagamento(od.getPaymentType().getValue());

		// this.setTipoCartao(booking.getPayment().getType());
		// this.setNumeroCartao(booking.getPayment().getCcNumber());
		// this.setValidadeCartao("-");
		// this.setCodigoVerificacaoCartao("-");
		// this.setNomeCartao(booking.getPayment().getCcName());

		String comentarioStr = od.getCustomerComments();

		if (comentarioStr.length() > 2000)
			comentarioStr = comentarioStr.substring(0, 1900);

		// String obsClean = comentarioStr.replaceAll("(\r\n|\r|\n|\n\r)","");
		String obsClean = TextUtils.removerNonAscii(comentarioStr);
		this.setComentario(obsClean);

		this.setTipoCartao("-");
		this.setValidadeCartao("-");
		this.setCodigoVerificacaoCartao("-");
		this.setTipoPagamento("-");
		this.setCompanhiaFaturamento("-");

		this.setNumeroCartao("-");

		this.setNomeCartao("-");
		this.setIdentificadorPagamento("-");

	}

	private ReservaItem addReservaItem(Order od, OrderRoom room) {
		ReservaItem rHospedeCurr;
		ReservaItem rHospede;
		rHospede = new ReservaItem(room, od.getHotelId() + "");
		rHospede.setReserva(this);
		rHospedeCurr = rHospede;
		this.getReservaItens().add(rHospede);
		return rHospedeCurr;
	}

	// OMINIBEES
	public Reserva(HotelReservationType rq, Date checkInTime, Date checkOutTime, Double markUp) {
		
		this.setTransactionIdentifier(rq.getUniqueID().get(0).getID());
		this.setVersao(new BigDecimal("3"));

		this.setUniqueIDParceiro(rq.getUniqueID().get(0).getID());

		Calendar c = DateUtils.getInstance().getCalendar();

		c.set(Calendar.YEAR, rq.getRoomStays().getRoomStay().get(0).getTimeSpan().getStart().getYear());
		c.set(Calendar.MONTH, rq.getRoomStays().getRoomStay().get(0).getTimeSpan().getStart().getMonth() - 1);
		c.set(Calendar.DAY_OF_MONTH, rq.getRoomStays().getRoomStay().get(0).getTimeSpan().getStart().getDay());

		Calendar cAux = DateUtils.getInstance().getCalendar();

		cAux.setTime(checkInTime);

		c.set(Calendar.HOUR_OF_DAY, cAux.get(Calendar.HOUR_OF_DAY));
		c.set(Calendar.MINUTE, cAux.get(Calendar.MINUTE));
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);

		this.setDataChegada(c.getTime());

		Calendar c1 = DateUtils.getInstance().getCalendar();

		c1.set(Calendar.YEAR, rq.getRoomStays().getRoomStay().get(0).getTimeSpan().getEnd().getYear());
		c1.set(Calendar.MONTH, rq.getRoomStays().getRoomStay().get(0).getTimeSpan().getEnd().getMonth() - 1);
		c1.set(Calendar.DAY_OF_MONTH, rq.getRoomStays().getRoomStay().get(0).getTimeSpan().getEnd().getDay());

		cAux.setTime(checkOutTime);

		/*
		 * c.set(Calendar.HOUR_OF_DAY, cAux.get(Calendar.HOUR_OF_DAY));
		 * c.set(Calendar.MINUTE, cAux.get(Calendar.MINUTE)); c.set(Calendar.SECOND, 0);
		 * c.set(Calendar.MILLISECOND, 0);
		 */

		c1.set(Calendar.HOUR_OF_DAY, cAux.get(Calendar.HOUR_OF_DAY));
		c1.set(Calendar.MINUTE, cAux.get(Calendar.MINUTE));
		c1.set(Calendar.SECOND, 0);
		c1.set(Calendar.MILLISECOND, 0);

		this.setDataSaida(c1.getTime());
		
		Calendar c3 = Calendar.getInstance();
		c3.set(Calendar.YEAR, rq.getLastModifyDateTime().getYear());
		c3.set(Calendar.MONTH, rq.getLastModifyDateTime().getMonth()-1);
		c3.set(Calendar.DAY_OF_MONTH, rq.getLastModifyDateTime().getDay());
		
		c3.set(Calendar.HOUR_OF_DAY, rq.getLastModifyDateTime().getHour());
		c3.set(Calendar.MINUTE, rq.getLastModifyDateTime().getMinute());
		c3.set(Calendar.SECOND, rq.getLastModifyDateTime().getSecond());
		c3.set(Calendar.MILLISECOND, 0);

		this.setDataModificada(c3.getTime());

		if (rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().size() >= 1) {

			this.setLocalizador(
					rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().get(0).getResIDValue());

			this.setLocalizadorExtras(
					rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().get(1).getResIDValue());

			this.setUniqueIDReservaParceiro(
					rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().get(0).getResIDValue());

			this.setUniqueIDReservaCanal(
					rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().get(1).getResIDValue());

		} else {
			this.setLocalizador(
					rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().get(0).getResIDValue());

		}

		this.setCodigoHotel(rq.getResGlobalInfo().getBasicPropertyInfo().getHotelCode());

		this.setMoedaReserva(rq.getResGlobalInfo().getTotal().getCurrencyCode());

		this.setCodigoParceiro(rq.getPOS().getSource().get(0).getBookingChannel().getCompanyName().getCodeContext());

		this.setNomeParceiro(rq.getPOS().getSource().get(0).getBookingChannel().getCompanyName().getCodeContext());

		this.setCodigoCanal(rq.getPOS().getSource().get(0).getBookingChannel().getCompanyName().getCode());
		this.setNomeCanal(TextUtils
				.removerNonAscii(rq.getPOS().getSource().get(0).getBookingChannel().getCompanyName().getValue()));

		int qtdAdultos = 0;
		int qtdCriancas = 0;
		
		for (org.opentravel.ota._2003._05.ArrayOfRoomStay.RoomStay roomStay : rq.getRoomStays().getRoomStay()) {
			ReservaItem reservaItem = new ReservaItem(roomStay, this.getCodigoHotel());
			this.servico = "";
			if (roomStay.getServiceRPHs() != null) {
				for (int i = 0; i < roomStay.getServiceRPHs().getServiceRPH().size(); i++) {
					if (rq.getServices() != null) {
						for (int j = 0; j < rq.getServices().getService().size(); j++) {
							if (roomStay.getServiceRPHs().getServiceRPH().get(i).getRPH().equals(rq.getServices().getService().get(j).getServiceRPH())) {
								if (rq.getServices().getService().get(j).getPrice() != null) {
									if (rq.getServices().getService().get(j).getPrice().get(0).getTotal() != null) {
										if (rq.getServices().getService().get(j).getPrice().get(0).getTotal().getAmountAfterTax().compareTo((new BigDecimal(0))) > 0) {
											this.servico += TextUtils.removerNonAscii(rq.getServices().getService().get(j).getServiceDetails().getServiceDescription().getText().get(0).getValue().trim()) + 
													" ||" + rq.getServices().getService().get(j).getPrice().get(0).getTotal().getAmountAfterTax().toString() + "||, ";
										} else {
											this.servico += TextUtils.removerNonAscii(rq.getServices().getService().get(j).getServiceDetails().getServiceDescription().getText().get(0).getValue().trim()) + ", ";
										}
									} else {
										this.servico += TextUtils.removerNonAscii(rq.getServices().getService().get(j).getServiceDetails().getServiceDescription().getText().get(0).getValue().trim()) + ", ";
									}
								} else {
									this.servico += TextUtils.removerNonAscii(rq.getServices().getService().get(j).getServiceDetails().getServiceDescription().getText().get(0).getValue().trim()) + ", ";
								}
							}
						}
					}
				}
				
				if (!this.servico.trim().isEmpty()) {
					this.setServico(this.servico.substring(0, this.servico.length()-2));
				}
			}
			
			// Paliativo!
//			if (rq.getResGlobalInfo().getGuestCounts().getGuestCount().size() > 1) {
//			Integer qtdeCriancas = 0;
//				
//				for (int i = 0; i < rq.getResGlobalInfo().getGuestCounts().getGuestCount().size(); i++) {
//					if (rq.getResGlobalInfo().getGuestCounts().getGuestCount().get(i).getAgeQualifyingCode() != null &&
//						(rq.getResGlobalInfo().getGuestCounts().getGuestCount().get(i).getAgeQualifyingCode().equals("8") ||
//						 rq.getResGlobalInfo().getGuestCounts().getGuestCount().get(i).getAgeQualifyingCode().equals("9"))
//						) {
//						qtdeCriancas += rq.getResGlobalInfo().getGuestCounts().getGuestCount().get(i).getCount();
//					}
//				}
			
//			reserva
//			}
			
			reservaItem.setServico(this.servico);
			reservaItem.setReserva(this);
			reservaItem.setMarkUp(markUp);
			this.getReservaItens().add(reservaItem);

		}
		
		// Contar a quantidade de adultos e crianças
		for (int i = 0; i < this.getReservaItens().size(); i++) {
			qtdAdultos += Integer.valueOf(this.getReservaItens().get(i).getQtdAdultos());
			qtdCriancas += Integer.valueOf(this.getReservaItens().get(i).getQtdCriancas());
		}

		if (rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().size() >= 3
				&& rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().get(2)
						.getResIDSource() != null
				&& rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().get(2).getResIDSource()
						.equalsIgnoreCase("PMS")) {
			int x = 0;
			for (int i = 2; i <= rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().size()-1; i++) {
				if (rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().get(i).getResIDSource() != null) {
					if (rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().get(i).getResIDSource().equalsIgnoreCase("PMS")) {
						String idPms = rq.getResGlobalInfo().getHotelReservationIDs().getHotelReservationID().get(i).getResIDValue();
						this.getReservaItens().get(x).setNumeroReservaPms(idPms);
						x++;
					}
				}
			}
		}

		this.idadeCrianca = new ArrayList<Long>();
		
//		logger.info("Qtde de GuestCounts: " + rq.getResGlobalInfo().getGuestCounts().getGuestCount().get(0).getCount());
		
		for (int i = 0; i < rq.getResGlobalInfo().getGuestCounts().getGuestCount().size(); i++) {

			if (rq.getResGlobalInfo().getGuestCounts().getGuestCount().get(i).getAgeQualifyingCode().equals("8")) {
				for (int j = 0; j < rq.getResGlobalInfo().getGuestCounts().getGuestCount().get(i).getCount(); j++) {
					if (rq.getResGlobalInfo().getGuestCounts().getGuestCount().get(i).getAge() != null) {
						Long idade = (long) rq.getResGlobalInfo().getGuestCounts().getGuestCount().get(i).getAge();
						this.idadeCrianca.add(idade);
						logger.info("CHD" + i + ":" + idade);
					}
				}
			}
		}
		
		if (this.idadeCrianca.size() == 0) {
			logger.info("A reserva não possui crianças!");
			this.idadeCrianca = null;
		}
		
		
		int qtdGuestCount = 0;
		boolean inconsistente = false;
		
		// Conta a quantidade de hóspedes da reserva
		int j = 0;
		int indexGuestCount = 0;
		qtdGuestCount = qtdAdultos + qtdCriancas;
		
		logger.info("Total de ResGuest -> " + rq.getResGuests().getResGuest().size() + " - Total de GuestCount -> " + qtdGuestCount);
		
		if (rq.getRoomStays().getRoomStay().size() == 1) {
			for (org.opentravel.ota._2003._05.ResGuestType resGuest : rq.getResGuests().getResGuest()) {
				GuestCountType.GuestCount guestCount = null;
				// Regra para definir o adulto e crianca
				if (rq.getResGuests().getResGuest().size() <= qtdGuestCount) {
					if (rq.getRoomStays().getRoomStay().get(0).getGuestCounts().getGuestCount().get(indexGuestCount).getCount() > j) {
						guestCount = rq.getRoomStays().getRoomStay().get(0).getGuestCounts().getGuestCount().get(indexGuestCount);
						j++;
					} else {
						j = 0;
						indexGuestCount++;
						guestCount = rq.getRoomStays().getRoomStay().get(0).getGuestCounts().getGuestCount().get(indexGuestCount);
					}
				} else {
					inconsistente = true;
					guestCount = rq.getRoomStays().getRoomStay().get(0).getGuestCounts().getGuestCount().get(0);
					logger.info("O XML ESTA APRESENTANDO INCONSISTENCIA NA QUANTIDADE ENTRE RESGUEST E GUESTCOUNT!");
				}

				ReservaHospede rHospede = new ReservaHospede(resGuest, guestCount);
				rHospede.setReserva(this);

				if (rHospede.getPrincipal() == 1) {

					this.setNomeCliente(TextUtils.removerNonAscii(rHospede.getNomeCliente().toUpperCase()));
					
					this.setApelidoCliente(rHospede.getApelidoCliente() == null || rHospede.getApelidoCliente().isEmpty() ? ""	: rHospede.getApelidoCliente().toUpperCase());

					this.setApelidoCliente(TextUtils.removerNonAscii(this.getApelidoCliente()));

					this.setTratamentoCliente(rHospede.getTratamentoCliente());

					this.setDocumento(rHospede.getDocumento());

					this.setTelefone(rHospede.getTelefone());

					this.setEmail(rHospede.getEmail());
				}

				if (inconsistente) {
					if (rHospede.getPrincipal() == 1) {
						this.getReservaHospedes().add(rHospede);
					}
				} else {
					this.getReservaHospedes().add(rHospede);
				}
			}
		} else {
			logger.info("Inserindo reservas múltiplas!");
			boolean encontrouHospedePrincipal = false;

			for (int i = 0; i < rq.getRoomStays().getRoomStay().size(); i++) {
				j = 0;
				indexGuestCount = 0;
				
				String[] arrayResGuestRPHs = rq.getRoomStays().getRoomStay().get(i).getResGuestRPHs().getContent().trim().split(",");
				
				logger.info("RoomStay Index: " + rq.getRoomStays().getRoomStay().get(i).getIndexNumber() + " - resguestRPHs: " + Arrays.toString(arrayResGuestRPHs));
				
				for (org.opentravel.ota._2003._05.ResGuestType resGuest : rq.getResGuests().getResGuest()) {
					GuestCountType.GuestCount guestCount = null;
					
					logger.info("resguestRPH " + resGuest.getResGuestRPH());
					
					for (int k = 0; k < arrayResGuestRPHs.length; k++) {
						
						// Regra para definir o adulto e crianca
						if (rq.getResGuests().getResGuest().size() <= qtdGuestCount) {
							if (arrayResGuestRPHs[k].equals(resGuest.getResGuestRPH())) {
								logger.info("resGuestRPH " + resGuest.getResGuestRPH().toString() + " localizado.");
								
								if (rq.getRoomStays().getRoomStay().get(i).getGuestCounts().getGuestCount().get(indexGuestCount).getCount() > j) {
									guestCount = rq.getRoomStays().getRoomStay().get(i).getGuestCounts().getGuestCount().get(indexGuestCount);
									j++;
								} else {
									j = 0;
									indexGuestCount++;
									guestCount = rq.getRoomStays().getRoomStay().get(i).getGuestCounts().getGuestCount().get(indexGuestCount);
								}
							} else {
								if (resGuest.isPrimaryIndicator() == null) {
									logger.info("PRIMARYINDICATOR NÃO EXISTE!");
								}
								
								// Adicionado p/ continuar procurando o hóspede da reserva
								if (resGuest.isPrimaryIndicator()) {
									ReservaHospede rHospede = new ReservaHospede(resGuest, guestCount);

									this.setNomeCliente(TextUtils.removerNonAscii(rHospede.getNomeCliente().toUpperCase()));
									this.setApelidoCliente(rHospede.getApelidoCliente() == null || rHospede.getApelidoCliente().isEmpty() ? "" : rHospede.getApelidoCliente().toUpperCase());
									this.setApelidoCliente(TextUtils.removerNonAscii(this.getApelidoCliente()));
									this.setTratamentoCliente(rHospede.getTratamentoCliente());
									this.setDocumento(rHospede.getDocumento());
									this.setTelefone(rHospede.getTelefone());
									this.setEmail(rHospede.getEmail());
								}
								continue;
							}
							
						} else {
							inconsistente = true;
							guestCount = rq.getRoomStays().getRoomStay().get(i).getGuestCounts().getGuestCount().get(0);
							logger.info("O XML ESTA APRESENTANDO INCONSISTENCIA NA QUANTIDADE ENTRE RESGUEST E GUESTCOUNT!");
						}
						
						// Hospede principal so pode ser inserido uma vez!
						if (encontrouHospedePrincipal) {
							continue;
						}
						
						ReservaHospede rHospede = new ReservaHospede(resGuest, guestCount);
						rHospede.setReserva(this);
						
						if (rHospede.getPrincipal() == 1) {
							
							this.setNomeCliente(TextUtils.removerNonAscii(rHospede.getNomeCliente().toUpperCase()));
							
							this.setApelidoCliente(rHospede.getApelidoCliente() == null || rHospede.getApelidoCliente().isEmpty() ? "" : rHospede.getApelidoCliente().toUpperCase());
							
							this.setApelidoCliente(TextUtils.removerNonAscii(this.getApelidoCliente()));
							
							this.setTratamentoCliente(rHospede.getTratamentoCliente());
							
							this.setDocumento(rHospede.getDocumento());
							
							this.setTelefone(rHospede.getTelefone());
							
							this.setEmail(rHospede.getEmail());
							
							encontrouHospedePrincipal = true;
						}
						
						if (inconsistente) {
							if (rHospede.getPrincipal() == 1) {
								this.getReservaHospedes().add(rHospede);
							}
						} else {
							this.getReservaHospedes().add(rHospede);
						}
					}
				}
			}
		}
		

		// Valida número de hospedes
		/*
		 * int contadorAdultos = 0; int contadorMenores = 0;
		 * 
		 * for (GuestCountType.GuestCount item :
		 * rq.getResGlobalInfo().getGuestCounts().getGuestCount()) { if
		 * (item.getAgeQualifyingCode().equals("10")) { contadorAdultos =
		 * contadorAdultos + item.getCount(); } else if
		 * (item.getAgeQualifyingCode().equals("8") ||
		 * item.getAgeQualifyingCode().equals("9")) { contadorMenores = contadorMenores
		 * + item.getCount(); } }
		 */
		/*
		 * this.setNumeroHopedes(contadorAdultos);
		 * this.setNumeroHopedesMenor(contadorMenores);
		 */

		/*
		 * this.setTipoApto(this.getReservaItens().get(0).getTipoApto());
		 * this.setQtdApto(this.getReservaItens().get(0).getQtdApto());
		 * this.setFumante(this.getReservaItens().get(0).getFumante());
		 * this.setQtdAdultos(this.getReservaItens().get(0).getQtdAdultos());
		 * this.setQtdCriancas(this.getReservaItens().get(0).getQtdCriancas());
		 */

		if (rq.getRoomStays() != null && rq.getRoomStays().getRoomStay() != null
				&& !rq.getRoomStays().getRoomStay().isEmpty()) {
			this.setCodigoTarifa(
					rq.getRoomStays().getRoomStay().get(0).getRatePlans().getRatePlan().get(0).getRatePlanCode() != null
							&& !rq.getRoomStays().getRoomStay().get(0).getRatePlans().getRatePlan().get(0)
									.getRatePlanCode().isEmpty()
											? rq.getRoomStays().getRoomStay().get(0).getRatePlans().getRatePlan().get(0)
													.getRatePlanCode()
											: "INDEFINIDA");
			
			
			
			if ((rq.getRoomStays().getRoomStay().get(0).getPromotionCode() != null) &&
				(!rq.getRoomStays().getRoomStay().get(0).getPromotionCode().trim().isEmpty())) {
				this.setCodPromocional(TextUtils.removerNonAscii(rq.getRoomStays().getRoomStay().get(0).getPromotionCode().trim()));
			} else {
				this.setCodPromocional("INDEFINIDA");
			}
		} else {
			this.setCodPromocional("INDEFINIDA");
		}

		this.setValorTotal(rq.getResGlobalInfo().getTotal().getAmountAfterTax().toString());

		this.setValorBruto(rq.getResGlobalInfo().getTotal().getAmountBeforeTax().toString());
		this.setMoedaTarifa(rq.getResGlobalInfo().getTotal().getCurrencyCode());

		this.setTipoGarantia("-");
		this.setTipoCartao("-");

		this.setNumeroCartao("-");
		this.setValidadeCartao("-");
		this.setCodigoVerificacaoCartao("-");
		this.setTipoPagamento("-");

		this.setNomeCartao("-");
		this.setIdentificadorPagamento("-");

		// direct bill
		/*
		 * if (rq.getResGlobalInfo().getGuarantee() != null &&
		 * rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted() != null &&
		 * rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().
		 * getGuaranteeAccepted() != null &&
		 * rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().
		 * getGuaranteeAccepted().size() > 0 &&
		 * rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().
		 * getGuaranteeAccepted().get(0) .getDirectBill() != null) {
		 * 
		 * this.setTpGarantia(TipoGarantiaEnum.FATURADA); }
		 */

		String garanteeTypeCode = "0";

		if (rq.getResGlobalInfo().getGuarantee() != null
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted() != null
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted() != null
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().size() > 0) {

			garanteeTypeCode = rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted()
					.get(0).getGuaranteeTypeCode();
		}
		String companyName = "-";

		if (rq.getResGlobalInfo().getGuarantee() != null
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted() != null
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted() != null
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().size() > 0
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().get(0)
						.getDirectBill() != null) {
			companyName = rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().get(0)
					.getDirectBill().getCompanyName().getValue();

		}

		switch (garanteeTypeCode) {

		case "2":

			this.setTpGarantia(TipoGarantiaEnum.FATURADA);

			break;
		case "3":

			this.setTpGarantia(TipoGarantiaEnum.VOUCHER);

			break;
		case "4":
			this.setTpGarantia(TipoGarantiaEnum.PRE_PAGO);

			break;
		case "5":
			this.setTpGarantia(TipoGarantiaEnum.CARTAO);

			break;
		case "8":
			this.setTpGarantia(TipoGarantiaEnum.DEPOSITO);

			break;
		case "28":
			this.setTpGarantia(TipoGarantiaEnum.TRANSFERENCIA);

			break;

		default:
			this.setTpGarantia(TipoGarantiaEnum.NAO_DEFINIDA);

			break;
		}

		this.setCompanhiaFaturamento(companyName);

		if (rq.getResGlobalInfo().getGuarantee() != null
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted() != null
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted() != null
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().size() > 0
				&& rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().get(0)
						.getPaymentCard() != null) {

			String cardName = rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().get(0)
					.getPaymentCard().getCardHolderName();
			cardName = TextUtils.removerNonAscii(cardName);
			String cardNumber = rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted()
					.get(0).getPaymentCard().getCardNumber().getPlainText();
			String cardCode = rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().get(0)
					.getPaymentCard().getSeriesCode().getPlainText();
			String cardType = rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted().get(0)
					.getPaymentCard().getCardCode();
			String expireDate = rq.getResGlobalInfo().getGuarantee().getGuaranteesAccepted().getGuaranteeAccepted()
					.get(0).getPaymentCard().getExpireDate();

			if (cardName.toLowerCase().contains("virtualcard") || cardName.toLowerCase().contains("decolar.com")
					|| cardName.toLowerCase().contains("despegar.com")) {
				this.setTpGarantia(TipoGarantiaEnum.VIRTUAL_CARD);
			} else {
				this.setTpGarantia(TipoGarantiaEnum.CARTAO);
			}

			this.setTipoCartao(cardType);

			this.setNumeroCartao(cardNumber);
			this.setValidadeCartao(expireDate);
			this.setCodigoVerificacaoCartao(cardCode);
			this.setTipoGarantia("-");
			this.setIdentificadorPagamento("-");
			this.setTipoPagamento("-");
			this.setNomeCartao(cardName);

		}

		/* MANTIS 2350 **/
		String codigoCanal = rq.getPOS().getSource().get(0).getBookingChannel().getCompanyName().getCode();

		if (Integer.valueOf(codigoCanal).intValue() == 1) {
			switch (garanteeTypeCode) {
			case "2":
				this.setTpGarantia(TipoGarantiaEnum.MOTOR_RESERVA);
				break;

			default:
				break;
			}
		}
		this.setDataOperacao(rq.getCreateDateTime().toGregorianCalendar().getTime());

		String comentarioStr = "";
		
		if (rq.getResGlobalInfo().getComments() != null) {
			if (rq.getResGlobalInfo().getComments().getComment() != null) {

				for (int i = 0; i < rq.getResGlobalInfo().getComments().getComment().size(); i++) {
					if (rq.getResGlobalInfo().getComments().getComment().get(i).isGuestViewable()) {
						comentarioStr += rq.getResGlobalInfo().getComments().getComment().get(i).getText().get(0).getValue() + ". ";
					}
				}
				
				if (comentarioStr.length() > 2000) {
					comentarioStr = comentarioStr.substring(0, 1900);
				}
				
				String obsClean = comentarioStr.replaceAll("(\r\n|\r|\n|\n\r)","");
				this.setComentario("Comentário: " + obsClean);
			}
		}

//		if (comentarioStr.length() > 2000)
//			comentarioStr = comentarioStr.substring(0, 1900);
//		String obsClean = TextUtils.removerNonAscii(comentarioStr);
//		this.setComentario(obsClean + " - Código Promocional: " + codigoPromocional);
//		this.setCodPromocional("Código Promocional: " + this.getCodigoPromocional());

		if (inconsistente) {
			this.setObservacao("O XML ESTA APRESENTANDO INCONSISTENCIA NA QUANTIDADE ENTRE RESGUEST E GUESTCOUNT!");
		} 
	}

	public TipoGarantiaEnum getTpGarantia() {
		return tpGarantia;
	}

	public void setTpGarantia(TipoGarantiaEnum tpGarantia) {
		this.tpGarantia = tpGarantia;
	}

	public String getCodigoParceiro() {
		return codigoParceiro;
	}

	public void setCodigoParceiro(String codigoParceiro) {
		this.codigoParceiro = codigoParceiro;
	}

	public String getCodigoCanal() {
		return codigoCanal;
	}

	public void setCodigoCanal(String codigoCanal) {
		this.codigoCanal = codigoCanal;
	}

	public String getCodigoHotel() {
		return codigoHotel;
	}

	public void setCodigoHotel(String codigoHotel) {
		this.codigoHotel = codigoHotel;
	}

	public String getNomeCartao() {
		return nomeCartao;
	}

	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}

	public String getIdentificadorPagamento() {
		return identificadorPagamento;
	}

	public void setIdentificadorPagamento(String identificadorPagamento) {
		this.identificadorPagamento = identificadorPagamento;
	}

	public List<ReservaItem> getReservaItens() {
		if (reservaItens == null) {
			reservaItens = new ArrayList<ReservaItem>();
		}
		return reservaItens;
	}

	public void setReservaItens(List<ReservaItem> reservaItens) {
		this.reservaItens = reservaItens;
	}

	public String getNomeCanal() {
		return nomeCanal;
	}

	public void setNomeCanal(String nomeCanal) {
		this.nomeCanal = nomeCanal;
	}

	public String getXmlReserva() {
		return xmlReserva;
	}

	public void setXmlReserva(String xmlReserva) {
		this.xmlReserva = xmlReserva;
	}

	public List<ReservaHospede> getReservaHospedes() {
		if (reservaHospedes == null) {
			reservaHospedes = new ArrayList<ReservaHospede>();
		}
		return reservaHospedes;
	}

	public void setReservaHospedes(List<ReservaHospede> reservaHospedes) {
		this.reservaHospedes = reservaHospedes;
	}

	public String getLocalizadorExtras() {
		return localizadorExtras;
	}

	public void setLocalizadorExtras(String localizadorExtras) {
		this.localizadorExtras = localizadorExtras;
	}

	public String getUniqueIDParceiro() {
		return uniqueIDParceiro;
	}

	public void setUniqueIDParceiro(String uniqueIDParceiro) {
		this.uniqueIDParceiro = uniqueIDParceiro;
	}

	public String getUniqueIDReservaParceiro() {
		return uniqueIDReservaParceiro;
	}

	public void setUniqueIDReservaParceiro(String uniqueIDReservaParceiro) {
		this.uniqueIDReservaParceiro = uniqueIDReservaParceiro;
	}

	public String getUniqueIDReservaCanal() {
		return uniqueIDReservaCanal;
	}

	public void setUniqueIDReservaCanal(String uniqueIDReservaCanal) {
		this.uniqueIDReservaCanal = uniqueIDReservaCanal;
	}

	/*
	 * public String getIdReservaPms() { return idReservaPms; }
	 * 
	 * public void setIdReservaPms(String idReservaPms) { this.idReservaPms =
	 * idReservaPms; }
	 * 
	 * public String getNumeroReservaPms() { return numeroReservaPms; }
	 * 
	 * public void setNumeroReservaPms(String numeroReservaPms) {
	 * this.numeroReservaPms = numeroReservaPms; }
	 */

	public String getXmlReservaConfirma() {
		return xmlReservaConfirma;
	}

	public void setXmlReservaConfirma(String xmlReservaConfirma) {
		this.xmlReservaConfirma = xmlReservaConfirma;
	}

	public String getNomeParceiro() {
		return nomeParceiro;
	}

	public void setNomeParceiro(String nomeParceiro) {
		this.nomeParceiro = nomeParceiro;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getApelidoCliente() {
		return apelidoCliente;
	}

	public void setApelidoCliente(String apelidoCliente) {
		this.apelidoCliente = apelidoCliente;
	}

	public String getTratamentoCliente() {
		return tratamentoCliente;
	}

	public void setTratamentoCliente(String tratamentoCliente) {
		this.tratamentoCliente = tratamentoCliente;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Transient
	public String getHospede() {
		return this.getNomeCliente() + " " + this.getApelidoCliente();
	}

	@NotAudited
	public Parceiro getParceiro() {
		return parceiro;
	}

	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	public StatusReservaEnum getStatus() {
		return status;
	}

	public void setStatus(StatusReservaEnum status) {
		this.status = status;
	}

	public String getXmlCancelamento() {
		return xmlCancelamento;
	}

	public void setXmlCancelamento(String xmlCancelamento) {
		this.xmlCancelamento = xmlCancelamento;
	}

	/**
	 * NOVA XS
	 * 
	 * @throws Exception
	 **/
	public Reserva(Reservation rq, Date checkInTime, Date checkOutTime, Parceiro parceiroParam) throws Exception {
		long time = System.currentTimeMillis();
		this.setTransactionIdentifier(rq.getHotelCode() + time);
		this.setVersao(new BigDecimal("5.1"));

		this.setUniqueIDParceiro(rq.getHotelCode() + time);

		Date dataChegada = DateUtils.getInstance().criaDataComString(rq.getStartDate(), "yyyy-MM-dd");
		Date dataPartida = DateUtils.getInstance().criaDataComString(rq.getEndDate(), "yyyy-MM-dd");
		Date dataOperacao = DateUtils.getInstance().criaDataComString(rq.getCreationDateTime(),
				"yyyy-MM-dd'T'HH:mm:ss");

		this.setDataChegada(dataChegada);

		this.setDataOperacao(dataOperacao);
		this.setDataSaida(dataPartida);

		this.setLocalizador(rq.getReservationIds().getReservationId());

		this.setCodigoParceiro(parceiroParam.getCodParceiro());

		this.setNomeParceiro(parceiroParam.getNomeParceiro());

		this.setCodigoCanal(rq.getBookingAgencyCode());
		this.setNomeCanal(TextUtils.removerNonAscii(rq.getSourceCode()));
		this.setMoedaReserva(rq.getRate().getCurrency());

		this.setUniqueIDReservaParceiro(rq.getReservationIds().getReservationId());

		this.setUniqueIDReservaCanal(parceiroParam.getCodParceiro());
		
		ReservaHospede principal = null;
		for (br.com.novaxs.rest.data.Guest resGuest : rq.getGuests()) {
			ReservaHospede rHospede = new ReservaHospede(resGuest);
			rHospede.setReserva(this);

			this.getReservaHospedes().add(rHospede);

			if (rHospede.getPrincipal().intValue() == 1) {
				principal = rHospede;
			}

		}

		if (principal == null) {
			this.getReservaHospedes().get(0).setPrincipal(1);
			principal = this.getReservaHospedes().get(0);
		}

		this.setNomeCliente(TextUtils.removerNonAscii(principal.getNomeCliente()));
		this.setApelidoCliente(TextUtils.removerNonAscii(principal.getApelidoCliente()));

		this.setDocumento(principal.getDocumento());

		this.setEmail(principal.getEmail());

		this.setTelefone(principal.getTelefone());

		this.setCodigoHotel(parceiroParam.getCodigoHotel());

		ReservaItem reservaItem = new ReservaItem(rq.getRate(), rq.getADT(), rq.getCHD1() + rq.getCHD2(),
				rq.getRoomCode(), rq.getPayments());
		reservaItem.setReserva(this);
		this.getReservaItens().add(reservaItem);

		this.setCodigoTarifa(rq.getRate().getRatePlanCode());
		this.setIdentificadorPagamento("-");
		this.setLocalizadorExtras("-");
		this.setMoedaTarifa(rq.getRate().getCurrency());
		this.setTipoGarantia("-");
		this.setXmlReserva("-");
		this.setXmlReservaConfirma("-");

		this.setValorTotal(String.valueOf(rq.getTotalAmountAfterTax()));

		this.setValorBruto("-");
		this.setTipoCartao("-");
		this.setNomeCartao("-");
		this.setNumeroCartao("-");

		this.setValidadeCartao("-");
		this.setCodigoVerificacaoCartao("-");
		this.setCompanhiaFaturamento("-");

		this.setTipoPagamento("-");

		Object comentarioObj = rq.getAdditionalProperties().get("Comment");

		String comentarioStr = "";
		if (comentarioObj != null && comentarioObj instanceof String) {
			if (((String) comentarioObj).length() > 1000) {
				comentarioStr = ((String) comentarioObj).substring(0, 999);
			} else {
				comentarioStr = ((String) comentarioObj);
			}
		}

		// String obsClean = comentarioStr.replaceAll("(\r\n|\r|\n|\n\r)","");
		// obsClean = obsClean.replaceAll("[^a-zA-Z0-9]", "");
		// System.out.println(obsClean);

		String obsClean = TextUtils.removerNonAscii(comentarioStr);
		this.setComentario(obsClean);

	}

	public String getCompanhiaFaturamento() {
		return companhiaFaturamento;
	}

	public void setCompanhiaFaturamento(String companhiaFaturamento) {
		this.companhiaFaturamento = companhiaFaturamento;
	}

}
