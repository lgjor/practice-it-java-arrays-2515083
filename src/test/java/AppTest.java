// Sem pacote - classe no diretório raiz

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para App.java
 * Testa as funções findSecondSmallest e findSecondSmallest2
 * 
 * @author Teste Unitário
 * @version 1.0
 */
public class AppTest {

  @Nested
  @DisplayName("Testes para rightTriangleOfAnArray")
  class RightTriangleOfAnArrayTests {

    @Test
    @DisplayName("Deve imprimir triângulo com array de inteiros")
    void testRightTriangleOfAnArray_IntegerArray() {
      // Arrange
      Integer[] array = { 1, 2, 3, 4 };

      // Act & Assert - Como a função imprime, vamos testar se não lança exceção
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve imprimir triângulo sem lançar exceção");
    }

    @Test
    @DisplayName("Deve imprimir triângulo com array de caracteres")
    void testRightTriangleOfAnArray_CharacterArray() {
      // Arrange
      Character[] array = { 'A', 'B', 'C', 'D', 'E' };

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve imprimir triângulo de caracteres sem lançar exceção");
    }

    @Test
    @DisplayName("Deve imprimir triângulo com array de strings")
    void testRightTriangleOfAnArray_StringArray() {
      // Arrange
      String[] array = { "Hello", "There", "Friend" };

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve imprimir triângulo de strings sem lançar exceção");
    }

    @Test
    @DisplayName("Deve lidar com array vazio")
    void testRightTriangleOfAnArray_EmptyArray() {
      // Arrange
      String[] array = {};

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve lidar com array vazio sem lançar exceção");
    }

    @Test
    @DisplayName("Deve lidar com array de um elemento")
    void testRightTriangleOfAnArray_SingleElement() {
      // Arrange
      String[] array = { "Hello" };

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve lidar com array de um elemento sem lançar exceção");
    }

    @Test
    @DisplayName("Deve lidar com array de dois elementos")
    void testRightTriangleOfAnArray_TwoElements() {
      // Arrange
      Integer[] array = { 10, 20 };

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve lidar com array de dois elementos sem lançar exceção");
    }

    @Test
    @DisplayName("Deve lidar com array de números decimais")
    void testRightTriangleOfAnArray_DecimalNumbers() {
      // Arrange
      Double[] array = { 1.5, 2.3, 3.7 };

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve lidar com array de números decimais sem lançar exceção");
    }

    @Test
    @DisplayName("Deve lidar com array de booleanos")
    void testRightTriangleOfAnArray_BooleanArray() {
      // Arrange
      Boolean[] array = { true, false, true, false };

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve lidar com array de booleanos sem lançar exceção");
    }

    @Test
    @DisplayName("Deve lidar com array de objetos mistos")
    void testRightTriangleOfAnArray_MixedObjects() {
      // Arrange
      Object[] array = { "String", 123, 'C', true };

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve lidar com array de objetos mistos sem lançar exceção");
    }

    @Test
    @DisplayName("Deve lidar com array grande")
    void testRightTriangleOfAnArray_LargeArray() {
      // Arrange
      Integer[] array = new Integer[100];
      for (int i = 0; i < 100; i++) {
        array[i] = i + 1;
      }

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve lidar com array grande sem lançar exceção");
    }

    @Test
    @DisplayName("Deve lidar com array contendo null")
    void testRightTriangleOfAnArray_ArrayWithNull() {
      // Arrange
      String[] array = { "Hello", null, "World" };

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve lidar com array contendo null sem lançar exceção");
    }

    @Test
    @DisplayName("Deve lidar com array de arrays")
    void testRightTriangleOfAnArray_ArrayOfArrays() {
      // Arrange
      int[][] innerArray1 = { { 1, 2 }, { 3, 4 } };
      int[][] innerArray2 = { { 5, 6 }, { 7, 8 } };
      Object[] array = { innerArray1, innerArray2 };

      // Act & Assert
      assertDoesNotThrow(() -> App.rightTriangleOfAnArray(array),
          "Deve lidar com array de arrays sem lançar exceção");
    }
  }

  @Nested
  @DisplayName("Testes para findSecondSmallest - Implementação Eficiente")
  class FindSecondSmallestTests {

