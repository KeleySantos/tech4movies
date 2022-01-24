package br.com.tech4me.tech4movies.telas;

import java.util.List;
import java.util.Scanner;

import org.springframework.data.repository.Repository;

import br.com.tech4me.tech4movies.model.Filme;
import br.com.tech4me.tech4movies.repository.FilmeRepositorio;

public class TelaListarFilmes implements Tela<Filme, Integer> {

    @Override
    public void executar(Scanner entrada, Repository<Filme, Integer> repositorio){
        FilmeRepositorio repo = (FilmeRepositorio)repositorio;
        List<Filme> filmes = repo.findByOrderByTituloAsc();

        if(filmes.isEmpty()) {
            System.out.println("\nNão há filmes cadastrados");
            return;
        }

        System.out.println("\nListar filmes cadastrados:");
        filmes.forEach(System.out::println);
    }


    
}
