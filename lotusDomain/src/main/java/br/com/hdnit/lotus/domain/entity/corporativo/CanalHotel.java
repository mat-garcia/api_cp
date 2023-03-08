/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hdnit.lotus.domain.entity.corporativo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.com.hdnit.lotus.domain.entity.AuditTrail;
import br.com.hdnit.lotus.domain.entity.config.TipoDebitoConfig;
import br.com.hdnit.lotus.domain.entity.config.TipoServicoConfig;
import br.com.hdnit.lotus.pms.cm.entity.oracle.ClienteDTO;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Contrclihotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Origemreserva;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Segmento;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tarifahotel;
import br.com.hdnit.lotus.pms.cm.entity.oracle.Tipohospede;
import br.com.hdnit.lotus.pms.lpp.dto.LphContrato;
import br.com.hdnit.lotus.pms.lpp.dto.LphOrigemReserva;
import br.com.hdnit.lotus.pms.lpp.dto.LphPessoa;
import br.com.hdnit.lotus.pms.lpp.dto.LphSegmentoReserva;
import br.com.hdnit.lotus.pms.lpp.dto.LphTarifa;
import br.com.hdnit.lotus.pms.lpp.dto.LphTipoHospede;

/**
 * 
 * @author hdn
 */
@Entity
@Table(name = "canal_hotel")
@XmlRootElement
public class CanalHotel extends AuditTrail {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CanalHotel [id=");
		builder.append(id);
		builder.append(", idOrigem=");
		builder.append(idOrigem);
		builder.append(", nomeOrigem=");
		builder.append(nomeOrigem);
		builder.append(", codigoOrigem=");
		builder.append(codigoOrigem);
		builder.append("]");
		return builder.toString();
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "ID_ORIGEM", nullable = true)
	private Integer idOrigem;

	@Column(name = "ORIGEM_NOME", nullable = true)
	private String nomeOrigem;

	@Column(name = "CODIGO_ORIGEM", nullable = true, updatable = true)
	private String codigoOrigem;

	@Transient
	private Origemreserva origemSelecionada = null;

