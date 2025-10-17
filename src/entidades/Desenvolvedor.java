package entidades;

import java.util.Arrays;
import java.util.List;

public class Desenvolvedor extends Funcionario {

    private List<String> tecnologias;

    public Desenvolvedor(String nome, String matricula, Double salarioBase, String[] tecnologias) {
        super(nome, matricula, salarioBase);
        this.tecnologias = Arrays.asList(tecnologias);
    }

    @Override
    public Double calcularSalario() {
        double bonus = tecnologias.size() * 500.0;
        return salarioBase + bonus;
    }

    public List<String> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<String> tecnologias) {
        this.tecnologias = tecnologias;
    }
}
