package entidades;

import Enums.Senioridades;

public class Analista_qualidade extends Funcionario {
    private Senioridades nivel;
    private boolean possuiCertificado;
    private final double BONUS = 1.25;
    private final double ADICIONAL_FIXO = 500.0;

    public Analista_qualidade(String nome, String matricula, Double salarioBase, String nivel, boolean possuiCertificado) {
        super(nome, matricula, salarioBase);
        this.nivel = Senioridades.valueOf(nivel.toUpperCase());
        this.possuiCertificado = possuiCertificado;
    }

    @Override
    public Double calcularSalario() {
        double salarioFinal = salarioBase;

        if (nivel == Senioridades.SENIOR) {
            salarioFinal *= BONUS;
        }

        if (possuiCertificado) {
            salarioFinal += ADICIONAL_FIXO;
        }

        return salarioFinal;
    }

    public Senioridades getNivel() {
        return nivel;
    }

    public void setNivel(Senioridades nivel) {
        this.nivel = nivel;
    }

    public boolean isPossuiCertificado() {
        return possuiCertificado;
    }

    public void setPossuiCertificado(boolean possuiCertificado) {
        this.possuiCertificado = possuiCertificado;
    }
}
