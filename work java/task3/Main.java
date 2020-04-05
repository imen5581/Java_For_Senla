import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    String text = new String(); //наш текст
    String[] subText; //для разбиения текста на слова
    int kWords; //количество слов
    Scanner in = new Scanner(System.in);
    System.out.println("Введите текст: ");
    text = in.nextLine();
    in.close();
    subText = text.split(" ");//разбиваем текст на слова
    kWords = subText.length; //считаем количество слов
    System.out.println("Слова с заглавной буквы в отсортированном порядке:");
    Arrays.sort(subText); //сортируем массив со словами
    for (int i = 0;i<subText.length;i++){
      subText[i] = subText[i].substring(0,1).toUpperCase() + subText[i].substring(1,subText[i].length()); //делаем каждое слово с заглавной буквы
      System.out.println(subText[i]); //выводим слово
    }
    System.out.print("Всего слов: ");
    System.out.println(kWords); //выводим количество слов
    

  }
}