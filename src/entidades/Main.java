package entidades;

public class Main {
    public static void main(String[] args) {
        DepartamentoRH departamento = new DepartamentoRH();

        Desenvolvedor d1 = new Desenvolvedor("Ana Silva", "D001", 5000.0, new String[] {"Java", "React", "Docker", "AWS"});
        Desenvolvedor d2 = new Desenvolvedor("Bruno Costa", "D002", 4500.0, new String[] {"Java", "Spring"});

        Gerente_projetos g1 = new  Gerente_projetos("Carla Mendes", "G001", 8000.0, 3);
        Gerente_projetos g2 = new  Gerente_projetos("Daniel Rocha", "G002", 7000.0, 1);

        Analista_qualidade a1 = new Analista_qualidade ("Eduarda Lopes", "A001", 4000.0, "SENIOR", true);
        Analista_qualidade  a2 = new Analista_qualidade ("Felipe Souza", "A002", 3500.0, "JUNIOR", false);

        Designer_UIUX des1 = new Designer_UIUX("Gabriela Nunes", "DS001", 6000.0, 6, "FIGMA");
        Designer_UIUX des2 = new Designer_UIUX("Hugo Martins", "DS002", 6000.0, 3, "ADOBEXD");

        Estagiario e1 = new Estagiario("Isabela Ferreira", "E001", 1200.0, 20, "Universidade A", 150.0);
        Estagiario e2 = new Estagiario("João Almeida", "E002", 1000.0, 30, "Universidade B", 120.0);

        departamento.adicionarFuncionario(d1);
        departamento.adicionarFuncionario(d2);
        departamento.adicionarFuncionario(g1);
        departamento.adicionarFuncionario(g2);
        departamento.adicionarFuncionario(a1);
        departamento.adicionarFuncionario(a2);
        departamento.adicionarFuncionario(des1);
        departamento.adicionarFuncionario(des2);
        departamento.adicionarFuncionario(e1);
        departamento.adicionarFuncionario(e2);

        departamento.gerarFolhaDePagamento();
        double total = departamento.calcularCustoTotalFolha();
        System.out.printf("Custo total da folha: R$ %.2f%n", total);
    }
}
