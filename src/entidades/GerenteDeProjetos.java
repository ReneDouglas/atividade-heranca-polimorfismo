package entidades;

public class GerenteDeProjetos extends Funcionario{

    private Integer quantidadeProjetos;
    private final Double BONUS_FIXO = 350.0;
    private final Double BONIFICACAO_LIDERANCA = 1.15;

    public GerenteDeProjetos(
            String nome,
            String matricula,
            Double salarioBase,
            Integer quantidadeProjetos) {
        super(nome, matricula, salarioBase);
        this.quantidadeProjetos = quantidadeProjetos;
    }

    @Override
    public Double calcularSalario() {
        Double salarioFinal;
        return salarioFinal = (salarioBase + (quantidadeProjetos * BONUS_FIXO)) * BONIFICACAO_LIDERANCA;
    }

    public Integer getQuantidadeProjetos() {
        return quantidadeProjetos;
    }

    public void setQuantidadeProjetos(Integer quantidadeProjetos) {
        this.quantidadeProjetos = quantidadeProjetos;
    }
}
