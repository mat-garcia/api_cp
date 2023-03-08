
package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;
import javax.xml.bind.JAXBException;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import br.com.hdnit.lotus.foundation.util.BundleUtils;
import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.foundation.util.DateUtils;
import br.com.hdnit.lotus.foundation.util.FileUtils;
import br.com.hdnit.lotus.foundation.util.XmlUtils;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.dao._interface.IReservasfrontDAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.ClienteDTO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.FaixaDTO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Reservasfront;
import br.com.hdnit.lotus.pms.cm.entity.oracle.TipoDebitoDTO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.TipoServicoDTO;

public class ReservasfrontDAOImpl extends AbstractGenericCMJPADAO<Reservasfront> implements IReservasfrontDAO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static String INSERIR_SERVICO_CANAL = "INSERT INTO SERVICOSXMOVHOSP (IDHOTEL,IDRESERVASFRONT,IDSERVICOHOTEL,IDHOSPEDE,VALORMANUAL)  VALUES ( :pIdHotel,:pIdReserva,:pIdServicoHotel,:pIdHospede,0)";

	private static String INSERIR_EVENTO_RESERVA = "INSERT INTO eventoreserva (IDDIRECIONAMENTO," + " dataevento,"
			+ " idreservasfront," + " idhotel," + " vlrdiaria," + " flgtarifa," + " moecodigo," + " flgsegmento,"
			+ " flgpacote," + " flgdiaria," + " flgdesconto," + " flgpensao)" + " VALUES (" + ":dataevento,"
			+ ":idreservasfront," + ":idhotel," + ":vlrdiaria," + "'N'," + ":moecodigo," + "'N'," + "'N'," + "'S',"
			+ "'N'," + "'N')";

	private static String INSERIR_DIRECIONAMENTO = "INSERT INTO direcdespesas (IDDIRECIONAMENTO," + " idhotel,"
			+ " idtipodebcred," + " idconta," + " idcontadestino," + " datainicio," + " datafim," + " horafim,"
			+ " incluialcool," + " percentual)" + " VALUES (:pID,:pidHotel,:pIdTipoDeb," + ":pIdContaCliente,"
			+ ":pIdContaDestino," + ":pDataInicio," + ":pDataFim," + ":pHoraFim," + "'N'," + "100)";

	private static String INSERIR_RESERVA_FRONT_V2 = "INSERT INTO RESERVASFRONT " + "(IDHOTEL," + // 1
			"IDRESERVASFRONT," + // 2
			"NUMRESERVA," + // 3
			"USUARIO," + // 4
			"TIPOUHESTADIA," + // 5
			"ADULTOS," + // 6
			"IDVEICULOS," + // 7
			"VLRDIARIA," + // 8
			"VLRDIARIAMANUAL," + // 8
			"MOECODIGOMANUAL," + // 9
			"FLGMENSALISTA," + // 10
			"LANCAUPSELL," + // 11
			"NUMRESERVAPRINC," + // 12
			"FLGREQCHECKIN," + // 13
			"IDORIGEM," + // 14
			"STATUSRESERVA," + // 15fc
			"CLIENTERESERVANTE," + // 16
			"IDTARIFA," + // 17
			"CODSEGMENTO," + // 18
			"IDDOCUMENTO," + // 19
			"IDMEIOCOMUNICACAO," + // 20
			"FLGDIARIAFIXA," + // 21
			"GARANTENOSHOW," + // 22
			"AJUSTE," + // 23
			"POOLLISTA," + // 24
			"IDUSUALTERACAO," + // 25
			// "VLRDIARIAMANUAL,"+ // 26
			"CRIANCAS1," + // 27
			"PERCDESCONTODIARIA," + // 28
			"CODPENSAO," + // 29
			"VLRDIARIASEMIMPOSTO," + // 30
			"FLAGCOMPARTILHADA," + // 31
			"OBSERVACOES," + // 32
			"DOCUMENTO," + // 33
			"CRIANCAS2," + // 34
			"VLRDIARIAPADRAO," + // 35
			"AUTOCHECKOUT," + // 36
			"DATARESERVA," + // 37
			"DATACHEGPREVISTA," + // 38
			"DATAPARTPREVISTA," + // 39
			"LOCRESERVA," + // 40
			"CONTRATOINICIAL," + // 41
			"HORARESERVA," + // 42
			"HORACHEGPREVISTA," + // 43
			"HORAPARTPREVISTA," + // 44
			"TIPOUHTARIFA," + // 45
			// "CONTRATOFINAL,"+ // 46
			"OBSCMNET," + // 46
			"DATAULTALTERACAO," + // 47
			"RESERVANTE," + // 48
			"EMAILRESERVANTE," + // 49
			"TELRESERVANTE," + // 50
			"CODREFERENCIA)" + " VALUES (";
	
	private static String INSERIR_RESERVA_FRONT_V2_SEM_CONTRATO = "INSERT INTO RESERVASFRONT " + "(IDHOTEL," + // 1
			"IDRESERVASFRONT," + // 2
			"NUMRESERVA," + // 3
			"USUARIO," + // 4
			"TIPOUHESTADIA," + // 5
			"ADULTOS," + // 6
			"IDVEICULOS," + // 7
			"VLRDIARIA," + // 8
			"VLRDIARIAMANUAL," + // 8
			"MOECODIGOMANUAL," + // 9
			"FLGMENSALISTA," + // 10
			"LANCAUPSELL," + // 11
			"NUMRESERVAPRINC," + // 12
			"FLGREQCHECKIN," + // 13
			"IDORIGEM," + // 14
			"STATUSRESERVA," + // 15fc
			"CLIENTERESERVANTE," + // 16
			"IDTARIFA," + // 17
			"CODSEGMENTO," + // 18
			"IDDOCUMENTO," + // 19
			"IDMEIOCOMUNICACAO," + // 20
			"FLGDIARIAFIXA," + // 21
			"GARANTENOSHOW," + // 22
			"AJUSTE," + // 23
			"POOLLISTA," + // 24
			"IDUSUALTERACAO," + // 25
			// "VLRDIARIAMANUAL,"+ // 26
			"CRIANCAS1," + // 27
			"PERCDESCONTODIARIA," + // 28
			"CODPENSAO," + // 29
			"VLRDIARIASEMIMPOSTO," + // 30
			"FLAGCOMPARTILHADA," + // 31
			"OBSERVACOES," + // 32
			"DOCUMENTO," + // 33
			"CRIANCAS2," + // 34
			"VLRDIARIAPADRAO," + // 35
			"AUTOCHECKOUT," + // 36
			"DATARESERVA," + // 37
			"DATACHEGPREVISTA," + // 38
			"DATAPARTPREVISTA," + // 39
			"LOCRESERVA," + // 40
