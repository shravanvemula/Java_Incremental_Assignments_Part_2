import java.util.Scanner;

public class SListDriver {
    public void printOptions(){
        System.out.println("Options are:\n1.Insert\n2.Remove\n3.Display\n4.Exit");
    }
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        SList<String> myList=new SList<String>();

        SListIterator<String> iterator=myList.iterator();

        SListDriver driver=new SListDriver();

        driver.printOptions();
        System.out.println("Enter your option:");
        int option=scanner.nextInt();

        while(option!=4){

            if(option==1){
                System.out.print("Enter the name to add:");
                String value=scanner.next();
                iterator.insert(value);
            }
            else if(option==2){
                iterator.remove();
            }
            else if(option==3)
            {

                System.out.println(myList);   //using toString()

            }
            driver.printOptions();
            System.out.println("Enter your option:");
            option=scanner.nextInt();

            }


    }
}

