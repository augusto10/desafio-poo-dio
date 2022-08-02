package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosescritos= new LinkedHashSet<>();
    private Set<Conteudo> conteudosconcluidos= new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){


    }

    public void progredir(){

    }
    public void calcularTotalXp(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosescritos() {
        return conteudosescritos;
    }

    public void setConteudosescritos(Set<Conteudo> conteudosescritos) {
        this.conteudosescritos = conteudosescritos;
    }

    public Set<Conteudo> getConteudosconcluidos() {
        return conteudosconcluidos;
    }

    public void setConteudosconcluidos(Set<Conteudo> conteudosconcluidos) {
        this.conteudosconcluidos = conteudosconcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosescritos, dev.conteudosescritos) && Objects.equals(conteudosconcluidos, dev.conteudosconcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosescritos, conteudosconcluidos);
    }
}
