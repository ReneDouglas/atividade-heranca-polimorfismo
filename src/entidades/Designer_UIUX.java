package entidades;

import Enums.Ferramentas;

public class Designer_UIUX extends Funcionario {
    private Integer anosDeExperiencia;
    private Ferramentas ferramentaPrincipal;
    private final int EXPERIENCIA_MINIMA = 5;
    private final double BONUS = 1.20;
    private final double ADICIONAL_FIXO = 500.0;

    public Designer_UIUX(String nome, String matricula, Double salarioBase, Integer anosDeExperiencia, String ferramentaPrincipal) {
        super(nome, matricula, salarioBase);
        this.anosDeExperiencia = anosDeExperiencia;
        this.ferramentaPrincipal = Ferramentas.valueOf(ferramentaPrincipal.toUpperCase().replace(" ", ""));
    }

    @Override
    public Double calcularSalario() {
        double salarioFinal = salarioBase;

        if (anosDeExperiencia > EXPERIENCIA_MINIMA) {
            salarioFinal *= BONUS;
        }

        if (ferramentaPrincipal == Ferramentas.FIGMA) {
            salarioFinal += ADICIONAL_FIXO;
        }

        return salarioFinal;
    }

    public Integer getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(Integer anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public Ferramentas getFerramentaPrincipal() {
        return ferramentaPrincipal;
    }

    public void setFerramentaPrincipal(Ferramentas ferramentaPrincipal) {
        this.ferramentaPrincipal = ferramentaPrincipal;
    }
}
