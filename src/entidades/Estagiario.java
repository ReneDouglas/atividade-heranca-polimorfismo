package entidades;

public class Estagiario extends Funcionario {
    private Integer horasSemanais;
    private String universidade;
    private Double valeTransporte;

    public Estagiario(String nome, String matricula, Double salarioBase, Integer horasSemanais, String universidade, Double valeTransporte) {
        super(nome, matricula, salarioBase);
        this.horasSemanais = horasSemanais;
        this.universidade = universidade;
        this.valeTransporte = valeTransporte;
    }

    @Override
    public Double calcularSalario() {
        return salarioBase + valeTransporte;
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

    public Double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(Double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }
}
