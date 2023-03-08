package br.com.hdnit.lotus.foundation.util;

import java.io.StringReader;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class XmlUtils {

	public static <T> T unmarshallXml(Class<T> classe, String xmlToUnmarshall) throws JAXBException {
	
		JAXBContext context = JAXBContext.newInstance(classe);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		T result = null;
		try {
			result = unmarshaller.unmarshal(new StreamSource(new StringReader(xmlToUnmarshall)), classe).getValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static <T> String marshallXml(T classe) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(classe.getClass());

		Marshaller marshaller = context.createMarshaller();
		// for getting nice formatted output
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");

		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		final StringWriter w = new StringWriter();
		marshaller.marshal(classe, w);
		return w.toString();

	}

	public static String formatarDataEventoCartaCorrecao() {
		return formatarDataEvento(new Date(), Locale.getDefault());
	}

	public static String formatarDataEventoCartaCorrecao(Date data) {
		return formatarDataEvento(data, Locale.getDefault());
	}

	public static String formatarDataEvento(Date data, Locale locale) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", locale);
		return data == null || locale == null ? null : sdf.format(data);
	}

	 /*
     * Converts java.util.Date to javax.xml.datatype.XMLGregorianCalendar
     */
    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date){
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
            ex.printStackTrace();
        }
        return xmlCalendar;
    }


	
	public static Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }


	
}
