package entidades;

/**
 * Estagiario
 *
 * Classe Estagiario
 * Representa os estudantes que estão no programa de estágio da empresa,
 * aprendendo e auxiliando nas tarefas. Esta classe é interessante pois possui
 * regras de remuneração bem distintas.
 * 
 * Atributos Adicionais (privados)
 * horasSemanais (int): A carga horária semanal do estagiário (geralmente 20 ou
 * 30 horas).
 * universidade (String): A instituição de ensino onde o estagiário estuda.
 * valeTransporte (double): Um valor fixo mensal de ajuda de custo para
 * transporte.
 * Construtor
 * Deve receber nome, matricula, o valor da bolsaAuxilio (que será passado para
 * o salarioBase da superclasse), horasSemanais, universidade e valeTransporte.
 * Regra de Negócio para calcularSalario() (@Override)
 * A remuneração de um estagiário não é considerada um "salário" com bônus, mas
 * sim o valor da sua bolsa-auxílio (salarioBase) somado aos seus benefícios.
 * O método calcularSalario() para o estagiário deve simplesmente retornar a
 * soma da bolsaAuxilio (salarioBase) com o valeTransporte.
 * Importante: A lógica de bônus e percentuais não se aplica a ele, demonstrando
 * um uso completamente diferente do método polimórfico.
 * Exemplo: Um estagiário com bolsa-auxílio de R$ 1.200,00 e vale-transporte de
 * R$ 150,00 terá um pagamento total de 1200 + 150 = R$ 1.350,00
 */
public class Estagiario extends Funcionario {

  private Integer horasSemanais;
  private String universidade;
  private Double valeTransporte;

  public Estagiario(String nome, String matricula, Double bolsaAuxilio, Integer horasSemanais, String universidade,
      Double valeTransporte) {
    super(nome, matricula, bolsaAuxilio); // Aqui, bolsaAuxilio é passado como salarioBase
    this.horasSemanais = horasSemanais;
    this.universidade = universidade;
    this.valeTransporte = valeTransporte;
  }

  @Override
  public void calcularSalario() {
    Double pagamentoTotal = salarioBase + valeTransporte; // soma da bolsaAuxilio (salarioBase) com o valeTransporte
    System.out.println("Pagamento do Estagiário " + nome + " (Matrícula: " + matricula + "): R$ " + pagamentoTotal);
  }

  @Override
  public Double getSalarioTotal() {
    return salarioBase + valeTransporte; // soma da bolsaAuxilio (salarioBase) com o valeTransporte
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