    @Test
    @DisplayName("Deve retornar o segundo menor número em array com elementos únicos")
    void testFindSecondSmallest_UniqueElements() {
      // Arrange
      double[] array = { 5.0, 2.0, 8.0, 1.0, 9.0 };

      // Act
      Double result = App.findSecondSmallest(array);

      // Assert
      assertEquals(2.0, result, 0.001, "O segundo menor número deve ser 2.0");
    }

    @Test
    @DisplayName("Deve retornar o segundo menor número em array com elementos duplicados")
    void testFindSecondSmallest_DuplicateElements() {
      // Arrange
      double[] array = { 3.0, 1.0, 1.0, 4.0, 2.0, 2.0 };

      // Act
      Double result = App.findSecondSmallest(array);

      // Assert
      assertEquals(2.0, result, 0.001, "O segundo menor número deve ser 2.0");
    }

    @Test
    @DisplayName("Deve retornar null para array vazio")
    void testFindSecondSmallest_EmptyArray() {
      // Arrange
      double[] array = {};

      // Act
      Double result = App.findSecondSmallest(array);

      // Assert
      assertNull(result, "Array vazio deve retornar null");
    }

    @Test
    @DisplayName("Deve retornar null para array com um elemento")
    void testFindSecondSmallest_SingleElement() {
      // Arrange
      double[] array = { 5.0 };

      // Act
      Double result = App.findSecondSmallest(array);

      // Assert
      assertNull(result, "Array com um elemento deve retornar null");
    }

    @Test
    @DisplayName("Deve retornar null para array com todos os elementos iguais")
    void testFindSecondSmallest_AllSameElements() {
      // Arrange
      double[] array = { 3.0, 3.0, 3.0, 3.0 };

      // Act
      Double result = App.findSecondSmallest(array);

      // Assert
      assertNull(result, "Array com todos elementos iguais deve retornar null");
    }

    @Test
    @DisplayName("Deve funcionar com números negativos")
    void testFindSecondSmallest_NegativeNumbers() {
      // Arrange
      double[] array = { -5.0, -2.0, -8.0, -1.0, -9.0 };

      // Act
      Double result = App.findSecondSmallest(array);

      // Assert
      assertEquals(-8.0, result, 0.001, "O segundo menor número deve ser -8.0");
    }

    @Test
    @DisplayName("Deve funcionar com números decimais")
    void testFindSecondSmallest_DecimalNumbers() {
      // Arrange
      double[] array = { 1.5, 2.3, 1.1, 3.7, 1.2 };

      // Act
      Double result = App.findSecondSmallest(array);

      // Assert
      assertEquals(1.2, result, 0.001, "O segundo menor número deve ser 1.2");
    }

    @Test
    @DisplayName("Deve funcionar com array de dois elementos diferentes")
    void testFindSecondSmallest_TwoDifferentElements() {
      // Arrange
      double[] array = { 10.0, 5.0 };

      // Act
      Double result = App.findSecondSmallest(array);

      // Assert
      assertEquals(10.0, result, 0.001, "O segundo menor número deve ser 10.0");
    }

    @Test
    @DisplayName("Deve funcionar com array grande")
    void testFindSecondSmallest_LargeArray() {
      // Arrange
      double[] array = new double[1000];
      for (int i = 0; i < 1000; i++) {
        array[i] = i + 1;
      }
      array[0] = 0.5; // Menor elemento
      array[1] = 1.5; // Segundo menor elemento

      // Act
      Double result = App.findSecondSmallest(array);

      // Assert
      assertEquals(1.5, result, 0.001, "O segundo menor número deve ser 1.5");
    }
  }

  @Nested
  @DisplayName("Testes para findSecondSmallest2 - Implementação com Sort")
  class FindSecondSmallest2Tests {

    @Test
    @DisplayName("Deve retornar o segundo menor número em array com elementos únicos")
    void testFindSecondSmallest2_UniqueElements() {
      // Arrange
      double[] array = { 5.0, 2.0, 8.0, 1.0, 9.0 };

      // Act
      Double result = App.findSecondSmallest2(array);

      // Assert
      assertEquals(2.0, result, 0.001, "O segundo menor número deve ser 2.0");
    }

