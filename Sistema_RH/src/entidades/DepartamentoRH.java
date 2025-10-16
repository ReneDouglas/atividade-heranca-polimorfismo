package entidades;

import java.util.ArrayList;

/**
 * DepartamentoRH
 *
 * Utilizando o Polimorfismo: Classe DepartamentoRH
 * Para demonstrar o poder do polimorfismo, crie uma classe DepartamentoRH que
 * gerencia uma lista de funcionários sem se preocupar com o cargo específico de
 * cada um.
 * 
 * Atributo
 * funcionarios (um ArrayList de Funcionarios): Para armazenar todos os
 * funcionários da empresa.
 * Métodos
 * adicionarFuncionario(Funcionario funcionario): Adiciona um funcionário (seja
 * ele Desenvolvedor, GerenteDeProjetos ou AnalistaDeQualidade) à lista.
 * removerFuncionario(String matricula): Remove um funcionário da lista com base
 * na sua matrícula.
 * gerarFolhaDePagamento(): Este método deve iterar pela lista funcionarios e,
 * para cada funcionário, fazer o seguinte:
 * Obter o nome e a matrícula.
 * Invocar o método calcularSalario(). Graças ao polimorfismo, o Java executará
 * a versão correta do método (a da subclasse específica).
 * Imprimir uma linha formatada no console, como: Nome: [Nome], Matrícula:
 * [Matrícula], Salário Final: R$ [Valor].
 * calcularCustoTotalFolha(): Itera pela lista e retorna a soma de todos os
 * salários calculados, representando o custo total da folha de pagamento do
 * mês.
 */
public class DepartamentoRH {

  private ArrayList<Funcionario> funcionarios;

  public DepartamentoRH() {
    this.funcionarios = new ArrayList<>();
  }

  public void adicionarFuncionario(Funcionario funcionario) {
    funcionarios.add(funcionario);
  }

  public void removerFuncionario(String matricula) {
    funcionarios.removeIf(func -> func.matricula.equals(matricula));
  }

  public void gerarFolhaDePagamento() {
    for (Funcionario func : funcionarios) {
      System.out.print("Nome: " + func.nome + ", Matrícula: " + func.matricula + ", ");
      func.calcularSalario(); // Invoca o método polimórfico
    }
  }

  public Double calcularCustoTotalFolha() {
    Double custoTotal = 0.0;
    for (Funcionario func : funcionarios) {
      custoTotal += func.getSalarioTotal();
    }
    return custoTotal;
  }
  
}
