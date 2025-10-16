package entidades;

/**
 * GerenteDeProjetos
 *
 * Subclasse Gerente de Projetos
 * Responsável por liderar equipes e gerenciar projetos.
 * 
 * Atributos Adicionais (privados)
 * quantidadeProjetos (int): O número de projetos que o gerente está liderando
 * atualmente.
 * Construtor
 * Deve receber nome, matricula, salarioBase e quantidadeProjetos.
 * Regra de Negócio para calcularSalario() (@Override)
 * O salário de um gerente é o salarioBase acrescido de um bônus fixo de R$
 * 350,00 por cada projeto que ele gerencia.
 * Além disso, ele recebe uma bonificação de liderança de 15% sobre o valor
 * total (salário base + bônus por projetos).
 * Fórmula: salarioFinal = (salarioBase + (quantidadeProjetos * 350)) * 1.15
 * Exemplo: Um gerente com salário base de R$ 8.000,00 e 3 projetos terá um
 * salário final de (8000 + 1050) * 1.15 = R$ 10.407,50.
 */
public class GerenteDeProjetos extends Funcionario {

  private Integer quantidadeProjetos;

  public GerenteDeProjetos(String nome, String matricula, Double salarioBase, Integer quantidadeProjetos) {
    super(nome, matricula, salarioBase);
    this.quantidadeProjetos = quantidadeProjetos;
  }

  @Override
  public void calcularSalario() {
    Double bonusPorProjetos = 350.0 * quantidadeProjetos;
    Double salarioComBonus = salarioBase + bonusPorProjetos;
    Double salarioFinal = salarioComBonus * 1.15; // Bonificação de liderança de 15%
    System.out.println("Salário do Gerente de Projetos " + nome + " (Matrícula: " + matricula + "): R$ " + salarioFinal);
  }

  @Override
  public Double getSalarioTotal() {
    Double bonusPorProjetos = 350.0 * quantidadeProjetos;
    Double salarioComBonus = salarioBase + bonusPorProjetos;
    return salarioComBonus * 1.15; // Bonificação de liderança de 15%
  }

  public Integer getQuantidadeProjetos() {
    return quantidadeProjetos;
  }

  public void setQuantidadeProjetos(Integer quantidadeProjetos) {
    this.quantidadeProjetos = quantidadeProjetos;
  }

}
