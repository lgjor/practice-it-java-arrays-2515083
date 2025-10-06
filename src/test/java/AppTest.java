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
  @DisplayName("Testes para rotateArray - Versão Melhorada (um parâmetro)")
  class RotateArraySingleParamTests {

    @Test
    @DisplayName("Deve rotacionar array de inteiros uma posição para a direita")
    void testRotateArray_IntegerArray() {
      // Arrange
      Object[] array = { 1, 2, 3, 4, 5 };
      Object[] expected = { 5, 1, 2, 3, 4 };

      // Act
      Object[] result = App.rotateArray(array);

      // Assert
      assertArrayEquals(expected, result, "Array deve ser rotacionado uma posição para a direita");
    }

    @Test
    @DisplayName("Deve rotacionar array de strings uma posição para a direita")
    void testRotateArray_StringArray() {
      // Arrange
      Object[] array = { "A", "B", "C", "D" };
      Object[] expected = { "D", "A", "B", "C" };

      // Act
      Object[] result = App.rotateArray(array);

      // Assert
      assertArrayEquals(expected, result, "Array de strings deve ser rotacionado corretamente");
    }

    @Test
    @DisplayName("Deve retornar null para array null")
    void testRotateArray_NullArray() {
      // Arrange
      Object[] array = null;

      // Act
      Object[] result = App.rotateArray(array);

      // Assert
      assertNull(result, "Array null deve retornar null");
    }

    @Test
    @DisplayName("Deve retornar array vazio para array vazio")
    void testRotateArray_EmptyArray() {
      // Arrange
      Object[] array = {};
      Object[] expected = {};

      // Act
      Object[] result = App.rotateArray(array);

      // Assert
      assertArrayEquals(expected, result, "Array vazio deve retornar array vazio");
    }

    @Test
    @DisplayName("Deve retornar o mesmo array para array com um elemento")
    void testRotateArray_SingleElement() {
      // Arrange
      Object[] array = { 42 };
      Object[] expected = { 42 };

      // Act
      Object[] result = App.rotateArray(array);

      // Assert
      assertArrayEquals(expected, result, "Array com um elemento deve retornar o mesmo array");
    }

    @Test
    @DisplayName("Deve rotacionar array de caracteres")
    void testRotateArray_CharacterArray() {
      // Arrange
      Object[] array = { 'a', 'b', 'c', 'd', 'e' };
      Object[] expected = { 'e', 'a', 'b', 'c', 'd' };

      // Act
      Object[] result = App.rotateArray(array);

      // Assert
      assertArrayEquals(expected, result, "Array de caracteres deve ser rotacionado corretamente");
    }

    @Test
    @DisplayName("Deve rotacionar array de booleanos")
    void testRotateArray_BooleanArray() {
      // Arrange
      Object[] array = { true, false, true, false };
      Object[] expected = { false, true, false, true };

      // Act
      Object[] result = App.rotateArray(array);

      // Assert
      assertArrayEquals(expected, result, "Array de booleanos deve ser rotacionado corretamente");
    }

    @Test
    @DisplayName("Deve rotacionar array de objetos mistos")
    void testRotateArray_MixedObjects() {
      // Arrange
      Object[] array = { "Hello", 123, 'C', true };
      Object[] expected = { true, "Hello", 123, 'C' };

      // Act
      Object[] result = App.rotateArray(array);

      // Assert
      assertArrayEquals(expected, result, "Array de objetos mistos deve ser rotacionado corretamente");
    }

    @Test
    @DisplayName("Deve rotacionar array com elementos null")
    void testRotateArray_ArrayWithNull() {
      // Arrange
      Object[] array = { "A", null, "C", "D" };
      Object[] expected = { "D", "A", null, "C" };

      // Act
      Object[] result = App.rotateArray(array);

      // Assert
      assertArrayEquals(expected, result, "Array com null deve ser rotacionado corretamente");
    }
  }

  @Nested
  @DisplayName("Testes para rotateArray - Versão com Passos (dois parâmetros)")
  class RotateArrayTwoParamsTests {

    @Test
    @DisplayName("Deve rotacionar array 1 posição para a direita")
    void testRotateArray_OneStep() {
      // Arrange
      Object[] array = { 1, 2, 3, 4, 5 };
      Object[] expected = { 5, 1, 2, 3, 4 };

      // Act
      Object[] result = App.rotateArray(array, 1);

      // Assert
      assertArrayEquals(expected, result, "Array deve ser rotacionado 1 posição para a direita");
    }

    @Test
    @DisplayName("Deve rotacionar array 2 posições para a direita")
    void testRotateArray_TwoSteps() {
      // Arrange
      Object[] array = { 1, 2, 3, 4, 5 };
      Object[] expected = { 4, 5, 1, 2, 3 };

      // Act
      Object[] result = App.rotateArray(array, 2);

      // Assert
      assertArrayEquals(expected, result, "Array deve ser rotacionado 2 posições para a direita");
    }

    @Test
    @DisplayName("Deve rotacionar array 3 posições para a direita")
    void testRotateArray_ThreeSteps() {
      // Arrange
      Object[] array = { 1, 2, 3, 4, 5 };
      Object[] expected = { 3, 4, 5, 1, 2 };

      // Act
      Object[] result = App.rotateArray(array, 3);

      // Assert
      assertArrayEquals(expected, result, "Array deve ser rotacionado 3 posições para a direita");
    }

    @Test
    @DisplayName("Deve retornar array original quando steps = 0")
    void testRotateArray_ZeroSteps() {
      // Arrange
      Object[] array = { 1, 2, 3, 4, 5 };
      Object[] expected = { 1, 2, 3, 4, 5 };

      // Act
      Object[] result = App.rotateArray(array, 0);

      // Assert
      assertArrayEquals(expected, result, "Array deve permanecer inalterado quando steps = 0");
    }

    @Test
    @DisplayName("Deve rotacionar array completo (steps = length)")
    void testRotateArray_FullRotation() {
      // Arrange
      Object[] array = { 1, 2, 3, 4, 5 };
      Object[] expected = { 1, 2, 3, 4, 5 };

      // Act
      Object[] result = App.rotateArray(array, 5);

      // Assert
      assertArrayEquals(expected, result, "Array deve retornar ao estado original após rotação completa");
    }

    @Test
    @DisplayName("Deve rotacionar array com steps maior que o tamanho")
    void testRotateArray_StepsLargerThanLength() {
      // Arrange
      Object[] array = { 1, 2, 3, 4, 5 };
      Object[] expected = { 1, 2, 3, 4, 5 };

      // Act
      Object[] result = App.rotateArray(array, 10);

      // Assert
      assertArrayEquals(expected, result, "Array deve retornar ao estado original após múltiplas rotações completas");
    }

    @Test
    @DisplayName("Deve rotacionar array de strings com múltiplos passos")
    void testRotateArray_StringArrayMultipleSteps() {
      // Arrange
      Object[] array = { "A", "B", "C", "D", "E" };
      Object[] expected = { "C", "D", "E", "A", "B" };

      // Act
      Object[] result = App.rotateArray(array, 3);

      // Assert
      assertArrayEquals(expected, result, "Array de strings deve ser rotacionado corretamente");
    }

    @Test
    @DisplayName("Deve rotacionar array de um elemento")
    void testRotateArray_SingleElement() {
      // Arrange
      Object[] array = { 42 };
      Object[] expected = { 42 };

      // Act
      Object[] result = App.rotateArray(array, 1);

      // Assert
      assertArrayEquals(expected, result, "Array com um elemento deve retornar o mesmo array");
    }

    @Test
    @DisplayName("Deve rotacionar array de dois elementos")
    void testRotateArray_TwoElements() {
      // Arrange
      Object[] array = { 10, 20 };
      Object[] expected = { 20, 10 };

      // Act
      Object[] result = App.rotateArray(array, 1);

      // Assert
      assertArrayEquals(expected, result, "Array de dois elementos deve ser rotacionado corretamente");
    }

    @Test
    @DisplayName("Deve rotacionar array com elementos duplicados")
    void testRotateArray_DuplicateElements() {
      // Arrange
      Object[] array = { 1, 1, 2, 2, 3 };
      Object[] expected = { 3, 1, 1, 2, 2 };

      // Act
      Object[] result = App.rotateArray(array, 1);

      // Assert
      assertArrayEquals(expected, result, "Array com elementos duplicados deve ser rotacionado corretamente");
    }

    @Test
    @DisplayName("Deve rotacionar array com elementos null")
    void testRotateArray_ArrayWithNull() {
      // Arrange
      Object[] array = { "A", null, "C", "D" };
      Object[] expected = { "D", "A", null, "C" };

      // Act
      Object[] result = App.rotateArray(array, 1);

      // Assert
      assertArrayEquals(expected, result, "Array com null deve ser rotacionado corretamente");
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

    @Test
    @DisplayName("Ambas versões de rotateArray devem retornar o mesmo resultado para 1 passo")
    void testBothRotateArrayImplementationsReturnSameResult() {
      // Arrange
      Object[] array = { 1, 2, 3, 4, 5 };

      // Act
      Object[] result1 = App.rotateArray(array);
      Object[] result2 = App.rotateArray(array, 1);

      // Assert
      assertArrayEquals(result1, result2, "Ambas versões de rotateArray devem retornar o mesmo resultado para 1 passo");
    }
  }
}
