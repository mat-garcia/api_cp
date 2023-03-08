package br.com.hdnit.lotus.pms.cm.entity.oracle.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.AbstractGenericCMJPADAO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Disponibilidade;
import br.com.hdnit.lotus.pms.cm.entity.oracle.ViewPrimeDisponibilidadeDTO;

public class DisponibilidadeDAOImpl extends AbstractGenericCMJPADAO<Disponibilidade> {
	
	public DisponibilidadeDAOImpl(DataSourceEnum dataSource) {
		super(dataSource);
	}
	
	public Boolean existeView(String view) {
		Query query = null;
		String resultado = null;
		startTransaction();

		query = getSession().createSQLQuery("SELECT VIEW_NAME FROM ALL_VIEWS WHERE VIEW_NAME = '" + view.toUpperCase() + "'");
		resultado = (String) query.uniqueResult();
		
		logger.info("Retorno do BD Oracle: " + resultado);
		finishTransacton();

		return (resultado != null) ? true : false;
	} 
	
	public boolean criarView(String view, String dataAutal) {
		long updated = 0;
		Query query = null;
		
		StringBuilder strBuilder = new StringBuilder();
		
		try {
			if (view.toUpperCase() == "VW_PRIME_DISP") {
				strBuilder.append("	CREATE VIEW CM.VW_PRIME_DISP (                                                                                                                                                                                                                             ");
				strBuilder.append("	    DATA,                                                                                                                                                                                                                                                  ");
				strBuilder.append("	    IDHOTEL,                                                                                                                                                                                                                                               ");
				strBuilder.append("	    CODREDUZIDO,                                                                                                                                                                                                                                           ");
				strBuilder.append("	    IDTIPOUH,                                                                                                                                                                                                                                              ");
				strBuilder.append("	    QTD_UHS,                                                                                                                                                                                                                                               ");
				strBuilder.append("	    TOTOCUPADA,                                                                                                                                                                                                                                            ");
				strBuilder.append("	    TOTWAITLIST,                                                                                                                                                                                                                                           ");
				strBuilder.append("	    TOTACONFIRMAR,                                                                                                                                                                                                                                         ");
				strBuilder.append("	    TOTCONFIRMADA,                                                                                                                                                                                                                                         ");
				strBuilder.append("	    QTDALLOTMENTS,                                                                                                                                                                                                                                         ");
				strBuilder.append("	    QTDALLOTREAL,                                                                                                                                                                                                                                          ");
				strBuilder.append("	    QTD_BLOQ) AS                                                                                                                                                                                                                                           ");
				strBuilder.append("	(SELECT                                                                                                                                                                                                                                                    ");
				strBuilder.append("	    DATA,                                                                                                                                                                                                                                                  ");
				strBuilder.append("	    IDHOTEL,                                                                                                                                                                                                                                               ");
				strBuilder.append("	    CODREDUZIDO,                                                                                                                                                                                                                                           ");
				strBuilder.append("	    IDTIPOUH,                                                                                                                                                                                                                                              ");
				strBuilder.append("	    SUM(QTD_UHS)       AS QTD_UHS,                                                                                                                                                                                                                         ");
				strBuilder.append("	    SUM(TOTOCUPADA)    AS TOTOCUPADA,                                                                                                                                                                                                                      ");
				strBuilder.append("	    SUM(TOTWAITLIST)   AS TOTWAITLIST,                                                                                                                                                                                                                     ");
				strBuilder.append("	    SUM(TOTACONFIRMAR) AS TOTACONFIRMAR,                                                                                                                                                                                                                   ");
				strBuilder.append("	    SUM(TOTCONFIRMADA) AS TOTCONFIRMADA,                                                                                                                                                                                                                   ");
				strBuilder.append("	    SUM(QTDALLOTMENTS) AS QTDALLOTMENTS,                                                                                                                                                                                                                   ");
				strBuilder.append("	    SUM(QTDALLOTREAL)  AS QTDALLOTREAL,                                                                                                                                                                                                                    ");
				strBuilder.append("	    SUM(QTD_BLOQ)      AS QTD_BLOQ                                                                                                                                                                                                                         ");
				strBuilder.append("	FROM                                                                                                                                                                                                                                                       ");
				strBuilder.append("	(                                                                                                                                                                                                                                                          ");
				strBuilder.append("	SELECT                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    VW.DATA,                                                                                                                                                                                                                                               ");
				strBuilder.append("	    VW.IDHOTEL,                                                                                                                                                                                                                                            ");
				strBuilder.append("	    T.CODREDUZIDO,                                                                                                                                                                                                                                         ");
				strBuilder.append("	    T.IDTIPOUH,                                                                                                                                                                                                                                            ");
				strBuilder.append("	    VW.TOTAL_UHS AS QTD_UHS,                                                                                                                                                                                                                               ");
				strBuilder.append("	    0 AS TOTOCUPADA,                                                                                                                                                                                                                                       ");
				strBuilder.append("	    0 AS TOTWAITLIST,                                                                                                                                                                                                                                      ");
				strBuilder.append("	    0 AS TOTACONFIRMAR,                                                                                                                                                                                                                                    ");
				strBuilder.append("	    0 AS TOTCONFIRMADA,                                                                                                                                                                                                                                    ");
				strBuilder.append("	    0 AS QTDALLOTMENTS,                                                                                                                                                                                                                                    ");
				strBuilder.append("	    0 AS QTDALLOTREAL,                                                                                                                                                                                                                                     ");
				strBuilder.append("	    0 AS QTD_BLOQ                                                                                                                                                                                                                                          ");
				strBuilder.append("	FROM                                                                                                                                                                                                                                                       ");
				strBuilder.append("	   VWTOTUHPOOL VW                                                                                                                                                                                                                                          ");
				strBuilder.append("	   INNER JOIN TIPOUH T ON (VW.IDHOTEL = T.IDHOTEL AND VW.IDTIPOUH = T.IDTIPOUH)                                                                                                                                                                            ");
				strBuilder.append("	WHERE                                                                                                                                                                                                                                                      ");
				strBuilder.append("	    VW.DATA >= TO_DATE('" + dataAutal +"', 'DD/MM/YYYY')                                                                                                                                                                                                         ");
				strBuilder.append("	UNION ALL                                                                                                                                                                                                                                                  ");
				strBuilder.append("	SELECT                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    D.DATA,                                                                                                                                                                                                                                                ");
				strBuilder.append("	    R.IDHOTEL,                                                                                                                                                                                                                                             ");
				strBuilder.append("	    T.CODREDUZIDO,                                                                                                                                                                                                                                         ");
				strBuilder.append("	    T.IDTIPOUH,                                                                                                                                                                                                                                            ");
				strBuilder.append("	    0 AS QTD_UHS,                                                                                                                                                                                                                                          ");
				strBuilder.append("	    SUM(CASE WHEN R.STATUSRESERVA = 7 THEN 0 ELSE 1 END) AS TOTOCUPADA,                                                                                                                                                                                    ");
				strBuilder.append("	    SUM(CASE WHEN R.STATUSRESERVA = 7 THEN 1 ELSE 0 END) AS TOTWAITLIST,                                                                                                                                                                                   ");
				strBuilder.append("	    SUM(CASE WHEN R.STATUSRESERVA = 0 THEN 1 ELSE 0 END) AS TOTACONFIRMAR,                                                                                                                                                                                 ");
				strBuilder.append("	    SUM(CASE WHEN R.STATUSRESERVA = 1 THEN 1 ELSE 0 END) AS TOTCONFIRMADA,                                                                                                                                                                                 ");
				strBuilder.append("	    SUM(CASE WHEN R.STATUSRESERVA = 7 THEN 0 ELSE DECODE(SIGN(TO_NUMBER(DATA-NVL(A.DATACUTOFF-1,DATA))),1,1,0) END) AS QTDALLOTMENTS,                                                                                                                      ");
				strBuilder.append("	    SUM(CASE WHEN R.TIPOUHESTADIA = A.IDTIPOUH THEN 1 ELSE 0 END) AS QTDALLOTREAL,                                                                                                                                                                         ");
				strBuilder.append("	    0 AS QTD_BLOQ                                                                                                                                                                                                                                          ");
				strBuilder.append("	FROM                                                                                                                                                                                                                                                       ");
				strBuilder.append("	   DATASIS D                                                                                                                                                                                                                                               ");
				strBuilder.append("	   INNER JOIN RESERVASFRONT R ON (D.IDHOTEL = R.IDHOTEL AND COALESCE(R.DATACHEGADAREAL, R.DATACHEGPREVISTA) <= D.DATA AND COALESCE(R.DATAPARTIDAREAL, R.DATAPARTPREVISTA) > D.DATA AND R.STATUSRESERVA < 4 AND R.POOLLISTA = 'N' AND R.IDROOMLIST IS NULL) ");
				strBuilder.append("	   INNER JOIN HOTEL HO ON (R.IDHOTEL = HO.IDHOTEL)																																																		   ");	
				strBuilder.append("	   INNER JOIN EMPRESAPROP EP ON (HO.IDPESSOA = EP.IDPESSOA AND EP.FLGATIVO = 'S')                                                                                                                                                                          ");
				strBuilder.append("	   INNER JOIN TIPOUH T ON (R.TIPOUHESTADIA = T.IDTIPOUH AND R.IDHOTEL = T.IDHOTEL AND T.FLGAPARECENADISP <>'N' AND COALESCE(T.FLGATIVA, 'N') = 'S')                                                                                                        ");
				strBuilder.append("	   LEFT OUTER JOIN ALLOTMENTXTIPOUH A ON (R.IDALLOTXTIPOUH = A.IDALLOTXTIPOUH AND R.IDHOTEL = A.IDHOTEL)                                                                                                                                                   ");
				strBuilder.append("	WHERE                                                                                                                                                                                                                                                      ");
				strBuilder.append("	    D.DATA >= TO_DATE('"+ dataAutal +"', 'DD/MM/YYYY')                                                                                                                                                                                                          ");
				strBuilder.append("	GROUP BY                                                                                                                                                                                                                                                   ");
				strBuilder.append("	    D.DATA,                                                                                                                                                                                                                                                ");
				strBuilder.append("	    R.IDHOTEL,                                                                                                                                                                                                                                             ");
				strBuilder.append("	    T.CODREDUZIDO,                                                                                                                                                                                                                                         ");
				strBuilder.append("	    T.IDTIPOUH,                                                                                                                                                                                                                                            ");
				strBuilder.append("	    T.IDHOTEL                                                                                                                                                                                                                                              ");
				strBuilder.append("	UNION ALL                                                                                                                                                                                                                                                  ");
				strBuilder.append("	SELECT                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    D.DATA,                                                                                                                                                                                                                                                ");
				strBuilder.append("	    D.IDHOTEL,                                                                                                                                                                                                                                             ");
				strBuilder.append("	    T.CODREDUZIDO,                                                                                                                                                                                                                                         ");
				strBuilder.append("	    T.IDTIPOUH,                                                                                                                                                                                                                                            ");
				strBuilder.append("	    0 AS QTD_UHS,                                                                                                                                                                                                                                          ");
				strBuilder.append("	    SUM(DECODE(RG.STATUSRESERVA, 7, 0, A.QTDUH)) AS TOTOCUPADA,                                                                                                                                                                                            ");
				strBuilder.append("	    SUM(DECODE(RG.STATUSRESERVA, 7, A.QTDUH, 0)) AS TOTWAITLIST,                                                                                                                                                                                           ");
				strBuilder.append("	    SUM(DECODE(RG.STATUSRESERVA, 0, A.QTDUH, 0)) AS TOTACONFIRMAR,                                                                                                                                                                                         ");
				strBuilder.append("	    SUM(DECODE(RG.STATUSRESERVA, 1, A.QTDUH, 0)) AS TOTCONFIRMADA,                                                                                                                                                                                         ");
				strBuilder.append("	    0,                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    0,                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    0                                                                                                                                                                                                                                                      ");
				strBuilder.append("	FROM                                                                                                                                                                                                                                                       ");
				strBuilder.append("	   DATASIS D                                                                                                                                                                                                                                               ");
				strBuilder.append("	   INNER JOIN ACOMODACAO A ON (D.IDHOTEL = A.IDHOTEL AND D.DATA >= A.DATACHEGADA AND D.DATA < A.DATAPARTIDA)                                                                                                                                               ");
				strBuilder.append("	   INNER JOIN RESERVAGRUPO RG ON (A.IDRESERVAGRUPO = RG.IDRESERVAGRUPO)                                                                                                                                                                                    ");
				strBuilder.append("	   INNER JOIN TIPOUH T ON (A.IDHOTEL = T.IDHOTEL AND A.IDTIPOUH = T.IDTIPOUH AND T.FLGAPARECENADISP <> 'N')                                                                                                                                                ");
				strBuilder.append("	   INNER JOIN HOTEL HO ON (T.IDHOTEL = HO.IDHOTEL)                                                                                                                                                                                                         ");
				strBuilder.append("	   INNER JOIN EMPRESAPROP P ON (HO.IDPESSOA = P.IDPESSOA AND COALESCE(P.FLGATIVO, 'N') = 'S')                                                                                                                                                              ");
				strBuilder.append("	WHERE                                                                                                                                                                                                                                                      ");
				strBuilder.append("	    D.DATA >= TO_DATE('"+ dataAutal +"', 'DD/MM/YYYY')                                                                                                                                                                                                          ");
				strBuilder.append("	    AND (RG.STATUSRESERVA < 3 OR RG.STATUSRESERVA = 7)                                                                                                                                                                                                     ");
				strBuilder.append("	GROUP BY                                                                                                                                                                                                                                                   ");
				strBuilder.append("	    D.DATA,                                                                                                                                                                                                                                                ");
				strBuilder.append("	    D.IDHOTEL,                                                                                                                                                                                                                                             ");
				strBuilder.append("	    T.CODREDUZIDO,                                                                                                                                                                                                                                         ");
				strBuilder.append("	    T.IDTIPOUH,                                                                                                                                                                                                                                            ");
				strBuilder.append("	    T.IDHOTEL                                                                                                                                                                                                                                              ");
				strBuilder.append("	UNION ALL                                                                                                                                                                                                                                                  ");
				strBuilder.append("	SELECT                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    D.DATA,                                                                                                                                                                                                                                                ");
				strBuilder.append("	    U.IDHOTEL,                                                                                                                                                                                                                                             ");
				strBuilder.append("	    T.CODREDUZIDO,                                                                                                                                                                                                                                         ");
				strBuilder.append("	    U.IDTIPOUH,                                                                                                                                                                                                                                            ");
				strBuilder.append("	    0 AS QTD_UHS,                                                                                                                                                                                                                                          ");
				strBuilder.append("	    0,                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    0,                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    0,                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    0,                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    0,                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    0,                                                                                                                                                                                                                                                     ");
				strBuilder.append("	    SUM(1) AS QTD_BLOQ                                                                                                                                                                                                                                     ");
				strBuilder.append("	FROM                                                                                                                                                                                                                                                       ");
				strBuilder.append("	   DATASIS D                                                                                                                                                                                                                                               ");
				strBuilder.append("	   INNER JOIN BLOQUEIOUH B ON (D.IDHOTEL = B.IDHOTEL AND D.DATA >= B.DATAINICIO AND D.DATA <= B.DATAFIM)                                                                                                                                                   ");
				strBuilder.append("	   INNER JOIN UH U ON (B.CODUH = U.CODUH AND B.IDHOTEL = U.IDHOTEL)                                                                                                                                                                                        ");
				strBuilder.append("	   INNER JOIN TIPOUH T ON (U.IDHOTEL = T.IDHOTEL AND U.IDTIPOUH = T.IDTIPOUH AND T.FLGAPARECENADISP <> 'N')                                                                                                                                                ");
				strBuilder.append("	WHERE                                                                                                                                                                                                                                                      ");
				strBuilder.append("	    D.DATA >= TO_DATE('"+ dataAutal +"', 'DD/MM/YYYY')                                                                                                                                                                                                          ");
				strBuilder.append("	GROUP BY                                                                                                                                                                                                                                                   ");
				strBuilder.append("	    D.DATA,                                                                                                                                                                                                                                                ");
				strBuilder.append("	    U.IDHOTEL,                                                                                                                                                                                                                                             ");
				strBuilder.append("	    U.IDTIPOUH,                                                                                                                                                                                                                                            ");
				strBuilder.append("	    T.CODREDUZIDO                                                                                                                                                                                                                                          ");
				strBuilder.append("	) X                                                                                                                                                                                                                                                        ");
				strBuilder.append("	GROUP BY                                                                                                                                                                                                                                                   ");
				strBuilder.append("	    DATA,                                                                                                                                                                                                                                                  ");
				strBuilder.append("	    IDHOTEL,                                                                                                                                                                                                                                               ");
				strBuilder.append("	    CODREDUZIDO,                                                                                                                                                                                                                                           ");
				strBuilder.append("	    IDTIPOUH)                                                                                                                                                                                                                                              ");
			} else {
				strBuilder.append("");
			}
			
			startTransaction();
			logger.info(strBuilder.toString());
			query = getSession().createSQLQuery(strBuilder.toString());
			updated = query.executeUpdate();
			
			logger.info("Resultado -> " + updated);
			
			finishTransacton();
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Erro " + e.getMessage());
		}
		
		return true;
	}
	
