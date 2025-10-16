package entidades;

/**
 * Funcionario
 *
 * Atributos (protegidos - protected):
 * nome (String): Nome completo do funcionário.
 * matricula (String): Identificador único do funcionário.
 * salarioBase (double): Salário bruto mensal, sem bônus ou descontos.
 * Construtor
 * Deve receber nome, matricula e salarioBase para inicializar os atributos.
 * Métodos
 * calcularSalario(): Método abstrato que não terá implementação na superclasse.
 * Sua assinatura será public abstract double calcularSalario();. Este método
 * será responsável por calcular o salário final do mês, aplicando bônus e
 * outras regras específicas de cada cargo.
 */
public abstract class Funcionario {

  protected String nome;
  protected String matricula;
  protected Double salarioBase;

  public Funcionario(String nome, String matricula, Double salarioBase) {
    this.nome = nome;
    this.matricula = matricula;
    this.salarioBase = salarioBase;
  }

  public abstract Double getSalarioTotal();

  protected abstract void calcularSalario();

}
