package com.example.demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;


@Entity
@Table(name="autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq_autor")
    private Integer id;

    @NotBlank @NotNull
    private String nome;

    @NotNull @NotBlank
    private String documentoPessoal;

    public Autor() {

    }

    public Autor(String documentoPessoal, String nome) {
        this.documentoPessoal = documentoPessoal;
        this.nome = nome;
    }

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

    public String getDocumentoPessoal() {
        return documentoPessoal;
    }

    public void setDocumentoPessoal(String documentoPessoal) {
        this.documentoPessoal = documentoPessoal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(id, autor.id) && Objects.equals(nome, autor.nome) && Objects.equals(documentoPessoal, autor.documentoPessoal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, documentoPessoal);
    }
}
