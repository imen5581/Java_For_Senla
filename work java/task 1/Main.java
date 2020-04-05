import java.util.Scanner;
class Main {
  static int k = 2; //переменная для проверки на простое число
  static String sost = new String(); //переменная для результата проверки на простое число
  static String chet = new String(); //переменная для результата проверки на четность
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      float innum;
      int num; //объявление переменных
      int true_ = 1;// для while
      while (true_==1){
        System.out.print("Введите число: ");
        innum = in.nextFloat(); //ввод числа с консоли
        if (innum == (int)innum){ //проверка на целое число
        num = (int)innum;
        ifChet(num); //проверка на четность
        ifSimple(num); //проверка на простое число
        k = 2; 
        
        System.out.print("Введенное число " + chet + " " + sost +"\n"); //вывод результата
        chet = "";
        sost = "";
      }
      else{
        System.out.print("Введено неверное число\n"); //если число не целое
      }
      }
      in.close();

      
      
  }
  private static void ifChet(int n){ //проверка на четность
    if (n % 2 == 0){
          chet = "четное";
        }
        else{
          chet = "нечетное";
        }
  }
  private static void ifSimple(int n) {//проверка на простое число
    
    if (n > 1) {
        if (n % k != 0) {
            k++;
            ifSimple(n);
        } else if (n % k == 0) {
            if (k == n){ //если последний делитель - само число
              sost = "и простое";
            }
            else{ //если нашелся лишний делитель
              sost = "и составное";
            }
        }
    }
    if (n==1){ //если входное число - единица
      sost = "и простое";
    }
}
}