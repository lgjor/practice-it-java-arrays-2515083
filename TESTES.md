# Testes Unitários - Practice IT Java Arrays

Este projeto contém implementações de duas funções para encontrar o segundo menor número em um array e seus respectivos testes unitários.

## Estrutura do Projeto

```
src/
├── main/java/main/
│   └── App.java                    # Classe principal com as implementações
└── test/java/main/
    ├── AppTest.java               # Testes com JUnit 5
    └── AppTestSimple.java         # Testes simples sem dependências
```

## Funções Implementadas

### 1. `findSecondSmallest(double[] array)`
- **Implementação eficiente** que percorre o array uma única vez
- **Complexidade**: O(n)
- **Retorna**: O segundo menor número único ou `null` se não existir

### 2. `findSecondSmallest2(double[] array)`
- **Implementação com ordenação** usando `Arrays.sort()`
- **Complexidade**: O(n log n)
- **Retorna**: O segundo menor número único ou `null` se não existir

## Executando os Testes

### Opção 1: Testes com JUnit 5 (Recomendado)
```bash
mvn test
```

### Opção 2: Testes Simples
```bash
# Compilar
javac -cp "src/main/java" "src/test/java/main/AppTestSimple.java"

# Executar
java -cp "src/main/java;src/test/java" main.AppTestSimple
```

## Casos de Teste Cobertos

### Casos Normais
- ✅ Array com elementos únicos
- ✅ Array com elementos duplicados
- ✅ Array com números negativos
- ✅ Array com números decimais
- ✅ Array com dois elementos diferentes
- ✅ Array grande (1000 elementos)

### Casos Extremos
- ✅ Array vazio
- ✅ Array com um elemento
- ✅ Array com todos os elementos iguais

### Testes de Consistência
- ✅ Ambas implementações retornam o mesmo resultado
- ✅ Ambas implementações retornam `null` para casos inválidos

## Resultados dos Testes

```
Tests run: 20, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## Boas Práticas Implementadas

1. **Estrutura de Pacotes**: Organização clara com pacote `main` para código principal e testes
2. **Cobertura de Testes**: Testes abrangentes para casos normais e extremos
3. **Documentação**: Comentários claros e nomes descritivos para métodos de teste
4. **Organização**: Uso de `@Nested` para agrupar testes relacionados
5. **Assertions**: Uso de mensagens descritivas nas asserções
6. **Múltiplas Implementações**: Comparação entre diferentes abordagens
7. **Configuração Maven**: Dependências e plugins configurados corretamente

## Dependências

- **Java 11+**
- **JUnit 5.9.2**
- **Maven 3.6+**

## Exemplo de Uso

```java
double[] array = {99, 10, 98, 10, 15, 15, 48, 54, 77};
Double result = App.findSecondSmallest(array);
System.out.println("Segundo menor: " + result); // Output: 15.0
```
