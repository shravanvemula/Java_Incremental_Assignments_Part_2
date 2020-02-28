import java.util.ArrayList;

/**
 * Create three new types of exceptions. Write a class with a method that throws all three.
 * In main( ), call the method but only use a single catch clause that will catch all
 * three types of exceptions. Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
 */
public class Employee {
    ArrayList<String> employeeNames;
    ArrayList<String> employeeIDs;
    ArrayList<String> employeeAddress;

    public void employeeDetails(){
       //If the Arraylist initialization is commented,it throws a Null Pointer Exception and this exception is also caught in the main()
        employeeNames=new ArrayList<String>();
        employeeNames.add("John");
        employeeNames.add("Jack");

        employeeIDs=new ArrayList<String>();
        employeeIDs.add("123");
        employeeIDs.add("456");

        employeeAddress=new ArrayList<String>();
        employeeAddress.add("Hyderabad");
        employeeAddress.add("Delhi");

    }
    public void findEmployee(String name,String ID,String address) throws EmployeeAddressNotFoundException,EmployeeNameNotFoundException,EmployeeIDNotFoundException
    {

        if(employeeNames.contains(name)){
            System.out.println(name+" found");
        }
        else
        {
            throw new EmployeeNameNotFoundException("Name "+name+" Not Found");

        }

        if(employeeIDs.contains(ID)){
            System.out.println(ID+" Found");
        }
        else
        {
            throw new EmployeeIDNotFoundException("ID "+ID+" Not Found");

        }


        if(employeeAddress.contains(address)){
            System.out.println(address+" Found");
        }
        else
        {
            throw new EmployeeAddressNotFoundException("Address "+address+" Not Found");

        }
    }

    public static void main(String args[]){
        Employee employee=new Employee();


        try{
            employee.employeeDetails();
            employee.findEmployee("John","146","Kolkata");
        }
        catch(Exception e){
            System.err.println(e);
        }
        finally {
            System.out.println("finally is executed");
        }
    }

}
