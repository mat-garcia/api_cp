
package br.com.hdnit.lotus.pms.cm.entity.dao._interface;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Reservasfront;

public interface IReservasfrontDAO {
	/**
	 * 
	 */

	

	public List<Reservasfront> findByDocumento(BigDecimal id, String strDocumento) throws PersistenceException;

	public Long findByIdReservaFront(BigDecimal idReserva) throws PersistenceException;

	public Reservasfront findItemByDocumento(BigDecimal id, String strDocumento) throws PersistenceException;

	public long inserirReservaFront(Long XSEQRESERVASFRONT, Long xseqnumreserva, Long XCM_IDHOTEL, Long XCM_USUARIO,
			Long XCM_TIPOUH, Long QTD_ADULTOS, Long XCM_VEICULOS, BigDecimal XVALORORCAMENTO, Long XCM_MOEDA,
			Long XCM_ORIGEM, Long XSTATUS, Long XCM_CLIENTE, Long XCM_TARIFA, String XCM_SEGMENTO, Long XCM_DOCUMENTO,
			Long XCM_MEIOCOMUNIC, String XGARANTIDA, Long XQTD_CRIANCAS, String XCM_PENSAO, double XDIVISAO,
			String XOBS5, String RESERVADOCUMENTO, Date RESERVA_DATA_CHEGADA, Date RESERVA_DATA_PARTIDA, String TEXTO,
			Long XCM_CONTRATO, Date DATA_RESERVA, Date dataChegadaPrevista, Date dataPartidaPrevista,
			String RESERVANTE, String EMAIL, String TELEFONE, String LOCALIZADOR,DataSourceEnum dataSource) throws Exception;

	public long inserirPessoa(Long XSEQPESSOA, Long xseqendpess, String NOME_COMPLETO, String EMAIL, Long XCM_USUARIO,
			Date XDATARESERVA, String NUM_DOCUMENTO) throws Exception;

	public long inserirEndPess(Long XSEQpessoa, Long xCM_CIDADE, Long xseqendpess) throws Exception;

	public long inserirHospede(Long xCM_FAIXA, String XCM_TRATAMENTO, Long XSEQpessoa, String SOBRENOME, String NOME,
			Long xCM_USUARIO, Date date, Long TIPO_ETARIO) throws Exception;

	public long inserirContasFront(Long xCM_IDHOTEL, Long XSEQCONTASFRONT, String NOME_COMPLETO, Long XSEQRESERVASFRONT,
			Long XSEQpessoa, Long xCM_USUARIO, Date date, Date date2, String pTIPOCONTA) throws Exception;

	public long inserirHospedeHotel(Long xseqpessoa, Long xCM_IDHOTEL, Long xCM_TIPOPAX, Date date, Long xCM_USUARIO)
			throws Exception;

	public int inserirMovimentoHospede(Long XSEQRESERVASFRONT, Long XCM_IDHOTEL, Long xseqpessoa, Long xCM_TIPOPAX,
			Date DATA_CHEGADA, Date DATA_PARTIDA, Long XCM_USUARIO, Date DATA_OPERACAO, String principal)
			throws Exception;

	public int inserirMovimentoHospedeMenor(Long XSEQRESERVASFRONT, Long XCM_IDHOTEL, Long xseqpessoa, Long xCM_TIPOPAX,
			Date DATA_CHEGADA, Date DATA_PARTIDA, Long XCM_USUARIO, Date DATA_OPERACAO, String principal,
			Long xIdResponsavel) throws Exception;

	public Long getNextSeqReservasFront(DataSourceEnum dataSource);

	public Long getNextSeqNumeroReserva(DataSourceEnum dataSource);

	public Long getNextSeqPessoa(DataSourceEnum dataSource);

	public Long getNextSeqEndPess(DataSourceEnum dataSource);

	public Long getNextSeqContasFront(DataSourceEnum dataSource);

	public int inserirReservaReduz(Long XSEQRESERVASFRONT, Long xCM_IDHOTEL, Long xCM_CLIENTE, Long xCM_TIPOUH,
			Date dataChegada, Date dataSaida, Long xCM_CONTRATO) throws Exception;

	public int inserirOrcamentoReserva(Long XSEQRESERVASFRONT, Long xCM_IDHOTEL, Long XCM_TARIFA, Long xCM_TIPOUH,
			Date dataOrcamentoReserva, Date dataOperacao, String XCM_SIGLA, Long XCM_USUARIO, Long xCM_MOEDA,
			Long xCM_ORIGEM, String xCM_SEGMENTO, BigDecimal xVALORORCAMENTO, Boolean tarifaContrato,String XCM_PENSAO) throws Exception;
	
	public long inserirTelEndPess(Long XSEQtelefone, Long xseqendpess, String telefone) throws Exception;

}