//			"CONTRATOINICIAL," + // 41
			"HORARESERVA," + // 42
			"HORACHEGPREVISTA," + // 43
			"HORAPARTPREVISTA," + // 44
			"TIPOUHTARIFA," + // 45
			// "CONTRATOFINAL,"+ // 46
			"OBSCMNET," + // 46
			"DATAULTALTERACAO," + // 47
			"RESERVANTE," + // 48
			"EMAILRESERVANTE," + // 49
			"TELRESERVANTE," + // 50
			"CODREFERENCIA)" + " VALUES (";


	private static String INSERIR_RESERVA_FRONT = "INSERT INTO RESERVASFRONT " + "(IDHOTEL," + // 1
			"IDRESERVASFRONT," + // 2
			"NUMRESERVA," + // 3
			"USUARIO," + // 4
			"TIPOUHESTADIA," + // 5
			"ADULTOS," + // 6
			"IDVEICULOS," + // 7
			"VLRDIARIA," + // 8
			"VLRDIARIAMANUAL," + // 8
			"MOECODIGOMANUAL," + // 9
			"FLGMENSALISTA," + // 10
			"LANCAUPSELL," + // 11
			"NUMRESERVAPRINC," + // 12
			"FLGREQCHECKIN," + // 13
			"IDORIGEM," + // 14
			"STATUSRESERVA," + // 15fc
			"CLIENTERESERVANTE," + // 16
			"IDTARIFA," + // 17
			"CODSEGMENTO," + // 18
			"IDDOCUMENTO," + // 19
			"IDMEIOCOMUNICACAO," + // 20
			"FLGDIARIAFIXA," + // 21
			"GARANTENOSHOW," + // 22
			"AJUSTE," + // 23
			"POOLLISTA," + // 24
			"IDUSUALTERACAO," + // 25
			// "VLRDIARIAMANUAL,"+ // 26
			"CRIANCAS1," + // 27
			"PERCDESCONTODIARIA," + // 28
			"CODPENSAO," + // 29
			"VLRDIARIASEMIMPOSTO," + // 30
			"FLAGCOMPARTILHADA," + // 31
			"OBSERVACOES," + // 32
			"DOCUMENTO," + // 33
			"CRIANCAS2," + // 34
			"VLRDIARIAPADRAO," + // 35
			"AUTOCHECKOUT," + // 36
			"DATARESERVA," + // 37
			"DATACHEGPREVISTA," + // 38
			"DATAPARTPREVISTA," + // 39
			"LOCRESERVA," + // 40
			"CONTRATOINICIAL," + // 41
			"HORARESERVA," + // 42
			"HORACHEGPREVISTA," + // 43
			"HORAPARTPREVISTA," + // 44
			"TIPOUHTARIFA," + // 45
			// "CONTRATOFINAL,"+ // 46
			"OBSCMNET," + // 46
			"DATAULTALTERACAO," + // 47
			"RESERVANTE," + // 48
			"EMAILRESERVANTE," + // 49
			"TELRESERVANTE," + // 50
			"CODREFERENCIA)" + " VALUES (:pIDHOTEL," + // 1
			":pIDRESERVASFRONT," + // 2
			":pNUMRESERVA," + // 3
			":pUSUARIO," + // 4
			":pTIPOUHESTADIA," + // 5
			":pADULTOS," + // 6
			":pIDVEICULOS," + // 7
			":pVLRDIARIA," + // 8
			":pVLRDIARIAMANUAL," + // 8
			":pMOECODIGOMANUAL," + // 9
			":pFLGMENSALISTA," + // 10
			":pLANCAUPSELL," + // 11
			":pNUMRESERVAPRINC," + // 12
			":pFLGREQCHECKIN," + // 13
			":pIDORIGEM," + // 14
			":pSTATUSRESERVA," + // 15
			":pCLIENTERESERVANTE," + // 16
			":pIDTARIFA," + // 17
			":pCODSEGMENTO," + // 18
			":pIDDOCUMENTO," + // 19
			":pIDMEIOCOMUNICACAO," + // 20
			":pFLGDIARIAFIXA," + // 21
			":pGARANTENOSHOW," + // 22
			":pAJUSTE," + // 23
			":pPOOLLISTA," + // 24
			":pIDUSUALTERACAO," + // 25
			// ":pVLRDIARIAMANUAL,"+ // 26
			":pCRIANCAS1," + // 27
			":pPERCDESCONTODIARIA," + // 28
			":pCODPENSAO," + // 29
			":pVLRDIARIASEMIMPOSTO," + // 30
			":pFLAGCOMPARTILHADA," + // 31
			":pOBSERVACOES," + // 32
			":pDOCUMENTO," + // 33
			":pCRIANCAS2," + // 34
			":pVLRDIARIAPADRAO," + // 35
			":pAUTOCHECKOUT," + // 36
			":pDATARESERVA," + // 37
			":pDATACHEGPREVISTA," + // 38
			":pDATAPARTPREVISTA," + // 39
			":pLOCRESERVA," + // 40
			":pCONTRATOINICIAL," + // 41
			":pHORARESERVA," + // 42
			":pHORACHEGPREVISTA," + // 43
			":pHORAPARTPREVISTA," + // 44
			":pTIPOUHTARIFA," + // 45
			// ":pCONTRATOFINAL,"+ // 46
			":pOBSERVACOESCM," + // 46
			":pDATAULTALTERACAO," + // 47
			":pRESERVANTE," + // 48
			":pEMAIL," + // 49
			":pTELEFONE," + // 50
			":pCODREFERENCIA)"; // 50

	private static String INSERIR_RESERVA_FRONT_V1 = "INSERT INTO RESERVASFRONT " + "(IDHOTEL," + // 1
			"IDRESERVASFRONT," + // 2
			"NUMRESERVA," + // 3
			"USUARIO," + // 4
			"TIPOUHESTADIA," + // 5
			"ADULTOS," + // 6
			"IDVEICULOS," + // 7
			"VLRDIARIA," + // 8
			"VLRDIARIAMANUAL," + // 8
			"MOECODIGOMANUAL," + // 9
			"FLGMENSALISTA," + // 10
			"LANCAUPSELL," + // 11
			"NUMRESERVAPRINC," + // 12
			"FLGREQCHECKIN," + // 13
			"IDORIGEM," + // 14
			"STATUSRESERVA," + // 15fc
			"CLIENTERESERVANTE," + // 16
			"IDTARIFA," + // 17
			"CODSEGMENTO," + // 18
			"IDDOCUMENTO," + // 19
			"IDMEIOCOMUNICACAO," + // 20
			"FLGDIARIAFIXA," + // 21
			"GARANTENOSHOW," + // 22
			"AJUSTE," + // 23
			"POOLLISTA," + // 24
			"IDUSUALTERACAO," + // 25
			// "VLRDIARIAMANUAL,"+ // 26
			"CRIANCAS1," + // 27
			"PERCDESCONTODIARIA," + // 28
			"CODPENSAO," + // 29
			"VLRDIARIASEMIMPOSTO," + // 30
			"FLAGCOMPARTILHADA," + // 31
			"OBSERVACOES," + // 32
			"DOCUMENTO," + // 33
			"CRIANCAS2," + // 34
			"VLRDIARIAPADRAO," + // 35
			"AUTOCHECKOUT," + // 36
			"DATARESERVA," + // 37
			"DATACHEGPREVISTA," + // 38
			"DATAPARTPREVISTA," + // 39
			"LOCRESERVA," + // 40
			"HORARESERVA," + // 42
			"HORACHEGPREVISTA," + // 43
			"HORAPARTPREVISTA," + // 44
			"TIPOUHTARIFA," + // 45
			// "CONTRATOFINAL,"+ // 46
			"OBSCMNET," + // 46
			"DATAULTALTERACAO," + // 47
			"RESERVANTE," + // 48
			"EMAILRESERVANTE," + // 49
			"TELRESERVANTE," + // 50
			"CODREFERENCIA)" + " VALUES (:pIDHOTEL," + // 1
			":pIDRESERVASFRONT," + // 2
			":pNUMRESERVA," + // 3
			":pUSUARIO," + // 4
			":pTIPOUHESTADIA," + // 5
			":pADULTOS," + // 6
			":pIDVEICULOS," + // 7
			":pVLRDIARIA," + // 8
			":pVLRDIARIAMANUAL," + // 8
			":pMOECODIGOMANUAL," + // 9
			":pFLGMENSALISTA," + // 10
			":pLANCAUPSELL," + // 11
			":pNUMRESERVAPRINC," + // 12
			":pFLGREQCHECKIN," + // 13
			":pIDORIGEM," + // 14
			":pSTATUSRESERVA," + // 15
			":pCLIENTERESERVANTE," + // 16
			":pIDTARIFA," + // 17
			":pCODSEGMENTO," + // 18
			":pIDDOCUMENTO," + // 19
			":pIDMEIOCOMUNICACAO," + // 20
			":pFLGDIARIAFIXA," + // 21
			":pGARANTENOSHOW," + // 22
			":pAJUSTE," + // 23
			":pPOOLLISTA," + // 24
			":pIDUSUALTERACAO," + // 25
			// ":pVLRDIARIAMANUAL,"+ // 26
			":pCRIANCAS1," + // 27
			":pPERCDESCONTODIARIA," + // 28
			":pCODPENSAO," + // 29
			":pVLRDIARIASEMIMPOSTO," + // 30
			":pFLAGCOMPARTILHADA," + // 31
			":pOBSERVACOES," + // 32
			":pDOCUMENTO," + // 33
			":pCRIANCAS2," + // 34
			":pVLRDIARIAPADRAO," + // 35
			":pAUTOCHECKOUT," + // 36
			":pDATARESERVA," + // 37
			":pDATACHEGPREVISTA," + // 38
			":pDATAPARTPREVISTA," + // 39
			":pLOCRESERVA," + // 40
			":pHORARESERVA," + // 42
			":pHORACHEGPREVISTA," + // 43
			":pHORAPARTPREVISTA," + // 44
			":pTIPOUHTARIFA," + // 45
			// ":pCONTRATOFINAL,"+ // 46
			":pOBSERVACOESCM," + // 46
			":pDATAULTALTERACAO," + // 47
			":pRESERVANTE," + // 48
			":pEMAIL," + // 49
			":pTELEFONE," + // 50
			":pCODREFERENCIA)"; // 50

	private static String INSERIR_PESSOA = "INSERT INTO pessoa " + "(IDPESSOA," + // 1
			"NOME," + // 2
			"TIPO," + // 3
			"RAZAOSOCIAL," + // 4
			"EMAIL," + // 5
			"flghospede," + // 6
			"trguserinclusao," + // 7
			"FLGATUALIZAR," + // 8
			"IDENDRESIDENCIAL," + // 9
			"trgDtInclusao," + // 10
			"NUMDOCUMENTO)" + // 10

			" VALUES (" + ":pIDPESSOA," + // 1
			":pNOME," + // 2
			":pTIPO," + // 3
			":pRAZAOSOCIAL," + // 4
			":pEMAIL," + // 5
			":pflghospede," + // 6
			":ptrguserinclusao," + // 7
			":pFLGATUALIZAR," + // 8
			":pIDENDRESIDENCIAL," + // 9
			":ptrgDtInclusao," +
			":pNumDocumento)"; // 10
	
	private static String INSERIR_DOCPESSOA = "INSERT INTO DOCPESSOA " +
			  "(IDPESSOA,"
			+ " IDDOCUMENTO,"
			+ "	NUMDOCUMENTO)"
			+ "	VALUES ("
			+ ":pIDPESSOA,"
			+ ":pIDDOCUMENTO,"
			+ ":pNUMDOCUMENTO)";
	
	private static String INSERIR_PESSOA_FISICA = "INSERT INTO PESSOAFISICA " +
			  "(IDPESSOA,"
			+ "	DATANASC)"
			+ "	VALUES ("
			+ ":pIDPESSOA,"
			+ ":pDATANASC)"; 

	private static String INSERIR_ENDPESS = "INSERT INTO ENDPESS " + "(IdPESSOA," + // 1
			"idcidades," + // 2
			"tipoendereco," + // 3
			"IDENDERECO)" + // 4

			" VALUES (" + ":pIdPESSOA," + // 1
			":pcidades," + // 2
			":ptipoendereco," + // 3
			":pIDENDERECO)"; // 4
	
	private static String INSERIR_TELENDPESS = "INSERT INTO TELENDPESS " + "(IDTELEFONE," + // 1
			"IDENDERECO," + // 2
			"NUMERO," +
			"DDI," +
			"DDD," +
		    "TIPO)" + // 3

			" VALUES (" + ":pIDTELEFONE," + // 1
			":pIDENDERECO," + // 2
			":pNUMERO," +
			":pDDI," +
			":pDDD,"+
		    ":pTIPO)"; // 3

	private static String INSERIR_HOSPEDE = "INSERT INTO HOSPEDE " + "(IdFaixaEtaria," + // 1
			"CodTratamento," + // 2
			"IDHOSPEDE," + // 3
			"SOBRENOME," + // 4
			"NOME," + // 5
			"RECEBEMALADIRETA," + // 6
			"FUMANTE," + // 7
			"TRGUSERINCLUSAO," + // 8
			"FLGENVIASMS," + // 9
			"FLGPAGATAXATURISMO," + // 10
			"TIPOETARIO," + // 11
			"trgDtInclusao)" + // 12

			" VALUES (" + ":pIdFaixaEtaria," + // 1
			":pCodTratamento," + // 2
			":pIDHOSPEDE," + // 3
			":pSOBRENOME," + // 4
			":pNOME," + // 5
			":pRECEBEMALADIRETA," + // 6
			":pFUMANTE," + // 7
			":pTRGUSERINCLUSAO," + // 8
			":pFLGENVIASMS," + // 9
			":pFLGPAGATAXATURISMO," + // 1Q
			":pTipoEtario," + // 11
			":ptrgDtInclusao)"; // 12

	private static String INSERIR_CONTASFRONT = "INSERT INTO CONTASFRONT " + "(IDHOTEL," + // 1
			"IDCONTA," + // 2
			"TIPOCONTA," + // 3
			"DESIGNACAO," + // 4
			"FORMAPAGT," + // 5
			"IDRESERVASFRONT," + // 6
			"IDHOSPEDE," + // 7
			"TRGUSERINCLUSAO," + // 8
			"FLGESTRECEITAS," + // 9
			"FLGIMPRIMIUEXTRATO," + // 10
			"DataAbertura," + // 11
			"HoraAbertura," + // 12
			"DATAENCPREVISTO," + // 13
			"HORAEncPrevisto)" + // 14

			" VALUES (" + ":pIDHOTEL," + // 1
			":pIDCONTA," + // 2
			":pTIPOCONTA," + // 3
			":pDESIGNACAO," + // 4
			":pFORMAPAGT," + // 5
			":pIDRESERVASFRONT," + // 6
			":pIDHOSPEDE," + // 7
			":pTRGUSERINCLUSAO," + // 8
			":pFLGESTRECEITAS," + // 9
			":pFLGIMPRIMIUEXTRATO," + // 10
			":pDataAbertura," + // 11
			":pHoraAbertura," + // 12
			":pDATAENCPREVISTO," + // 13
			":pHORAEncPrevisto)"; // 14

	private static String INSERIR_CONTASFRONT_EMPRESA = "INSERT INTO CONTASFRONT " + "(IDHOTEL," + // 1
			"IDCONTA," + // 2
			"TIPOCONTA," + // 3
			"DESIGNACAO," + // 4
			"FORMAPAGT," + // 5
			"IDRESERVASFRONT," + // 6
			"IDFORCLI," + // 7
			"CODCONTRATO," + // 7
			"TRGUSERINCLUSAO," + // 8
			"FLGESTRECEITAS," + // 9
			"FLGIMPRIMIUEXTRATO," + // 10
			"DataAbertura," + // 11
			"HoraAbertura," + // 12
			"DATAENCPREVISTO," + // 13
			"HORAEncPrevisto)" + // 14

			" VALUES (" + ":pIDHOTEL," + // 1
			":pIDCONTA," + // 2
			":pTIPOCONTA," + // 3
			":pDESIGNACAO," + // 4
			":pFORMAPAGT," + // 5
			":pIDRESERVASFRONT," + // 6
			":pIDFORCLI," + // 7
			":pCODCONTRATO," + // 7
			":pTRGUSERINCLUSAO," + // 8
			":pFLGESTRECEITAS," + // 9
			":pFLGIMPRIMIUEXTRATO," + // 10
			":pDataAbertura," + // 11
			":pHoraAbertura," + // 12
			":pDATAENCPREVISTO," + // 13
			":pHORAEncPrevisto)"; // 14

	private static String INSERIR_CONTASFRONT_EMPRESA_SEM_CONTRATO = "INSERT INTO CONTASFRONT " + "(IDHOTEL," + // 1
			"IDCONTA," + // 2
			"TIPOCONTA," + // 3
			"DESIGNACAO," + // 4
			"FORMAPAGT," + // 5
			"IDRESERVASFRONT," + // 6
			"IDFORCLI," + // 7
			"TRGUSERINCLUSAO," + // 8
			"FLGESTRECEITAS," + // 9
			"FLGIMPRIMIUEXTRATO," + // 10
			"DataAbertura," + // 11
			"HoraAbertura," + // 12
			"DATAENCPREVISTO," + // 13
			"HORAEncPrevisto)" + // 14

			" VALUES (" + ":pIDHOTEL," + // 1
			":pIDCONTA," + // 2
			":pTIPOCONTA," + // 3
			":pDESIGNACAO," + // 4
			":pFORMAPAGT," + // 5
			":pIDRESERVASFRONT," + // 6
			":pIDFORCLI," + // 7
			":pTRGUSERINCLUSAO," + // 8
			":pFLGESTRECEITAS," + // 9
			":pFLGIMPRIMIUEXTRATO," + // 10
			":pDataAbertura," + // 11
			":pHoraAbertura," + // 12
			":pDATAENCPREVISTO," + // 13
			":pHORAEncPrevisto)"; // 14

	private static String INSERIR_RESERVAREDUZ = "INSERT INTO ReservaReduz " + "(IdReservasFront," + // 1
			"IDHOTEL," + // 2
			"STATUSRESERVA," + // 3
			"IDFORCLI," + // 4
			"IDTIPOUH," + // 5
			"DATACHEGADA," + // 6
			"DATAPARTIDA)" + // 7

			" VALUES (" + ":pIdReservasFront," + // 1
			":pIDHOTEL," + // 2
			":pSTATUSRESERVA," + // 3
			":pIDFORCLI," + // 4
			":pIDTIPOUH," + // 5
			":pDATACHEGADA," + // 6
			":pDATAPARTIDA)"; // 7

	private static String INSERIR_RESERVAREDUZ_CONTRATO = "INSERT INTO ReservaReduz " + "(IdReservasFront," + // 1
			"IDHOTEL," + // 2
			"STATUSRESERVA," + // 3
			"IDFORCLI," + // 4
			"IDTIPOUH," + // 5
			"CODCONTRATO," + // 5
			"DATACHEGADA," + // 6
			"DATAPARTIDA)" + // 7

			" VALUES (" + ":pIdReservasFront," + // 1
			":pIDHOTEL," + // 2
			":pSTATUSRESERVA," + // 3
			":pIDFORCLI," + // 40
			":pIDTIPOUH," + // 5
			":pCODCONTRATO," + // 5
			":pDATACHEGADA," + // 6
			":pDATAPARTIDA)"; // 7

	private static String INSERIR_MOVIHOSPEDE = "INSERT INTO MOVIMENTOHOSPEDES " + "(IdReservasFront," + // 1
			"IDHOTEL," + // 2
			"IDHOSPEDE," + // 3
			"IDTIPOHOSPEDE," + // 4
			"INCOGNITO," + // 5
			"USODACASA," + // 6
			"PRINCIPAL," + // 7
			"PercDiaria," + // 8
			"MENORIDADE," + // 9
			"DataChegPrevista," + // 10
			"DataPartPrevista," + // 11
			"trgDtInclusao," + // 12
			"HoraChegPrevista," + // 13
			"HoraPartPrevista," + // 14
			"trgUserInclusao)" + // 15

			" VALUES (" + ":pIdReservasFront," + // 1
			":pIDHOTEL," + // 2
			":pIDHOSPEDE," + // 3
			":pIDTIPOHOSPEDE," + // 4
			":pINCOGNITO," + // 5
			":pUSODACASA," + // 6
			":pPRINCIPAL," + // 7
			":pPercDiaria," + // 8
			":pMENORIDADE," + // 9
			":pDataChegPrevista," + // 10
			":pDataPartPrevista," + // 11
			":ptrgDtInclusao," + // 12
			":pHoraChegPrevista," + // 13
			":pHoraPartPrevista," + // 14
			":ptrgUserInclusao)"; // 15

	private static String INSERIR_MOVIHOSPEDE_MENOR = "INSERT INTO MOVIMENTOHOSPEDES " + "(IdReservasFront," + // 1
			"IDHOTEL," + // 2
			"IDHOSPEDE," + // 3
			"IDTIPOHOSPEDE," + // 4
			"INCOGNITO," + // 5
			"USODACASA," + // 6
			"PRINCIPAL," + // 7
			"PercDiaria," + // 8
			"MENORIDADE," + // 9
			"DataChegPrevista," + // 10
			"DataPartPrevista," + // 11
			"trgDtInclusao," + // 12
			"HoraChegPrevista," + // 13
			"HoraPartPrevista," + // 14
			"IDRESPONSAVEL," + "trgUserInclusao)" + // 15

			" VALUES (" + ":pIdReservasFront," + // 1
			":pIDHOTEL," + // 2
			":pIDHOSPEDE," + // 3
			":pIDTIPOHOSPEDE," + // 4
			":pINCOGNITO," + // 5
			":pUSODACASA," + // 6
			":pPRINCIPAL," + // 7
			":pPercDiaria," + // 8
			":pMENORIDADE," + // 9
			":pDataChegPrevista," + // 10
			":pDataPartPrevista," + // 11
			":ptrgDtInclusao," + // 12
			":pHoraChegPrevista," + // 13
			":pHoraPartPrevista," + // 14
			":pIdResponsavel," + // 14
			":ptrgUserInclusao)"; // 15

	private static String INSERIR_HOSPEDEHOTEL = "INSERT INTO HOSPEDEXHOTEL " + "(IDHOSPEDE," + // 1
			"IDHOTEL," + // 2
			"IDTIPOHOSPEDE," + // 3
			"trgDtInclusao," + // 4
			"trgUserInclusao)" + // 5

			" VALUES (" + ":pIDHOSPEDE," + // 1
			":pIDHOTEL," + // 2
			":pIDTIPOHOSPEDE," + // 3
			":ptrgDtInclusao," + // 4
			":ptrgUserInclusao)"; // 5

	private static String INSERIR_ORCAMENTORESERVA = "INSERT INTO ORCAMENTORESERVA " + "(IDRESERVASFRONT," + // 1
			"DATA," + // 2
			"VALOR," + // 3
			"VALORTARIFA," + // 3
			"VALORMANUAL," + // 3
			"CODSEGMENTO," + "IDORIGEM," + "MOECODIGO," + "SIGLAMOEDA," + // 4
			"IDTARIFA," + // 5
			"IDHOTEL," + // 6
			"CODPENSAO," + // 7
			"trgDtInclusao," + // 8
			"trgUserInclusao)" + // 9

			" VALUES (" + ":pIDRESERVASFRONT," + // 1
			":pDATA," + // 2
			":pVALOR," + // 3
			":pVALORTARIFA," + // 3
			":pVALORMANUAL," + // 3
			":pCODSEGMENTO," + ":pIDORIGEM," + ":pMOECODIGO," + ":pSIGLAMOEDA," + // 4
			":pIDTARIFA," + // 5
			":pIDHOTEL," + // 6
			":pCODPENSAO," + // 7
			":ptrgDtInclusao," + // 8
			":ptrgUserInclusao)"; // 9

	private static String CANCELAR_RESERVA = "UPDATE RESERVASFRONT SET STATUSRESERVA = 6,"
			+ " DATACANCELAMENTO = :pDATA," + " IDMOTIVO = :pMOTIVO WHERE IDRESERVASFRONT = :pIDRESERVA";

	private static String CANCELAR_RESERVA_NUMERO = "UPDATE RESERVASFRONT SET STATUSRESERVA = 6,"
			+ " DATACANCELAMENTO = :pDATA," + " IDMOTIVO = :pMOTIVO WHERE NUMRESERVA = :pIDRESERVA";
	
	private static String INSERIR_LANCAMENTOSFRONT = "INSERT INTO LANCAMENTOSFRONT (" +
			 	" IDHOTEL" +
				",IDLANCAMENTO" +
				",IDCONTA" +
				",IDUSUARIO" +
				",IDTIPODEBCRED" +
				",DOCUMENTO" +
				",VLRLANCAMENTO" +
				",FLGREDIRECIONADO" +
				",DATALANCAMENTO" +
				",HORALANCAMENTO" +
				",QTDEITEM" +
				",FLGLANCDESCONTO" +
				",LANCENCERRAMENTO" +
				",SEQNOTA" +
				",COTACAO" +
				",FLGISENTO"+
				",NUMPARCELAS" +
				",VLRLANCLIQUIDO" +
				",CODPENSAO) "
				+ "	VALUES (" +
				" :pIDHOTEL" +
				",:pIDLANCAMENTO" +
				",:pIDCONTA" +
				",:pIDUSUARIO" +
				",:pIDTIPODEBCRED" +
				",:pDOCUMENTO" +
				",:pVLRLANCAMENTO" +
				",:pFLGREDIRECIONADO" +
				",:pDATALANCAMENTO" +
				",:pHORALANCAMENTO" +
				",:pQTDEITEM" +
				",:pFLGLANCDESCONTO" +
				",:pLANCENCERRAMENTO" +
				",:pSEQNOTA" +
				",:pCOTACAO" +
				",:pFLGISENTO"+
				",:pNUMPARCELAS" +
				",:pVLRLANCLIQUIDO" +
				",:pCODPENSAO)";

	public ReservasfrontDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}

	public List<Reservasfront> findByDocumento(BigDecimal id, String strDocumento) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reservasfront.class);

		if (id != null) {
			criteria.createCriteria("idhotelori", "hotel", CriteriaSpecification.LEFT_JOIN);

			criteria.add(Restrictions.eq("hotel.idhotel", id));

		}
		criteria.add(Restrictions.eq("documento", strDocumento));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		List<Reservasfront> result = criteria.list();
		finishTransacton();

		return result;
	}

	public Long findByIdReservaFront(BigDecimal idReserva) throws PersistenceException {
		startTransaction();
		Query query = null;
		BigInteger result = null;
		
		query = getSession()
				.createSQLQuery("select r.STATUSRESERVA as num from RESERVASFRONT r  where r.idreservasfront = :p1 ")
				.addScalar("num", StandardBasicTypes.BIG_INTEGER);
		
		query.setParameter("p1", idReserva);
		
		logger.info("findByIdReservaFront - > select r.STATUSRESERVA as num from RESERVASFRONT r  where r.idreservasfront = :p1");
		logger.info("idReserva: " + idReserva);	
		
		result = ((BigInteger) query.uniqueResult());

		/*
		 * Criteria criteria = getSession().createCriteria(Reservasfront.class);
		 * 
		 * criteria.add(Restrictions.eq("idreservasfront", idReserva));
		 * 
		 * criteria.createCriteria("statusreserva", "statusreserva",
		 * CriteriaSpecification.LEFT_JOIN);
		 * 
		 * criteria.setResultTransformer(CriteriaSpecification. DISTINCT_ROOT_ENTITY);
		 * 
		 * Reservasfront result = (Reservasfront) criteria.uniqueResult();
		 * finishTransacton();
		 */
		return result.longValue();
	}

	public Long findStatusByNumReserva(Long numeroReserva) throws PersistenceException {
		startTransaction();
		Query query = null;
		BigInteger result = null;

		query = getSession()
				.createSQLQuery("select r.STATUSRESERVA as num from RESERVASFRONT r  where r.numreserva = :p1 ")
				.addScalar("num", StandardBasicTypes.BIG_INTEGER);

		query.setParameter("p1", numeroReserva);

		result = ((BigInteger) query.uniqueResult());

		/*
		 * Criteria criteria = getSession().createCriteria(Reservasfront.class);
		 * 
		 * criteria.add(Restrictions.eq("idreservasfront", idReserva));
		 * 
		 * criteria.createCriteria("statusreserva", "statusreserva",
		 * CriteriaSpecification.LEFT_JOIN);
		 * 
		 * criteria.setResultTransformer(CriteriaSpecification. DISTINCT_ROOT_ENTITY);
		 * 
		 * Reservasfront result = (Reservasfront) criteria.uniqueResult();
		 * finishTransacton();
		 */
		return result.longValue();
	}

	public Long findByNumReserva(Long idReserva) throws PersistenceException {
			
		startTransaction();
		Query query = null;
		BigDecimal resultado = null;
		Long valor = null;
				
		query = getSession().createSQLQuery("select cast(r.IDRESERVASFRONT as INTEGER) as num from RESERVASFRONT r  where r.numreserva = :p1 ");

		query.setParameter("p1", idReserva);
		
		resultado = (BigDecimal) query.uniqueResult();
		
		logger.info("Retorno do Banco -> " + resultado);
		
		if (resultado != null) {
			valor = resultado.longValue();
		}
		
		return valor;
	}
	
	public Reservasfront findItemByDocumento(BigDecimal id, String strDocumento) throws PersistenceException {
		startTransaction();
		Criteria criteria = getSession().createCriteria(Reservasfront.class);

		if (id != null) {
			criteria.createCriteria("idhotelori", "hotel", CriteriaSpecification.LEFT_JOIN);

			criteria.add(Restrictions.eq("hotel.idhotel", id));

		}
		criteria.add(Restrictions.eq("documento", strDocumento));

		criteria.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);

		Reservasfront result = (Reservasfront) criteria.uniqueResult();
		finishTransacton();

		return result;
	}
	
	public Long findByDebitoCredito(Integer idHotel) throws PersistenceException {
		
		startTransaction();
		Query query = null;
		Long result = null;
		
		String qry = " SELECT " 
				   + " 	 IDTIPODEBCRED"
				   + " FROM TIPODEBCREDHOTEL"
				   + " WHERE IDHOTEL = :p1"
				   + " AND DEBITOCREDITO = 'C'"
				   + " AND ATIVO = 'S'"
				   + " AND ACEITALANCAMENTO = 'S'"
				   + " AND GRUPOFIXO not in ('DI')"
				   + " ORDER BY DESCRICAO";
				
		query = getSession().createSQLQuery(qry);

		query.setParameter("p1", idHotel);
		
		logger.info("findByDebitoCredito - " + qry);	
		logger.info("Paramentro: " + idHotel);
		
		result = ((Long)query.uniqueResult()).longValue();
		
		return result;
	}

	public long inserirReservaFront(Long XSEQRESERVASFRONT, Long xseqnumreserva, Long XCM_IDHOTEL, Long XCM_USUARIO,
			Long XCM_TIPOUH, Long QTD_ADULTOS, Long XCM_VEICULOS, BigDecimal XVALORORCAMENTO, Long XCM_MOEDA,
			Long XCM_ORIGEM, Long XSTATUS, Long XCM_CLIENTE, Long XCM_TARIFA, String XCM_SEGMENTO, Long XCM_DOCUMENTO,
			Long XCM_MEIOCOMUNIC, String XGARANTIDA, Long XQTD_CRIANCAS, String XCM_PENSAO, double XDIVISAO,
			String XOBS5, String RESERVADOCUMENTO, Date RESERVA_DATA_CHEGADA, Date RESERVA_DATA_PARTIDA, String TEXTO,
			Long XCM_CONTRATO, Date DATA_RESERVA, Date dataChegadaPrevista, Date dataPartidaPrevista, String RESERVANTE,
			String EMAIL, String TELEFONE, String LOCALIZADOR,DataSourceEnum dataSource) throws Exception {
		long updated = 0;
		try {
			String tempReservaChegada = DateUtils.getInstance().formatarData(RESERVA_DATA_CHEGADA,
					"dd/MM/yyyy HH:mm:ss");
			String tempReservaPartida = DateUtils.getInstance().formatarData(RESERVA_DATA_PARTIDA,
					"dd/MM/yyyy HH:mm:ss");

			String tempReserva = DateUtils.getInstance().formatarData(DATA_RESERVA,
					BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_RESERVA = DateUtils.getInstance().criaDataComString(tempReserva,
					BundleUtils.getMessage("formato.campo.data"));

			String tempChegada = DateUtils.getInstance().formatarData(dataChegadaPrevista,
					BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_CHEG_PREV = DateUtils.getInstance().criaDataComString(tempChegada,
					BundleUtils.getMessage("formato.campo.data"));

			String tempPartida = DateUtils.getInstance().formatarData(dataPartidaPrevista,
					BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_PARTIDA_PREV = DateUtils.getInstance().criaDataComString(tempPartida,
					BundleUtils.getMessage("formato.campo.data"));
			StringBuffer sql = new StringBuffer();
			sql.append(INSERIR_RESERVA_FRONT_V2);

			sql.append(XCM_IDHOTEL).append(",");
			sql.append(XSEQRESERVASFRONT).append(",");
			sql.append(xseqnumreserva).append(",");
			sql.append(XCM_USUARIO).append(",");
			sql.append(XCM_TIPOUH).append(",");
			sql.append(QTD_ADULTOS).append(",");
			sql.append(XCM_VEICULOS).append(",");
			sql.append(XVALORORCAMENTO).append(",");
			sql.append(XVALORORCAMENTO).append(",");
			sql.append(XCM_MOEDA).append(",");
			sql.append("'N'").append(",");
			sql.append("'N'").append(",");
			sql.append(xseqnumreserva).append(",");
			sql.append("'N'").append(",");
			sql.append(XCM_ORIGEM).append(",");
			sql.append(XSTATUS).append(",");
			sql.append(XCM_CLIENTE).append(",");
			sql.append(XCM_TARIFA).append(",");
			sql.append("'").append(XCM_SEGMENTO).append("',");
			sql.append(XCM_DOCUMENTO).append(",");
			sql.append(XCM_MEIOCOMUNIC).append(",");
			sql.append("'S'").append(",");
			sql.append("'").append(XGARANTIDA).append("',");
			sql.append("'N'").append(",");
			sql.append("'N'").append(",");
			sql.append(XCM_USUARIO).append(",");
			sql.append(XQTD_CRIANCAS).append(",");
			sql.append(0).append(",");
			sql.append("'").append(XCM_PENSAO).append("',");
			sql.append(XDIVISAO).append(",");
			sql.append("'N'").append(",");
//			sql.append("NULL").append(","); 
			sql.append("'").append(XOBS5).append("',");
			sql.append("'").append(RESERVADOCUMENTO).append("',");
			sql.append(0).append(",");
			sql.append(XVALORORCAMENTO).append(",");
			sql.append("'N'").append(",");
			
			logger.info("DATA SOURCE - > " + dataSource);
			
			if (dataSource.equals(DataSourceEnum.ORACLE)) {
				sql.append("TO_DATE('").append(tempReserva).append("','dd/MM/yyyy'),");
				sql.append("TO_DATE('").append(tempChegada).append("','dd/MM/yyyy'),");
				sql.append("TO_DATE('").append(tempPartida).append("','dd/MM/yyyy'),");
			}else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {
				sql.append("convert(datetime,'").append(tempReserva).append("',105),");
				sql.append("convert(datetime,'").append(tempChegada).append("',105),");
				sql.append("convert(datetime,'").append(tempPartida).append("',105),");
			}	
			sql.append("'").append(TEXTO).append("',");
			if (XCM_CONTRATO != null) {// getAge() return BigDecimal and map a NUMBER column type
				sql.append(XCM_CONTRATO).append(",");
			} else {
				sql.append("NULL").append(",");
			}

			if (dataSource.equals(DataSourceEnum.ORACLE)) {
				sql.append("TO_DATE('").append(tempReserva).append("','dd/MM/yyyy'),");
				sql.append("TO_DATE('").append(tempReservaChegada).append("','dd/MM/yyyy hh24:mi:ss'),");
				sql.append("TO_DATE('").append(tempReservaPartida).append("','dd/MM/yyyy hh24:mi:ss'),");
			}else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {
				sql.append("convert(datetime,'").append(tempReserva).append("',105),");
				sql.append("convert(datetime,'").append(tempReservaChegada).append("',105),");
				sql.append("convert(datetime,'").append(tempReservaPartida).append("',105),");
			}	
		
		
			sql.append(XCM_TIPOUH).append(",");
//			sql.append("NULL").append(","); 
			sql.append("'").append(XOBS5).append("',");
			
			if (dataSource.equals(DataSourceEnum.ORACLE)) {
				sql.append("TO_DATE('").append(tempReserva).append("','dd/MM/yyyy'),");
			}else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {
				sql.append("convert(datetime,'").append(tempReserva).append("',105),");
			}	
		
			
			sql.append("'").append(RESERVANTE).append("',");
			sql.append("'").append(EMAIL).append("',");
			sql.append("'").append(TELEFONE).append("',");
			sql.append("'").append(LOCALIZADOR).append("')");

			logger.info("INSERT " + sql.toString());
			
			Query query = getSession().createSQLQuery(sql.toString());

			/*
			 * query.setParameter("pTIPOUHTARIFA", XCM_TIPOUH);
			 * 
			 * query.setParameter("pOBSERVACOESCM", XOBS5);
			 * 
			 * query.setParameter("pDATAULTALTERACAO", sDATA_RESERVA);
			 * 
			 * query.setParameter("pRESERVANTE", RESERVANTE);
			 * 
			 * query.setParameter("pEMAIL", EMAIL);
			 * 
			 * query.setParameter("pTELEFONE", TELEFONE);
			 * 
			 * query.setParameter("pCODREFERENCIA", LOCALIZADOR);
			 */
			updated = query.executeUpdate();

		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			
			try {
				String tempReservaChegada = DateUtils.getInstance().formatarData(RESERVA_DATA_CHEGADA,
						"dd/MM/yyyy HH:mm:ss");
				String tempReservaPartida = DateUtils.getInstance().formatarData(RESERVA_DATA_PARTIDA,
						"dd/MM/yyyy HH:mm:ss");

				String tempReserva = DateUtils.getInstance().formatarData(DATA_RESERVA,
						BundleUtils.getMessage("formato.campo.data"));

				Date sDATA_RESERVA = DateUtils.getInstance().criaDataComString(tempReserva,
						BundleUtils.getMessage("formato.campo.data"));

				String tempChegada = DateUtils.getInstance().formatarData(dataChegadaPrevista,
						BundleUtils.getMessage("formato.campo.data"));

				Date sDATA_CHEG_PREV = DateUtils.getInstance().criaDataComString(tempChegada,
						BundleUtils.getMessage("formato.campo.data"));

				String tempPartida = DateUtils.getInstance().formatarData(dataPartidaPrevista,
						BundleUtils.getMessage("formato.campo.data"));

				Date sDATA_PARTIDA_PREV = DateUtils.getInstance().criaDataComString(tempPartida,
						BundleUtils.getMessage("formato.campo.data"));
				StringBuffer sql = new StringBuffer();
				sql.append(INSERIR_RESERVA_FRONT_V2_SEM_CONTRATO);

				sql.append(XCM_IDHOTEL).append(",");
				sql.append(XSEQRESERVASFRONT).append(",");
				sql.append(xseqnumreserva).append(",");
				sql.append(XCM_USUARIO).append(",");
				sql.append(XCM_TIPOUH).append(",");
				sql.append(QTD_ADULTOS).append(",");
				sql.append(XCM_VEICULOS).append(",");
				sql.append(XVALORORCAMENTO).append(",");
				sql.append(XVALORORCAMENTO).append(",");
				sql.append(XCM_MOEDA).append(",");
				sql.append("'N'").append(",");
				sql.append("'N'").append(",");
				sql.append(xseqnumreserva).append(",");
				sql.append("'N'").append(",");
				sql.append(XCM_ORIGEM).append(",");
				sql.append(XSTATUS).append(",");
				sql.append(XCM_CLIENTE).append(",");
				sql.append(XCM_TARIFA).append(",");
				sql.append("'").append(XCM_SEGMENTO).append("',");
				sql.append(XCM_DOCUMENTO).append(",");
				sql.append(XCM_MEIOCOMUNIC).append(",");
				sql.append("'S'").append(",");
				sql.append("'").append(XGARANTIDA).append("',");
				sql.append("'N'").append(",");
				sql.append("'N'").append(",");
				sql.append(XCM_USUARIO).append(",");
				sql.append(XQTD_CRIANCAS).append(",");
				sql.append(0).append(",");
				sql.append("'").append(XCM_PENSAO).append("',");
				sql.append(XDIVISAO).append(",");
				sql.append("'N'").append(",");
//				sql.append("NULL").append(","); 
				sql.append("'").append(XOBS5).append("',");
				sql.append("'").append(RESERVADOCUMENTO).append("',");
				sql.append(0).append(",");
				sql.append(XVALORORCAMENTO).append(",");
				sql.append("'N'").append(",");
				
				logger.info("DATA SOURCE - > " + dataSource);
				
				if (dataSource.equals(DataSourceEnum.ORACLE)) {
					sql.append("TO_DATE('").append(tempReserva).append("','dd/MM/yyyy'),");
					sql.append("TO_DATE('").append(tempChegada).append("','dd/MM/yyyy'),");
					sql.append("TO_DATE('").append(tempPartida).append("','dd/MM/yyyy'),");
				}else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {
					sql.append("convert(datetime,'").append(tempReserva).append("',105),");
					sql.append("convert(datetime,'").append(tempChegada).append("',105),");
					sql.append("convert(datetime,'").append(tempPartida).append("',105),");
				}	
				
				sql.append("'").append(TEXTO).append("',");
				
				if (dataSource.equals(DataSourceEnum.ORACLE)) {
					sql.append("TO_DATE('").append(tempReserva).append("','dd/MM/yyyy'),");
					sql.append("TO_DATE('").append(tempReservaChegada).append("','dd/MM/yyyy hh24:mi:ss'),");
					sql.append("TO_DATE('").append(tempReservaPartida).append("','dd/MM/yyyy hh24:mi:ss'),");
				}else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {
					sql.append("convert(datetime,'").append(tempReserva).append("',105),");
					sql.append("convert(datetime,'").append(tempReservaChegada).append("',105),");
					sql.append("convert(datetime,'").append(tempReservaPartida).append("',105),");
				}	
			
			
				sql.append(XCM_TIPOUH).append(",");
//				sql.append("NULL").append(","); 
				sql.append("'").append(XOBS5).append("',");
				
				if (dataSource.equals(DataSourceEnum.ORACLE)) {
					sql.append("TO_DATE('").append(tempReserva).append("','dd/MM/yyyy'),");
				}else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {
					sql.append("convert(datetime,'").append(tempReserva).append("',105),");
				}	
			
				
				sql.append("'").append(RESERVANTE).append("',");
				sql.append("'").append(EMAIL).append("',");
				sql.append("'").append(TELEFONE).append("',");
				sql.append("'").append(LOCALIZADOR).append("')");

				logger.info("INSERT SEM CONTRATO " + sql.toString());
				
				Query query = getSession().createSQLQuery(sql.toString());

				/*
				 * query.setParameter("pTIPOUHTARIFA", XCM_TIPOUH);
				 * 
				 * query.setParameter("pOBSERVACOESCM", XOBS5);
				 * 
				 * query.setParameter("pDATAULTALTERACAO", sDATA_RESERVA);
				 * 
				 * query.setParameter("pRESERVANTE", RESERVANTE);
				 * 
				 * query.setParameter("pEMAIL", EMAIL);
				 * 
				 * query.setParameter("pTELEFONE", TELEFONE);
				 * 
				 * query.setParameter("pCODREFERENCIA", LOCALIZADOR);
				 */
				updated = query.executeUpdate();

			} catch (Exception ee) {
				transactionFailed();
				logger.error(ee.getMessage() + "\nNão foi possível inserir a instrução SQL sem o contrato!", ee);
			}
			
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirReservaFront ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public long inserirReservaFront_old(Long XSEQRESERVASFRONT, Long xseqnumreserva, Long XCM_IDHOTEL, Long XCM_USUARIO,
			Long XCM_TIPOUH, Long QTD_ADULTOS, Long XCM_VEICULOS, BigDecimal XVALORORCAMENTO, Long XCM_MOEDA,
			Long XCM_ORIGEM, Long XSTATUS, Long XCM_CLIENTE, Long XCM_TARIFA, String XCM_SEGMENTO, Long XCM_DOCUMENTO,
			Long XCM_MEIOCOMUNIC, String XGARANTIDA, Long XQTD_CRIANCAS, String XCM_PENSAO, double XDIVISAO,
			String XOBS5, String RESERVADOCUMENTO, Date RESERVA_DATA_CHEGADA, Date RESERVA_DATA_PARTIDA, String TEXTO,
			Long XCM_CONTRATO, Date DATA_RESERVA, Date dataChegadaPrevista, Date dataPartidaPrevista, String RESERVANTE,
			String EMAIL, String TELEFONE, String LOCALIZADOR) throws Exception {
		long updated = 0;
		try {

			String temp = DateUtils.getInstance().formatarData(DATA_RESERVA,
					BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_RESERVA = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			temp = DateUtils.getInstance().formatarData(dataChegadaPrevista,
					BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_CHEG_PREV = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			temp = DateUtils.getInstance().formatarData(dataPartidaPrevista,
					BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_PARTIDA_PREV = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));
			String sql = INSERIR_RESERVA_FRONT;
			if (XCM_CONTRATO == null) {// getAge() return BigDecimal and map a NUMBER column type
				sql = INSERIR_RESERVA_FRONT_V1;
			}

			Query query = getSession().createSQLQuery(sql);
			query.setParameter("pIDHOTEL", XCM_IDHOTEL);
			query.setParameter("pIDRESERVASFRONT", XSEQRESERVASFRONT);
			query.setParameter("pNUMRESERVA", xseqnumreserva);
			query.setParameter("pUSUARIO", XCM_USUARIO);
			query.setParameter("pTIPOUHESTADIA", XCM_TIPOUH);
			query.setParameter("pADULTOS", QTD_ADULTOS);
			query.setParameter("pIDVEICULOS", XCM_VEICULOS);
			query.setParameter("pVLRDIARIA", XVALORORCAMENTO);
			query.setParameter("pVLRDIARIAMANUAL", XVALORORCAMENTO);
			query.setParameter("pMOECODIGOMANUAL", XCM_MOEDA);
			query.setParameter("pFLGMENSALISTA", "N");
			query.setParameter("pLANCAUPSELL", "N");
			query.setParameter("pNUMRESERVAPRINC", xseqnumreserva);
			query.setParameter("pFLGREQCHECKIN", "N");
			query.setParameter("pIDORIGEM", XCM_ORIGEM);
			query.setParameter("pSTATUSRESERVA", XSTATUS);

			query.setParameter("pCLIENTERESERVANTE", XCM_CLIENTE);
			query.setParameter("pIDTARIFA", XCM_TARIFA);

			query.setParameter("pCODSEGMENTO", XCM_SEGMENTO);
			query.setParameter("pIDDOCUMENTO", XCM_DOCUMENTO);

			query.setParameter("pIDMEIOCOMUNICACAO", XCM_MEIOCOMUNIC);
			query.setParameter("pFLGDIARIAFIXA", "S");
			query.setParameter("pGARANTENOSHOW", XGARANTIDA);

			query.setParameter("pAJUSTE", "N");
			query.setParameter("pPOOLLISTA", "N");

			query.setParameter("pIDUSUALTERACAO", XCM_USUARIO);
			// query.setParameter(26, XVALORORCAMENTO);

			query.setParameter("pCRIANCAS1", XQTD_CRIANCAS);
			query.setParameter("pPERCDESCONTODIARIA", 0);

			query.setParameter("pCODPENSAO", XCM_PENSAO);
			query.setParameter("pVLRDIARIASEMIMPOSTO", XDIVISAO);

			query.setParameter("pFLAGCOMPARTILHADA", "N");

//			query.setParameter("pOBSERVACOES", "NULL"); 
			query.setParameter("pOBSERVACOES", XOBS5);
			query.setParameter("pDOCUMENTO", RESERVADOCUMENTO);

			query.setParameter("pCRIANCAS2", 0);
			query.setParameter("pVLRDIARIAPADRAO", XVALORORCAMENTO);

			query.setParameter("pAUTOCHECKOUT", "N");

			query.setParameter("pDATARESERVA", sDATA_RESERVA);

			query.setDate("pDATACHEGPREVISTA", sDATA_CHEG_PREV);

			query.setDate("pDATAPARTPREVISTA", sDATA_PARTIDA_PREV);

			query.setParameter("pLOCRESERVA", TEXTO);

			if (XCM_CONTRATO != null) {// getAge() return BigDecimal and map a NUMBER column type
				query.setParameter("pCONTRATOINICIAL", XCM_CONTRATO);
			}

			query.setParameter("pHORARESERVA", DATA_RESERVA);

			query.setParameter("pHORACHEGPREVISTA", RESERVA_DATA_CHEGADA);
			query.setParameter("pHORAPARTPREVISTA", RESERVA_DATA_PARTIDA);

			query.setParameter("pTIPOUHTARIFA", XCM_TIPOUH);

//			query.setParameter("pOBSERVACOES", "NULL"); 
			query.setParameter("pOBSERVACOESCM", XOBS5);

			query.setParameter("pDATAULTALTERACAO", sDATA_RESERVA);

			query.setParameter("pRESERVANTE", RESERVANTE);

			query.setParameter("pEMAIL", EMAIL);

			query.setParameter("pTELEFONE", TELEFONE);

			query.setParameter("pCODREFERENCIA", LOCALIZADOR);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirReservaFront ("
							+ e.getMessage() + ")\".");

		}
		return updated;
	}

	public long inserirPessoa(Long XSEQPESSOA, Long xseqendpess, String NOME_COMPLETO, String EMAIL, Long XCM_USUARIO,
			Date XDATARESERVA, String NUM_DOCUMENTO) throws Exception {
		long updated = 0;
		try {

			Query query = getSession().createSQLQuery(INSERIR_PESSOA);
			query.setParameter("pIDPESSOA", XSEQPESSOA);
			query.setParameter("pNOME", NOME_COMPLETO);
			query.setParameter("pTIPO", "F");
			query.setParameter("pRAZAOSOCIAL", NOME_COMPLETO);
			
			query.setParameter("pEMAIL", EMAIL);
			query.setParameter("pflghospede", 1);
			query.setParameter("ptrguserinclusao", "CM" + XCM_USUARIO);
			query.setParameter("pFLGATUALIZAR", "S");
			query.setParameter("pIDENDRESIDENCIAL", xseqendpess);
			query.setParameter("ptrgDtInclusao", XDATARESERVA);
			query.setParameter("pNumDocumento", NUM_DOCUMENTO);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirPessoa ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}
	
	public long inserirPessoaFisica(Long XSEQPESSOA, Date DATA_NASC) throws Exception {
		long updated = 0;
		try {
			String temp = DateUtils.getInstance().formatarData(DATA_NASC, BundleUtils.getMessage("formato.campo.data"));
			Date sDATA_NASC = DateUtils.getInstance().criaDataComString(temp,
						BundleUtils.getMessage("formato.campo.data"));
			
			Query query = getSession().createSQLQuery(INSERIR_PESSOA_FISICA);
			query.setParameter("pIDPESSOA", XSEQPESSOA);
			query.setParameter("pDATANASC", sDATA_NASC);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirPessoa ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}
	
	public long inserirDocPessoa(Long XSEQPESSOA, String NUM_DOC, Integer ID_DOC_PESSOA_FISICA) throws Exception {
		long updated = 0;
		try {
			logger.info(INSERIR_DOCPESSOA + " Parametros -> " + XSEQPESSOA + ", " + ID_DOC_PESSOA_FISICA.toString() + ", " + NUM_DOC);
			Query query = getSession().createSQLQuery(INSERIR_DOCPESSOA);
			query.setParameter("pIDPESSOA", XSEQPESSOA);
			query.setParameter("pIDDOCUMENTO", ID_DOC_PESSOA_FISICA);
			query.setParameter("pNUMDOCUMENTO", NUM_DOC);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirPessoa ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}



	public long inserirEndPess(Long XSEQpessoa, Long xCM_CIDADE, Long xseqendpess) throws Exception {
		long updated = 0;
		try {

			Query query = getSession().createSQLQuery(INSERIR_ENDPESS);
			query.setParameter("pIdPESSOA", XSEQpessoa);
			query.setParameter("pcidades", xCM_CIDADE);
			query.setParameter("ptipoendereco", "R");
			query.setParameter("pIDENDERECO", xseqendpess);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirEndPess ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}
	
	public long inserirTelEndPess(Long XSEQtelefone, Long xseqendpess, String telefone) throws Exception {
		long updated = 0;
		try {

			Query query = getSession().createSQLQuery(INSERIR_TELENDPESS);
			query.setParameter("pIDTELEFONE", XSEQtelefone);
			query.setParameter("pIDENDERECO", xseqendpess);
			query.setParameter("pNUMERO", telefone);
			query.setParameter("pDDI", "55");
			query.setParameter("pDDD", "");
			query.setParameter("pTIPO", "L");
			
			logger.info(INSERIR_TELENDPESS);
			logger.info("Parâmetros -> (" + XSEQtelefone + ", " + xseqendpess + ", " + telefone + ", 55, '', L)");
			
			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirTelEndPess ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	
	public long inserirEndPess(Long XSEQpessoa, Integer xCM_CIDADE, String cep, String logradouro, Long xseqendpess) throws Exception {
		long updated = 0;
		try {
			
			String qrySQL = "INSERT INTO ENDPESS " + "(IdPESSOA," + // 1
													 " cep," + // 2
													 " idcidades," + // 2
													 " logradouro," + // 2
													 " tipoendereco," + // 3
													 " IDENDERECO)" + // 4
							" VALUES (" + ":pIdPESSOA," + // 1
							":pCep," + // 2
							":pcidades," + // 2
							":pLogradouro," + // 2
							":ptipoendereco," + // 3
							":pIDENDERECO)"; // 4
			
			Query query = getSession().createSQLQuery(qrySQL);
			query.setParameter("pIdPESSOA", XSEQpessoa);
			query.setParameter("pCep", cep);
			query.setParameter("pcidades", xCM_CIDADE);
			
			if (logradouro.length() > 59) {
				query.setParameter("pLogradouro", logradouro.substring(0, 59));
			} else {
				query.setParameter("pLogradouro", logradouro);
			}
			
			query.setParameter("ptipoendereco", "R");
			query.setParameter("pIDENDERECO", xseqendpess);
			
			logger.info(qrySQL);
			logger.info("Parâmetros -> " + XSEQpessoa + " " + cep + " " + xCM_CIDADE + " " + logradouro + "R" + " " + xseqendpess);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirEndPess ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public long inserirHospede(Long xCM_FAIXA, String XCM_TRATAMENTO, Long XSEQpessoa, String SOBRENOME, String NOME,
			Long xCM_USUARIO, Date date, Long TIPO_ETARIO) throws Exception {
		int updated = 0;
		try {
			
			Query query = getSession().createSQLQuery(INSERIR_HOSPEDE);
			query.setParameter("pIdFaixaEtaria", xCM_FAIXA);
			query.setParameter("pCodTratamento", XCM_TRATAMENTO);
			query.setParameter("pIDHOSPEDE", XSEQpessoa);

			query.setParameter("pSOBRENOME", SOBRENOME);

			query.setParameter("pNOME", NOME);
			query.setParameter("pRECEBEMALADIRETA", "S");
			query.setParameter("pFUMANTE", "N");
			query.setParameter("pTRGUSERINCLUSAO", "CM" + xCM_USUARIO);
			query.setParameter("pFLGENVIASMS", "S");
			query.setParameter("pFLGPAGATAXATURISMO", "S");
			query.setParameter("pTipoEtario", TIPO_ETARIO);
			query.setParameter("ptrgDtInclusao", date);
			
			logger.info(INSERIR_HOSPEDE + "Parametros -> " + 
			xCM_FAIXA + 
			", " + XCM_TRATAMENTO + 
			", " + XSEQpessoa + 
			", " + SOBRENOME + 
			", " + NOME + 
			", S, N, CM" + xCM_USUARIO + 
			", S, S, " + TIPO_ETARIO + 
			", " + date.toString());

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirHospede ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public long inserirContasFront(Long xCM_IDHOTEL, Long XSEQCONTASFRONT, String NOME_COMPLETO, Long XSEQRESERVASFRONT,
			Long XSEQpessoa, Long xCM_USUARIO, Date date, Date date2, String pTIPOCONTA) throws Exception {
		int updated = 0;
		try {

			String temp = DateUtils.getInstance().formatarData(date, BundleUtils.getMessage("formato.campo.data"));

			Date pDataAbertura = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			temp = DateUtils.getInstance().formatarData(date2, BundleUtils.getMessage("formato.campo.data"));

			Date pDataEncPrevisto = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			Query query = getSession().createSQLQuery(INSERIR_CONTASFRONT);
			query.setParameter("pIDHOTEL", xCM_IDHOTEL);
			query.setParameter("pIDCONTA", XSEQCONTASFRONT);
			query.setParameter("pTIPOCONTA", pTIPOCONTA);

			query.setParameter("pDESIGNACAO", NOME_COMPLETO);

			query.setParameter("pFORMAPAGT", "V");
			query.setParameter("pIDRESERVASFRONT", XSEQRESERVASFRONT);
			query.setParameter("pIDHOSPEDE", XSEQpessoa);
			query.setParameter("pTRGUSERINCLUSAO", "CM" + xCM_USUARIO);
			query.setParameter("pFLGESTRECEITAS", "N");
			query.setParameter("pFLGIMPRIMIUEXTRATO", "N");

			query.setParameter("pDataAbertura", pDataAbertura);

			query.setParameter("pHoraAbertura", date);
			query.setParameter("pDATAENCPREVISTO", pDataEncPrevisto);

			query.setParameter("pHORAEncPrevisto", date2);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirContasFront ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public long inserirContasFrontEmpresa(Long xCM_IDHOTEL, Long XSEQCONTASFRONT, String NOME_COMPLETO,
			Long XSEQRESERVASFRONT, Long XSEQpessoa, Long xCM_USUARIO, Date date, Date date2, String pTIPOCONTA,
			Long idForCli, Long idContrato) throws Exception {
		int updated = 0;
		try {

			String temp = DateUtils.getInstance().formatarData(date, BundleUtils.getMessage("formato.campo.data"));

			Date pDataAbertura = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			temp = DateUtils.getInstance().formatarData(date2, BundleUtils.getMessage("formato.campo.data"));

			Date pDataEncPrevisto = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			String sql = INSERIR_CONTASFRONT_EMPRESA;

			if (idContrato == null) {
				sql = INSERIR_CONTASFRONT_EMPRESA_SEM_CONTRATO;
			}

			Query query = getSession().createSQLQuery(sql);
			query.setParameter("pIDHOTEL", xCM_IDHOTEL);
			query.setParameter("pIDCONTA", XSEQCONTASFRONT);
			query.setParameter("pTIPOCONTA", pTIPOCONTA);

			query.setParameter("pDESIGNACAO", NOME_COMPLETO);

			query.setParameter("pFORMAPAGT", "F");
			query.setParameter("pIDRESERVASFRONT", XSEQRESERVASFRONT);
			// query.setParameter("pIDHOSPEDE", XSEQpessoa);

			query.setParameter("pIDFORCLI", idForCli);
			if (idContrato != null)
				query.setParameter("pCODCONTRATO", idContrato);

			query.setParameter("pTRGUSERINCLUSAO", "CM" + xCM_USUARIO);
			query.setParameter("pFLGESTRECEITAS", "N");
			query.setParameter("pFLGIMPRIMIUEXTRATO", "N");

			query.setParameter("pDataAbertura", pDataAbertura);

			query.setParameter("pHoraAbertura", date);
			query.setParameter("pDATAENCPREVISTO", pDataEncPrevisto);

			query.setParameter("pHORAEncPrevisto", date2);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirContasFrontEmpresa ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public long inserirHospedeHotel(Long xseqpessoa, Long xCM_IDHOTEL, Long xCM_TIPOPAX, Date date, Long xCM_USUARIO)
			throws Exception {
		int updated = 0;
		try {

			Query query = getSession().createSQLQuery(INSERIR_HOSPEDEHOTEL);
			query.setParameter("pIDHOSPEDE", xseqpessoa);
			query.setParameter("pIDHOTEL", xCM_IDHOTEL);
			query.setParameter("pIDTIPOHOSPEDE", xCM_TIPOPAX);

			query.setParameter("ptrgDtInclusao", date);

			query.setParameter("ptrgUserInclusao", "CM" + xCM_USUARIO);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();

			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirHospedeHotel ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public int inserirMovimentoHospede(Long XSEQRESERVASFRONT, Long XCM_IDHOTEL, Long xseqpessoa, Long xCM_TIPOPAX,
			Date DATA_CHEGADA, Date DATA_PARTIDA, Long XCM_USUARIO, Date DATA_OPERACAO, String principal)
			throws Exception {
		int updated = 0;
		try {

			String temp = DateUtils.getInstance().formatarData(DATA_CHEGADA,
					BundleUtils.getMessage("formato.campo.data"));

			Date sChegada = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			temp = DateUtils.getInstance().formatarData(DATA_PARTIDA, BundleUtils.getMessage("formato.campo.data"));

			Date sSaida = DateUtils.getInstance().criaDataComString(temp, BundleUtils.getMessage("formato.campo.data"));

			Query query = getSession().createSQLQuery(INSERIR_MOVIHOSPEDE);
			query.setParameter("pIdReservasFront", XSEQRESERVASFRONT);
			query.setParameter("pIDHOTEL", XCM_IDHOTEL);
			query.setParameter("pIDHOSPEDE", xseqpessoa);

			query.setParameter("pIDTIPOHOSPEDE", xCM_TIPOPAX);

			query.setParameter("pINCOGNITO", "N");
			query.setParameter("pUSODACASA", "N");

			// TRATAR PELO TIPO DE HOSPEDE
			query.setParameter("pPRINCIPAL", principal);

			if (principal.equals("S")) {
				query.setParameter("pPercDiaria", 100);
			} else {
				query.setParameter("pPercDiaria", 0);
			}
			query.setParameter("pMENORIDADE", "N");
			query.setParameter("pDataChegPrevista", sChegada);

			query.setParameter("pDataPartPrevista", sSaida);
			query.setParameter("ptrgDtInclusao", DATA_OPERACAO);
			query.setParameter("pHoraChegPrevista", DATA_CHEGADA);

			query.setParameter("pHoraPartPrevista", DATA_PARTIDA);
			query.setParameter("ptrgUserInclusao", "CM" + XCM_USUARIO);

			logger.info("QRY_MOVIMENTOHOSPEDES_ADULTO -> " + INSERIR_MOVIHOSPEDE + " - Parametros -> (" +
							 XSEQRESERVASFRONT 
					+ ", " + XCM_IDHOTEL 
					+ ", " + xseqpessoa
					+ ", " + xCM_TIPOPAX
					+ ", N, N, " + principal 
					+ ", " + ((principal == "S") ? "100" : "0") 
					+ ", N, " + sChegada 
					+ ", " + sSaida 
					+ ", " + DATA_OPERACAO 
					+ ", " + DATA_CHEGADA 
					+ ", " + DATA_PARTIDA 
					+ ", CM" + XCM_USUARIO + ")");
			
			updated = query.executeUpdate();
		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirMovimentoHospede ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public int inserirMovimentoHospedeMenor(Long XSEQRESERVASFRONT, Long XCM_IDHOTEL, Long xseqpessoa, Long xCM_TIPOPAX,
			Date DATA_CHEGADA, Date DATA_PARTIDA, Long XCM_USUARIO, Date DATA_OPERACAO, String principal,
			Long xIdResponsavel) throws Exception {
		int updated = 0;
		try {
			String temp = DateUtils.getInstance().formatarData(DATA_CHEGADA,
					BundleUtils.getMessage("formato.campo.data"));

			Date sChegada = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			temp = DateUtils.getInstance().formatarData(DATA_PARTIDA, BundleUtils.getMessage("formato.campo.data"));

			Date sSaida = DateUtils.getInstance().criaDataComString(temp, BundleUtils.getMessage("formato.campo.data"));

			Query query = getSession().createSQLQuery(INSERIR_MOVIHOSPEDE_MENOR);
			query.setParameter("pIdReservasFront", XSEQRESERVASFRONT);
			query.setParameter("pIDHOTEL", XCM_IDHOTEL);
			query.setParameter("pIDHOSPEDE", xseqpessoa);

			query.setParameter("pIDTIPOHOSPEDE", xCM_TIPOPAX);

			query.setParameter("pINCOGNITO", "N");
			query.setParameter("pUSODACASA", "N");

			// TRATAR PELO TIPO DE HOSPEDE
			query.setParameter("pPRINCIPAL", principal);

			if (principal.equals("S")) {
				query.setParameter("pPercDiaria", 100);
			} else {
				query.setParameter("pPercDiaria", 0);
			}
			query.setParameter("pMENORIDADE", "S");
			query.setParameter("pDataChegPrevista", sChegada);

			query.setParameter("pDataPartPrevista", sSaida);

			query.setParameter("ptrgDtInclusao", DATA_OPERACAO);
			query.setParameter("pHoraChegPrevista", DATA_CHEGADA);

			query.setParameter("pHoraPartPrevista", DATA_PARTIDA);
			query.setParameter("pIdResponsavel", xIdResponsavel);

			query.setParameter("ptrgUserInclusao", "CM" + XCM_USUARIO);

			logger.info("QRY_MOVIMENTOHOSPEDES_MENOR -> " + INSERIR_MOVIHOSPEDE_MENOR + " - Parametros -> (" +
					 XSEQRESERVASFRONT 
			+ ", " + XCM_IDHOTEL 
			+ ", " + xseqpessoa
			+ ", " + xCM_TIPOPAX
			+ ", N, N, " + principal 
			+ ", " + ((principal == "S") ? "100" : "0") 
			+ ", S, " + sChegada 
			+ ", " + sSaida 
			+ ", " + DATA_OPERACAO 
			+ ", " + DATA_CHEGADA 
			+ ", " + DATA_PARTIDA
			+ ", " + xIdResponsavel 
			+ ", CM" + XCM_USUARIO + ")");
			
			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirMovimentoHospedeMenor ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public Long getNextSeqReservasFront(DataSourceEnum dataSource) {

		Query query = null;
		Long result = null;
		if (dataSource.equals(DataSourceEnum.ORACLE)) {
			query = getSession().createSQLQuery("select SEQRESERVASFRONT.NEXTVAL as num from dual").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

		} else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {

			String sql = "insert into SEQ_RESERVASFRONT (flg) values (1)";

			Query queryInsert = getSession().createSQLQuery(sql);

			queryInsert.executeUpdate();

			query = getSession().createSQLQuery(" SELECT MAX(ID) as num FROM SEQ_RESERVASFRONT").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

			System.out.println("ID Final : " + result);
			logger.info("ID Final : " + result);

		}

		return result;
	}

	public Long getNextSeqNumeroReserva(DataSourceEnum dataSource) {

		Query query = null;
		Long result = null;
		if (dataSource.equals(DataSourceEnum.ORACLE)) {
			query = getSession().createSQLQuery("select SEQNUMERORESERVA.NEXTVAL || 1 as num from dual")
					.addScalar("num", StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

		} else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {
			String sql = "insert into SEQ_NUMERORESERVA (flg) values (1)";

			Query queryInsert = getSession().createSQLQuery(sql);

			queryInsert.executeUpdate();

			query = getSession().createSQLQuery(" SELECT MAX(ID) as num FROM SEQ_NUMERORESERVA").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

			System.out.println("ID Final : " + result);
			logger.info("ID Final : " + result);
		}

		return result;
	}

	public Long getNextSeqPessoa(DataSourceEnum dataSource) {

		Query query = null;
		Long result = null;
		if (dataSource.equals(DataSourceEnum.ORACLE)) {
			query = getSession().createSQLQuery("select SEQPESSOA.NEXTVAL as num from dual").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

		} else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {

			String sql = "insert into SEQ_PESSOA (flg) values (1)";

			Query queryInsert = getSession().createSQLQuery(sql);

			queryInsert.executeUpdate();

			query = getSession().createSQLQuery(" SELECT MAX(ID) as num FROM SEQ_PESSOA").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

			System.out.println("ID Final : " + result);

		}

		return result;
	}
	
	public Long getNextSeqTelEndPess(DataSourceEnum dataSource) {

		Query query = null;
		Long result = null;
		if (dataSource.equals(DataSourceEnum.ORACLE)) {
			query = getSession().createSQLQuery("select SEQTELENDPESS.NEXTVAL as num from dual").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

		} else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {

			String sql = "insert into SEQ_TELENDPESS (flg) values (1)";

			Query queryInsert = getSession().createSQLQuery(sql);

			queryInsert.executeUpdate();

			query = getSession().createSQLQuery(" SELECT MAX(ID) as num FROM SEQ_TELENDPESS").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

			System.out.println("ID Final : " + result);

		}

		return result;

	}


	public Long getNextSeqEndPess(DataSourceEnum dataSource) {

		Query query = null;
		Long result = null;
		if (dataSource.equals(DataSourceEnum.ORACLE)) {
			query = getSession().createSQLQuery("select SEQENDPESS.NEXTVAL as num from dual").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

		} else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {

			String sql = "insert into SEQ_ENDPESS (flg) values (1)";

			Query queryInsert = getSession().createSQLQuery(sql);

			queryInsert.executeUpdate();

			query = getSession().createSQLQuery(" SELECT MAX(ID) as num FROM SEQ_ENDPESS").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

			System.out.println("ID Final : " + result);

		}

		return result;

	}

	public Long getNextSeqContasFront(DataSourceEnum dataSource) {
		Query query = null;
		Long result = null;
		if (dataSource.equals(DataSourceEnum.ORACLE)) {
			query = getSession().createSQLQuery("select SEQCONTASFRONT.NEXTVAL as num from dual").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);

			result = ((BigInteger) query.uniqueResult()).longValue();

		} else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {

			String sql = "insert into SEQ_CONTASFRONT (flg) values (1)";

			Query queryInsert = getSession().createSQLQuery(sql);

			queryInsert.executeUpdate();

			query = getSession().createSQLQuery(" SELECT MAX(ID) as num FROM SEQ_CONTASFRONT").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

			System.out.println("ID Final : " + result);

		}

		return result;
	}

	public int inserirReservaReduz(Long XSEQRESERVASFRONT, Long xCM_IDHOTEL, Long xCM_CLIENTE, Long xCM_TIPOUH,
			Date dataChegada, Date dataSaida, Long xCM_CONTRATO) throws Exception {
		// TODO Auto-generated method stub
		int updated = 0;
		try {

			String temp = DateUtils.getInstance().formatarData(dataChegada,
					BundleUtils.getMessage("formato.campo.data"));

			Date pDataChegada = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			temp = DateUtils.getInstance().formatarData(dataSaida, BundleUtils.getMessage("formato.campo.data"));

			Date pDataPartida = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			String sql = INSERIR_RESERVAREDUZ;

			if (xCM_CONTRATO != null && xCM_CONTRATO != 0) {
				sql = INSERIR_RESERVAREDUZ_CONTRATO;
			}

			Query query = getSession().createSQLQuery(sql);
			query.setParameter("pIdReservasFront", XSEQRESERVASFRONT);
			query.setParameter("pIDHOTEL", xCM_IDHOTEL);
			query.setParameter("pSTATUSRESERVA", 0);

			query.setParameter("pIDFORCLI", xCM_CLIENTE);
			query.setParameter("pIDTIPOUH", xCM_TIPOUH);

			if (xCM_CONTRATO != null && xCM_CONTRATO != 0) {
				query.setParameter("pCODCONTRATO", xCM_CONTRATO);
			}

			query.setParameter("pDATACHEGADA", pDataChegada);

			query.setParameter("pDATAPARTIDA", pDataPartida);

			/*
			 * ZQ1.Parameters.ParamByName("pIdReservasFront").Value := XSEQRESERVASFRONT; //
			 * 1 ZQ1.Parameters.ParamByName("pIDHOTEL").Value := XCM_IDHOTEL; // 2
			 * ZQ1.Parameters.ParamByName("pSTATUSRESERVA").Value := 0; // 3
			 * ZQ1.Parameters.ParamByName("pIDFORCLI").Value := XCM_CLIENTE; // 4
			 * ZQ1.Parameters.ParamByName("pIDTIPOUH").Value := XCM_TIPOUH; // 5
			 * ZQ1.Parameters.ParamByName("pDATACHEGADA").Value :=
			 * T_RESERVASDATA_CHEGADA.Value;// 6
			 * ZQ1.Parameters.ParamByName("pDATAPARTIDA").Value :=
			 * T_RESERVASDATA_PARTIDA.Value;// 7
			 * 
			 */

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirReservaReduz ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public int inserirOrcamentoReserva(Long XSEQRESERVASFRONT, Long xCM_IDHOTEL, Long XCM_TARIFA, Long xCM_TIPOUH,
			Date dataOrcamentoReserva, Date dataOperacao, String XCM_SIGLA, Long XCM_USUARIO, Long xCM_MOEDA,
			Long xCM_ORIGEM, String xCM_SEGMENTO, BigDecimal xVALORORCAMENTO, Boolean tarifaContrato, String XCM_PENSAO)
			throws Exception {
		// TODO Auto-generated method stub
		int updated = 0;
		try {
			
			String temp = DateUtils.getInstance().formatarData(dataOrcamentoReserva,
					BundleUtils.getMessage("formato.campo.data"));

			Date sData = DateUtils.getInstance().criaDataComString(temp, BundleUtils.getMessage("formato.campo.data"));

			Query query = getSession().createSQLQuery(INSERIR_ORCAMENTORESERVA);
			query.setParameter("pIDRESERVASFRONT", XSEQRESERVASFRONT);
			query.setDate("pDATA", sData);

			query.setParameter("pVALOR", xVALORORCAMENTO);

			if (tarifaContrato) {
				query.setParameter("pVALORTARIFA", xVALORORCAMENTO);
				query.setParameter("pVALORMANUAL", 0);

			} else {
				query.setParameter("pVALORTARIFA", 0);
				query.setParameter("pVALORMANUAL", xVALORORCAMENTO);
			}

			query.setParameter("pCODSEGMENTO", xCM_SEGMENTO);
			query.setParameter("pIDORIGEM", xCM_ORIGEM);
			query.setParameter("pMOECODIGO", xCM_MOEDA);

			query.setParameter("pSIGLAMOEDA", XCM_SIGLA);
			query.setParameter("pIDTARIFA", XCM_TARIFA);
			query.setParameter("pIDHOTEL", xCM_IDHOTEL);

			query.setParameter("pCODPENSAO", XCM_PENSAO);
			query.setDate("ptrgDtInclusao", dataOperacao);
			query.setParameter("ptrgUserInclusao", "CM" + XCM_USUARIO);
			
			/*
			 * ZQ1.Parameters.ParamByName("pIDRESERVASFRONT").Value := xseqreservasfront; //
			 * 1 ZQ1.Parameters.ParamByName("pDATA").Value := QueryORCADATA.AsDateTime; // 2
			 * ZQ1.Parameters.ParamByName("pVALOR").Value := QueryORCAVALOR.AsFloat; // 3
			 * ZQ1.Parameters.ParamByName("pSIGLAMOEDA").Value := XCM_SIGLA; // 4
			 * ZQ1.Parameters.ParamByName("pIDTARIFA").Value := XCM_TARIFA; // 5
			 * ZQ1.Parameters.ParamByName("pIDHOTEL").Value := XCM_IDHOTEL; // 6
			 * ZQ1.Parameters.ParamByName("pCODPENSAO").Value := "C"; // 7
			 * ZQ1.Parameters.ParamByName("ptrgDtInclusao").Value :=
			 * T_RESERVASDATA_RESERVA.Value; // 8
			 * zQ1.Parameters.ParamByName("ptrgUserInclusao").Value :=
			 * "CM"+INTTOSTR(XCM_USUARIO); // 9
			 * 
			 */
			logger.info("INSERIRORCAMENTORESERVA ->" + INSERIR_ORCAMENTORESERVA + " VALUES " +
					XSEQRESERVASFRONT +  ", " + sData +  ", " + xVALORORCAMENTO +  ", " + xVALORORCAMENTO +  ", " + 0 +  ", " +xCM_SEGMENTO +  ", " +
					xCM_ORIGEM +  ", " + xCM_MOEDA +  ", '" + XCM_SIGLA +  "', " + XCM_TARIFA +  ", " + xCM_IDHOTEL +  ", '" + XCM_PENSAO +  "', " + dataOperacao + ", " +
					"'CM" + XCM_USUARIO + "'"
					);
			
			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirOrcamentoReserva ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public List<ClienteDTO> getAllClientes(Long idHotel) {
		Query query = null;
		List<ClienteDTO> result = null;
		/*
		 * query = getSession().createSQLQuery(
		 * "select cp.IDPESSOA as IDPESSOA, p.NOME as NOME from EMPRESACLIENTE ec, CLIENTEPESS cp, PESSOA p where cp.IDPESSOA = p.IDPESSOA and p.IDPESSOA=ec.IDFORCLI and ec.IDPESSOA = "
		 * + idHotel + " order by p.NOME") .addScalar("IDPESSOA",
		 * StandardBasicTypes.BIG_INTEGER).addScalar("NOME", StandardBasicTypes.STRING);
		 */

		query = getSession().createSQLQuery(
				"SELECT p.idpessoa as IDPESSOA, p.nome as NOME, p.razaosocial as RAZAO, p.numdocumento as DOCUMENTO  FROM pessoa p WHERE EXISTS (SELECT 1 FROM empresacliente e WHERE p.idpessoa = e.idforcli AND e.flgstatus = 'A' AND e.idpessoa in (select h.idpessoa from hotel h where h.idhotel = "
						+ idHotel + " )) ORDER BY p.nome")
				.addScalar("IDPESSOA", StandardBasicTypes.BIG_INTEGER).addScalar("NOME", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(ClienteDTO.class));

		result = query.list();

		return result;
	}

	public FaixaDTO getFaixaEtaria(Long idHotel) {
		Query query = null;
		FaixaDTO result = null;
		/*
		 * query = getSession().createSQLQuery(
		 * "select cp.IDPESSOA as IDPESSOA, p.NOME as NOME from EMPRESACLIENTE ec, CLIENTEPESS cp, PESSOA p where cp.IDPESSOA = p.IDPESSOA and p.IDPESSOA=ec.IDFORCLI and ec.IDPESSOA = "
		 * + idHotel + " order by p.NOME") .addScalar("IDPESSOA",
		 * StandardBasicTypes.BIG_INTEGER).addScalar("NOME", StandardBasicTypes.STRING);
		 */

		query = getSession().createSQLQuery("select idhotel as IDHOTEL,idademaxcri1 AS IDADEMAXCRI1, idademaxcri2 AS IDADEMAXCRI2 from paramhotel where idhotel = "+ idHotel)
				.addScalar("IDHOTEL", StandardBasicTypes.BIG_INTEGER)
				.addScalar("IDADEMAXCRI1", StandardBasicTypes.BIG_INTEGER)
				.addScalar("IDADEMAXCRI2", StandardBasicTypes.BIG_INTEGER);

		query.setResultTransformer(Transformers.aliasToBean(FaixaDTO.class));

		result = (FaixaDTO) query.uniqueResult();

		return result;
	}
	
	
	
	public List<ClienteDTO> getAllClientes(Long idHotel, String filter) {
		Query query = null;
		List<ClienteDTO> result = null;

		StringBuffer buffer = new StringBuffer();

		buffer.append("SELECT p.idpessoa as IDPESSOA, p.nome as NOME  FROM pessoa p");
		buffer.append(
				" WHERE EXISTS (SELECT 1 FROM empresacliente e WHERE p.idpessoa = e.idforcli AND e.flgstatus = 'A' AND e.idpessoa in ");
		buffer.append(" (select h.idpessoa from hotel h where h.idhotel =");
		buffer.append(idHotel).append("))");
		buffer.append(" and upper(p.NOME) like '%").append(filter.toUpperCase()).append("%' order by p.NOME");

		logger.info("getAllClientes->" + buffer.toString());

		query = getSession().createSQLQuery(buffer.toString()).addScalar("IDPESSOA", StandardBasicTypes.BIG_INTEGER)
				.addScalar("NOME", StandardBasicTypes.STRING);

		/*
		 * query = getSession().createSQLQuery(
		 * "SELECT p.idpessoa as IDPESSOA, p.nome as NOME, p.razaosocial as RAZAO, p.numdocumento as DOCUMENTO  FROM pessoa p WHERE EXISTS (SELECT 1 FROM empresacliente e WHERE p.idpessoa = e.idforcli AND e.flgstatus = 'A' AND e.idpessoa in (select h.idpessoa from hotel h where h.idhotel = "
		 * + idHotel + ")) and upper(p.NOME) like '%" + filter.toUpperCase() +
		 * "%' order by p.NOME") .addScalar("IDPESSOA",
		 * StandardBasicTypes.BIG_INTEGER).addScalar("NOME", StandardBasicTypes.STRING);
		 */
		/*
		 * query = getSession().createSQLQuery(
		 * "select cp.IDPESSOA as IDPESSOA, p.NOME as NOME from EMPRESACLIENTE ec, CLIENTEPESS cp, PESSOA p where cp.IDPESSOA = p.IDPESSOA and p.IDPESSOA=ec.IDFORCLI and ec.IDPESSOA = "
		 * + idHotel + " and upper(p.NOME) like '%" + filter.toUpperCase() +
		 * "%' order by p.NOME") .addScalar("IDPESSOA",
		 * StandardBasicTypes.BIG_INTEGER).addScalar("NOME", StandardBasicTypes.STRING);
		 */

		query.setResultTransformer(Transformers.aliasToBean(ClienteDTO.class));

		result = query.list();

		return result;
	}

	public List<TipoDebitoDTO> getAllTipoDebito(Long idHotel) {
		Query query = null;
		List<TipoDebitoDTO> result = null;

		query = getSession()
				.createSQLQuery("SELECT IDTIPODEBCRED, DESCRICAO FROM TIPODEBCREDHOTEL WHERE IDHOTEL = " + idHotel
						+ " AND DEBITOCREDITO = 'D' AND ATIVO = 'S' order by DESCRICAO ")
				.addScalar("IDTIPODEBCRED", StandardBasicTypes.INTEGER)
				.addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(TipoDebitoDTO.class));

		result = query.list();

		return result;
	}

	public List<TipoServicoDTO> getAllTipoServico(Long idHotel) {
		Query query = null;
		List<TipoServicoDTO> result = null;

		query = getSession().createSQLQuery(
				"SELECT IDSERVICOHOTEL, IDTIPODEBCRED, DESCRICAO, VALOROUTRAMOEDA from servicoshotel where flgativo = 'S' AND IDHOTEL = "
						+ idHotel + " order by DESCRICAO ")
				.addScalar("IDSERVICOHOTEL", StandardBasicTypes.INTEGER)
				.addScalar("IDTIPODEBCRED", StandardBasicTypes.INTEGER)
				.addScalar("DESCRICAO", StandardBasicTypes.STRING);

		query.setResultTransformer(Transformers.aliasToBean(TipoServicoDTO.class));

		result = query.list();

		return result;
	}

	public long cancelarReserva(Long XSEQRESERVAFRONT, Date XDATACANCELAMENTO, Long IDMOTIVO) throws Exception {
		long updated = 0;
		try {

			String temp = DateUtils.getInstance().formatarData(XDATACANCELAMENTO,
					BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_CANCELAMENTO = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			Query query = getSession().createSQLQuery(CANCELAR_RESERVA);
			query.setParameter("pIDRESERVA", XSEQRESERVAFRONT);
			query.setParameter("pDATA", sDATA_CANCELAMENTO);
			query.setParameter("pMOTIVO", IDMOTIVO);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha cancelarReserva ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public long cancelarReservaNumero(Long numero, Date XDATACANCELAMENTO, Long IDMOTIVO) throws Exception {
		long updated = 0;
		try {

			String temp = DateUtils.getInstance().formatarData(XDATACANCELAMENTO,
					BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_CANCELAMENTO = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			Query query = getSession().createSQLQuery(CANCELAR_RESERVA_NUMERO);
			query.setParameter("pIDRESERVA", numero);
			query.setParameter("pDATA", sDATA_CANCELAMENTO);
			query.setParameter("pMOTIVO", IDMOTIVO);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha cancelarReserva ("
							+ e.getMessage() + ")\".");
		}
		return updated;
	}

	public long inserirDirecionamento(Long pID, Long XCM_IDHOTEL, Date RESERVA_DATA_CHEGADA, Date RESERVA_DATA_PARTIDA,
			Date HORA_FIM, Integer XCM_IDTIPODEBITO, Long XCM_IDCONTA, Long XCM_IDCONTADESTINO) throws Exception {
		long updated = 0;
		try {

			String temp = DateUtils.getInstance().formatarData(RESERVA_DATA_CHEGADA,
					BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_RESERVA = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			temp = DateUtils.getInstance().formatarData(RESERVA_DATA_PARTIDA,
					BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_PARTIDA = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			Query query = getSession().createSQLQuery(INSERIR_DIRECIONAMENTO);
			query.setParameter("pID", pID);
			query.setParameter("pidHotel", XCM_IDHOTEL);
			query.setParameter("pIdTipoDeb", XCM_IDTIPODEBITO);
			query.setParameter("pIdContaCliente", XCM_IDCONTA);
			query.setParameter("pIdContaDestino", XCM_IDCONTADESTINO);
			query.setParameter("pDataInicio", sDATA_RESERVA);
			query.setParameter("pDataFim", sDATA_PARTIDA);
			query.setParameter("pHoraFim", HORA_FIM);
			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirReservaFront ("
							+ e.getMessage() + ")\".");

		}
		return updated;
	}

	public long inserirEventoReserva(Long XCM_IDHOTEL, Date DATA_ITEM, Long XCM_IDRESERVAFRONT, Long XCM_MOEDA,
			BigDecimal xVALORORCAMENTO) throws Exception {
		long updated = 0;
		try {

			String temp = DateUtils.getInstance().formatarData(DATA_ITEM, BundleUtils.getMessage("formato.campo.data"));

			Date sDATA_EVENTO = DateUtils.getInstance().criaDataComString(temp,
					BundleUtils.getMessage("formato.campo.data"));

			Query query = getSession().createSQLQuery(INSERIR_EVENTO_RESERVA);
			query.setParameter("dataevento", sDATA_EVENTO);
			query.setParameter("idreservasfront", XCM_IDRESERVAFRONT);
			query.setParameter("idhotel", XCM_IDHOTEL);
			query.setParameter("vlrdiaria", xVALORORCAMENTO);
			query.setParameter("moecodigo", XCM_MOEDA);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirEventoReserva ("
							+ e.getMessage() + ")\".");

		}
		return updated;
	}

	public long inserirServicoCanal(Long XCM_IDHOTEL, Long XCM_IDRESERVAFRONT, Long XCM_IDHOSPEDE, Long XCM_IDSERVICO)
			throws Exception {
		long updated = 0;
		try {

			Query query = getSession().createSQLQuery(INSERIR_SERVICO_CANAL);
			query.setParameter("pIdReserva", XCM_IDRESERVAFRONT);
			query.setParameter("pIdHotel", XCM_IDHOTEL);
			query.setParameter("pIdHospede", XCM_IDHOSPEDE);
			query.setParameter("pIdServicoHotel", XCM_IDSERVICO);

			updated = query.executeUpdate();

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirServicoCanal ("
							+ e.getMessage() + ")\".");

		}
		return updated;
	}

	public Long getNextSeqDirecionamento(DataSourceEnum dataSource) {

		Query query = null;
		Long result = null;
		if (dataSource.equals(DataSourceEnum.ORACLE)) {
			query = getSession().createSQLQuery("select SEQDIRECDESPESAS.NEXTVAL as num from dual").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

		} else if (dataSource.equals(DataSourceEnum.SQL_SERVER)) {

			String sql = "insert into SEQ_DIRECDESPESAS (flg) values (1)";

			Query queryInsert = getSession().createSQLQuery(sql);

			queryInsert.executeUpdate();

			query = getSession().createSQLQuery(" SELECT MAX(ID) as num FROM SEQ_DIRECDESPESAS").addScalar("num",
					StandardBasicTypes.BIG_INTEGER);
			result = ((BigInteger) query.uniqueResult()).longValue();

			System.out.println("ID Final : " + result);

		}

		return result;
	}
	
	public long inserirLancamentosFront(Long XCM_IDHOTEL, Long XSEQRESERVASFRONT, Long XSEQCONTASFRONT, Long XCM_USUARIO,
			Integer IDTIPODEBCRED, BigDecimal VLR_LANCAMENTO, String COD_AUTORIZACAO, String NSU, Date DATA_LANCAMENTO, 
			Integer QTDE_PARC) throws Exception {
		
		long updated = 0;
		
		try {
			Query query = getSession().createSQLQuery(INSERIR_LANCAMENTOSFRONT);
			query.setParameter("pIDHOTEL", XCM_IDHOTEL);
			query.setParameter("pIDLANCAMENTO", XSEQRESERVASFRONT);
			query.setParameter("pIDCONTA", XSEQCONTASFRONT);
			query.setParameter("pIDUSUARIO", XCM_USUARIO);
			query.setParameter("pIDTIPODEBCRED", IDTIPODEBCRED);
			query.setParameter("pDOCUMENTO", COD_AUTORIZACAO + "-" + NSU);
			query.setParameter("pVLRLANCAMENTO", VLR_LANCAMENTO);
			query.setParameter("pFLGREDIRECIONADO", 'N');
			query.setParameter("pDATALANCAMENTO", DATA_LANCAMENTO);
			query.setParameter("pHORALANCAMENTO", "sistema");
			query.setParameter("pQTDEITEM", 0);
			query.setParameter("pFLGLANCDESCONTO", 'N');
			query.setParameter("pLANCENCERRAMENTO", 'N');
			query.setParameter("pSEQNOTA", 0);
			query.setParameter("pCOTACAO", 1);
			query.setParameter("pFLGISENTO", 'S');
			query.setParameter("pNUMPARCELAS", QTDE_PARC);
			query.setParameter("pVLRLANCLIQUIDO", VLR_LANCAMENTO);
			query.setParameter("pCODPENSAO", 'I');
			updated = query.executeUpdate();

			logger.info("Inserindo bee2pay -> " + INSERIR_LANCAMENTOSFRONT + 
					XCM_IDHOTEL + ", " + XSEQRESERVASFRONT + ", " + XSEQCONTASFRONT +
					XCM_USUARIO + ", " + IDTIPODEBCRED + ", " + COD_AUTORIZACAO + "-" + NSU + VLR_LANCAMENTO + ", 'N'" + 
					DATA_LANCAMENTO + ", sistema, 0, 'N', 'N, 0, 1, 'S'" + QTDE_PARC + ", " + VLR_LANCAMENTO + ", 'I'");

		} catch (Exception e) {
			transactionFailed();
			logger.error(e.getMessage(), e);
			throw new Exception(
					"Erro inesperado. Entre em contato com a LOTUS e informe a seguinte mensagem de erro: \n\"Falha inserirLancamentosFront(Bee2Pay) ("
							+ e.getMessage() + ")\".");
		}
		
		return updated;
	}

}
