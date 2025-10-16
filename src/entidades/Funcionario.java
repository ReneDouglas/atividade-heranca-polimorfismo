package entidades;

public abstract class Funcionario {

    protected String nome;
    protected String matricula;
    protected Double salarioBase;

    public Funcionario(String nome, String matricula, Double salarioBase){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract Double calcularSalario();

}
