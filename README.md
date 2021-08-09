# Testes Unitários com Qualidade | Zup Insights

## Conceitos de Testes Unitários

- Alto percentual de **Code Coverage** não garante qualidade do código e nem mesmo a qualidade dos testes
- Testes Unitários
  - É um nível de teste de _software_ em que componentes individuais são testados (métodos)
  - O propósito é validar se cada unidade do software executa como esperado
  - Garantir que problemas serão descobertos cedo
  - Facilitar a manutenção do código
  - Servir como documentação
  - Para ter certeza que o código não tem erro, garantir possíveis entradas do método
  - Geralmente se testa valores chaves que representam essas possíveis entradas
  - Ajudam a melhorar o _design_ do seu código
  - Achou um _bug_? Não conserte, escreva um teste que o pegue
  - Normalmente o número de linhas de testes são maiores que o código da implementação

## AAA Pattern

- Arrange
  - Set things up
  - Create object instances
  - Create test data / inputs
- Act
  - Execute production code
  - Call methods
- Assert
  - Check results
  - **Check behaviors**

## JUnit

- Framework que facilita o desenvolvimento e execução dos testes
- **JUnit - Assertions**
  - fail
  - assertNull / assertNotNull
  - assertTrue / assertFalse
  - assertEquals / assertNotEquals
  - assertThrows / assertDoesNotThrows
  - assertArrayEquals
- **JUnit - Annotations**
  - @Test
  - @BeforeEach
  - @BeforeAll
  - @AfterEach
  - @AfterAll
  - @Disabled

## Mock Objects

- Testes unitários devem testar uma classe isoladamente, isto é, sem que o efeito de outras classes com que ela se relaciona, interfiram no teste
- Isso é particularmente muito difícil porque a maioria das classes em um sistema real possuem relacionamento com outras classes
- Para resolver esse problema, normalmente se usa a metodologia de se criar Mocks
- Objetos Mock são implementações simuladas de uma _interface_ ou classe que define a saída das chamadas dos métodos
- Isso permite que você só esteja testando a classe em questão, e que não será afetado por efeitos colaterais
- Um teste sempre testará um único método. Se houver chamadas a outros métodos da mesma classe, estes deverão ser mocados

## Mockito

- Framework para criação de Mocks
- **Mockito - Resources**
  - @Mock / Mockito.mock(...)
  - @InjectMocks
  - @Spy / Mockito.spy(...)
  - Mockito.when(...).thenReturn(...)
  - Mockito.verify(...).method(...)
  - Mockito.any(...)

Fonte: [Testes Unitários com Qualidade | ⚡ Zup Insights 🚀](https://youtu.be/DH7F-axOrFU)
