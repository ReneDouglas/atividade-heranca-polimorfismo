package entidades;

import java.util.List;

public class Desenvolvedor extends Funcionario{

    private List<String> tecnologias;

    public Desenvolvedor(String nome,
                         String matricula,
                         Double salarioBase,
                         List<String> tecnologias){
        super(nome, matricula, salarioBase);
        this.tecnologias = tecnologias;

    }

    @Override
    public Double calcularSalario() {

        Double salarioFinal;
        Double bonus = 0.0;

        for (String tecnologia : tecnologias) {
            bonus += 500.0;
        }
        return salarioFinal = salarioBase + bonus;
    }

    public List<String> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<String> tecnologias) {
        this.tecnologias = tecnologias;
    }
}
