package br.com.tech4me.tech4movies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "actor")
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="act_id")
    private Integer id;
    @Column(name="act_fname")
    private String nome;
    @Column(name="act_lname")
    private String sobrenome;
    @Column(name="act_gender")
    private Character sexo;
   
    public Integer getId() {
        return id;
    }
   
    public void setId(Integer id) {
        this.id = id;
    }
   
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return nome;
    }
  
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
   
    public Character getSexo() {
        return sexo;
    }
   
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    
    public String getNomeCompleto(){
        return String.format("%s %s", nome.trim(), sobrenome.trim());
    }
    
    @Override
    public String toString(){
        return getNomeCompleto();
    }
}
