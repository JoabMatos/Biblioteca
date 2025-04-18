package com.example.demo.dtos;

import com.example.demo.Editora;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EditoraDTO {

    private Integer id;

    @NotNull(message = "O campo cnpj não pode ser nulo")
    @NotBlank(message = "O campo cnpj não pode ser vazio")
    private String cnpj;

    @NotNull(message = "O campo Razão Social não pode ser nulo")
    @NotBlank(message = "O campo Razão Social não pode ser vazio")
    private String razaoSocial;

    public EditoraDTO() {}

    public EditoraDTO(Editora Editora) {
        this.id = Editora.getId();
        this.cnpj = Editora.getCnpj();
        this.razaoSocial = Editora.getRazaoSocial();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotNull(message = "O campo cnpj não pode ser nulo") @NotBlank(message = "O campo cnpj não pode ser vazio") String getCnpj() {
        return cnpj;
    }

    public void setCnpj(@NotNull(message = "O campo cnpj não pode ser nulo") @NotBlank(message = "O campo cnpj não pode ser vazio") String cnpj) {
        this.cnpj = cnpj;
    }

    public @NotNull(message = "O campo Razão Social não pode ser nulo") @NotBlank(message = "O campo Razão Social não pode ser vazio") String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(@NotNull(message = "O campo Razão Social não pode ser nulo") @NotBlank(message = "O campo Razão Social não pode ser vazio") String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
