/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hdnit.lotus.pms.cm.entity.oracle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author renanhdn
 */
@Entity
@Table(name = "PESSOA")
@XmlRootElement
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDPESSOA", nullable = false, precision = 22)
    private Long idpessoa;
    @Column(name = "NOME", length = 60)
    private String nome;
    @Column(name = "TIPO")
    private Character tipo;
    @Column(name = "RAZAOSOCIAL", length = 60)
    private String razaosocial;
    @Column(name = "FLGUSUARIO")
    private Short flgusuario;
    @Column(name = "FLGCONTATO")
    private Short flgcontato;
    @Column(name = "FLGCOTISTA")
    private Short flgcotista;
    @Column(name = "FLGCLIENTE")
    private Short flgcliente;
    @Column(name = "FLGPATROCINADORA")
    private Short flgpatrocinadora;
    @Column(name = "FLGADMINFUNDO")
    private Short flgadminfundo;
    @Column(name = "FLGADMINISTRADORA")
    private Short flgadministradora;
    @Column(name = "FLGEMPEMITIT")
    private Short flgempemitit;
    @Column(name = "FLGBANCO")
    private Short flgbanco;
    @Column(name = "FLGBOLSA")
    private Short flgbolsa;
    @Column(name = "FLGAUTARQUIA")
    private Short flgautarquia;
    @Column(name = "FLGSINDICATO")
    private Short flgsindicato;
    @Column(name = "FLGOUTRO")
    private Short flgoutro;
    @Column(name = "FLGRESPONSAVEL")
    private Short flgresponsavel;
    @Column(name = "FLGTERCEIRO")
    private Short flgterceiro;
    @Column(name = "FLGFORNSERV")
    private Short flgfornserv;
    @Column(name = "FLGFUNCIONARIO")
    private Short flgfuncionario;
    @Column(name = "FLGINVALIDO")
    private Short flginvalido;
    @Column(name = "FLGCANDIDATO")
    private Short flgcandidato;
    @Column(name = "FLGESTRANGEIRO")
    private Short flgestrangeiro;
    @Column(name = "FLGGESTORFUNDO")
    private Short flggestorfundo;
    @Column(name = "FLGAVALISTA")
    private Short flgavalista;
    @Column(name = "FLGPAGADOR")
    private Short flgpagador;
    @Column(name = "FLGPRODUTOR")
    private Short flgprodutor;
    @Column(name = "FLGAVERBADORA")
    private Short flgaverbadora;
    @Column(name = "NUMDOCUMENTO", length = 18)
    private String numdocumento;
    @Column(name = "EMAIL", length = 100)
    private String email;
    @Column(name = "FLGAGENCIA")
    private Short flgagencia;
    @Column(name = "FLGFUNDACAO")
    private Short flgfundacao;
    @Column(name = "FLGDEPENDENTE")
    private Short flgdependente;
    @Column(name = "FLGELEGIVEL")
    private Short flgelegivel;
    @Column(name = "FLGHOTEL")
    private Short flghotel;
    @Column(name = "FLGVENDEDOR")
    private Short flgvendedor;
    @Column(name = "FLGAGENCIAVIAGEM")
    private Short flgagenciaviagem;
    @Column(name = "FLGFILIALPESSOA")
    private Short flgfilialpessoa;
    @Column(name = "FLGPROPRIETARIOUH")
    private Short flgproprietariouh;
    @Column(name = "FLGREPRESENTANTE")
    private Short flgrepresentante;
    @Column(name = "SEQTRANSMISSAO")
    private BigInteger seqtransmissao;
    @Column(name = "FLGHOSPEDE")
    private Short flghospede;
    @Column(name = "FLGEMISSOR")
    private Short flgemissor;
    @Column(name = "FLGINSTFIN")
    private Short flginstfin;
    @Column(name = "FLGBOLSAVALORES")
    private Short flgbolsavalores;
    @Column(name = "FLGCORRETORAVALOR")
    private Short flgcorretoravalor;
    @Column(name = "FLGGESTORCARTEIRA")
    private Short flggestorcarteira;
    @Column(name = "FLGCUSTODIANTE")
    private Short flgcustodiante;
    @Column(name = "FLGBENEFPROCUH")
    private Short flgbenefprocuh;
    @Column(name = "FLGCANALREPRESENT")
    private Short flgcanalrepresent;
    @Column(name = "FLGOPERADORMANUT")
    private Short flgoperadormanut;
    @Column(name = "FLGCONCIERGE")
    private Short flgconcierge;
    @Column(name = "FLGLOCATARIO")
    private Short flglocatario;
    @Column(name = "FLGADMINIMOVEL")
    private Short flgadminimovel;
    @Column(name = "IDENDCORRESP")
    private BigInteger idendcorresp;
    @Column(name = "IDENDCOMERCIAL")
    private BigInteger idendcomercial;
    @Column(name = "IDENDENTREGA")
    private BigInteger idendentrega;
    @Column(name = "IDENDRESIDENCIAL")
    private BigInteger idendresidencial;
    @Column(name = "IDENDCOBRANCA")
    private BigInteger idendcobranca;
    @Column(name = "MASCARACC", length = 30)
    private String mascaracc;
    @Column(name = "MASCARAAGENCIA", length = 30)
    private String mascaraagencia;
    @Column(name = "FLGVALIDACC")
    private Character flgvalidacc;
    @Column(name = "HOMEPAGE", length = 250)
    private String homepage;
    @Column(name = "TRGDTINCLUSAO")
    @Temporal(TemporalType.DATE)
    private Date trgdtinclusao;
    @Column(name = "TRGUSERINCLUSAO", length = 30)
    private String trguserinclusao;
    @Column(name = "FLGATUALIZAR")
    private Character flgatualizar;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "idusuarioinclusao")
    private List<Moeda> moedaList;
    @OneToMany(mappedBy = "idpassante")
    private List<Contasfront> contasfrontList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private Hospede hospede;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpessoa")
    private List<Endpess> endpessList;
    */@OneToOne(optional = false, cascade = CascadeType.ALL, mappedBy = "pessoa",fetch=FetchType.LAZY)
    private Hotel hotel;
    @OneToOne(optional = false, cascade = CascadeType.ALL, mappedBy = "pessoa",fetch=FetchType.LAZY)
    private Usuariosistema usuariosistema;
    /*@OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private Clientepess clientepess;
    @OneToMany(mappedBy = "idgrupo")
    private List<Pessoa> pessoaList;
    @JoinColumn(name = "IDGRUPO", referencedColumnName = "IDPESSOA")
    @ManyToOne
    private Pessoa idgrupo;
    @OneToMany(mappedBy = "idresponsavel")
    private List<Movimentohospedes> movimentohospedesList;
*/  
    public Pessoa() {
    }

    public Pessoa(Long idpessoa) {
        this.idpessoa = idpessoa;
    }

    public Long getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Long idpessoa) {
        this.idpessoa = idpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public Short getFlgusuario() {
        return flgusuario;
    }

    public void setFlgusuario(Short flgusuario) {
        this.flgusuario = flgusuario;
    }

    public Short getFlgcontato() {
        return flgcontato;
    }

    public void setFlgcontato(Short flgcontato) {
        this.flgcontato = flgcontato;
    }

    public Short getFlgcotista() {
        return flgcotista;
    }

    public void setFlgcotista(Short flgcotista) {
        this.flgcotista = flgcotista;
    }

    public Short getFlgcliente() {
        return flgcliente;
    }

    public void setFlgcliente(Short flgcliente) {
        this.flgcliente = flgcliente;
    }

    public Short getFlgpatrocinadora() {
        return flgpatrocinadora;
    }

    public void setFlgpatrocinadora(Short flgpatrocinadora) {
        this.flgpatrocinadora = flgpatrocinadora;
    }

    public Short getFlgadminfundo() {
        return flgadminfundo;
    }

    public void setFlgadminfundo(Short flgadminfundo) {
        this.flgadminfundo = flgadminfundo;
    }

    public Short getFlgadministradora() {
        return flgadministradora;
    }

    public void setFlgadministradora(Short flgadministradora) {
        this.flgadministradora = flgadministradora;
    }

    public Short getFlgempemitit() {
        return flgempemitit;
    }

    public void setFlgempemitit(Short flgempemitit) {
        this.flgempemitit = flgempemitit;
    }

    public Short getFlgbanco() {
        return flgbanco;
    }

    public void setFlgbanco(Short flgbanco) {
        this.flgbanco = flgbanco;
    }

    public Short getFlgbolsa() {
        return flgbolsa;
    }

    public void setFlgbolsa(Short flgbolsa) {
        this.flgbolsa = flgbolsa;
    }

    public Short getFlgautarquia() {
        return flgautarquia;
    }

    public void setFlgautarquia(Short flgautarquia) {
        this.flgautarquia = flgautarquia;
    }

    public Short getFlgsindicato() {
        return flgsindicato;
    }

    public void setFlgsindicato(Short flgsindicato) {
        this.flgsindicato = flgsindicato;
    }

    public Short getFlgoutro() {
        return flgoutro;
    }

    public void setFlgoutro(Short flgoutro) {
        this.flgoutro = flgoutro;
    }

    public Short getFlgresponsavel() {
        return flgresponsavel;
    }

    public void setFlgresponsavel(Short flgresponsavel) {
        this.flgresponsavel = flgresponsavel;
    }

    public Short getFlgterceiro() {
        return flgterceiro;
    }

    public void setFlgterceiro(Short flgterceiro) {
        this.flgterceiro = flgterceiro;
    }

    public Short getFlgfornserv() {
        return flgfornserv;
    }

    public void setFlgfornserv(Short flgfornserv) {
        this.flgfornserv = flgfornserv;
    }

    public Short getFlgfuncionario() {
        return flgfuncionario;
    }

    public void setFlgfuncionario(Short flgfuncionario) {
        this.flgfuncionario = flgfuncionario;
    }

    public Short getFlginvalido() {
        return flginvalido;
    }

    public void setFlginvalido(Short flginvalido) {
        this.flginvalido = flginvalido;
    }

    public Short getFlgcandidato() {
        return flgcandidato;
    }

    public void setFlgcandidato(Short flgcandidato) {
        this.flgcandidato = flgcandidato;
    }

    public Short getFlgestrangeiro() {
        return flgestrangeiro;
    }

    public void setFlgestrangeiro(Short flgestrangeiro) {
        this.flgestrangeiro = flgestrangeiro;
    }

    public Short getFlggestorfundo() {
        return flggestorfundo;
    }

    public void setFlggestorfundo(Short flggestorfundo) {
        this.flggestorfundo = flggestorfundo;
    }

    public Short getFlgavalista() {
        return flgavalista;
    }

    public void setFlgavalista(Short flgavalista) {
        this.flgavalista = flgavalista;
    }

    public Short getFlgpagador() {
        return flgpagador;
    }

    public void setFlgpagador(Short flgpagador) {
        this.flgpagador = flgpagador;
    }

    public Short getFlgprodutor() {
        return flgprodutor;
    }

    public void setFlgprodutor(Short flgprodutor) {
        this.flgprodutor = flgprodutor;
    }

    public Short getFlgaverbadora() {
        return flgaverbadora;
    }

    public void setFlgaverbadora(Short flgaverbadora) {
        this.flgaverbadora = flgaverbadora;
    }

    public String getNumdocumento() {
        return numdocumento;
    }

    public void setNumdocumento(String numdocumento) {
        this.numdocumento = numdocumento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getFlgagencia() {
        return flgagencia;
    }

    public void setFlgagencia(Short flgagencia) {
        this.flgagencia = flgagencia;
    }

    public Short getFlgfundacao() {
        return flgfundacao;
    }

    public void setFlgfundacao(Short flgfundacao) {
        this.flgfundacao = flgfundacao;
    }

    public Short getFlgdependente() {
        return flgdependente;
    }

    public void setFlgdependente(Short flgdependente) {
        this.flgdependente = flgdependente;
    }

    public Short getFlgelegivel() {
        return flgelegivel;
    }

    public void setFlgelegivel(Short flgelegivel) {
        this.flgelegivel = flgelegivel;
    }

    public Short getFlghotel() {
        return flghotel;
    }

    public void setFlghotel(Short flghotel) {
        this.flghotel = flghotel;
    }

    public Short getFlgvendedor() {
        return flgvendedor;
    }

    public void setFlgvendedor(Short flgvendedor) {
        this.flgvendedor = flgvendedor;
    }

    public Short getFlgagenciaviagem() {
        return flgagenciaviagem;
    }

    public void setFlgagenciaviagem(Short flgagenciaviagem) {
        this.flgagenciaviagem = flgagenciaviagem;
    }

    public Short getFlgfilialpessoa() {
        return flgfilialpessoa;
    }

    public void setFlgfilialpessoa(Short flgfilialpessoa) {
        this.flgfilialpessoa = flgfilialpessoa;
    }

    public Short getFlgproprietariouh() {
        return flgproprietariouh;
    }

    public void setFlgproprietariouh(Short flgproprietariouh) {
        this.flgproprietariouh = flgproprietariouh;
    }

    public Short getFlgrepresentante() {
        return flgrepresentante;
    }

    public void setFlgrepresentante(Short flgrepresentante) {
        this.flgrepresentante = flgrepresentante;
    }

    public BigInteger getSeqtransmissao() {
        return seqtransmissao;
    }

    public void setSeqtransmissao(BigInteger seqtransmissao) {
        this.seqtransmissao = seqtransmissao;
    }

    public Short getFlghospede() {
        return flghospede;
    }

    public void setFlghospede(Short flghospede) {
        this.flghospede = flghospede;
    }

    public Short getFlgemissor() {
        return flgemissor;
    }

    public void setFlgemissor(Short flgemissor) {
        this.flgemissor = flgemissor;
    }

    public Short getFlginstfin() {
        return flginstfin;
    }

    public void setFlginstfin(Short flginstfin) {
        this.flginstfin = flginstfin;
    }

    public Short getFlgbolsavalores() {
        return flgbolsavalores;
    }

    public void setFlgbolsavalores(Short flgbolsavalores) {
        this.flgbolsavalores = flgbolsavalores;
    }

    public Short getFlgcorretoravalor() {
        return flgcorretoravalor;
    }

    public void setFlgcorretoravalor(Short flgcorretoravalor) {
        this.flgcorretoravalor = flgcorretoravalor;
    }

    public Short getFlggestorcarteira() {
        return flggestorcarteira;
    }

    public void setFlggestorcarteira(Short flggestorcarteira) {
        this.flggestorcarteira = flggestorcarteira;
    }

    public Short getFlgcustodiante() {
        return flgcustodiante;
    }

    public void setFlgcustodiante(Short flgcustodiante) {
        this.flgcustodiante = flgcustodiante;
    }

    public Short getFlgbenefprocuh() {
        return flgbenefprocuh;
    }

    public void setFlgbenefprocuh(Short flgbenefprocuh) {
        this.flgbenefprocuh = flgbenefprocuh;
    }

    public Short getFlgcanalrepresent() {
        return flgcanalrepresent;
    }

    public void setFlgcanalrepresent(Short flgcanalrepresent) {
        this.flgcanalrepresent = flgcanalrepresent;
    }

    public Short getFlgoperadormanut() {
        return flgoperadormanut;
    }

    public void setFlgoperadormanut(Short flgoperadormanut) {
        this.flgoperadormanut = flgoperadormanut;
    }

    public Short getFlgconcierge() {
        return flgconcierge;
    }

    public void setFlgconcierge(Short flgconcierge) {
        this.flgconcierge = flgconcierge;
    }

    public Short getFlglocatario() {
        return flglocatario;
    }

    public void setFlglocatario(Short flglocatario) {
        this.flglocatario = flglocatario;
    }

    public Short getFlgadminimovel() {
        return flgadminimovel;
    }

    public void setFlgadminimovel(Short flgadminimovel) {
        this.flgadminimovel = flgadminimovel;
    }

    public BigInteger getIdendcorresp() {
        return idendcorresp;
    }

    public void setIdendcorresp(BigInteger idendcorresp) {
        this.idendcorresp = idendcorresp;
    }

    public BigInteger getIdendcomercial() {
        return idendcomercial;
    }

    public void setIdendcomercial(BigInteger idendcomercial) {
        this.idendcomercial = idendcomercial;
    }

    public BigInteger getIdendentrega() {
        return idendentrega;
    }

    public void setIdendentrega(BigInteger idendentrega) {
        this.idendentrega = idendentrega;
    }

    public BigInteger getIdendresidencial() {
        return idendresidencial;
    }

    public void setIdendresidencial(BigInteger idendresidencial) {
        this.idendresidencial = idendresidencial;
    }

    public BigInteger getIdendcobranca() {
        return idendcobranca;
    }

    public void setIdendcobranca(BigInteger idendcobranca) {
        this.idendcobranca = idendcobranca;
    }

    public String getMascaracc() {
        return mascaracc;
    }

    public void setMascaracc(String mascaracc) {
        this.mascaracc = mascaracc;
    }

    public String getMascaraagencia() {
        return mascaraagencia;
    }

    public void setMascaraagencia(String mascaraagencia) {
        this.mascaraagencia = mascaraagencia;
    }

    public Character getFlgvalidacc() {
        return flgvalidacc;
    }

    public void setFlgvalidacc(Character flgvalidacc) {
        this.flgvalidacc = flgvalidacc;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
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

    public Character getFlgatualizar() {
        return flgatualizar;
    }

    public void setFlgatualizar(Character flgatualizar) {
        this.flgatualizar = flgatualizar;
    }

  
    /*@XmlTransient
    public List<Moeda> getMoedaList() {
        return moedaList;
    }

    public void setMoedaList(List<Moeda> moedaList) {
        this.moedaList = moedaList;
    }




    @XmlTransient
    public List<Contasfront> getContasfrontList() {
        return contasfrontList;
    }

    public void setContasfrontList(List<Contasfront> contasfrontList) {
        this.contasfrontList = contasfrontList;
    }


    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }


    @XmlTransient
    public List<Endpess> getEndpessList() {
        return endpessList;
    }

    public void setEndpessList(List<Endpess> endpessList) {
        this.endpessList = endpessList;
    }
*/

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa",fetch=FetchType.LAZY)
    public Usuariosistema getUsuariosistema() {
        return usuariosistema;
    }

    public void setUsuariosistema(Usuariosistema usuariosistema) {
        this.usuariosistema = usuariosistema;
    }

   /* public Clientepess getClientepess() {
        return clientepess;
    }

    public void setClientepess(Clientepess clientepess) {
        this.clientepess = clientepess;
    }


    @XmlTransient
    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    public void setPessoaList(List<Pessoa> pessoaList) {
        this.pessoaList = pessoaList;
    }

    public Pessoa getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Pessoa idgrupo) {
        this.idgrupo = idgrupo;
    }


    @XmlTransient
    public List<Movimentohospedes> getMovimentohospedesList() {
        return movimentohospedesList;
    }

    public void setMovimentohospedesList(List<Movimentohospedes> movimentohospedesList) {
        this.movimentohospedesList = movimentohospedesList;
    }
*/

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idpessoa == null) ? 0 : idpessoa.hashCode());
		return result;
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idpessoa == null) {
			if (other.idpessoa != null)
				return false;
		} else if (!idpessoa.equals(other.idpessoa))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Pessoa[ idpessoa=" + idpessoa + " ]";
    }

    

    @Transient
    public String getLabel() {
        return this.getNome();
    }
}
