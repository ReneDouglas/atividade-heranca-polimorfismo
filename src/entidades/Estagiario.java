package entidades;

public class Estagiario extends Funcionario{

    private Integer horasSemanais;
    private String universidade;
    private Double valorTransporte;

    public Estagiario(String nome,
                      String matricula,
                      Double salarioBase,
                      Integer horasSemanais,
                      String universidade,
                      Double valorTransporte) {
        super(nome, matricula, salarioBase);
        this.horasSemanais = horasSemanais;
        this.universidade = universidade;
        this.valorTransporte = valorTransporte;
    }

    @Override
    public Double calcularSalario() {
        Double bolsaAuxilio = salarioBase;
        return bolsaAuxilio + valorTransporte;
    }

    public Integer getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(Integer horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public Double getValorTransporte() {
        return valorTransporte;
    }

    public void setValorTransporte(Double valorTransporte) {
        this.valorTransporte = valorTransporte;
    }
}
