/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "HOSPEDE")
@XmlRootElement
public class Hospede implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDHOSPEDE", nullable = false, precision = 22)
    private Long idhospede;
    @Basic(optional = false)
    @Column(name = "SOBRENOME", nullable = false, length = 60)
    private String sobrenome;
    @Basic(optional = false)
    @Column(name = "NOME", nullable = false, length = 60)
    private String nome;
    @Column(name = "LIMITECREDITO", precision = 17, scale = 2)
    private BigDecimal limitecredito;
    @Column(name = "QTDEVISITAS")
    private Integer qtdevisitas;
    @Column(name = "QTDENOSHOW")
    private Integer qtdenoshow;
    @Column(name = "QTDECANCELAMENTO")
    private Integer qtdecancelamento;
    @Column(name = "QTDECHEGADAANT")
    private Integer qtdechegadaant;
    @Column(name = "QTDESAIDAANT")
    private Integer qtdesaidaant;
    @Column(name = "OBSERVACAO", length = 200)
    private String observacao;
    @Column(name = "RECEBEMALADIRETA")
    private Character recebemaladireta;
    @Column(name = "DATANASCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    @Column(name = "TIPOETARIO")
    private Short tipoetario;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "PARENTGRPFAMILIAR", length = 20)
    private String parentgrpfamiliar;
    @Column(name = "FUMANTE")
    private Character fumante;
    @Column(name = "IDHOSPEDEVALENET", precision = 18, scale = 2)
    private BigDecimal idhospedevalenet;
    @Column(name = "MODELOVEICULO", length = 20)
    private String modeloveiculo;
    @Column(name = "PLACAVEICULO", length = 10)
    private String placaveiculo;
    @Column(name = "CONVMEDICO", length = 100)
    private String convmedico;
    @Column(name = "FLGENVIASMS")
    private Character flgenviasms;
    @Column(name = "FLGPAGATAXATURISMO")
    private Character flgpagataxaturismo;
    @Column(name = "TIPOISENTOTXTURISMO")
    private Character tipoisentotxturismo;
    @Column(name = "NOMESOCIAL", length = 60)
    private String nomesocial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospede")
    private List<Hospedexhotel> hospedexhotelList;
    @OneToMany(mappedBy = "idhospede")
    private List<Contasfront> contasfrontList;
    @JoinColumn(name = "IDCIDADES", referencedColumnName = "IDCIDADES")
    @ManyToOne
    private Cidades idcidades;
    @JoinColumn(name = "IDFAIXAETARIA", referencedColumnName = "IDFAIXAETARIA")
    @ManyToOne
    private Faixaetaria idfaixaetaria;
    @JoinColumn(name = "IDHOSPEDE", referencedColumnName = "IDPESSOA", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Pessoa pessoa;
    @JoinColumns({
        @JoinColumn(name = "IDHOTEL", referencedColumnName = "IDHOTEL", nullable = false, insertable = false, updatable = false),
        @JoinColumn(name = "IDTIPOHOSPEDE", referencedColumnName = "IDTIPOHOSPEDE", nullable = false, insertable = false, updatable = false)})
    @ManyToOne
    private Tipohospede tipohospede;
    @JoinColumn(name = "CODTRATAMENTO", referencedColumnName = "CODTRATAMENTO")
    @ManyToOne
    private Tratamento codtratamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hospede")
    private List<Movimentohospedes> movimentohospedesList;

    public Hospede() {
    }

    public Hospede(Long idhospede) {
        this.idhospede = idhospede;
    }

    public Hospede(Long idhospede, String sobrenome, String nome) {
        this.idhospede = idhospede;
        this.sobrenome = sobrenome;
        this.nome = nome;
    }

    public Long getIdhospede() {
        return idhospede;
    }

    public void setIdhospede(Long idhospede) {
        this.idhospede = idhospede;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getLimitecredito() {
        return limitecredito;
    }

    public void setLimitecredito(BigDecimal limitecredito) {
        this.limitecredito = limitecredito;
    }

    public Integer getQtdevisitas() {
        return qtdevisitas;
    }

    public void setQtdevisitas(Integer qtdevisitas) {
        this.qtdevisitas = qtdevisitas;
    }

    public Integer getQtdenoshow() {
        return qtdenoshow;
    }

    public void setQtdenoshow(Integer qtdenoshow) {
        this.qtdenoshow = qtdenoshow;
    }

    public Integer getQtdecancelamento() {
        return qtdecancelamento;
    }

    public void setQtdecancelamento(Integer qtdecancelamento) {
        this.qtdecancelamento = qtdecancelamento;
    }

    public Integer getQtdechegadaant() {
        return qtdechegadaant;
    }

    public void setQtdechegadaant(Integer qtdechegadaant) {
        this.qtdechegadaant = qtdechegadaant;
    }

    public Integer getQtdesaidaant() {
        return qtdesaidaant;
    }

    public void setQtdesaidaant(Integer qtdesaidaant) {
        this.qtdesaidaant = qtdesaidaant;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Character getRecebemaladireta() {
        return recebemaladireta;
    }

    public void setRecebemaladireta(Character recebemaladireta) {
        this.recebemaladireta = recebemaladireta;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public Short getTipoetario() {
        return tipoetario;
    }

    public void setTipoetario(Short tipoetario) {
        this.tipoetario = tipoetario;
    }

    public Date getTrgdtinclusao() {
        return trgdtinclusao;
    }

    public void setTrgdtinclusao(Date trgdtinclusao) {
        this.trgdtinclusao = trgdtinclusao;
    }

    public String getTrguserinclusao() {
        return trguserinclusao;
    }

    public void setTrguserinclusao(String trguserinclusao) {
        this.trguserinclusao = trguserinclusao;
    }

    public String getParentgrpfamiliar() {
        return parentgrpfamiliar;
    }

    public void setParentgrpfamiliar(String parentgrpfamiliar) {
        this.parentgrpfamiliar = parentgrpfamiliar;
    }

    public Character getFumante() {
        return fumante;
    }

    public void setFumante(Character fumante) {
        this.fumante = fumante;
    }

    public BigDecimal getIdhospedevalenet() {
        return idhospedevalenet;
    }

    public void setIdhospedevalenet(BigDecimal idhospedevalenet) {
        this.idhospedevalenet = idhospedevalenet;
    }

    public String getModeloveiculo() {
        return modeloveiculo;
    }

    public void setModeloveiculo(String modeloveiculo) {
        this.modeloveiculo = modeloveiculo;
    }

    public String getPlacaveiculo() {
        return placaveiculo;
    }

    public void setPlacaveiculo(String placaveiculo) {
        this.placaveiculo = placaveiculo;
    }

    public String getConvmedico() {
        return convmedico;
    }

    public void setConvmedico(String convmedico) {
        this.convmedico = convmedico;
    }

    public Character getFlgenviasms() {
        return flgenviasms;
    }

    public void setFlgenviasms(Character flgenviasms) {
        this.flgenviasms = flgenviasms;
    }

    public Character getFlgpagataxaturismo() {
        return flgpagataxaturismo;
    }

    public void setFlgpagataxaturismo(Character flgpagataxaturismo) {
        this.flgpagataxaturismo = flgpagataxaturismo;
    }

    public Character getTipoisentotxturismo() {
        return tipoisentotxturismo;
    }

    public void setTipoisentotxturismo(Character tipoisentotxturismo) {
        this.tipoisentotxturismo = tipoisentotxturismo;
    }

    public String getNomesocial() {
        return nomesocial;
    }

    public void setNomesocial(String nomesocial) {
        this.nomesocial = nomesocial;
    }

    @XmlTransient
    public List<Hospedexhotel> getHospedexhotelList() {
        return hospedexhotelList;
    }

    public void setHospedexhotelList(List<Hospedexhotel> hospedexhotelList) {
        this.hospedexhotelList = hospedexhotelList;
    }

    @XmlTransient
    public List<Contasfront> getContasfrontList() {
        return contasfrontList;
    }

    public void setContasfrontList(List<Contasfront> contasfrontList) {
        this.contasfrontList = contasfrontList;
    }

    
    public Cidades getIdcidades() {
        return idcidades;
    }

    public void setIdcidades(Cidades idcidades) {
        this.idcidades = idcidades;
    }

    public Faixaetaria getIdfaixaetaria() {
        return idfaixaetaria;
    }

    public void setIdfaixaetaria(Faixaetaria idfaixaetaria) {
        this.idfaixaetaria = idfaixaetaria;
    }

   
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

  
    public Tipohospede getTipohospede() {
        return tipohospede;
    }

    public void setTipohospede(Tipohospede tipohospede) {
        this.tipohospede = tipohospede;
    }

    public Tratamento getCodtratamento() {
        return codtratamento;
    }

    public void setCodtratamento(Tratamento codtratamento) {
        this.codtratamento = codtratamento;
    }

   
    @XmlTransient
    public List<Movimentohospedes> getMovimentohospedesList() {
        return movimentohospedesList;
    }

    public void setMovimentohospedesList(List<Movimentohospedes> movimentohospedesList) {
        this.movimentohospedesList = movimentohospedesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhospede != null ? idhospede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospede)) {
            return false;
        }
        Hospede other = (Hospede) object;
        if ((this.idhospede == null && other.idhospede != null) || (this.idhospede != null && !this.idhospede.equals(other.idhospede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Hospede[ idhospede=" + idhospede + " ]";
    }
    
}
