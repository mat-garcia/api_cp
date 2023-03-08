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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
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
@Table(name = "ENDPESS")
@XmlRootElement
public class Endpess implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "SEQRESERVASFRONT", sequenceName = "SEQRESERVASFRONT", allocationSize = 1)
  	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQRESERVASFRONT")  
      
    @Column(name = "IDENDERECO", nullable = false, precision = 22)
    private Long idendereco;
    @Column(name = "LOGRADOURO", length = 60)
    private String logradouro;
    @Column(name = "NUMERO", length = 8)
    private String numero;
    @Column(name = "COMPLEMENTO", length = 60)
    private String complemento;
    @Column(name = "BAIRRO", length = 20)
    private String bairro;
    @Column(name = "CIDADE", length = 20)
    private String cidade;
    @Column(name = "CEP", length = 8)
    private String cep;
    @Column(name = "TIPOENDERECO", length = 5)
    private String tipoendereco;
    @Column(name = "NOME", length = 40)
    private String nome;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "CODCORRESP", length = 20)
    private String codcorresp;
    @Column(name = "FLGTIPOEND")
    private Character flgtipoend;
    @JoinColumn(name = "IDCIDADES", referencedColumnName = "IDCIDADES")
    @ManyToOne
    private Cidades idcidades;
    @JoinColumn(name = "IDPESSOA", referencedColumnName = "IDPESSOA", nullable = false)
    @ManyToOne(optional = false)
    private Pessoa idpessoa;
    @OneToMany(mappedBy = "idendereco")
    private List<Telendpess> telendpessList;

    public Endpess() {
    }

    public Endpess(Long idendereco) {
        this.idendereco = idendereco;
    }

    public Long getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Long idendereco) {
        this.idendereco = idendereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipoendereco() {
        return tipoendereco;
    }

    public void setTipoendereco(String tipoendereco) {
        this.tipoendereco = tipoendereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCodcorresp() {
        return codcorresp;
    }

    public void setCodcorresp(String codcorresp) {
        this.codcorresp = codcorresp;
    }

    public Character getFlgtipoend() {
        return flgtipoend;
    }

    public void setFlgtipoend(Character flgtipoend) {
        this.flgtipoend = flgtipoend;
    }

    public Cidades getIdcidades() {
        return idcidades;
    }

    public void setIdcidades(Cidades idcidades) {
        this.idcidades = idcidades;
    }

    
    public Pessoa getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Pessoa idpessoa) {
        this.idpessoa = idpessoa;
    }

   
    @XmlTransient
    public List<Telendpess> getTelendpessList() {
        return telendpessList;
    }

    public void setTelendpessList(List<Telendpess> telendpessList) {
        this.telendpessList = telendpessList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idendereco != null ? idendereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Endpess)) {
            return false;
        }
        Endpess other = (Endpess) object;
        if ((this.idendereco == null && other.idendereco != null) || (this.idendereco != null && !this.idendereco.equals(other.idendereco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Endpess[ idendereco=" + idendereco + " ]";
    }
    
}
