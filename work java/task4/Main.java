import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int k = 0;//счетчик слов
    String text = new String(); //текст
    String word = new String(); //слово для поиска
    String[] subText;
    Scanner in = new Scanner(System.in);
    System.out.print("Введите текст\n ");
    text = in.nextLine(); //ввод текста
    System.out.print("Введите слово\n "); 
    word = in.nextLine(); //ввод слова
    in.close();
    subText = text.split(" "); //разбиение текста на слова по пробелу
    for(int i = 0; i < subText.length; i++) { 
         if ((subText[i].equalsIgnoreCase(word)) || (subText[i].equalsIgnoreCase(word + ".")) || (subText[i].equalsIgnoreCase(word + "!")) || (subText[i].equalsIgnoreCase(word + "?")) || (subText[i].equalsIgnoreCase(word + "...")) || (subText[i].equalsIgnoreCase(word + ","))){ //проверка сходства каждого слова текста с нашим заданным словом, также учитывается постановка знака препинания после слова в тексте
           k++; //увеличение счетчика
         }
      }
    System.out.print("Количество таких слов - " + Integer.toString(k));//выврд результата
    
    
  }
}