// Sem pacote - classe no diretório raiz

import java.util.Arrays;

public class App {

  public static void rightTriangleOfAnArray(Object[] array) {
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col <= row; col++) {
        System.out.print(array[col]);
      }
      System.out.println();
    }
    System.out.println();
  }

  /**
   * Find the second smallest number in an array
   * 
   * @param array
   * @return Double
   */
  public static Double findSecondSmallest2(double[] array) {
    if (array.length <= 1) {
      return null; //
    }
    Arrays.sort(array); // ordeno o array

    // Verifico se há dois elementos diferentes em sequência, se não hover, não há
    // segundo menor número.
    // Mas, se houver e o array estiver ordenado, então o segundo menor será o
    // segundo entre os 2 diferentes.
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] != array[i + 1]) {
        return array[i + 1];
      }
    }
    return null;
  }

  /**
   * Find the second smallest number in an array
   * Implementação mais eficiente
   * 
   * @param array
   * @return Double
   */
  public static Double findSecondSmallest(double[] array) {
    double smallest = Double.MAX_VALUE;
    double secondSmallest = Double.MAX_VALUE;

    // iteramos o array definindo o menor e segundo menor elemento
    for (int i = 0; i < array.length; i++) {
      double current = array[i];
      if (current < smallest) {
        secondSmallest = smallest;
        smallest = current;
      } else if (current < secondSmallest && current != smallest) {
        secondSmallest = current;
      }
    }
    // Caso o segundo menor não tenha sido definido, retornamos null
    if (secondSmallest == Double.MAX_VALUE) {
      return null;
    }

    return secondSmallest;
  }

  public static void main(String[] args) {
    double[] lotteryNums = { 99, 10, 98, 10, 15, 15, 48, 54, 77 }; // new double[n elements];
    Integer[] array = { 1, 2, 3, 4, 5 };
    // System.out.println(lotteryNums[2]);
    lotteryNums[2] = 49;
    // System.out.println(lotteryNums[4]);

    // iterando o array a partir de índice zero até o último índice
    System.out.println();
    System.out.println("iterando o array a partir de zero até último índice");
    for (int i = 0; i < lotteryNums.length; i++) {
      System.out.println(lotteryNums[i]);
    }

    // iterando o array do índice maior para o menor
    System.out.println();
    System.out.println("Iterando o array do índice maior para o menor");
    for (int i = lotteryNums.length - 1; i >= 0; i--) {
      System.out.println(lotteryNums[i]);
    }

    // iterando com o for each
    System.out.println();
    System.out.println("iterando com o for each");
    for (double number : lotteryNums) {
      System.out.println(number);
    }

    // iterando com javastreams
    System.out.println();
    System.out.println("iterando com javastreams");
    Arrays.stream(lotteryNums).forEach(System.out::println);
    // Arrays.stream(lotteryNums).filter() -> filtrar elementos do array
    // Arrays.stream(lotteryNums).average() -> média dos itens do array
    // Arrays.stream(lotteryNums).sum(); -> soma os itens do array

    // Print the second smallest number of the array
    System.out.println();
    System.out.println("Print the second smallest number of the array");
    System.out.println(findSecondSmallest(lotteryNums));

    // Print a right triangle of an array
    System.out.println();
    System.out.println("Print a right triangle of an array");
    rightTriangleOfAnArray(array);
  }
}
