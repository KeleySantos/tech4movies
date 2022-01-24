package br.com.tech4me.tech4movies.model;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class AtuacaoId implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @ManyToOne
    @JoinColumn(name = "act_id")
    private Ator ator;
    @JoinColumn(name = "mov_id")
    private Filme filme;
   
    public Ator getAtor() {
        return ator;
    }
    
    public void setAtor(Ator ator) {
        this.ator = ator;
    }
  
    public Filme getFilme() {
        return filme;
    }
   
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    
}
