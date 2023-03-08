package br.com.hdnit.lotus.pms.cm.dao;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Cidades;
import br.com.hdnit.lotus.pms.cm.entity.oracle.ClienteDTO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Clientepess;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Contrclihotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Docconfirmahotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Faixaetaria;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Meioscomunicacao;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Moeda;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Motivosfront;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Origemreserva;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Pensaofront;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Pessoa;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Segmento;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tarifahotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipohospede;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipouh;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tratamento;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Usuariosistema;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Veiculoscomunica;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.CidadesDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.ClientepessDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.ContrclihotelDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.DocconfirmaDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.FaixaetariaDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.MeioscomunicaDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.MoedaDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.MotivosfrontDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.OrigemReservaDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.PensaofrontDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.PessoaDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.ReservasfrontDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.SegmentoDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.TarifahotelDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.TipoHospedeDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.TipoUhDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.TratamentoDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.UsuarioSistemaDAOImpl;
import br.com.hdnit.lotus.pms.cm.entity.oracle.dao.VeiculoscomuniDAOImpl;

public class Main {

	private static Logger _logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		_logger.info("Inicio Teste com Banco de Dados" + new Date(System.currentTimeMillis()).toLocaleString());

		_logger.info("ID HOTEL:" + new BigDecimal(args[0]));
		_logger.info("DATA SOURCE:" + DataSourceEnum.valueOf(args[1]));
		_logger.info("IP:" + args[2]);
		_logger.info("Usuário:" + args[3]);
		_logger.info("Senha:" + args[4]);

