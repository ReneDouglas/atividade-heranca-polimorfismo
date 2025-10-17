package entidades;

import enums.Ferramentas;

public class DesignerUIUX extends Funcionario{

    private Integer anosDeExperiencia;
    private Ferramentas ferramentaPreferida;
    private final Integer EXPERIENCIA_MINIMA = 5;
    private final Double BONIFICACAO_SENIORIDADE = 1.20;
    private final Double BONUS_FERRAMENTA = 500.0;

    public DesignerUIUX(
            String nome,
            String matricula,
            Double salarioBase,
            Integer anos,
            Ferramentas ferramenta
            ) {
        super(nome, matricula, salarioBase);
        this.anosDeExperiencia = anos;
        this.ferramentaPreferida = ferramenta;
    }

    @Override
    public Double calcularSalario() {
        Double salarioFinal = salarioBase;

        if (this.anosDeExperiencia >= EXPERIENCIA_MINIMA) salarioFinal *= BONIFICACAO_SENIORIDADE;
        if (this.ferramentaPreferida == Ferramentas.FIGMA) salarioFinal += BONUS_FERRAMENTA;

        return salarioFinal;
    }

    public Integer getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(Integer anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public Ferramentas getFerramentaPreferida() {
        return ferramentaPreferida;
    }

    public void setFerramentaPreferida(Ferramentas ferramentaPreferida) {
        this.ferramentaPreferida = ferramentaPreferida;
    }
}
