package Module2SD1;

public class Main implements CONSTANTS {
    public static void main(String[] args) {
        WebSaver.writePageToFile(); // Step 1
        StringCleaner.cleanTheString(); // Step 2
        WordCounter.countTheWords(); // Step 3
    }
}