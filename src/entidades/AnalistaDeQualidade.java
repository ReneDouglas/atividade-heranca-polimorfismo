package entidades;

import enums.Senioridades;

public class AnalistaDeQualidade extends Funcionario{

    private Senioridades nivel;
    private Boolean possuiCertificacao;
    private final Double BONUS = 1.25;
    private final Double ADICIONAL_FIXO = 500.00;

    public AnalistaDeQualidade(
            String nome,
            String matricula,
            Double salarioBase,
            Senioridades nivel,
            Boolean possuiCertificacao) {
        super(nome, matricula, salarioBase);
        this.nivel = nivel;
        this.possuiCertificacao = possuiCertificacao;
    }

    @Override
    public Double calcularSalario() {
        Double salarioFinal = salarioBase;

        if (this.nivel == Senioridades.SENIOR) {
            salarioFinal *= BONUS;
        }
        if (possuiCertificacao) {
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

    public Boolean getPossuiCertificacao() {
        return possuiCertificacao;
    }

    public void setPossuiCertificacao(Boolean possuiCertificacao) {
        this.possuiCertificacao = possuiCertificacao;
    }
}
