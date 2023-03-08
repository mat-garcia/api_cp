package br.com.hdnit.connector.galvani.test;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

import org.junit.Test;
import org.opentravel.ota._2003._05.HotelReservationType;
import org.opentravel.ota._2003._05.OTAPingRQ;
import org.opentravel.ota._2003._05.OTAPingRS;
import org.opentravel.ota._2003._05.OTAReadRQ;
import org.opentravel.ota._2003._05.OTAReadRQ.ReadRequests;
import org.opentravel.ota._2003._05.OTAReadRQ.ReadRequests.HotelReadRequest;
import org.opentravel.ota._2003._05.OTAReadRQ.ReadRequests.HotelReadRequest.SelectionCriteria;
import org.opentravel.ota._2003._05.OTAResRetrieveRS;

import com.omnibees.connectors.Channel;
import com.omnibees.connectors.ChannelsRQ;
import com.omnibees.connectors.ChannelsRS;
import com.omnibees.connectors.PullWebService;
import com.omnibees.connectors.PullWebServiceSoap;

import br.com.hdnit.lotus.foundation.util.BundleUtils;
import br.com.hdnit.lotus.foundation.util.FileUtils;
import br.com.hdnit.lotus.foundation.util.XmlUtils;
import br.com.lotus.soaphandler.SOAPHeaderHandler;

public class SapConnectorTest {

	@Test
	public void testPing() {
//		PullWebService webService = new PullWebService();
//
//		PullWebServiceSoap hello = webService.getPullWebServiceSoap();
//
//		OTAPingRQ pingRQ = new OTAPingRQ();
//
//		Calendar cal = new GregorianCalendar();
//		cal.setTimeInMillis(System.currentTimeMillis());
//
//		pingRQ.setEchoData("Teste para agadi !");
//		pingRQ.setVersion(new BigDecimal("3"));
//		pingRQ.setEchoToken("93a77858-7fd3-423a-b4fd-f9eb537d5792");
//
//		OTAPingRS result = hello.otaPing(pingRQ);
//
//		System.out.println(result.getEchoData());

	}

	@Test
	public void testChannels() {
//		PullWebService webService = new PullWebService();
//		webService.setHandlerResolver(new HandlerResolver() {
//			public List<Handler> getHandlerChain(PortInfo portInfo) {
//				List<Handler> handlerList = new ArrayList<Handler>();
//				handlerList.add(new SOAPHeaderHandler("LotusBrasil", "12173", "user.12173"));
//				return handlerList;
//			}
//		});
//
//
//		PullWebServiceSoap hello = webService.getPullWebServiceSoap();
//
//		ChannelsRQ req = new ChannelsRQ();
//
//		Calendar cal = new GregorianCalendar();
//		cal.setTimeInMillis(System.currentTimeMillis());
//
//		req.setHotelCode("12173");
//		req.setVersion(new BigDecimal("3"));
//		req.setEchoToken("93a77858-7fd3-423a-b4fd-f9eb537d5792");
//
//		ChannelsRS result = hello.getChannels(req);
//
//		for (Channel channel : result.getChannels().getChannel()) {
//			System.out.println(channel.getUID() + channel.getName());
//
//		}

	}

	@Test
	public void testReservas() {
//		PullWebService webService = new PullWebService();
//		webService.setHandlerResolver(new HandlerResolver() {
//			public List<Handler> getHandlerChain(PortInfo portInfo) {
//				List<Handler> handlerList = new ArrayList<Handler>();
//				handlerList.add(new SOAPHeaderHandler("LotusBrasil", "12173", "user.12173"));
//				return handlerList;
//			}
//		});
//
//		PullWebServiceSoap hello = webService.getPullWebServiceSoap();
//
//		OTAReadRQ req = new OTAReadRQ();
//
//		Calendar cal = new GregorianCalendar();
//		cal.setTimeInMillis(System.currentTimeMillis());
//
//		ReadRequests readRequest = new ReadRequests();
//
//		HotelReadRequest hotelReadRequest = new HotelReadRequest();
//
//		hotelReadRequest.setHotelCode("12173");
//
//		SelectionCriteria selectCriteria = new SelectionCriteria();
//
//		selectCriteria.setStart("2016-09-10 08:48:58");
//		selectCriteria.setEnd("2016-12-31 00:01:06");
//
//		hotelReadRequest.getSelectionCriteria().add(selectCriteria);
//
//		readRequest.getHotelReadRequest().add(hotelReadRequest);
//
//		req.setReadRequests(readRequest);
//
//		req.setVersion(new BigDecimal("3"));
//		req.setEchoToken("93a77858-7fd3-423a-b4fd-f9eb537d5792");
//
//		OTAResRetrieveRS result = hello.otaRead(req);
//
//		String content;
//		try {
//			content = XmlUtils.marshallXml(result);
//			
//			System.out.println(content);
//
//			File path = FileUtils.fileSave(
//					BundleUtils.getMessage("uploadFilePath") + "/reserva" + System.currentTimeMillis() + ".xml",
//					content);
//		} catch (JAXBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		for (HotelReservationType channel : result.getReservationsList().getHotelReservation()) {
//			System.out.println(channel.getCreateDateTime().toString() + " - " + channel.getResStatus());
//
//		}

	}

}
