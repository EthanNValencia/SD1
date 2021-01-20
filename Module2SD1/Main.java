package Module2SD1;

public class Main implements CONSTANTS {
    public static void main(String[] args) {
        WebSaver.writePageToFile();
        StringCleaner.cleanTheString();
        WordCounter.countTheWords();
    }
}