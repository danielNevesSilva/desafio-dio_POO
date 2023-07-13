package org.example.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public double calcularXP(){

        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {

    }

    public Curso(String titulo, String descricao, int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return 0;
    }
}
