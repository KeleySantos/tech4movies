package br.com.tech4me.tech4movies.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "movie_cast")
public class Atuacao {

    @EmbeddedId
    private AtuacaoId id;
    @Column(name = "role")
    private String papel;
    
    public AtuacaoId getId() {
        return id;
    }
    
    public void setId(AtuacaoId id) {
        this.id = id;
    }
   
    public String getPapel() {
        return papel;
    }
   
    public void setPapel(String papel) {
        this.papel = papel;
    }

    public Object getAtor() {
        return null;
    }

    
    
}
