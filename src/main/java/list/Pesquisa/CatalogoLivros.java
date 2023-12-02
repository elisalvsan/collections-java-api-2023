package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Trono de Vidro Vol.1","Sarah J. Maas", 2013);
        catalogoLivros.adicionarLivro("Trono de Vidro: Coroa da meia-noite Vol.2","Sarah J. Maas", 2014);
        catalogoLivros.adicionarLivro("Solo Leveling","Chu-Gong", 2019);
        catalogoLivros.adicionarLivro("Solo Leveling","Chu-Gong", 2021);
        catalogoLivros.adicionarLivro("Fallen","Lauren Kate", 2010);
        catalogoLivros.adicionarLivro("O único destino dos vilões é a morte: volume 1","Gwon Gyeoeul", 2023);

        System.out.println(catalogoLivros.pesquisarPorAutor("sarah J. Maas"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010,2014));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Solo Leveling"));
    }
}
