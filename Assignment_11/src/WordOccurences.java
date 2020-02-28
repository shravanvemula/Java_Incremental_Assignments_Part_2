import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
/**
 * This class has a method calculate() that calculates occurences of each and every character including numbers,alphabets,
 * and the punctuations ',.:;!@"()[]{} except whitespace, I have included all characters as mentioned in the question
 * It stores all the characters and the counts in a hashmap returns it.
 * This method reads the file line to line using BufferedReader and FileReader.
 */
public class WordOccurences
{
    public HashMap<Character,Integer> calculate(File file) throws IOException {
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        HashMap<Character,Integer> charAndCount=new HashMap<Character,Integer>();
        String line="";
        while((line=br.readLine())!=null){
            for(int i=0;i<line.length();i++){
                char currentLetter=line.charAt(i);
                if(line.charAt(i)!=' ') {
                    if (!charAndCount.containsKey(currentLetter)) {
                        charAndCount.put(currentLetter, 1);
                    } else {
                        charAndCount.put(currentLetter, charAndCount.get(currentLetter) + 1);
                    }
                }
            }
        }

        return charAndCount;
    }
}
