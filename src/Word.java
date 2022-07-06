import java.util.Scanner;

public class Word {
    private String word_target;  // từ mới
    private String word_explain; // giải nghĩa

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
}

class Dictionary {


}

class DictionaryManagement {

    public void insertFromCommandline(int word_count) {
        Scanner sc = new Scanner(System.in);
        Word[] word = new Word[word_count];
        for (int i = 0; i < word_count; i++) {
            System.out.println("Nhap tu moi:    ");
            String new_word = sc.nextLine();
            word[i].setWord_target(new_word);
            System.out.println("Nhap nghia: ");
            String mean_of_word = sc.nextLine();
            word[i].setWord_explain(mean_of_word);
        }

    }
}

class DictionaryCommandline {
    public void showAllWords(Word[] words) {
        for (Word word:words) {
            System.out.println(word.getWord_target());
            System.out.println(word.getWord_explain());
        }
    }
    public void dictionaryBasic(int word_count,Word[] words){
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        dictionaryManagement.insertFromCommandline(word_count);
        showAllWords(words);
    }

}