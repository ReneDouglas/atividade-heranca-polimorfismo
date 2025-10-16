package entidades;

/**
 * AnalistaDeQualidade
 *
 * Subclasse Analista de Qualidade (QA)
 * Responsável por garantir a qualidade do software através de testes.
 * 
 * Atributos Adicionais (privados)
 * nivel (String): O nível do analista ("JUNIOR" ou "SENIOR").
 * possuiCertificacao (boolean): Indica se o analista possui uma certificação
 * reconhecida (ex: CTFL, ISTQB).
 * Construtor
 * Deve receber nome, matricula, salarioBase, nivel e possuiCertificacao.
 * Regra de Negócio para calcularSalario() (@Override)
 * O salário de um QA é o salarioBase.
 * Se for do nível "SENIOR", ele recebe um bônus de 25% sobre o salarioBase.
 * Se possuir uma certificação, ele recebe um bônus fixo adicional de R$ 500,00,
 * independentemente do nível.
 * Exemplo: Um analista SÊNIOR com certificação e salário base de R$ 4.000,00
 * receberá (4000 * 1.25) + 500 = R$ 5.500,00. Um analista JÚNIOR sem
 * certificação com o mesmo base receberia apenas os R$ 4.000,00.
 */
public class AnalistaDeQualidade extends Funcionario {

  private String nivel; // "JUNIOR" ou "SENIOR"
  private Boolean possuiCertificacao;

  public AnalistaDeQualidade(String nome, String matricula, Double salarioBase, String nivel,
      Boolean possuiCertificacao) {
    super(nome, matricula, salarioBase);
    this.nivel = nivel;
    this.possuiCertificacao = possuiCertificacao;
  }

  @Override
  public void calcularSalario() {
    Double salarioFinal = salarioBase;
    if (nivel.equalsIgnoreCase("SENIOR")) {
      salarioFinal *= 1.25; // Bônus de 25% para SENIOR
    }
    if (possuiCertificacao) {
      salarioFinal += 500.0; // Bônus fixo de R$ 500,00 por certificação
    }
    System.out.println("Salário do Analista de Qualidade " + nome + " (Matrícula: " + matricula + "): R$ " + salarioFinal);
  }

  @Override
  public Double getSalarioTotal() {
    Double salarioFinal = salarioBase;
    if (nivel.equalsIgnoreCase("SENIOR")) {
      salarioFinal *= 1.25; // Bônus de 25% para SENIOR
    }
    if (possuiCertificacao) {
      salarioFinal += 500.0; // Bônus fixo de R$ 500,00 por certificação
    }
    return salarioFinal;
  }

  public String getNivel() {
    return nivel;
  }

  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

  public Boolean getPossuiCertificacao() {
    return possuiCertificacao;
  }

  public void setPossuiCertificacao(Boolean possuiCertificacao) {
    this.possuiCertificacao = possuiCertificacao;
  }

}