	@Transient
	private LphOrigemReserva origemSelecionadaLph = null;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "canalHotel", orphanRemoval = true, cascade = {
			javax.persistence.CascadeType.ALL })
	private List<TipoDebitoConfig> lstTipoDebitoConfig;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "canalHotel", orphanRemoval = true, cascade = {
			javax.persistence.CascadeType.ALL })
	private Set<TipoServicoConfig> lstTipoServicoConfig;

	@ManyToOne
	@JoinColumn(name = "ID_CANAL", nullable = false)
	@Fetch(FetchMode.SELECT)
	private Canal canal;

	@ManyToOne
	@JoinColumn(name = "ID_HOTEL", nullable = false)
	@Fetch(FetchMode.SELECT)
	private Empresa empresaPai;

	@ManyToOne
	@JoinColumn(name = "ID_PARCEIRO", nullable = false)
	@Fetch(FetchMode.SELECT)
	private Parceiro parceiro;

	@Column(name = "ID_PMS", nullable = true)
	private Integer idPms;

	@Column(name = "CLI_NOME", nullable = true)
	private String clienteNome;

	@Column(name = "SEG_COD", nullable = true)
	private String codigoSegmento;

	@Column(name = "SEG_NOME", nullable = true)
	private String nomeSegmento;

	@Column(name = "ID_CTR", nullable = true)
	private Integer idCtr;

	@Column(name = "CTR_NOME_TARIFA", nullable = true)
	private String ctrNomeTarifa;

	@Column(name = "CTR_INICIO", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	protected Date ctrInicio;

	@Column(name = "CTR_FIM", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	protected Date ctrFim;

	@Column(name = "MARK_UP", nullable = true)
	private Double markUp;

	@Column(name = "ISS", nullable = true)
	private Double iss;

	
	@Column(name = "ID_TIPO_HOSPEDE", nullable = true)
	private Integer idTipoHospede;

	@Column(name = "TIPO_HOSP_NOME", nullable = true)
	private String nomeTipoHospede;

	@Column(name = "COD_TIPO_HOSPEDER", nullable = true)
	private String codigoTipoHospede;

	@Column(name = "COD_TARIFA", nullable = true)
	private String codigoTarifa;

	@Column(name = "ID_TIPO_TARIFA", nullable = true)
	private Integer idTipoTarifa;

	@Column(name = "TIPO_TARIFA_NOME", nullable = true)
	private String nomeTipoTarifa;

	@Column(name = "OBSERVACAO", nullable = true)
	private String observacao;

	@Transient
	private Tipohospede tipoHospedeSelecionado = null;

	@Transient
	private Tarifahotel tipoTarifaSelecionada = null;

	@Transient
	private Segmento segmentoSelecionada = null;
	@Transient
	private Contrclihotel contrclihotelSelecionada = null;
	@Transient
	private ClienteDTO pessoaSelecionada = null;

	@Transient
	private LphTipoHospede tipoHospedeSelecionadoLph = null;

	@Transient
	private LphTarifa tipoTarifaSelecionadaLph = null;

	@Transient
	private LphSegmentoReserva segmentoSelecionadaLph = null;
	@Transient
	private LphContrato contrclihotelSelecionadaLph = null;
	@Transient
	private LphPessoa pessoaSelecionadaLph = null;

	@Column(name = "BL_CONTA", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean gerarContaFront = Boolean.FALSE;

	@Column(name = "BL_NO_SHOW", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean noShow = Boolean.TRUE;

	@Column(name = "BL_ISS", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean issMunicipal = Boolean.FALSE;

	@Column(name = "BL_TXTURISMO", nullable = true, columnDefinition = "BOOLEAN")
	private Boolean taxaTurismo = Boolean.FALSE;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdPms() {
		return idPms;
	}

	public void setIdPms(Integer idPms) {
		this.idPms = idPms;
	}

	public String getCodigoSegmento() {
		return codigoSegmento;
	}

	public void setCodigoSegmento(String codigoSegmento) {
		this.codigoSegmento = codigoSegmento;

	}

	public String getNomeSegmento() {
		return nomeSegmento;
	}

	public void setNomeSegmento(String nomeSegmento) {
		this.nomeSegmento = nomeSegmento;
	}

	public Integer getIdCtr() {
		return idCtr;
	}

	public void setIdCtr(Integer idCtr) {
		this.idCtr = idCtr;
	}

	public Date getCtrInicio() {
		return ctrInicio;
	}

	public void setCtrInicio(Date ctrInicio) {
		this.ctrInicio = ctrInicio;
	}

	public Date getCtrFim() {
		return ctrFim;
	}

	public void setCtrFim(Date ctrFim) {
		this.ctrFim = ctrFim;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public Segmento getSegmentoSelecionada() {
		return segmentoSelecionada;
	}

	public void setSegmentoSelecionada(Segmento segmentoSelecionada) {
		this.segmentoSelecionada = segmentoSelecionada;
		if (this.segmentoSelecionada != null) {
			if (this.segmentoSelecionada.getCodreduzido() == null) {
				this.setCodigoSegmento(null);
				this.setNomeSegmento(null);
			} else {
				this.setCodigoSegmento(this.segmentoSelecionada.getSegmentoPK().getCodsegmento());

				this.setNomeSegmento(this.segmentoSelecionada.getDescricao());
			}
		}
	}

	public Contrclihotel getContrclihotelSelecionada() {
		return contrclihotelSelecionada;
	}

	public void setContrclihotelSelecionada(Contrclihotel contrclihotelSelecionada) {
		this.contrclihotelSelecionada = contrclihotelSelecionada;
		if (this.contrclihotelSelecionada != null) {
			if (this.contrclihotelSelecionada.getNometarifa() == null) {
				this.setIdCtr(null);
				this.setCtrNomeTarifa(null);
				this.setCtrInicio(null);
				this.setCtrFim(null);
			} else {

				this.setIdCtr(this.contrclihotelSelecionada.getContrclihotelPK().getCodcontrato().intValue());
				this.setCtrNomeTarifa(this.contrclihotelSelecionada.getNometarifa());
				this.setCtrInicio(this.contrclihotelSelecionada.getDatainicontrato());
				this.setCtrFim(this.contrclihotelSelecionada.getDatafimcontrato());
			}
		}
	}

	public ClienteDTO getPessoaSelecionada() {
		return pessoaSelecionada;
	}

	public void setPessoaSelecionada(ClienteDTO pessoaSelecionada) {
		this.pessoaSelecionada = pessoaSelecionada;
		if (this.pessoaSelecionada != null) {
			if (this.pessoaSelecionada.getIDPESSOA() == null) {
				this.setIdPms(null);
				this.setClienteNome(null);
			} else {

				this.setIdPms(this.pessoaSelecionada.getIDPESSOA().intValue());
				this.setClienteNome(this.pessoaSelecionada.getNOME());
			}
		}
	}

	@Transient
	public String getTipoHospedeTxt() {
		StringBuffer buffer = new StringBuffer();

		buffer.append("");

		if (this.getIdTipoHospede() != null) {
			buffer.append(this.getIdTipoHospede());
			buffer.append("-");
			buffer.append(this.getNomeTipoHospede());

		}

		return buffer.toString();

	}

	@Transient
	public String getTipoTarifaTxt() {
		StringBuffer buffer = new StringBuffer();

		buffer.append("");

		if (this.getIdTipoTarifa() != null) {
			buffer.append(this.getIdTipoTarifa());
			buffer.append("-");
			buffer.append(this.getNomeTipoTarifa());
		}

		return buffer.toString();

	}

	@Transient
	public String getClienteTxt() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("");

		if (this.getIdPms() != null) {
			buffer.append(this.getIdPms());
			buffer.append("-");

			buffer.append(this.getClienteNome());

		}

		return buffer.toString();

	}

	@Transient
	public String getSegmentoTxt() {
		StringBuffer buffer = new StringBuffer();

		buffer.append("");

		if (this.getCodigoSegmento() != null) {
			buffer.append(this.getCodigoSegmento());
			buffer.append("-");
			buffer.append(this.getNomeSegmento());

		}

		return buffer.toString();

	}

	@Transient
	public String getContratoTxt() {
		StringBuffer buffer = new StringBuffer();

		buffer.append("");

		if (this.getIdCtr() != null) {
			buffer.append(this.getIdCtr());
			buffer.append("-");
			buffer.append(this.getCtrNomeTarifa());
		}

		return buffer.toString();

	}

	@Transient
	public String getTipoHospede() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("");

		if (this.getIdTipoHospede() != null) {
			buffer.append(this.getIdTipoHospede());
			buffer.append("-");

			buffer.append(this.getClienteNome());

		}

		return buffer.toString();

	}

	public String getCtrNomeTarifa() {
		return ctrNomeTarifa;
	}

	public void setCtrNomeTarifa(String ctrNomeTarifa) {
		this.ctrNomeTarifa = ctrNomeTarifa;
	}

	public Boolean getGerarContaFront() {
		if (gerarContaFront == null) {
			gerarContaFront = Boolean.FALSE;
		}
		return gerarContaFront;
	}

	public void setGerarContaFront(Boolean gerarContaFront) {
		this.gerarContaFront = gerarContaFront;
	}

	public Integer getIdTipoHospede() {
		return idTipoHospede;
	}

	public void setIdTipoHospede(Integer idTipoHospede) {
		this.idTipoHospede = idTipoHospede;
	}

	public Tipohospede getTipoHospedeSelecionado() {
		return tipoHospedeSelecionado;
	}

	public void setTipoHospedeSelecionado(Tipohospede tipoHospedeSelecionado) {
		this.tipoHospedeSelecionado = tipoHospedeSelecionado;
		if (this.tipoHospedeSelecionado != null) {
			if (this.tipoHospedeSelecionado.getCodreduzido() == null) {
				this.setIdTipoHospede(null);
				this.setNomeTipoHospede(null);

			} else {

				this.setIdTipoHospede(this.tipoHospedeSelecionado.getTipohospedePK().getIdtipohospede().intValue());
				this.setNomeTipoHospede(this.tipoHospedeSelecionado.getDescricao());
			}
		}

	}

	public Boolean getNoShow() {
		return noShow;
	}

	public void setNoShow(Boolean noShow) {
		this.noShow = noShow;
	}

	public String getNomeTipoHospede() {
		return nomeTipoHospede;
	}

	public void setNomeTipoHospede(String nomeTipoHospede) {
		this.nomeTipoHospede = nomeTipoHospede;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	public Empresa getEmpresaPai() {
		return empresaPai;
	}

	public void setEmpresaPai(Empresa empresaPai) {
		this.empresaPai = empresaPai;
	}

	public Parceiro getParceiro() {
		return parceiro;
	}

	public void setParceiro(Parceiro parceiro) {
		this.parceiro = parceiro;
	}

	public Tarifahotel getTipoTarifaSelecionada() {
		return tipoTarifaSelecionada;
	}

	public void setTipoTarifaSelecionada(Tarifahotel tipoTarifaSelecionada) {
		this.tipoTarifaSelecionada = tipoTarifaSelecionada;
		if (this.tipoTarifaSelecionada != null) {
			if (this.tipoTarifaSelecionada.getCodpensao() == null) {
				this.setIdTipoTarifa(null);
				this.setNomeTipoTarifa(null);

			} else {

				this.setIdTipoTarifa(this.tipoTarifaSelecionada.getTarifahotelPK().getIdtarifa().intValue());
				this.setNomeTipoTarifa(this.tipoTarifaSelecionada.getDescricao());
			}
		}
	}

	public Integer getIdTipoTarifa() {
		return idTipoTarifa;
	}

	public void setIdTipoTarifa(Integer idTipoTarifa) {
		this.idTipoTarifa = idTipoTarifa;
	}

	public String getNomeTipoTarifa() {
		return nomeTipoTarifa;
	}

	public void setNomeTipoTarifa(String nomeTipoTarifa) {
		this.nomeTipoTarifa = nomeTipoTarifa;
	}

	public Double getMarkUp() {
		return markUp;
	}

	public void setMarkUp(Double markUp) {
		this.markUp = markUp;
	}

	public List<TipoDebitoConfig> getLstTipoDebitoConfig() {
		if (lstTipoDebitoConfig == null) {
			lstTipoDebitoConfig = new ArrayList<TipoDebitoConfig>();
		}
		return lstTipoDebitoConfig;
	}

	public void setLstTipoDebitoConfig(List<TipoDebitoConfig> lstTipoDebitoConfig) {
		this.lstTipoDebitoConfig = lstTipoDebitoConfig;
	}

	public Boolean getDirecionamento() {
		Boolean result = Boolean.FALSE;
		if (getLstTipoDebitoConfig().size() > 0) {
			result = Boolean.TRUE;
		}
		return result;
	}

	public Set<TipoServicoConfig> getLstTipoServicoConfig() {
		return lstTipoServicoConfig;
	}

	public void setLstTipoServicoConfig(Set<TipoServicoConfig> lstTipoServicoConfig) {
		this.lstTipoServicoConfig = lstTipoServicoConfig;
	}

	public LphTipoHospede getTipoHospedeSelecionadoLph() {
		return tipoHospedeSelecionadoLph;
	}

	public void setTipoHospedeSelecionadoLph(LphTipoHospede tipoHospedeSelecionadoLph) {
		this.tipoHospedeSelecionadoLph = tipoHospedeSelecionadoLph;
		if (this.tipoHospedeSelecionadoLph != null) {
			if (this.tipoHospedeSelecionadoLph.getCODIGO() == null) {
				this.setIdTipoHospede(null);
				this.setNomeTipoHospede(null);
				this.setCodigoTipoHospede(null);
			} else {

				this.setIdTipoHospede(this.tipoHospedeSelecionadoLph.getSEQUENCIA());
				this.setNomeTipoHospede(this.tipoHospedeSelecionadoLph.getDESCRICAO());
				this.setCodigoTipoHospede(this.tipoHospedeSelecionadoLph.getCODIGO());
			}
		}
	}

	public LphTarifa getTipoTarifaSelecionadaLph() {
		return tipoTarifaSelecionadaLph;
	}

	public void setTipoTarifaSelecionadaLph(LphTarifa tipoTarifaSelecionadaLPh) {
		this.tipoTarifaSelecionadaLph = tipoTarifaSelecionadaLPh;
		if (this.tipoTarifaSelecionadaLph != null) {
			if (this.tipoTarifaSelecionadaLph.getCODIGO() == null) {
				this.setIdTipoTarifa(null);
				this.setNomeTipoTarifa(null);
				this.setCodigoTarifa(null);

			} else {

				this.setIdTipoTarifa(this.tipoTarifaSelecionadaLph.getSEQUENCIA());
				this.setNomeTipoTarifa(this.tipoTarifaSelecionadaLph.getNOME());
				this.setCodigoTarifa(this.tipoTarifaSelecionadaLph.getCODIGO());
			}
		}
	}

	public LphSegmentoReserva getSegmentoSelecionadaLph() {
		return segmentoSelecionadaLph;
	}

	public void setSegmentoSelecionadaLph(LphSegmentoReserva segmentoSelecionadaLph) {
		this.segmentoSelecionadaLph = segmentoSelecionadaLph;
		if (this.segmentoSelecionadaLph != null) {
			if (this.segmentoSelecionadaLph.getCODIGO() == null) {
				this.setCodigoSegmento(null);
				this.setNomeSegmento(null);
			} else {

				this.setCodigoSegmento(this.segmentoSelecionadaLph.getCODIGO());
				this.setNomeSegmento(this.segmentoSelecionadaLph.getDESCRICAO());
			}
		}
	}

	public LphContrato getContrclihotelSelecionadaLph() {
		return contrclihotelSelecionadaLph;
	}

	public void setContrclihotelSelecionadaLph(LphContrato contrclihotelSelecionadaLph) {
		this.contrclihotelSelecionadaLph = contrclihotelSelecionadaLph;
		if (this.contrclihotelSelecionadaLph != null) {
			if (this.contrclihotelSelecionadaLph.getSEQUENCIA() == null) {
				this.setIdCtr(null);
				this.setCtrNomeTarifa(null);
				this.setCtrInicio(null);
				this.setCtrFim(null);
			} else {

				this.setIdCtr(this.contrclihotelSelecionadaLph.getSEQUENCIA());
				this.setCtrNomeTarifa(this.contrclihotelSelecionadaLph.getTARIFA() + "");
				this.setCtrInicio(this.contrclihotelSelecionadaLph.getINICIO());
				this.setCtrFim(this.contrclihotelSelecionadaLph.getTERMINO());
			}
		}
	}

	public LphPessoa getPessoaSelecionadaLph() {
		return pessoaSelecionadaLph;
	}

	public void setPessoaSelecionadaLph(LphPessoa pessoaSelecionadaLph) {
		this.pessoaSelecionadaLph = pessoaSelecionadaLph;
		if (this.pessoaSelecionadaLph != null) {
			if (this.pessoaSelecionadaLph.getCODIGO() == null) {
				this.setIdPms(null);
				this.setClienteNome(null);
			} else {

				this.setIdPms(Integer.valueOf(this.pessoaSelecionadaLph.getCODIGO()));
				this.setClienteNome(this.pessoaSelecionadaLph.getRAZAO());
			}
		}
	}

	public String getCodigoTipoHospede() {
		return codigoTipoHospede;
	}

	public void setCodigoTipoHospede(String codigoTipoHospede) {
		this.codigoTipoHospede = codigoTipoHospede;
	}

	public String getCodigoTarifa() {
		return codigoTarifa;
	}

	public void setCodigoTarifa(String codigoTarifa) {
		this.codigoTarifa = codigoTarifa;
	}

	public Integer getIdOrigem() {
		return idOrigem;
	}

	public void setIdOrigem(Integer idOrigem) {
		this.idOrigem = idOrigem;
	}

	public String getNomeOrigem() {
		return nomeOrigem;
	}

	public void setNomeOrigem(String nomeOrigem) {
		this.nomeOrigem = nomeOrigem;
	}

	@Transient
	public Origemreserva getOrigemSelecionada() {
		return origemSelecionada;
	}

	public void setOrigemSelecionada(Origemreserva origemSelecionada) {
		this.origemSelecionada = origemSelecionada;
		if (this.origemSelecionada != null) {
			if (this.origemSelecionada.getIdorigem() == -1L) {
				this.setIdOrigem(null);
				this.setNomeOrigem(null);
				this.setCodigoOrigem(null);

			} else {
				this.setIdOrigem(this.origemSelecionada.getIdorigem().intValue());
				this.setNomeOrigem(this.origemSelecionada.getDescricao());
			}
		}
	}

	@Transient
	public String getOrigemTxt() {
		StringBuffer buffer = new StringBuffer();

		buffer.append("");

		if (this.getIdOrigem() != null) {
			buffer.append(this.getIdOrigem());
			buffer.append("-");
			buffer.append(this.getNomeOrigem());

		}

		return buffer.toString();

	}

	@Transient
	public LphOrigemReserva getOrigemSelecionadaLph() {
		return origemSelecionadaLph;
	}

	public void setOrigemSelecionadaLph(LphOrigemReserva origemSelecionadaLph) {
		this.origemSelecionadaLph = origemSelecionadaLph;
		if (this.origemSelecionadaLph != null) {

			if (this.origemSelecionadaLph.getCODIGO() == null) {
				this.setIdOrigem(null);
				this.setNomeOrigem(null);
				this.setCodigoOrigem(null);
			} else {

				this.setIdOrigem(this.origemSelecionadaLph.getSEQUENCIA());
				this.setNomeOrigem(this.origemSelecionadaLph.getDESCRICAO());
				this.setCodigoOrigem(this.origemSelecionadaLph.getCODIGO());
			}
		}

	}

	public String getCodigoOrigem() {
		return codigoOrigem;
	}

	public void setCodigoOrigem(String codigoOrigem) {
		this.codigoOrigem = codigoOrigem;
	}

	public Boolean getIssMunicipal() {
		return issMunicipal;
	}

	public void setIssMunicipal(Boolean issMunicipal) {
		this.issMunicipal = issMunicipal;
	}

	public Boolean getTaxaTurismo() {
		return taxaTurismo;
	}

	// nomeTipoTarifa
	@Transient
	public String getTipoTarifa() {

		String ret = "";

		if (nomeTipoTarifa != null) {

			ret = nomeTipoTarifa;
		} else if (ctrNomeTarifa != null) {

			ret = ctrNomeTarifa;
		}

		return ret;

	}

	public void setTaxaTurismo(Boolean taxaTurismo) {
		this.taxaTurismo = taxaTurismo;
	}

	public Double getIss() {
		return iss;
	}

	public void setIss(Double iss) {
		this.iss = iss;
	}

}
