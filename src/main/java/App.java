// Sem pacote - classe no diretório raiz

import java.util.Arrays;

public class App {


  /**
  * Reverse an array in place
  *
  */
  public static void reverse(int[] arr){
    if (arr.length<=1){
      System.out.println(arr);
      return;
    }
    int firstPartLength = arr.length/2;
    for (int i=0; i<firstPartLength; i++){
      int temp = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-1-i]=temp;
    }
    System.out.println(Arrays.toString(arr));
  }

  /**
  * Move all the zeros to the end of the array improved version
  *
  */
  public static void moveZerosToTheEndImproved(int[] arr){
      int count = 0;
      if (arr.length != 0) {
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0) {
              arr[count] = arr[i];
              count++;
            }
        }
        while (count <arr.length){
          arr[count]=0;
          count++;
        }
      }
    System.out.println("Modified array: " + Arrays.toString(arr));
  }


  /**
  * Move all the zeros to the end of the array
  *
  */
  public static void moveZerosToTheEnd(int[] arr){
    if (arr.length != 0) {
      for (int i=0; i<arr.length; i++){
        if (arr[i]==0){
          for (int j=i; j<arr.length; j++){
            if (arr[j]!=0){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              break;
            }
          }
        }
      }
      System.out.println("Modified array: " + Arrays.toString(arr));
    }
  }
  /**
   * Rotate an array to the right
   * 
   * @param array Object[]
   * @return array Object[] rotated
   */
  public static Object[] rotateArray(Object[] array) {
    if (array == null || array.length == 0) {
      return array;
    }
    Object[] result = new Object[array.length];

    for (int i = 0; i < array.length; i++) {
      result[(i + 1) % result.length] = array[i];
    }
    return result;
  }

  /**
   * Rotate an array to the right steps times
   * 
   * @param array Object[]
   * @param steps int
   * @return array Object[] rotated
   */
  public static Object[] rotateArray(Object[] array, int steps) {
    if (array == null || array.length == 0) {
      return array;
    }

    // Normalizar steps para evitar rotações desnecessárias
    steps = steps % array.length;
    if (steps < 0) {
      steps += array.length;
    }

    if (steps == 0) { // Sem rotação
      return array.clone(); // Retorna uma cópia do array original
    }

    Object[] result = new Object[array.length];

    // Com rotação
    for (int i = 0; i < array.length; i++) {
      result[(i + steps) % array.length] = array[i];
    }

    return result;
  }

  /**
   * Print a right triangle of an array
   *
   * @param array
   */
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
    Object[] arrayReferenceType = { 1, 2, 3, 4, 5 };
    int[] arr = {1, 2, 9, 8, 4};
    int[] arr2 = {1, 2, 0, 0, 1, 0};
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

    // Rotate an array to the right
    System.out.println();
    System.out.println("Rotate an array to the right");

    arrayReferenceType = rotateArray(arrayReferenceType, 1);
    System.out.println("Rotate an array to the right: " + Arrays.toString(arrayReferenceType));

    arrayReferenceType = rotateArray(arrayReferenceType, 1);
    System.out.println("Rotate an array to the right: " + Arrays.toString(arrayReferenceType));

    arrayReferenceType = rotateArray(arrayReferenceType, 1);
    System.out.println("Rotate an array to the right: " + Arrays.toString(arrayReferenceType));

    // Rotate an array to the right improved version
    System.out.println();
    System.out.println("Rotate an array to the right improved version");
    arrayReferenceType = rotateArray(arrayReferenceType);
    System.out.println("Rotate an array to the right: " + Arrays.toString(arrayReferenceType));

    arrayReferenceType = rotateArray(arrayReferenceType);
    System.out.println("Rotate an array to the right: " + Arrays.toString(arrayReferenceType));

    arrayReferenceType = rotateArray(arrayReferenceType);
    System.out.println("Rotate an array to the right: " + Arrays.toString(arrayReferenceType));

    arrayReferenceType = rotateArray(arrayReferenceType);
    System.out.println("Rotate an array to the right: " + Arrays.toString(arrayReferenceType));

    // Move Zeros To The End
    System.out.println("Move Zeros To The End");
    System.out.println("Original array: "+ Arrays.toString(arr));
    moveZerosToTheEnd(arr);

    // Move Zeros To The End
    System.out.println("Move Zeros To The End");
    System.out.println("Original array: "+ Arrays.toString(arr2));
    moveZerosToTheEndImproved(arr2);

    // Reverse the array
    System.out.println();
    System.out.println("Reverse the array");
    System.out.println("Original array: "+ Arrays.toString(arr));
    reverse(arr);

  }
}
