package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    // Atributos
    private LocalDate data;

    // Sobrescrevendo método para calcular o XP
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    // Construtor
    public Mentoria() {
    }

    // Métodos getters e setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // Sobrescrevendo método toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
