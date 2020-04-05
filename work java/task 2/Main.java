import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int nod;
    int nok;
    float ina;
    float inb;
    int a;
    int b;
    int true_ = 1;//объявление переменных
      while (true_==1){
    System.out.print("Введите первое число: ");
    ina = in.nextFloat();//ввод первого числа
    if (ina==(int)ina){
      System.out.print("Введите второе число: "); //ввод второго числа
      inb = in.nextFloat();
      if (inb==(int)inb){
        a = (int)ina;
        b = (int)inb;
        nod = findNOD(a,b); //находим НОД
        nok = findNOK(a,b);//находим НОК
        System.out.print("НОД - " + Integer.toString(nod) + "; НОК - " + Integer.toString(nok) + "\n"); //вывод результата

      } else{ //если второе число введено неверно
      System.out.print("Введено неверное число\n ");
    }
    }
    else{ //если первое число введено неверно
      System.out.print("Введено неверное число\n ");
    }
      }
    in.close();
  }

  static int findNOD(int x,int y){
	return y == 0 ? x : findNOD(y,x % y);		
}
  static int findNOK(int x,int y){
	return (x*y) / findNOD(x,y);
}
}