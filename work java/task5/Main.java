import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число: ");
    n = in.nextInt();
    in.close();
    for(int i = 0; i <= n; i++) { 
       String iS = new StringBuffer(Integer.toString(i)).reverse().toString(); //создание строки iS, в которую помещается переведенное в строку и перевернутое число i.
       if (i == Integer.parseInt(iS)){ //сравнение числа i и строки iS, переведенной в число.
         System.out.print(Integer.toString(i) + "\n");//вывод результата
       }
      }
  }
}