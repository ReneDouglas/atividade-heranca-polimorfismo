# Atividade Prática: Sistema de Gestão de RH da "InnovateTech Solutions"

## Contexto do Problema

A "InnovateTech Solutions", uma empresa líder em desenvolvimento de software, está crescendo rapidamente e precisa modernizar seu sistema de Recursos Humanos (RH). O sistema atual é inflexível e não consegue lidar com as diferentes políticas de remuneração e bonificação para os diversos cargos da empresa.

Seu objetivo é projetar e implementar um novo módulo para o sistema de RH, utilizando os conceitos de Herança e Polimorfismo da programação orientada a objetos para criar um modelo de funcionários que seja flexível, coeso e facilmente extensível para futuros cargos que possam surgir.

## Requisitos Gerais

Você deverá criar uma estrutura de classes que represente os funcionários da empresa. A base dessa estrutura será uma superclasse que define as características comuns a todos, e diversas subclasses que representarão os cargos específicos, cada uma com suas próprias regras de negócio.

## Estrutura de Classes a Ser Implementada

## Superclasse Abstrata: `Funcionario`
Esta classe servirá como um modelo para todos os tipos de funcionários. Nenhum objeto do tipo Funcionario poderá ser instanciado diretamente.

### Atributos (protegidos - `protected`):
- `nome` (String): Nome completo do funcionário.
- `matricula` (String): Identificador único do funcionário.
- `salarioBase` (double): Salário bruto mensal, sem bônus ou descontos.

### Construtor
- Deve receber `nome`, `matricula` e `salarioBase` para inicializar os atributos.

### Métodos
- `calcularSalario()`: Método abstrato que não terá implementação na superclasse. Sua assinatura será public abstract double calcularSalario();. Este método será responsável por calcular o salário final do mês, aplicando bônus e outras regras específicas de cada cargo.


## Subclasse `Desenvolvedor`
Representa os programadores da empresa.

### Atributos Adicionais (privados):
- `tecnologias` (array de String): Uma lista das principais tecnologias que o desenvolvedor domina (ex: "Java", "React", "Docker", "AWS").

### Construtor
- Deve receber `nome`, `matricula`, `salarioBase` e o array de `tecnologias`.

### Regra de Negócio para `calcularSalario()` (@Override):
- O salário de um desenvolvedor é o salarioBase acrescido de um bônus de R$ 500,00 por cada tecnologia que ele domina.

Exemplo: Um desenvolvedor com salário base de R$ 5.000,00 que domina 4 tecnologias receberá R$ 7.000,00.


## Subclasse `Gerente de Projetos`
Responsável por liderar equipes e gerenciar projetos.

### Atributos Adicionais (privados)
- `quantidadeProjetos` (int): O número de projetos que o gerente está liderando atualmente.

### Construtor
- Deve receber `nome`, `matricula`, `salarioBase` e `quantidadeProjetos`.

### Regra de Negócio para `calcularSalario()` (@Override)
- O salário de um gerente é o salarioBase acrescido de um bônus fixo de R$ 350,00 por cada projeto que ele gerencia.
- Além disso, ele recebe uma bonificação de liderança de 15% sobre o valor total (salário base + bônus por projetos).
- Fórmula: `salarioFinal = (salarioBase + (quantidadeProjetos * 350)) * 1.15`

Exemplo: Um gerente com salário base de R$ 8.000,00 e 3 projetos terá um salário final de (8000 + 1050) * 1.15 = R$ 10.407,50.


## Subclasse `Analista de Qualidade (QA)`
Responsável por garantir a qualidade do software através de testes.

### Atributos Adicionais (privados)
- `nivel` (String): O nível do analista ("JUNIOR" ou "SENIOR").
- `possuiCertificacao` (boolean): Indica se o analista possui uma certificação reconhecida (ex: CTFL, ISTQB).

### Construtor
- Deve receber `nome`, `matricula`, `salarioBase`, `nivel` e `possuiCertificacao`.

### Regra de Negócio para `calcularSalario()` (@Override)
- O salário de um QA é o salarioBase.
- Se for do nível "SENIOR", ele recebe um bônus de 25% sobre o salarioBase.
- Se possuir uma certificação, ele recebe um bônus fixo adicional de R$ 500,00, independentemente do nível.

Exemplo: Um analista SÊNIOR com certificação e salário base de R$ 4.000,00 receberá (4000 * 1.25) + 500 = R$ 5.500,00. Um analista JÚNIOR sem certificação com o mesmo base receberia apenas os R$ 4.000,00.

## Classe `Designer UIUX`

