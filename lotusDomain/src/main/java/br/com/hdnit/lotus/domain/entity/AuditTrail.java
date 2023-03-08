package br.com.hdnit.lotus.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.codehaus.jackson.annotate.JsonIgnore;

import br.com.hdnit.lotus.domain.entity.access.Usuario;
import br.com.hdnit.lotus.domain.entity.corporativo.Empresa;

@MappedSuperclass
public abstract class AuditTrail implements Serializable {

    @Basic(optional = false)
    @Column(name = "DATA_INCLUSAO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date dataInclusao;
    
    
    
    @Column(name = "DATA_ALTERACAO", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date dataAlteracao;
  
    
    @JoinColumn(name = "ID_USUARIO_ALTERACAO", referencedColumnName = "ID", nullable = true)
    @OneToOne(fetch=FetchType.LAZY)
    protected Usuario idUsuarioAlteracao;
    
   
    @JoinColumn(name = "ID_USUARIO_INCLUSAO", referencedColumnName = "ID", nullable = false)
    @OneToOne(fetch=FetchType.LAZY)
    protected Usuario idUsuarioInclusao;
   
    
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID", nullable = true)
    @OneToOne(fetch=FetchType.LAZY)
    protected Empresa idEmpresa;
    
    @Basic(optional = false)
    @Column(name = "ATIVO", nullable = false, length=1)
    protected Integer ativo=1;
 
	public abstract  Integer getId();
	@JsonIgnore
    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }
    @JsonIgnore
    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
    @JsonIgnore
    public Usuario getIdUsuarioAlteracao() {
        return idUsuarioAlteracao;
    }

    public void setIdUsuarioAlteracao(Usuario idUsuarioAlteracao) {
        this.idUsuarioAlteracao = idUsuarioAlteracao;
    }
    @JsonIgnore
    public Usuario getIdUsuarioInclusao() {
        return idUsuarioInclusao;
    }

    public void setIdUsuarioInclusao(Usuario idUsuarioInclusao) {
        this.idUsuarioInclusao = idUsuarioInclusao;
    }
    @JsonIgnore
    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    @JsonIgnore
    public List<Object> getImagesObject() {
        
        return null;
    }
    
    
    @Transient
    @JsonIgnore
    public String getLabel() {
        return this.toString();
    }

    @Transient
    public void setLabel(String nome) {

    }

    @JsonIgnore
    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }



    @JsonIgnore
    public void validateEntity(Usuario usuario, Empresa empresaCorrente, Boolean isEmpresaCorrente) {

        if (this.getIdUsuarioInclusao() != null) {
            this.setIdUsuarioAlteracao(usuario);
            this.setDataAlteracao(new Date(System.currentTimeMillis()));

            // correcao dados faltantes
            if (this.getDataInclusao() == null) {
                this.setDataInclusao(new Date(System.currentTimeMillis()));
            }

        } else {
            /* verifica se pega a empresa corrente do usuario 
            (PARA ENTIDADE EMPRESA UTILIZAMOS O CAMPO ID_EMPRESA PARA EMPRESA PAI...VIDE INTERFACE*) */
            if (isEmpresaCorrente)
                this.setIdEmpresa(empresaCorrente);
            this.setIdUsuarioInclusao(usuario);
            this.setDataInclusao(new Date(System.currentTimeMillis()));
        }
    }

}