	public List<ViewPrimeDisponibilidadeDTO> obterDisponibilidades(String idHotel, String dataInicial, String dataFinal, String codigos) {
		
		Query query = null;
		List<ViewPrimeDisponibilidadeDTO> resultado = null;
		startTransaction();
		
		try {
			query = getSession().createSQLQuery(
							"SELECT																																"+
							"	Q.idhotel,                                                                                                                      "+
							"	min(Q.DATAINICIAL) AS dataInicial,                                                                                              "+
							"	COALESCE(Q.DATAFINAL, D.DATA) AS dataFinal,                                                                                     "+
							"	Q.codReduzido,                                                                                                                  "+
							"	Q.qtd_uhs,                                                                                                                      "+
							"	Q.disponibilidade                                                                                                               "+
							"FROM                                                                                                                               "+
							"	(                                                                                                                               "+
							"	SELECT                                                                                                                          "+
							"		D1.IDHOTEL,                                                                                                                 "+
							"		D1.DATA AS DATAINICIAL,                                                                                                     "+
							"		MIN(D2.DATA - 1) AS DATAFINAL,                                                                                              "+
							"		D1.CODREDUZIDO,                                                                                                             "+
							"		D1.QTD_UHS,                                                                                                                 "+
							"		D1.DISPONIBILIDADE                                                                                                          "+
							"	FROM                                                                                                                            "+
							"		(                                                                                                                           "+
							"		SELECT                                                                                                                      "+
							"			DATA,                                                                                                                   "+
							"			IDHOTEL,                                                                                                                "+
							"			CODREDUZIDO,                                                                                                            "+
							"			QTD_UHS,                                                                                                                "+
							"			SUM(QTD_UHS - TOTOCUPADA - TOTWAITLIST - QTDALLOTMENTS - QTD_BLOQ) AS DISPONIBILIDADE                                   "+
							"		FROM                                                                                                                        "+
							"			VW_PRIME_DISP                                                                                                           "+
							"		WHERE                                                                                                                       "+
							"			IDHOTEL = '" + idHotel + "'" +                                                                                                    
							"			AND DATA BETWEEN TO_DATE('" + dataInicial + "', 'dd/mm/yyyy') AND TO_DATE('" + dataFinal + "', 'dd/mm/yyyy')            "+
							"			AND CODREDUZIDO IN (" + codigos + ")"																					 + 
							"		GROUP BY                                                                                                                    "+
							"			DATA,                                                                                                                   "+
							"			IDHOTEL,                                                                                                                "+
							"			CODREDUZIDO,                                                                                                            "+
							"			QTD_UHS                                                                                                                 "+
							") D1                                                                                                                               "+
							"	LEFT OUTER JOIN                                                                                                                 "+
							"(                                                                                                                                  "+
							"		SELECT                                                                                                                      "+
							"			DATA,                                                                                                                   "+
							"			IDHOTEL,                                                                                                                "+
							"			CODREDUZIDO,                                                                                                            "+
							"			QTD_UHS,                                                                                                                "+
							"			SUM(QTD_UHS - TOTOCUPADA - TOTWAITLIST - QTDALLOTMENTS - QTD_BLOQ) AS DISPONIBILIDADE                                   "+
							"		FROM                                                                                                                        "+
							"			VW_PRIME_DISP                                                                                                           "+
							"		WHERE                                                                                                                       "+
							"			IDHOTEL = '" + idHotel + "'" +                                                                                           
							"			AND DATA BETWEEN TO_DATE('" + dataInicial + "', 'dd/mm/yyyy') AND TO_DATE('" + dataFinal + "', 'dd/mm/yyyy')            "+
							"			AND CODREDUZIDO IN (" + codigos + ")"																					 +                                                                                            
							"			GROUP BY                                                                                                                "+
							"				DATA,                                                                                                               "+
							"				IDHOTEL,                                                                                                            "+
							"				CODREDUZIDO,                                                                                                        "+
							"				QTD_UHS                                                                                                             "+
							") D2 ON                                                                                                                            "+
							"		(D1.IDHOTEL = D2.IDHOTEL                                                                                                    "+
							"			AND D1.CODREDUZIDO = D2.CODREDUZIDO                                                                                     "+
							"			AND TO_CHAR(D1.QTD_UHS)|| '-' || TO_CHAR(D1.DISPONIBILIDADE) <> TO_CHAR(D2.QTD_UHS)|| '-' || TO_CHAR(D2.DISPONIBILIDADE)"+
							"				AND D1.DATA < D2.DATA)                                                                                              "+
							"	GROUP BY                                                                                                                        "+
							"		D1.IDHOTEL,                                                                                                                 "+
							"		D1.DATA,                                                                                                                    "+
							"		D1.CODREDUZIDO,                                                                                                             "+
							"		D1.QTD_UHS,                                                                                                                 "+
							"		D1.DISPONIBILIDADE                                                                                                          "+
							") q,                                                                                                                               "+
							"	(                                                                                                                               "+
							"	SELECT                                                                                                                          "+
							"		TO_DATE('" + dataFinal + "', 'dd/mm/yyyy') AS DATA                                                                          "+
							"	FROM                                                                                                                            "+
							"		dual) d                                                                                                                     "+
							"GROUP BY                                                                                                                           "+
							"	Q.IDHOTEL,                                                                                                                      "+
							"	COALESCE(Q.datafinal, D.DATA),                                                                                                  "+
							"	Q.CODREDUZIDO,                                                                                                                  "+
							"	Q.QTD_UHS,                                                                                                                      "+
							"	Q.DISPONIBILIDADE                                                                                                               "+
							"ORDER BY                                                                                                                           "+
							"	IDHOTEL,                                                                                                                        "+
							"	CODREDUZIDO,                                                                                                                    "+
							"	DATAINICIAL                                                                                                                     "
					).addScalar("idhotel", StandardBasicTypes.LONG)
					.addScalar("dataInicial", StandardBasicTypes.DATE)
					.addScalar("dataFinal", StandardBasicTypes.DATE)
					.addScalar("codReduzido", StandardBasicTypes.STRING)
					.addScalar("qtd_uhs", StandardBasicTypes.INTEGER)
					.addScalar("disponibilidade", StandardBasicTypes.INTEGER);
			
			logger.info("Qry - " + query.toString());
			query.setResultTransformer(Transformers.aliasToBean(ViewPrimeDisponibilidadeDTO.class));
			resultado = query.list();
						
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Ocorreu um erro ->" + e.getMessage());
		}
		
		finishTransacton();
		
		return resultado;
	}
}

