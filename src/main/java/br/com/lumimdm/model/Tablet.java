package br.com.lumimdm.model;

import jakarta.persistence.*;

@Entity
public class Tablet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String emailGoogle;
    private String grupo; // A, B ou C
    private String status; // ONLINE, OFFLINE, etc.

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailGoogle() {
        return emailGoogle;
    }

    public void setEmailGoogle(String emailGoogle) {
        this.emailGoogle = emailGoogle;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
