package entidades;

/**
 * DesignerUXUI
 *
 * Classe Designer UIUX
 * Representa os especialistas em User Interface (Interface de Usuário) e User
 * Experience (Experiência do Usuário), responsáveis por criar as telas e a
 * usabilidade dos sistemas.
 * 
 * Atributos Adicionais (privados)
 * anosDeExperiencia (int): Quantidade de anos que o designer atua no mercado.
 * ferramentaPrincipal (String): A principal ferramenta de design que utiliza
 * (ex: "Figma", "Adobe XD", "Sketch").
 * Construtor
 * Deve receber nome, matricula, salarioBase, anosDeExperiencia e
 * ferramentaPrincipal.
 * Regra de Negócio para calcularSalario() (@Override)
 * O salário de um designer parte do salarioBase.
 * 
 * Ele recebe uma bonificação por senioridade de 20% sobre o salarioBase se
 * tiver mais de 5 anos de experiência.
 * 
 * Adicionalmente, há um bônus de ferramenta de R$ 500,00 fixos se a sua
 * ferramenta principal for "Figma", pois é a ferramenta padrão da empresa e
 * otimiza a colaboração com os desenvolvedores.
 * 
 * Exemplo 1: Um designer com 6 anos de experiência, que usa "Figma" e tem
 * salário base de R$ 6.000,00, receberá (6000 * 1.20) + 500 = 7200 + 500 = R$
 * 7.700,00.
 * 
 * Exemplo 2: Um designer com 3 anos de experiência, que usa "Adobe XD" e tem o
 * mesmo base, receberá apenas os R$ 6.000,00.
 */
public class DesignerUXUI extends Funcionario {

  private Integer anosDeExperiencia;
  private String ferramentaPrincipal;

  public DesignerUXUI(String nome, String matricula, Double salarioBase, Integer anosDeExperiencia,
      String ferramentaPrincipal) {
    super(nome, matricula, salarioBase);
    this.anosDeExperiencia = anosDeExperiencia;
    this.ferramentaPrincipal = ferramentaPrincipal;
  }

  @Override
  public void calcularSalario() {
    Double salarioFinal = salarioBase;
    if (anosDeExperiencia > 5) {
      salarioFinal *= 1.20; // Bonificação de 20% por senioridade
    }
    if (ferramentaPrincipal.equalsIgnoreCase("Figma")) {
      salarioFinal += 500.0; // Bônus fixo de R$ 500,00 por usar Figma
    }
    System.out.println("Salário do Designer UX/UI " + nome + " (Matrícula: " + matricula + "): R$ " + salarioFinal);
  }

  @Override
  public Double getSalarioTotal() {
    Double salarioFinal = salarioBase;
    if (anosDeExperiencia > 5) {
      salarioFinal *= 1.20; // Bonificação de 20% por senioridade
    }
    if (ferramentaPrincipal.equalsIgnoreCase("Figma")) {
      salarioFinal += 500.0; // Bônus fixo de R$ 500,00 por usar Figma
    }
    return salarioFinal;
  }

  public Integer getAnosDeExperiencia() {
    return anosDeExperiencia;
  }

  public void setAnosDeExperiencia(Integer anosDeExperiencia) {
    this.anosDeExperiencia = anosDeExperiencia;
  }

  public String getFerramentaPrincipal() {
    return ferramentaPrincipal;
  }

  public void setFerramentaPrincipal(String ferramentaPrincipal) {
    this.ferramentaPrincipal = ferramentaPrincipal;
  }

}
