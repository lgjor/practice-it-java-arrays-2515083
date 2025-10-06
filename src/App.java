import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    double[] lotteryNums = {10, 15, 48, 54, 77}; // new double[5];
    //System.out.println(lotteryNums[2]);
    lotteryNums[2] = 49;
    //System.out.println(lotteryNums[4]);

    // iterando o array a partir de índice zero até o último índice
    System.out.println();
    System.out.println("iterando o array a partir de zero até último índice");
    for (int i=0; i<lotteryNums.length; i++){
      System.out.println(lotteryNums[i]);
    }

    // iterando o array do índice maior para o menor
    System.out.println();
    System.out.println("Iterando o array do índice maior para o menor");
    for (int i=lotteryNums.length-1; i>=0; i--){
      System.out.println(lotteryNums[i]);
    }

    // iterando com o for each
    System.out.println();
    System.out.println("iterando com o for each");
    for (double number: lotteryNums){
      System.out.println(number);
    }

    // iterando com javastreams
    System.out.println();
    System.out.println("iterando com javastreams");
    Arrays.stream(lotteryNums).forEach(System.out::println);
    // Arrays.stream(lotteryNums).filter() -> filtrar elementos do array
    // Arrays.stream(lotteryNums).average() -> média dos itens do array
    // Arrays.stream(lotteryNums).sum(); -> soma os itens do array

  }
}