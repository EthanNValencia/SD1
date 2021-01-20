package Module2SD1;

import java.util.Objects;

public class Word {
    private String wordName;
    private int wordCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return wordName.equals(word.wordName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordName);
    }

    @Override
    public String toString() {
        return "\n" + "Word{" +
                "wordName='" + wordName + '\'' +
                ", wordCount=" + wordCount +
                '}';
    }

    public Word(String wordName) {
        this.wordName = wordName;
    }

    public void addWordCount(){
        this.wordCount++;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
}