		testaBanco(new BigDecimal(args[0]), DataSourceEnum.valueOf(args[1]), args[2], args[3], args[4]);
	}

	private static void testaBanco(BigDecimal ID_HOTEL, DataSourceEnum tipo, String ip, String user, String pass) {
		List<Tipohospede> lstTipoHospede;
		List<Tipouh> lstTipoUh;

		List<Moeda> lstMoeda;

		List<Origemreserva> lstOrigemReserva;

		List<Pensaofront> lstPensaoFront;

		List<Veiculoscomunica> lstVeiculoscomunica;

		List<Motivosfront> lstMotivosfront;

		List<Cidades> lstCidades;

		List<Tratamento> lstTratamento;

		List<Usuariosistema> lstUsuariosistema;

		List<Pessoa> lstPessoa;

		List<Segmento> lstSegmento;

		List<Docconfirmahotel> lstDocconfirmahotel;

		List<Meioscomunicacao> lstMeioscomunicacao;

		List<Tarifahotel> lstTarifahotel;

		List<Faixaetaria> lstFaixaetaria;

		if (tipo.equals(DataSourceEnum.ORACLE)) {
			_logger.info("Inicio Conectando o banco Oracle:" + new Date(System.currentTimeMillis()).toLocaleString());
			HibernateUtilCMOracle.getInstance().configureCMDB(ip, user, pass,DataSourceEnum.ORACLE);
		} else if (tipo.equals(DataSourceEnum.SQL_SERVER)) {
			_logger.info(
					"Inicio Conectando o banco SQL SERVER:" + new Date(System.currentTimeMillis()).toLocaleString());
			HibernateUtilCMSqlServer.getInstance().configureCMDB(ip, user, pass,DataSourceEnum.SQL_SERVER);

		}

		_logger.info("Fim Conectando o banco:" + new Date(System.currentTimeMillis()).toLocaleString());

		ClientepessDAOImpl clientPessDAO = new ClientepessDAOImpl(tipo);

		SegmentoDAOImpl segmentoDAO = new SegmentoDAOImpl(tipo);
		CidadesDAOImpl cidadesDAO = new CidadesDAOImpl(tipo);
		TipoHospedeDAOImpl tipoHospedeDAO = new TipoHospedeDAOImpl(tipo);
		TipoUhDAOImpl tipoUhDAO = new TipoUhDAOImpl(tipo);
		MoedaDAOImpl moedaDAO = new MoedaDAOImpl(tipo);
		OrigemReservaDAOImpl origemDAO = new OrigemReservaDAOImpl(tipo);
		PensaofrontDAOImpl pensaoDAO = new PensaofrontDAOImpl(tipo);
		ReservasfrontDAOImpl reservaFrontDAO = new ReservasfrontDAOImpl(tipo);
		VeiculoscomuniDAOImpl veiculoDAO = new VeiculoscomuniDAOImpl(tipo);
		MotivosfrontDAOImpl motivosDAO = new MotivosfrontDAOImpl(tipo);
		TratamentoDAOImpl tratamentoDAO = new TratamentoDAOImpl(tipo);
		UsuarioSistemaDAOImpl usuarioSistemaDAO = new UsuarioSistemaDAOImpl(tipo);
		PessoaDAOImpl pessoaDAO = new PessoaDAOImpl(tipo);
		DocconfirmaDAOImpl docConfimaDAO = new DocconfirmaDAOImpl(tipo);
		MeioscomunicaDAOImpl meioComuicaDAO = new MeioscomunicaDAOImpl(tipo);
		TarifahotelDAOImpl tarifaHotelDAO = new TarifahotelDAOImpl(tipo);
		FaixaetariaDAOImpl faixaDAO = new FaixaetariaDAOImpl(tipo);
		// TODO Auto-generated method stub
		ContrclihotelDAOImpl contrclihotelDAO = new ContrclihotelDAOImpl(tipo);

		
		segmentoDAO.findByIdPms(ID_HOTEL.longValue());

		try {
			if (tipoHospedeDAO != null) {

				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());
				lstTipoHospede = tipoHospedeDAO.findByIdPms(ID_HOTEL.longValue());
				_logger.info("Tipo hospede qtd" + lstTipoHospede.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}

		try {

			_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());
			List<Clientepess> itens = clientPessDAO.findByIdPms(ID_HOTEL.longValue());
			_logger.info("Cliente Pess qtd" + itens.size());
			_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}

		
		
		try {

			
			if (contrclihotelDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());
				List<Contrclihotel> lstContrclihotel = contrclihotelDAO.findByIdPmsClientPess(ID_HOTEL.longValue(),new Long("1"));
				_logger.info("Contrato cliente qtd" + lstContrclihotel.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}

		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}

		try {

			
			if (tipoUhDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());
				lstTipoUh = tipoUhDAO.findByIdPms(ID_HOTEL.longValue());
				_logger.info("Tipo hospede qtd" + lstTipoUh.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}

		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}

		
		try {
			if (moedaDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstMoeda = moedaDAO.findAll();
				_logger.info("Moedas qtd" + lstMoeda.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (origemDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstOrigemReserva = origemDAO.findAll();

				_logger.info("lstOrigemReserva qtd" + lstOrigemReserva.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (pensaoDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstPensaoFront = pensaoDAO.findAll();
				_logger.info("lstPensaoFront qtd" + lstPensaoFront.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (veiculoDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstVeiculoscomunica = veiculoDAO.findAll();
				_logger.info("lstVeiculoscomunica qtd" + lstVeiculoscomunica.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (motivosDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstMotivosfront = motivosDAO.findAll();

				_logger.info("lstMotivosfront qtd" + lstMotivosfront.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());
			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (tratamentoDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstTratamento = tratamentoDAO.findAll();
				_logger.info("lstTratamento qtd" + lstTratamento.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (usuarioSistemaDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstUsuariosistema = usuarioSistemaDAO.findAll();
				_logger.info("lstUsuariosistema" + lstUsuariosistema.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (pessoaDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstPessoa = pessoaDAO.findAll();
				_logger.info("lstPessoa qtd" + lstPessoa.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (segmentoDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstSegmento = segmentoDAO.findByIdPms(ID_HOTEL.longValue());
				_logger.info("lstSegmento qtd" + lstSegmento.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (docConfimaDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstDocconfirmahotel = docConfimaDAO.findAll();
				_logger.info("lstDocconfirmahotel qtd" + lstDocconfirmahotel.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (meioComuicaDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstMeioscomunicacao = meioComuicaDAO.findAll();
				_logger.info("lstMeioscomunicacao qtd" + lstMeioscomunicacao.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (tarifaHotelDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstTarifahotel = tarifaHotelDAO.findByIdPms(ID_HOTEL.longValue());
				_logger.info("Tarifas qtd" + lstTarifahotel.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		try {
			if (faixaDAO != null) {
				_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());

				lstFaixaetaria = faixaDAO.findAll();
				_logger.info("Faixas qtd" + lstFaixaetaria.size());
				_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

			}
		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}

		reservaFrontDAO.startTransaction();
		
		try {

			_logger.info("Inicio:" + new Date(System.currentTimeMillis()).toLocaleString());
			List<ClienteDTO> itens = reservaFrontDAO.getAllClientes(ID_HOTEL.longValue());
			_logger.info("Cliente Pess qtd" + itens.size());
			_logger.info("Fim:" + new Date(System.currentTimeMillis()).toLocaleString());

		} catch (Exception e) {
			// TODO: handle exception
			_logger.info("Erro:" + e.getMessage(), e);

		}
		
		Long XSEQRESERVASFRONT = reservaFrontDAO.getNextSeqReservasFront(tipo);
		Long xseqnumreserva = reservaFrontDAO.getNextSeqNumeroReserva(tipo);

		Long XSEQPESSOA = reservaFrontDAO.getNextSeqPessoa(tipo);

		Long xseqendpess = reservaFrontDAO.getNextSeqEndPess(tipo);

		Long XSEQCONTASFRONT = reservaFrontDAO.getNextSeqContasFront(tipo);
		reservaFrontDAO.finishTransacton();
	}

}
