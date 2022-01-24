package br.com.tech4me.tech4movies;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

import br.com.tech4me.tech4movies.repository.FilmeRepositorio;
import br.com.tech4me.tech4movies.telas.Tela;
import br.com.tech4me.tech4movies.telas.TelaBuscarPorId;
import br.com.tech4me.tech4movies.telas.TelaCriarFilme;
import br.com.tech4me.tech4movies.telas.TelaListarFilmes;

@Component
public class LoopPrincipal {

    @Autowired
    private ApplicationContext context;
    
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void loop(){
        int opcao;
        Scanner entrada = new Scanner(System.in);

        do{
            Tela tela = null;
            Repository repositorio = null;
            limparTela();

            System.out.println("------------------------ MENU ------------------------\n");
            System.out.println("1 - Buscar filmes");
            System.out.println("2 - Incluir filme");
            System.out.println("3 - Listar filme");
            System.out.println("0 - Sair");
            System.out.println("Opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch(opcao){
                case 1:
                    tela = new TelaBuscarPorId();
                    repositorio = context.getBean(FilmeRepositorio.class);
                    break;
                
                case 2:
                    tela = new TelaCriarFilme();
                    repositorio = context.getBean(FilmeRepositorio.class);
                    break;

                case 3: 
                    tela = new TelaListarFilmes();
                    repositorio = context.getBean(FilmeRepositorio.class);
                    break;

                case 0:

                    System.out.println("Fim do programa!");
                    break;
                
                default:
                    System.out.println("\nOpção invalida!");
                    voltarMenu(entrada);
                    break;
            }

             if(tela != null){
                tela.executar(entrada, repositorio);
                voltarMenu(entrada);
            }

        }while(opcao != 0);

        entrada.close();

    }

    private void limparTela() {
    }

    private void voltarMenu(Scanner entrada) {
    }
}
