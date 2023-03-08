
package br.com.hdnit.lotus.pms.lpp.dao;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.foundation.util.DateUtils;
import br.com.hdnit.lotus.foundation.util.StringUtils;
import br.com.hdnit.lotus.foundation.util.TextUtils;
import br.com.hdnit.lotus.pms.lpp.dto.LphCidade;
import br.com.hdnit.lotus.pms.lpp.dto.LphContrato;
import br.com.hdnit.lotus.pms.lpp.dto.LphDebitos;
import br.com.hdnit.lotus.pms.lpp.dto.LphMoeda;
import br.com.hdnit.lotus.pms.lpp.dto.LphMotivoCancelamento;
import br.com.hdnit.lotus.pms.lpp.dto.LphOrigemReserva;
import br.com.hdnit.lotus.pms.lpp.dto.LphParam;
import br.com.hdnit.lotus.pms.lpp.dto.LphPensao;
import br.com.hdnit.lotus.pms.lpp.dto.LphPessoa;
import br.com.hdnit.lotus.pms.lpp.dto.LphSegmentoReserva;
import br.com.hdnit.lotus.pms.lpp.dto.LphServicos;
import br.com.hdnit.lotus.pms.lpp.dto.LphTarifa;
import br.com.hdnit.lotus.pms.lpp.dto.LphTipoHospede;
import br.com.hdnit.lotus.pms.lpp.dto.LphTipoUH;
import br.com.hdnit.lotus.pms.lpp.dto.LphUsuario;
import br.com.hdnit.lotus.pms.lpp.dto.LphVeiculosComunicacao;

public class LphDAOImpl extends AbstractGenericLppJPADAO<Object> {

	private static String INSERIR_ORCAMENTO_RESERVA = "INSERT INTO ORCAMENTO_RES (" + "ID_EMPRESA," + "NUMRES,"
			+ "VALOR," + "DATA," + "TARIFA," + "USUARIO," + "DATAALT," + "HORAALT," + "SEMANA," + "FLAG," + "REGIME,"
			+ "VALOR_PENSAO," + "QTD_PAX," + "TIPO_PAX," + "DESCONTO," + "TAXA," + "VALOR_TAXA," + "DIARIA," + "PARK1,"
			+ "PARK2) " + " VALUES ( ";

	private static String INSERIR_RESERVA_FRONT = "INSERT INTO RESERVA ( NUMRES," + "ID_EMPRESA," + "TXSN,"
			+ "EMPRESA," + "STATUS," + "OCUPACAO," + "DATACHE," + "DATAPAR," + "DIAREAL," + "NOME," + "TIPOAPT,"
			+ "COMPARTI," + "ADULTO," + "CRIANCA," + "CONTRATO," + "HORAOUT," + "HORAIN," + "NTARIFA," + "VDIARIA,"
			+ "FUNCALT," + "NOMEAC," + "FONE," + "NOMEAC1," + "NOMEAC2," + "NOMEAC3," + "NOMEAC4," + "COD_EMP,"
			+ "INCOG," + "FUN1N," + "FUN1D," + "FUN1H," + "DEB1," + "DEB2," + "DEB3," + "VAL1," + "VAL2," + "VAL3,"
			+ "ORIGEM," + "SEGMENTO," + "DOLAR," + "COFRE," + "OBS6," + "NOMECLI," + "TXTURISMO," + "UF," + "VDIRETO,"
			+ "TOTAL_DIAS," + "VALOR_PERIODO," + "REGIME," + "VALOR_PENSAO," + "TOTAL_PAX," + "TIPOMASTER,"
			+ "CANAL_RESERVA," + "CC_NUMERO," + "CC_VALIDADE," + "CC_CV," + "LOC_CANAL,"
			+ "DIARIA_CONFIDENCIAL,OBSMEMO,CIDADE,LOC_MOTOR,MUNICIPAL, N_COMPLE)" + " VALUES (";

