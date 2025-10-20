import entidades.*;
import java.util.List;

/**
 * Requisitos Gerais:
 *
 * Você deverá criar uma estrutura de classes que represente os funcionários da
 * empresa.
 * A base dessa estrutura será uma superclasse que define as características
 * comuns a todos, e diversas subclasses que
 * representarão os cargos específicos, cada uma com suas próprias regras de
 * negócio.
 *
 * Crie uma classe Main (ou TesteRH) para simular o funcionamento do sistema:
 * 
 * Instancie pelo menos dois objetos de cada subclasse (Desenvolvedor,
 * GerenteDeProjetos, AnalistaDeQualidade), com dados variados.
 * Crie uma instância de DepartamentoRH.
 * Adicione todos os funcionários criados ao DepartamentoRH.
 * Chame o método gerarFolhaDePagamento() para exibir o relatório de salários de
 * todos os funcionários.
 * Chame o método calcularCustoTotalFolha() e imprima o custo total da folha de
 * pagamento no console.
 */

public class App {

  void main(){
    DepartamentoRH rh = new DepartamentoRH();

    List<String> techs1 = List.of("Java", "React", "Docker");
    Desenvolvedor dev1 = new Desenvolvedor("Alice", "D001", 5000.0, techs1);

    List<String> techs2 = List.of("Python", "Django");
    Desenvolvedor dev2 = new Desenvolvedor("Bob", "D002", 6000.0, techs2);

    GerenteDeProjetos gp1 = new GerenteDeProjetos("Carlos", "G001", 8000.0, 3);
    GerenteDeProjetos gp2 = new GerenteDeProjetos("Diana", "G002", 9000.0, 2);

    AnalistaDeQualidade aq1 = new AnalistaDeQualidade("Eva", "A001", 4000.0, "SENIOR", true);
    AnalistaDeQualidade aq2 = new AnalistaDeQualidade("Frank", "A002", 3500.0, "JUNIOR", false);

    Estagiario est1 = new Estagiario("Gina", "E001", 1200.0, 20, "UFSC", 150.0);
    Estagiario est2 = new Estagiario("Hugo", "E002", 1000.0, 30, "USP", 100.0);

    rh.adicionarFuncionario(dev1);
    rh.adicionarFuncionario(dev2);
    rh.adicionarFuncionario(gp1);
    rh.adicionarFuncionario(gp2);
    rh.adicionarFuncionario(aq1);
    rh.adicionarFuncionario(aq2);
    rh.adicionarFuncionario(est1);
    rh.adicionarFuncionario(est2);

    rh.gerarFolhaDePagamento();

    Double custoTotal = rh.calcularCustoTotalFolha();
    System.out.println("Custo Total da Folha de Pagamento: R$ " + custoTotal);
  }

}
