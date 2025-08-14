package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    // Atributos
    private int cargaHoraria;

    // Sobrescrevendo método para calcular o XP
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    // Construtor
    public Curso() {
    }


    // Métodos getters e setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Sobrescrevendo método toString
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
