/**
 * Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression
 * that checks a sentence to see that it begins with a capital letter and ends with a period.
 *
 * This class takes input from the in main() and checks whether the sentence start with a capital letter
 * and ends with a period using isMatches() method.
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatcher {

    public boolean isMatches(String sentence){
        Pattern pattern=Pattern.compile("^[A-Z].*[.]$");
        Matcher m= pattern.matcher(sentence);
        boolean result=m.matches();
        return result;

    }


    public static void main(String args[]) {
       PatternMatcher patternMatcher=new PatternMatcher();
        Scanner scanner=new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter the sentence:");
        String sentence=scanner.next();

        if(patternMatcher.isMatches(sentence)){
            System.out.println("\""+sentence+"\" starts with a capital letter and ends with a period");
        }
       else{
            System.out.println("\""+sentence+"\" does not match the regular expression");
        }


    }



}