Representa os especialistas em User Interface (Interface de Usuário) e User Experience (Experiência do Usuário), responsáveis por criar as telas e a usabilidade dos sistemas.

### Atributos Adicionais (privados)
- `anosDeExperiencia` (int): Quantidade de anos que o designer atua no mercado.
- `ferramentaPrincipal` (String): A principal ferramenta de design que utiliza (ex: "Figma", "Adobe XD", "Sketch").

### Construtor
- Deve receber `nome`, `matricula`, `salarioBase`, `anosDeExperiencia` e `ferramentaPrincipal`.

### Regra de Negócio para calcularSalario() (@Override)
- O salário de um designer parte do salarioBase.
- Ele recebe uma bonificação por senioridade de 20% sobre o salarioBase se tiver mais de 5 anos de experiência.
- Adicionalmente, há um bônus de ferramenta de R$ 500,00 fixos se a sua ferramenta principal for "Figma", pois é a ferramenta padrão da empresa e otimiza a colaboração com os desenvolvedores.

- Exemplo 1: Um designer com 6 anos de experiência, que usa "Figma" e tem salário base de R$ 6.000,00, receberá (6000 * 1.20) + 500 = 7200 + 500 = R$ 7.700,00.
- Exemplo 2: Um designer com 3 anos de experiência, que usa "Adobe XD" e tem o mesmo base, receberá apenas os R$ 6.000,00.

## Classe `Estagiario`
Representa os estudantes que estão no programa de estágio da empresa, aprendendo e auxiliando nas tarefas. Esta classe é interessante pois possui regras de remuneração bem distintas.

### Atributos Adicionais (privados)
- `horasSemanais` (int): A carga horária semanal do estagiário (geralmente 20 ou 30 horas).
- `universidade` (String): A instituição de ensino onde o estagiário estuda.
- `valeTransporte` (double): Um valor fixo mensal de ajuda de custo para transporte.

### Construtor
- Deve receber `nome`, `matricula`, o valor da `bolsaAuxilio` (que será passado para o `salarioBase` da superclasse), `horasSemanais`, `universidade` e `valeTransporte`.

### Regra de Negócio para calcularSalario() (@Override)
- A remuneração de um estagiário não é considerada um "salário" com bônus, mas sim o valor da sua bolsa-auxílio (salarioBase) somado aos seus benefícios.
- O método `calcularSalario()` para o estagiário deve simplesmente retornar a soma da bolsaAuxilio (salarioBase) com o valeTransporte.
  - Importante: A lógica de bônus e percentuais não se aplica a ele, demonstrando um uso completamente diferente do método polimórfico.

Exemplo: Um estagiário com bolsa-auxílio de R$ 1.200,00 e vale-transporte de R$ 150,00 terá um pagamento total de 1200 + 150 = R$ 1.350,00

## Utilizando o Polimorfismo: Classe `DepartamentoRH`

Para demonstrar o poder do polimorfismo, crie uma classe DepartamentoRH que gerencia uma lista de funcionários sem se preocupar com o cargo específico de cada um.

### Atributo
- `funcionarios` (um ArrayList de Funcionarios): Para armazenar todos os funcionários da empresa.

### Métodos
- `adicionarFuncionario(Funcionario funcionario)`: Adiciona um funcionário (seja ele Desenvolvedor, GerenteDeProjetos ou AnalistaDeQualidade) à lista.
- `removerFuncionario(String matricula)`: Remove um funcionário da lista com base na sua matrícula.
- `gerarFolhaDePagamento()`: Este método deve iterar pela lista funcionarios e, para cada funcionário, fazer o seguinte:
   - Obter o nome e a matrícula.
   - Invocar o método calcularSalario(). Graças ao polimorfismo, o Java executará a versão correta do método (a da subclasse específica).
   - Imprimir uma linha formatada no console, como: Nome: [Nome], Matrícula: [Matrícula], Salário Final: R$ [Valor]
-`calcularCustoTotalFolha()`: Itera pela lista e retorna a soma de todos os salários calculados, representando o custo total da folha de pagamento do mês.

## Tarefa a Ser Executada (Classe Main)

Crie uma classe Main (ou TesteRH) para simular o funcionamento do sistema:

- Instancie pelo menos dois objetos de cada subclasse (Desenvolvedor, GerenteDeProjetos, AnalistaDeQualidade), com dados variados.
- Crie uma instância de DepartamentoRH.
- Adicione todos os funcionários criados ao DepartamentoRH.
- Chame o método `gerarFolhaDePagamento()` para exibir o relatório de salários de todos os funcionários.
- Chame o método `calcularCustoTotalFolha()` e imprima o custo total da folha de pagamento no console.
