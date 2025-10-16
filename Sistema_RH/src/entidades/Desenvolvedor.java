package entidades;

import java.util.List;

/**
 * Desenvolvedor
 *
 * Atributos Adicionais (privados):
 * tecnologias (array de String): Uma lista das principais tecnologias que o
 * desenvolvedor domina (ex: "Java", "React", "Docker", "AWS").
 * Construtor
 * Deve receber nome, matricula, salarioBase e o array de tecnologias.
 * Regra de Negócio para calcularSalario() (@Override):
 * O salário de um desenvolvedor é o salarioBase acrescido de um bônus de R$
 * 500,00 por cada tecnologia que ele domina.
 * Exemplo: Um desenvolvedor com salário base de R$ 5.000,00 que domina 4
 * tecnologias receberá R$ 7.000,00.
 */
public class Desenvolvedor extends Funcionario {

  private List<String> tecnologias;

  public Desenvolvedor(String nome, String matricula, Double salarioBase, List<String> tecnologias) {
    super(nome, matricula, salarioBase);
    this.tecnologias = tecnologias;
  }

  @Override
  public void calcularSalario() {
    Double bonus = 500.0 * tecnologias.size();
    Double salarioFinal = salarioBase + bonus;
    System.out.println("Salário do Desenvolvedor " + nome + " (Matrícula: " + matricula + "): R$ " + salarioFinal);
  }

  @Override
  public Double getSalarioTotal() {
    Double bonus = 500.0 * tecnologias.size();
    return salarioBase + bonus;
  }

  public List<String> getTecnologias() {
    return tecnologias;
  }
  public void setTecnologias(List<String> tecnologias) {
    this.tecnologias = tecnologias;
  }


}