	private static String INSERT_INTO_LANCA = "INSERT INTO LANCA (ID_EMPRESA,NUMRES,VALOR,ATIVA,TIPOCC,TAXA,CODIGO,DOCUM,HISTOR,"
			+ "DEBCR,PDV,DATALAN,HORLAN,QTD,FUNC,"
			+ "COD_CARTAO,COMPARTI,CC_NUMERO,CC_AUTORIZACAO,CC_NSU,CARTAOX,DATA_CREDITO) VALUES (";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LphDAOImpl() {

	}

	public List<LphMoeda> getMoedas() {
		Query query = null;
		List<LphMoeda> result = null;
		startTransaction();

		query = getSession().createSQLQuery("SELECT SEQUENCIA,CODIGO, DESCRICAO FROM T_MOEDA order by DESCRICAO")
				.addScalar("SEQUENCIA", StandardBasicTypes.INTEGER).addScalar("CODIGO", StandardBasicTypes.STRING)
				.addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphMoeda.class));

		result = query.list();
		finishTransacton();

		return result;
	}

	public List<LphDebitos> getDebitos(Integer idEmpresa) {
		Query query = null;
		List<LphDebitos> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery("SELECT CODIGO, DESCRI FROM DEBCR where debcr = 'C' AND ID_EMPRESA = " + idEmpresa
						+ " order by DESCRI")
				.addScalar("CODIGO", StandardBasicTypes.STRING).addScalar("DESCRI", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphDebitos.class));

		result = query.list();
		finishTransacton();

		return result;
	}

	public LphDebitos getDebito(Integer idEmpresa, String codigo) {
		Query query = null;
		LphDebitos result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery("SELECT CODIGO, DESCRI FROM DEBCR where debcr = 'C' AND ID_EMPRESA = " + idEmpresa
						+ " AND CODIGO = '" + codigo + "'" + " order by DESCRI")
				.addScalar("CODIGO", StandardBasicTypes.STRING).addScalar("DESCRI", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphDebitos.class));

		result = (LphDebitos) query.uniqueResult();
		finishTransacton();

		return result;
	}

	public List<LphTipoHospede> getTipoHospede() {
		Query query = null;
		List<LphTipoHospede> result = null;
		startTransaction();
		query = getSession().createSQLQuery("SELECT SEQUENCIA,CODIGO, DESCRICAO FROM T_TIPOPAX order by DESCRICAO")
				.addScalar("SEQUENCIA", StandardBasicTypes.INTEGER).addScalar("CODIGO", StandardBasicTypes.STRING)
				.addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphTipoHospede.class));

		result = query.list();
		finishTransacton();

		return result;
	}

	public List<LphOrigemReserva> getOrigemReserva() {
		Query query = null;
		List<LphOrigemReserva> result = null;
		startTransaction();

		query = getSession().createSQLQuery("SELECT SEQUENCIA,CODIGO, DESCRICAO FROM T_ORIGEMRES order by DESCRICAO")
				.addScalar("SEQUENCIA", StandardBasicTypes.INTEGER).addScalar("CODIGO", StandardBasicTypes.STRING)
				.addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphOrigemReserva.class));

		result = query.list();
		finishTransacton();

		return result;
	}

	public List<LphSegmentoReserva> getSegmentoReserva(Integer idEmpresa) {
		Query query = null;
		List<LphSegmentoReserva> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery("SELECT SEQUENCIA,CODIGO, DESCRICAO FROM TARIFA_AGENTES where ID_EMPRESA = " + idEmpresa
						+ " order by DESCRICAO")
				.addScalar("SEQUENCIA", StandardBasicTypes.INTEGER).addScalar("CODIGO", StandardBasicTypes.STRING)
				.addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphSegmentoReserva.class));

		result = query.list();
		finishTransacton();

		return result;
	}

	public List<LphVeiculosComunicacao> getVeiculosComunicacao() {
		Query query = null;
		List<LphVeiculosComunicacao> result = null;
		startTransaction();

		query = getSession().createSQLQuery("SELECT SEQUENCIA,CODIGO, DESCRICAO FROM TARIFA_CANAIS order by DESCRICAO")
				.addScalar("SEQUENCIA", StandardBasicTypes.INTEGER).addScalar("CODIGO", StandardBasicTypes.STRING)
				.addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphVeiculosComunicacao.class));

		result = query.list();
		finishTransacton();

		return result;
	}

	public List<LphTipoUH> getTiposUH(Integer idEmpresa) {
		Query query = null;
		List<LphTipoUH> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery("SELECT SEQUENCIA,ID_EMPRESA, CODIGO, DESCRICAO FROM T_TIPOAPT WHERE ID_EMPRESA = "
						+ idEmpresa + " order by DESCRICAO")
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("SEQUENCIA", StandardBasicTypes.INTEGER)
				.addScalar("CODIGO", StandardBasicTypes.STRING).addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphTipoUH.class));

		result = query.list();
		finishTransacton();

		return result;
	}

	public List<LphPessoa> getPessoas() {
		Query query = null;
		List<LphPessoa> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery(
						"SELECT ID_EMPRESA, CODIGO, RAZAO, FANTASIA, CNPJ,SEQUENCIA FROM EMPRESA order by RAZAO")
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("CODIGO", StandardBasicTypes.STRING)
				.addScalar("RAZAO", StandardBasicTypes.STRING).addScalar("CNPJ", StandardBasicTypes.STRING)
				.addScalar("SEQUENCIA", StandardBasicTypes.INTEGER).addScalar("FANTASIA", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphPessoa.class));

		result = query.list();
		finishTransacton();
		return result;
	}

	public List<LphPessoa> getPessoas(Integer idEmpresa) {
		Query query = null;
		List<LphPessoa> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery(
						"SELECT ID_EMPRESA, CODIGO, RAZAO, FANTASIA, CNPJ,SEQUENCIA FROM EMPRESA where ID_EMPRESA = "
								+ idEmpresa + " order by RAZAO")
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("CODIGO", StandardBasicTypes.STRING)
				.addScalar("RAZAO", StandardBasicTypes.STRING).addScalar("CNPJ", StandardBasicTypes.STRING)
				.addScalar("SEQUENCIA", StandardBasicTypes.INTEGER).addScalar("FANTASIA", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphPessoa.class));

		result = query.list();
		finishTransacton();
		return result;
	}

	public List<LphPessoa> getPessoas(Integer idEmpresa, String value) {
		Query query = null;
		List<LphPessoa> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery(
						"SELECT ID_EMPRESA, CODIGO, RAZAO, FANTASIA, CNPJ,SEQUENCIA FROM EMPRESA where ID_EMPRESA = "
								+ idEmpresa + " and upper(RAZAO) like '%" + value.toUpperCase() + "%' order by RAZAO")
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("CODIGO", StandardBasicTypes.STRING)
				.addScalar("RAZAO", StandardBasicTypes.STRING).addScalar("CNPJ", StandardBasicTypes.STRING)
				.addScalar("SEQUENCIA", StandardBasicTypes.INTEGER).addScalar("FANTASIA", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphPessoa.class));

		result = query.list();
		finishTransacton();
		return result;
	}

	public List<LphTarifa> getTarifas(Integer idEmpresa) {
		Query query = null;
		List<LphTarifa> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery(
						"SELECT SEQUENCIA,ID_EMPRESA, CODIGO, NOME, INICVAL, FIMVAL FROM TARIFA WHERE ID_EMPRESA = "
								+ idEmpresa + " order by NOME")
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("SEQUENCIA", StandardBasicTypes.INTEGER)
				.addScalar("CODIGO", StandardBasicTypes.STRING).addScalar("NOME", StandardBasicTypes.STRING)
				.addScalar("INICVAL", StandardBasicTypes.STRING).addScalar("FIMVAL", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphTarifa.class));

		result = query.list();
		finishTransacton();
		return result;
	}

	public List<LphPensao> getPensoes(Integer idEmpresa) {
		Query query = null;
		List<LphPensao> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery("SELECT SEQUENCIA,ID_EMPRESA, CODIGO, DESCRICAO FROM REGIME where ID_EMPRESA = "
						+ idEmpresa + "  order by DESCRICAO")
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("SEQUENCIA", StandardBasicTypes.INTEGER)
				.addScalar("CODIGO", StandardBasicTypes.STRING).addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphPensao.class));

		result = query.list();
		finishTransacton();
		return result;
	}

	public List<LphUsuario> getUsuarios() {
		Query query = null;
		List<LphUsuario> result = null;
		startTransaction();

		query = getSession().createSQLQuery("SELECT SEQUENCIA, LOGON FROM LOGON ORDER BY LOGON")
				.addScalar("SEQUENCIA", StandardBasicTypes.INTEGER).addScalar("LOGON", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphUsuario.class));

		result = query.list();
		finishTransacton();
		return result;
	}

	public List<LphMotivoCancelamento> getMotivosCancelamento(Integer pIdEmpresa) {
		Query query = null;
		List<LphMotivoCancelamento> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery("SELECT ID_EMPRESA,SEQUENCIA, CODIGO, DESCRICAO FROM T_CANRES where ID_EMPRESA = "
						+ pIdEmpresa + " order by DESCRICAO")
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("SEQUENCIA", StandardBasicTypes.INTEGER)
				.addScalar("CODIGO", StandardBasicTypes.STRING).addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphMotivoCancelamento.class));

		result = query.list();
		finishTransacton();
		return result;
	}

	public List<LphContrato> getContratos(Integer idEmpresa) {
		Query query = null;
		List<LphContrato> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery("SELECT SEQUENCIA,ID_EMPRESA,TARIFA,INICIO,TERMINO FROM EMPRESATAR WHERE ID_EMPRESA = "
						+ idEmpresa + " order by INICIO,TERMINO")
				.addScalar("SEQUENCIA", StandardBasicTypes.INTEGER).addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER)
				.addScalar("TARIFA", StandardBasicTypes.INTEGER).addScalar("INICIO", StandardBasicTypes.DATE)
				.addScalar("TERMINO", StandardBasicTypes.DATE);

		query.setResultTransformer(Transformers.aliasToBean(LphContrato.class));

		result = query.list();
		finishTransacton();
		return result;
	}

	public List<LphCidade> getCidades() {
		Query query = null;
		List<LphCidade> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery("SELECT IDCIDADE, CODMUNICIPIOIBGE, NOMECIDADE FROM CIDADE order by NOMECIDADE")
				.addScalar("IDCIDADE", StandardBasicTypes.INTEGER)
				.addScalar("CODMUNICIPIOIBGE", StandardBasicTypes.STRING)
				.addScalar("NOMECIDADE", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphCidade.class));

		result = query.list();
		finishTransacton();
		return result;
	}

	public List<LphServicos> getServicos(Integer idEmpresa) {
		Query query = null;
		List<LphServicos> result = null;
		startTransaction();

		query = getSession().createSQLQuery(
				"SELECT SEQUENCIA,ID_EMPRESA, CODIGO, DESCRI FROM DEBCR WHERE DEBCR = 'D' AND PDV = 'N' AND ID_EMPRESA = "
						+ idEmpresa + " order by DESCRI")
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("SEQUENCIA", StandardBasicTypes.INTEGER)
				.addScalar("CODIGO", StandardBasicTypes.STRING).addScalar("DESCRI", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphServicos.class));

		result = query.list();
		finishTransacton();
		return result;
	}

	public long inserirReservaFront(Integer pID_EMPRESA, Integer pNUMRES, String pTXSN, String pEMPRESA, String pSTATUS,
			String pOCUPACAO, String pDATACHE, String pDATAPAR, double pDIAREAL, String pNOME, String pTIPOAPT,
			String pCOMPARTI, Integer pADULTO, Integer pCRIANCA, Integer pCONTRATO, String pHORAOUT, String pHORAIN,
			String pNTARIFA, double pVDIARIA, String pFUNCALT, String pNOMEAC, String pFONE, String pNOMEAC1,
			String pNOMEAC2, String pNOMEAC3, String pNOMEAC4, String pCOD_EMP, String pINCOG, String pFUN1N,
			String pFUN1D, String pFUN1H, String pDEB1, String DEB2, String pDEB3, String pVAL1, String pVAL2,
			String pVAL3, String pORIGEM, String pSEGMENTO, String pDOLAR, String pCOFRE, String pOBS6, String pNOMECLI,
			String pTXTURISMO, String pUF, double pVFDIRETO, Integer pTOTAL_DIAS, double pVALOR_PERIODO, String pREGIME,
			double pVALOR_PENSAO, Integer pTOTAL_PAX, Integer pCRIANCAPAG, String pTIPOMASTER, String pCANAL_RESERVA,
			String pCC_NUMERO, String pCC_VALIDADE, String pCC_CV, String pLOC_CANAL, String pDIARIA_CONFIDENCIAL,
			String pOBS, String pLOC_MOTOR, String pMunicipal, String pN_Comple) throws Exception {
		long updated = 0;
		try {
			String sqlTmp = "";
			startTransaction();

			sqlTmp = INSERIR_RESERVA_FRONT + pID_EMPRESA + "," + pNUMRES + ",'" + pTXSN + "','" + pEMPRESA + "','"
					+ pSTATUS + "','" + pOCUPACAO + "','" + pDATACHE + "','" + pDATAPAR + "'," + pDIAREAL + ",'"
					+ StringUtils.escapeSql(pNOME) + "','" + pTIPOAPT + "','" + pCOMPARTI + "'," + pADULTO + ","
					+ pCRIANCA + "," + (pCONTRATO == null ? "NULL" : pCONTRATO) + ",'" + pHORAOUT + "','" + pHORAIN
					+ "'," + (pNTARIFA == null ? "NULL" : "'" + pNTARIFA + "'") + "," + pVDIARIA + ",'" + pFUNCALT
					+ "'," + (pNOMEAC == null ? "NULL" : "'" + StringUtils.escapeSql(pNOMEAC) + "'") + ",'" + pFONE
					+ "'," + (pNOMEAC1 == null ? "NULL" : "'" + StringUtils.escapeSql(pNOMEAC1) + "'") + ","
					+ (pNOMEAC2 == null ? "NULL" : "'" + StringUtils.escapeSql(pNOMEAC2) + "'") + ","
					+ (pNOMEAC3 == null ? "NULL" : "'" + StringUtils.escapeSql(pNOMEAC3) + "'") + ","
					+ (pNOMEAC4 == null ? "NULL" : "'" + StringUtils.escapeSql(pNOMEAC4) + "'") + ",'" + pCOD_EMP
					+ "','" + pINCOG + "','" + pFUN1N + "','" + pFUN1D + "','" + pFUN1H
					+ "',NULL,NULL,NULL,NULL,NULL,NULL,'" + pORIGEM + "','" + pSEGMENTO + "','" + pDOLAR + "','"
					+ pCOFRE + "','" + pOBS6 + "',"
					+ (pNOMECLI == null ? "NULL" : "'" + StringUtils.escapeSql(pNOMECLI) + "'") + ",'" + pTXTURISMO
					+ "','" + pUF + "'," + pVFDIRETO + "," + pTOTAL_DIAS + "," + pVALOR_PERIODO + ",'" + pREGIME + "',"
					+ pVALOR_PENSAO + "," + pTOTAL_PAX + ",'" + pTIPOMASTER + "','" + pCANAL_RESERVA + "',"
					+ (pCC_NUMERO == null ? "NULL" : "'" + pCC_NUMERO + "'") + ","
					+ (pCC_VALIDADE == null ? "NULL" : "'" + pCC_VALIDADE + "'") + ","
					+ (pCC_CV == null ? "NULL" : "'" + pCC_CV + "'") + ",'" + pLOC_CANAL + "','" + pDIARIA_CONFIDENCIAL
					+ "','" + StringUtils.escapeSql(pOBS) + "','S'" + ",'" + pLOC_MOTOR + "','" + pMunicipal 
					+ "','" + pN_Comple + "')";

			Query query = getSession().createSQLQuery(sqlTmp);

			logger.info(sqlTmp);

			updated = query.executeUpdate();

			finishTransacton();
		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirReservaFront ("
							+ e.getMessage() + ")\".");

		}
		return updated;
	}

	public long inserirOrcamentoReserva(Integer pID_EMPRESA, Integer pNUMRES, Double pVALOR, String pDATA,
			String pTARIFA, String pUSUARIO, String pDATAALT, String pHORAALT, String pSEMANA, String pFLAG,
			String pREGIME, Double pVALOR_PENSAO, Integer pQTD_PAX, String pTIPO_PAX, Integer pDESCONTO, String pTAXA,
			Double pVALOR_TAXA, Double pDIARIA, String pPARK1, String pPARK2) throws Exception {
		long updated = 0;
		try {

			String sqlTmp = "";
			/*
			 * String temp = DateUtils.getInstance().formatarData(DATA_RESERVA,
			 * BundleUtils.getMessage("formato.campo.data"));
			 * 
			 * Date sDATA_RESERVA = DateUtils.getInstance().criaDataComString(temp,
			 * BundleUtils.getMessage("formato.campo.data"));
			 * 
			 * temp = DateUtils.getInstance().formatarData(dataChegadaPrevista,
			 * BundleUtils.getMessage("formato.campo.data"));
			 * 
			 * Date sDATA_CHEG_PREV = DateUtils.getInstance().criaDataComString(temp,
			 * BundleUtils.getMessage("formato.campo.data"));
			 * 
			 * temp = DateUtils.getInstance().formatarData(dataPartidaPrevista,
			 * BundleUtils.getMessage("formato.campo.data"));
			 * 
			 * Date sDATA_PARTIDA_PREV = DateUtils.getInstance().criaDataComString(temp,
			 * BundleUtils.getMessage("formato.campo.data"));
			 */
			startTransaction();
			sqlTmp = INSERIR_ORCAMENTO_RESERVA + pID_EMPRESA + "," + pNUMRES + "," + pVALOR + ",'" + pDATA + "',"
					+ (pTARIFA == null ? "NULL" : "'" + pTARIFA + "'") + ",'" + pUSUARIO + "','" + pDATAALT + "','"
					+ pHORAALT + "','" + pSEMANA + "','" + pFLAG + "','" + pREGIME + "'," + pVALOR_PENSAO + ","
					+ pQTD_PAX + ",'" + pTIPO_PAX + "'," + pDESCONTO + ",'" + pTAXA + "'," + pVALOR_TAXA + "," + pDIARIA
					+ ",NULL,NULL)";

			Query query = getSession().createSQLQuery(sqlTmp);
			logger.info(sqlTmp);
			updated = query.executeUpdate();
			finishTransacton();
		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirReservaFront ("
							+ e.getMessage() + ")\".");

		}
		return updated;
	}

	public List<LphCidade> findFilter(String value) {
		// TODO Auto-generated method stub
		Query query = null;
		List<LphCidade> result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery(
						"SELECT IDCIDADE, CODMUNICIPIOIBGE, NOMECIDADE FROM CIDADE where upper(NOMECIDADE) like '%"
								+ value.trim().toUpperCase() + "%' order by NOMECIDADE")
				.addScalar("IDCIDADE", StandardBasicTypes.INTEGER)
				.addScalar("CODMUNICIPIOIBGE", StandardBasicTypes.STRING)
				.addScalar("NOMECIDADE", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphCidade.class));

		result = query.list();
		finishTransacton();
		return result;

	}

	public LphTipoUH findTipoUHById(Integer idPms, Integer idEmpresa) {
		// TODO Auto-generated method stub
		Query query = null;
		LphTipoUH result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery("SELECT SEQUENCIA,ID_EMPRESA, CODIGO, DESCRICAO FROM T_TIPOAPT WHERE ID_EMPRESA = "
						+ idEmpresa + " and SEQUENCIA = " + idPms + " order by DESCRICAO")
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("SEQUENCIA", StandardBasicTypes.INTEGER)
				.addScalar("CODIGO", StandardBasicTypes.STRING).addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphTipoUH.class));

		result = (LphTipoUH) query.uniqueResult();
		finishTransacton();

		return result;

	}

	public LphPensao findPensaoById(Integer idEmpresa, String codigo) {
		Query query = null;
		LphPensao result = null;
		startTransaction();

		query = getSession()
				.createSQLQuery("SELECT SEQUENCIA,ID_EMPRESA, CODIGO, DESCRICAO FROM REGIME where ID_EMPRESA = "
						+ idEmpresa + " and CODIGO = '" + codigo + "'  order by DESCRICAO")
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("SEQUENCIA", StandardBasicTypes.INTEGER)
				.addScalar("CODIGO", StandardBasicTypes.STRING).addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(LphPensao.class));

		result = (LphPensao) query.uniqueResult();
		finishTransacton();
		return result;
	}

	public Integer getNextSeqReservasFront(DataSourceEnum tipoDataSource) {
		// TODO Auto-generated method stub
		Query query = null;
		Integer result = null;
		try {
			startTransaction();
			query = getSession().createSQLQuery(" SELECT MAX(SEQUENCIA) + 1 as num FROM RESERVA").addScalar("num",
					StandardBasicTypes.INTEGER);
			result = ((Integer) query.uniqueResult()).intValue();

			System.out.println("ID Final : " + result);
		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);

		} finally {

			finishTransacton();
		}

		return result;

	}

	public Integer getNextSeqNumeroReserva(DataSourceEnum tipoDataSource) {
		// TODO Auto-generated method stub
		Query query = null;
		Integer result = null;
		try {
			startTransaction();
			query = getSession().createSQLQuery(" SELECT MAX(NUMRES) + 1 as num FROM RESERVA").addScalar("num",
					StandardBasicTypes.INTEGER);
			result = (Integer) query.uniqueResult();

			System.out.println("ID Final : " + result);
		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);

		} finally {

			finishTransacton();
		}

		return result;

	}

	public Integer getNextSeqOrcamento(DataSourceEnum tipoDataSource) {
		// TODO Auto-generated method stub
		Query query = null;
		Integer result = null;
		try {
			startTransaction();
			query = getSession().createSQLQuery(" SELECT MAX(SEQUENCIA) + 1 as num FROM ORCAMENTO_RES").addScalar("num",
					StandardBasicTypes.INTEGER);
			result = ((Integer) query.uniqueResult()).intValue();

			System.out.println("ID Final : " + result);
		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);

		} finally {

			finishTransacton();
		}

		return result;

	}

	public LphParam findParam(Integer idEmpresa) {
		// TODO Auto-generated method stub
		Query query = null;
		LphParam result = null;
		startTransaction();

		query = getSession().createSQLQuery(
				"SELECT ID_EMPRESA, PARAT1, VCAFE , COD_MEIAPENSAO, VALOR_MEIAPENSAO , COD_PENSAOCOMPLETA, VALOR_PENSAOCOMPLETA FROM PARAME WHERE ID_EMPRESA = "
						+ idEmpresa)
				.addScalar("ID_EMPRESA", StandardBasicTypes.INTEGER).addScalar("PARAT1", StandardBasicTypes.STRING)
				.addScalar("VCAFE", StandardBasicTypes.DOUBLE).addScalar("COD_MEIAPENSAO", StandardBasicTypes.STRING)
				.addScalar("VALOR_MEIAPENSAO", StandardBasicTypes.DOUBLE)
				.addScalar("COD_PENSAOCOMPLETA", StandardBasicTypes.STRING)
				.addScalar("VALOR_PENSAOCOMPLETA", StandardBasicTypes.DOUBLE);

		query.setResultTransformer(Transformers.aliasToBean(LphParam.class));

		result = (LphParam) query.uniqueResult();
		finishTransacton();

		return result;

	}

	public long cancelarReserva(String numeroReservaPms, Integer idEmpresa, Date dataCancelamento, Long idmotivo,
			String motivo, String usuario) throws Exception {
		// TODO Auto-generated method stub
		long updated = 0;
		try {

			Calendar calIn = DateUtils.getInstance().getCalendar();

			String dataInsercao = DateUtils.getInstance().formatarData(dataCancelamento, "yyyy/MM/dd");
			calIn.setTimeInMillis(System.currentTimeMillis());

			String horaInsercao = TextUtils.lpad(String.valueOf(calIn.get(Calendar.HOUR_OF_DAY)), "0", 2) + ":"
					+ TextUtils.lpad(String.valueOf(calIn.get(Calendar.MINUTE)), "0", 2) + ":"
					+ TextUtils.lpad(String.valueOf(calIn.get(Calendar.SECOND)), "0", 2);

			String CANCELAR_RESERVA = "UPDATE RESERVA SET STATUS = 2, ID_CANCELAMENTO = " + idmotivo
					+ ", MOTIVO_CANCELAMENTO = '" + motivo + "',FUN4N = '" + usuario + "',FUN4D = '" + dataInsercao
					+ "',FUN4H = '" + horaInsercao + "'  WHERE ID_EMPRESA = " + idEmpresa + " AND NUMRES = "
					+ numeroReservaPms + "";
			startTransaction();

			logger.info(CANCELAR_RESERVA);

			Query query = getSession().createSQLQuery(CANCELAR_RESERVA);

			updated = query.executeUpdate();

			finishTransacton();
		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha cancelarReserva ("
							+ e.getMessage() + ")\".");
		}
		return updated;

	}

	public String findByIdReservaFront(Integer reserva) {
		Query query = null;
		String result = null;
		startTransaction();

		query = getSession().createSQLQuery("SELECT STATUS FROM RESERVA WHERE NUMRES = " + reserva);

		result = (String) query.uniqueResult();
		finishTransacton();

		return result;

	}

	public long inserirLancamento(Integer pID_EMPRESA, Integer pNUMRES, String pVALOR, String pTIPOCC, String pCODIGO,
			String pDESC, String pHISTOR, String pDATALAN, String pHORALAN, String pFUNC, String pCOD_CARTAO,
			String pCC_NUMERO, String pCC_AUTORIZACAO, String pCC_NSU, String pDATA_CREDITO) throws Exception {
		long updated = 0;
		try {
			String sqlTmp = "";
			startTransaction();

			sqlTmp = INSERT_INTO_LANCA + pID_EMPRESA + "," + pNUMRES + ",'" + pVALOR + "','S','" + pTIPOCC + "','N',"
					+ "'" + pCODIGO + "'," + "'" + pDESC + "'," + "'" + pHISTOR + "'," + "'C','N','" + pDATALAN + "','"
					+ pHORALAN + "',1,'" + pFUNC + "',"
				    + (pCOD_CARTAO == null ? "NULL," : "'" + pCOD_CARTAO + "',")
					+ "1," 
					+ (pCC_NUMERO == null ? "NULL," : "'" + pCC_NUMERO + "',")
					+ (pCC_AUTORIZACAO == null ? "NULL," : "'" + pCC_AUTORIZACAO + "',")
					+ (pCC_NSU == null ? "NULL," : "'" + pCC_NSU + "',")
					+ "1,'" + pDATA_CREDITO + "')";

			Query query = getSession().createSQLQuery(sqlTmp);

			logger.info(sqlTmp);

			updated = query.executeUpdate();

			finishTransacton();
		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirReservaFront ("
							+ e.getMessage() + ")\".");

		}
		return updated;
	}

}