package com.gerenciamento.gerenciamento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class UserSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "O campo 'nome' não pode estar em branco ou vazio.")
    @Size(max = 80, message = "O campo 'nome' deve ter no máximo 80 caracteres.")
    @Column(length = 80, nullable = false)
    private String nome;

    @NotBlank(message = "O campo 'time' não pode estar em branco ou vazio.")
    @Size(max = 30, message = "O campo 'time' deve ter no máximo 30 caracteres.")
    @Column(length = 30, nullable = false)
    private String time;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Método toString
    @Override
    public String toString() {
        return "UserSystem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    // Método equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSystem that = (UserSystem) o;

        if (!id.equals(that.id)) return false;
        if (!nome.equals(that.nome)) return false;
        return time.equals(that.time);
    }

    // Método hashCode
    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nome.hashCode();
        result = 31 * result + time.hashCode();
        return result;
    }
}