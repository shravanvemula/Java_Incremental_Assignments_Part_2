import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
/**
 * This class writes hashmap's keys and values into the output file using BufferedWriter object which
 * is initialized using its constructor.
 */
public class ResultWriter {
    private BufferedWriter bw;
    ResultWriter(BufferedWriter bwr){
        this.bw=bwr;
    }
    void writingToFile(HashMap<Character,Integer> charAndCounts) throws IOException {
        for(Character key:charAndCounts.keySet()){
            String currentCharacterCount=Integer.toString(charAndCounts.get(key));
            String currentLine= "\" "+key + " \" has occurred " + currentCharacterCount +" times.";
            bw.write(currentLine+"\n");
        }
        bw.close();

    }
}
