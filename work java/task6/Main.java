import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int w; //максимальный вес
    int k; //количество вещей
    
    Scanner in = new Scanner(System.in);
    System.out.print("Введите вместимость рюкзака: ");
    w = in.nextInt(); 
    System.out.print("Введите количество предметов: ");
    k = in.nextInt();
    int[] weights = new int[k]; //массив с весами предметов
    int[] prices = new int[k]; //массив с ценами предметов
    for(int i = 0;i<k;i++){
      System.out.print("Введите вес для предмета " + Integer.toString(i+1) + ": ");
      weights[i] = in.nextInt();
      System.out.print("Введите цену для предмета " + Integer.toString(i+1) + ":");
      prices[i] = in.nextInt();
    } //ввод весов и цен
    
    backpack(weights,prices,w); //вызов функции. 
    
    in.close();
  }
  static void backpack(int weights[], int costs[], int maxWeight) {
    int n = weights.length;
    int dp[][] = new int[maxWeight + 1][n + 1]; //массив, содержащий максимальную стоимость предметов, которые можно уложить в рюкзак массы n, если можно использовать только первые i предметов.
    for (int j = 1; j <= n; j++) {
        for (int w = 1; w <= maxWeight; w++) {
            if (weights[j-1] <= w) { //проверка на соответствие весу
             
              dp[w][j] = Math.max(dp[w][j - 1], dp[w - weights[j-1]][j - 1] + costs[j-1]); //выбор следующего предмета
                
                
            } else {
                
                dp[w][j] = dp[w][j - 1]; //если вес нас не устраивает
            }
        }
    }
     System.out.print("Вам нужно положить предметы: ");
    int k = maxWeight;
    for(int i=n;i>=1;i--){ //находим предметы, которые мы положили в рюкзак
        if (dp[k][i] != dp[k][i-1]){
          
          k = k - weights[i-1]; //уменьшаем наш вес на вес найденного предмета
          System.out.print(i); //выводим предмет
          System.out.print(" ");
        }
    }
    System.out.println("");
    System.out.print("Ценность груза: ");
    System.out.print(dp[maxWeight][n]);//выводим ценность
    

    
}
}