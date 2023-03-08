package br.com.lotus.connector.service.omnibees;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

import com.omnibees.connectors.Channel;
import com.omnibees.connectors.ChannelsRQ;
import com.omnibees.connectors.ChannelsRS;
import com.omnibees.connectors.PullWebService;
import com.omnibees.connectors.PullWebServiceSoap;

import br.com.lotus.soaphandler.SOAPHeaderHandler;

public class OmniBeesService {

	public List<Channel> getChannels() {
		PullWebService webService = new PullWebService();
		webService.setHandlerResolver(new HandlerResolver() {
			public List<Handler> getHandlerChain(PortInfo portInfo) {
				List<Handler> handlerList = new ArrayList<Handler>();
				handlerList.add(new SOAPHeaderHandler("LotusBrasil", "12173", "user.12173"));
				return handlerList;
			}
		});

		PullWebServiceSoap hello = webService.getPullWebServiceSoap();

		ChannelsRQ req = new ChannelsRQ();

		Calendar cal = new GregorianCalendar();
		cal.setTimeInMillis(System.currentTimeMillis());

		req.setHotelCode("12173");
		req.setVersion(new BigDecimal("3"));
		req.setEchoToken("93a77858-7fd3-423a-b4fd-f9eb537d5792");

		ChannelsRS result = hello.getChannels(req);

		return result.getChannels().getChannel();

	}

}
