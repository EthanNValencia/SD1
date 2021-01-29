package Module2SD1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class WordCounter implements CONSTANTS{
    public static void countTheWords(){
        ArrayList<Word> arrayList = new ArrayList<Word>();

        File file = new File(normalizedDirectory);
        try(Scanner sc = new Scanner(new FileInputStream(file))){
            int count=0;
            while(sc.hasNext()){ // While there is a next word
                Word nextWord = new Word(sc.next());
                if(arrayList.contains(nextWord)) {
                    arrayList.get(arrayList.indexOf(nextWord)).addWordCount();
                } else {
                    nextWord.addWordCount();
                    arrayList.add(nextWord);
                }
                count++;
            }
            System.out.println("Number of words: " + count);
            //System.out.println(arrayList.toString());

            Collections.sort(arrayList, new Comparator<Word>() {
                @Override
                public int compare(Word o1, Word o2) {
                    return Integer.valueOf(o2.getWordCount()).compareTo(o1.getWordCount());
                }
            });

            System.out.println(arrayList.toString());
            WriteToFile.writeThisToFile(wordReportDirectory, arrayList.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
