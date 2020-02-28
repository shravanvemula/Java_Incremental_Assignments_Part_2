import java.util.*;
import java.io.*;
/**
 * This class takes in a command line argument of input file and creates objects for WordOccurences and ResultWriter
 * and calls their methods and writes output to output.txt
 */
public class Counter{

    public static void main(String[] args) throws IOException{
        File file=new File(args[0]);
        WordOccurences obj=new WordOccurences();
        HashMap<Character,Integer> charAndCount=obj.calculate(file);
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        ResultWriter rw=new ResultWriter(bw);
        rw.writingToFile(charAndCount);
    }
}