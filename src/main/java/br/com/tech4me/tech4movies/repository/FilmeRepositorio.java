package br.com.tech4me.tech4movies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.tech4me.tech4movies.model.Filme;

@Repository
public interface FilmeRepositorio extends JpaRepository<Filme, Integer> {
    
    List<Filme> findByOrderByTituloAsc();
    List<Filme> findFilmeById(int id);
    List<Filme> findByTituloContainsIgnoreCaseOrderByTituloAsc(String titulo);
    @Query("Selecione f do filme f busca de junção esquerda f.atuacoes encomendar por f.titulo")
    List<Filme> encontrarTodosCompletos();
}
