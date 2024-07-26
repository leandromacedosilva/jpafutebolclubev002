package com.jpafutebolclubev002.generic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author leandro
 */
@MappedSuperclass
public abstract class EntidadeGenerica implements Serializable {
    public Boolean ativo;
    @Temporal(TemporalType.TIMESTAMP)
    public Date dataRegistro;
    @Temporal(TemporalType.TIMESTAMP)
    public Date dateAtualizacao;
    
    public EntidadeGenerica() {
        ativo = Boolean.TRUE;
        dataRegistro = new Date();
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Date getDateAtualizacao() {
        return dateAtualizacao;
    }

    public void setDateAtualizacao(Date dateAtualizacao) {
        this.dateAtualizacao = dateAtualizacao;
    }
    
    
}
