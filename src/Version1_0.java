import java.util.Scanner;

public class Version1_0 {
    public static void main(String[] args) {
        DictionaryCommandline dictionaryCommandline=new DictionaryCommandline();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tu: ");
        int word_count = sc.nextInt();
        Word[] word = new Word[word_count];
        dictionaryCommandline.dictionaryBasic(word_count,word);
    }
}
