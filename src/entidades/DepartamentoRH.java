package entidades;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoRH {
    private final List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        if (funcionario == null) return;
        funcionarios.add(funcionario);
    }

    public boolean removerFuncionario(String matricula) {
        if (matricula == null) return false;

        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getMatricula().equals(matricula)) {
                funcionarios.remove(i);
                return true;
            }
        }

        return false;
    }

    public void gerarFolhaDePagamento() {
        System.out.println("Folha de Pagamento:");
        for (Funcionario f : funcionarios) {
            double salario = f.calcularSalario();
            System.out.printf("Nome: %s - Matrícula: %s - Salário Final: R$ %.2f%n",
                    f.getNome(), f.getMatricula(), salario);
        }
    }

    public double calcularCustoTotalFolha() {
        double total = 0.0;
        for (Funcionario f : funcionarios) {
            total += f.calcularSalario();
        }
        return total;
    }
}
