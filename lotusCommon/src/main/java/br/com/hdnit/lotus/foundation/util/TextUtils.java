/*
 * 
 */
package br.com.hdnit.lotus.foundation.util;

import java.awt.Font;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.ParseException;

import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

// TODO: Auto-generated Javadoc
/**
 * The Class TextUtils.
 */
public class TextUtils {
	
	/**
	 * Gets the codigo formatado.
	 *
	 * @param i_size the i_size
	 * @param i_value the i_value
	 * @return the codigo formatado
	 */

	/**
	 * Metodo que formata um codigo colocando zeros a esquerda
	 * 
	 * @param i_size
	 *            - Quantidade casas do formato
	 * @param i_value
	 *            - Valor a ser formatado
	 */
	public static String getCodigoFormatado(long i_size, long i_value) {
		String formato = "";
		for (int i = 0; i < i_size; i++) {
			formato += "0";
		}

		DecimalFormat fmt = new DecimalFormat(formato);
		return fmt.format(i_value);
	}

	/**
	 * Zeros str.
	 *
	 * @param i_size the i_size
	 * @param i_value the i_value
	 * @return the string
	 */
	public static String zerosStr(long i_size, long i_value) {
		String formato = "";
		for (int i = 0; i < i_size; i++) {
			formato += "0";
		}

		DecimalFormat fmt = new DecimalFormat(formato);
		return fmt.format(i_value);
	}

	/**
	 * Repetir texto.
	 *
	 * @param nrVezesRepeticao the nr vezes repeticao
	 * @param textoRepeticao the texto repeticao
	 * @return the string
	 */
	public static String repetirTexto(long nrVezesRepeticao,
			String textoRepeticao) {
		String textoRepetido = "";
		for (int i = 0; i < nrVezesRepeticao; i++) {
			textoRepetido += textoRepeticao;
		}
		return textoRepetido;
	}

	/**
	 * Removes the caracteres especiais.
	 *
	 * @param valor the valor
	 * @return the string
	 */
	public static String removeCaracteresEspeciais(String valor) {
		String retorno = "";
		for (int i = 0; i < valor.length(); i++) {
			if (!valor.substring(i, i + 1).equals(".")
					&& !valor.substring(i, i + 1).equals("-")
					&& !valor.substring(i, i + 1).equals("/")
					&& !valor.substring(i, i + 1).equals("(")
					&& !valor.substring(i, i + 1).equals(")")
					&& !valor.substring(i, i + 1).equals("_")) {
				retorno += valor.substring(i, i + 1);
			}
		}

		return retorno;
	}

	/**
	 * Calcular quantidade pixel texto.
	 *
	 * @param texto the texto
	 * @param fonteTexto the fonte texto
	 * @return the integer
	 */
	public static Integer calcularQuantidadePixelTexto(String texto,
			Font fonteTexto) {

		// cria um label com um espaco em branco para dimensionar o numero
		// de espacos adicionados entre os itens da escala
		JLabel lblTexto = new JLabel(texto);
		lblTexto.setFont(fonteTexto);

		Integer nrPixelTexto = lblTexto.getFontMetrics(lblTexto.getFont())
				.stringWidth(lblTexto.getText());

		return nrPixelTexto;
	}

	/**
	 * Removes the caracter especificado.
	 *
	 * @param valor the valor
	 * @param caracter the caracter
	 * @return the string
	 */
	public static String removeCaracterEspecificado(String valor,
			String caracter) {
		String retorno = "";
		for (int i = 0; i < valor.length(); i++) {
			if (!valor.substring(i, i + 1).equals(caracter)) {
				retorno += valor.substring(i, i + 1);
			}
		}
		return removeBarraN(retorno);
	}

	/**
	 * Removes the barra n.
	 *
	 * @param valor the valor
	 * @return the string
	 */
	public static String removeBarraN(String valor) {
		return valor.replaceAll("\n", "");
	}

	/**
	 * Limpa campo double.
	 *
	 * @param valor the valor
	 * @return the string
	 */
	public static String limpaCampoDouble(String valor) {
		String novoValor = "";
		if (valor.endsWith(",0")) {
			int index = valor.indexOf(",");
			novoValor = valor.substring(0, index);
		} else {
			novoValor = valor;
		}
		return novoValor;
	}

	/**
	 * Lpad.
	 *
	 * @param valueToPad the value to pad
	 * @param filler the filler
	 * @param size the size
	 * @return the string
	 */
	public static String lpad(String valueToPad, String filler, int size) {
		while (valueToPad.length() < size) {
			valueToPad = filler + valueToPad;
		}
		return valueToPad;
	}

	/**
	 * Rpad.
	 *
	 * @param valueToPad the value to pad
	 * @param filler the filler
	 * @param size the size
	 * @return the string
	 */
	public static String rpad(String valueToPad, String filler, int size) {
		while (valueToPad.length() < size) {
			valueToPad = valueToPad + filler;
		}
		return valueToPad;
	}
	
	public static String formatPattern(String pattern, Object value) {
        MaskFormatter mask;
        try {
            mask = new MaskFormatter(pattern);
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
	
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

	public static String removerNonAscii(String str) {
		str = str.replaceAll("[^\\x00-\\x7F]", "");

		// erases all the ASCII control characters
		str = str.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "");

		// removes non-printable characters from Unicode
		str = str.replaceAll("\\p{C}", "");

		return str;
	}
	
	// strips off all non-ASCII characters
}
