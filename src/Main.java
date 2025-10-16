import entidades.Desenvolvedor;
import entidades.Funcionario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Funcionario dev = new Desenvolvedor(
            "rene",
            "123",
            3000.0,
            List.of("Java", "JavaScript", "Python"));

    IO.println("Salario final: " + dev.calcularSalario());

}