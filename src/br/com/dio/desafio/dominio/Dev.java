package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosescritos= new LinkedHashSet<>();
    private Set<Conteudo> conteudosconcluidos= new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
       this.conteudosescritos.addAll(bootcamp.getConteudos());
       bootcamp.getDevsInscristos().add(this);



    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosescritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosconcluidos.add(conteudo.get());
            this.conteudosescritos.remove(conteudo.get());

        }else {
            System.err.println("voce nao esta inscrito em nenhum conteudo");
        }


    }
    public Stream<Double> calcularTotalXp(){
        return (Stream<Double>) this.conteudosconcluidos.stream().map(conteudo -> conteudo.calcularXp());


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
