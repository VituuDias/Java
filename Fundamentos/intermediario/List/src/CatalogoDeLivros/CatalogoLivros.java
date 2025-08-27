package CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livros> livros = new ArrayList<>();

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livros.add(new Livros(titulo, autor, anoPublicacao));
    }

    public List<Livros> pesquisarPorAutor(String autor){
        List<Livros> livrosPorAutor= new ArrayList<>();
        System.out.println("Livros do autor " + autor + ":");

        for(Livros l : livros){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
                System.out.println("- " + l.getTitulo() + " (" + l.getAnoPublicacao() + ")");

            }
        }
        return livrosPorAutor;
    }

    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> livrosPorIntervalos = new ArrayList<>();
        System.out.println("Livros por intervalos de " + anoInicial + " até " + anoFinal + ":");

        for(Livros l : livros){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                livrosPorIntervalos.add(l);
                System.out.println("- " + l.getTitulo() + " (" + l.getAnoPublicacao() + ")");

            }
        }
        return livrosPorIntervalos;
    }

    public List<Livros> pesquisarPorTitulo(String titulo){
        List<Livros> livrosPorTitulo = new ArrayList<>();
        System.out.println("Pesquisa por título: " + titulo);

        for(Livros l : livros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livrosPorTitulo.add(l);
                System.out.println("- " + l.getTitulo() + " (" + l.getAutor() + ", " + l.getAnoPublicacao() + ")");
                break;
            }
        }
        return livrosPorTitulo;
    }

}
