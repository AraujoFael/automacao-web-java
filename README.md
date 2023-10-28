# Projeto de Automação com Java, Selenium e JUnit 5 (Maven)

Este projeto é uma estrutura de automação de testes desenvolvida em Java, que utiliza o Selenium WebDriver para interagir com aplicativos da web. A abordagem de Page Object e os princípios de Orientação a Objetos são a base da arquitetura deste projeto, tornando-o organizado e de fácil manutenção.

## Principais Recursos e Conceitos

- **Page Object Model (POM)**: Foi utilizado o modelo Page Object para representar cada página da aplicação como uma classe separada. Isso ajuda na organização do código, melhora a manutenção e reutilização de elementos e ações da página.

- **Design Orientado a Objetos**: A estrutura do projeto segue os princípios de Orientação a Objetos, com classes e métodos bem encapsulados e orientados para a reutilização e extensibilidade.

- **JUnit 5**: Utilizamos o framework JUnit 5 para a execução dos testes e validações, permitindo a criação de testes parametrizados e a configuração de asserções.

- **Relatórios detalhados**: Foi utilizado relatórios detalhados que fornecem informações valiosas sobre o resultado de cada execução de teste, tornando mais fácil a identificação e resolução de problemas.

- **Gestão de Dependências com Maven**: Este projeto utiliza o sistema de gerenciamento de dependências Maven para simplificar a configuração e a integração de bibliotecas e ferramentas.

## Estrutura dos Testes

Os testes são estruturados em um estilo "step by step" (passo a passo), tornando a sequência de ações clara e fácil de entender. Cada teste é organizado em três partes principais:

1. **Preparação (Setup)**: Nesta etapa, configuramos o ambiente de teste, inicializamos o WebDriver e navegamos para a página de destino.

2. **Execução (Execution)**: Aqui, realizamos as ações e interações com a página, como preencher formulários, clicar em botões e verificar resultados.

3. **Validação (Assertion)**: No último passo, usamos asserções do JUnit 5 para verificar se os resultados são os esperados e confirmar o sucesso ou a falha do teste.

## Como Usar

Para executar os testes deste projeto em seu ambiente local, siga estas etapas:

1. Clone este repositório para sua máquina.

2. Certifique-se de ter o Java, o Selenium WebDriver e o Maven configurados corretamente.

3. Use o Maven para gerenciar as dependências e executar os testes.

   ```bash
   mvn clean test