    @Test
    @DisplayName("Deve retornar o segundo menor número em array com elementos duplicados")
    void testFindSecondSmallest2_DuplicateElements() {
      // Arrange
      double[] array = { 3.0, 1.0, 1.0, 4.0, 2.0, 2.0 };

      // Act
      Double result = App.findSecondSmallest2(array);

      // Assert
      assertEquals(2.0, result, 0.001, "O segundo menor número deve ser 2.0");
    }

    @Test
    @DisplayName("Deve retornar null para array vazio")
    void testFindSecondSmallest2_EmptyArray() {
      // Arrange
      double[] array = {};

      // Act
      Double result = App.findSecondSmallest2(array);

      // Assert
      assertNull(result, "Array vazio deve retornar null");
    }

    @Test
    @DisplayName("Deve retornar null para array com um elemento")
    void testFindSecondSmallest2_SingleElement() {
      // Arrange
      double[] array = { 5.0 };

      // Act
      Double result = App.findSecondSmallest2(array);

      // Assert
      assertNull(result, "Array com um elemento deve retornar null");
    }

    @Test
    @DisplayName("Deve retornar null para array com todos os elementos iguais")
    void testFindSecondSmallest2_AllSameElements() {
      // Arrange
      double[] array = { 3.0, 3.0, 3.0, 3.0 };

      // Act
      Double result = App.findSecondSmallest2(array);

      // Assert
      assertNull(result, "Array com todos elementos iguais deve retornar null");
    }

    @Test
    @DisplayName("Deve funcionar com números negativos")
    void testFindSecondSmallest2_NegativeNumbers() {
      // Arrange
      double[] array = { -5.0, -2.0, -8.0, -1.0, -9.0 };

      // Act
      Double result = App.findSecondSmallest2(array);

      // Assert
      assertEquals(-8.0, result, 0.001, "O segundo menor número deve ser -8.0");
    }

    @Test
    @DisplayName("Deve funcionar com números decimais")
    void testFindSecondSmallest2_DecimalNumbers() {
      // Arrange
      double[] array = { 1.5, 2.3, 1.1, 3.7, 1.2 };

      // Act
      Double result = App.findSecondSmallest2(array);

      // Assert
      assertEquals(1.2, result, 0.001, "O segundo menor número deve ser 1.2");
    }

    @Test
    @DisplayName("Deve funcionar com array de dois elementos diferentes")
    void testFindSecondSmallest2_TwoDifferentElements() {
      // Arrange
      double[] array = { 10.0, 5.0 };

      // Act
      Double result = App.findSecondSmallest2(array);

      // Assert
      assertEquals(10.0, result, 0.001, "O segundo menor número deve ser 10.0");
    }

    @Test
    @DisplayName("Deve funcionar com array grande")
    void testFindSecondSmallest2_LargeArray() {
      // Arrange
      double[] array = new double[1000];
      for (int i = 0; i < 1000; i++) {
        array[i] = i + 1;
      }
      array[0] = 0.5; // Menor elemento
      array[1] = 1.5; // Segundo menor elemento

      // Act
      Double result = App.findSecondSmallest2(array);

      // Assert
      assertEquals(1.5, result, 0.001, "O segundo menor número deve ser 1.5");
    }
  }

  @Nested
  @DisplayName("Testes de Comparação entre as Implementações")
  class ComparisonTests {

    @Test
    @DisplayName("Ambas implementações devem retornar o mesmo resultado")
    void testBothImplementationsReturnSameResult() {
      // Arrange
      double[] array = { 99.0, 10.0, 98.0, 10.0, 15.0, 15.0, 48.0, 54.0, 77.0 };

      // Act
      Double result1 = App.findSecondSmallest(array);
      Double result2 = App.findSecondSmallest2(array);

      // Assert
      assertEquals(result1, result2, "Ambas implementações devem retornar o mesmo resultado");
    }

    @Test
    @DisplayName("Ambas implementações devem retornar null para array com elementos iguais")
    void testBothImplementationsReturnNullForSameElements() {
      // Arrange
      double[] array = { 5.0, 5.0, 5.0, 5.0 };

      // Act
      Double result1 = App.findSecondSmallest(array);
      Double result2 = App.findSecondSmallest2(array);

      // Assert
      assertNull(result1, "findSecondSmallest deve retornar null");
      assertNull(result2, "findSecondSmallest2 deve retornar null");
    }
  }
}
