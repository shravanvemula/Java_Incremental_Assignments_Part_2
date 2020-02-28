public class SecondClass {

    SecondClass(){
        System.out.println("This is my Second class");
    }
    public  class SecondInnerClass extends FirstClass.FirstInnerClass {
        SecondInnerClass() {
            new FirstClass().super("First Inner Class");
            System.out.println("This is my Second Inner Class");
        }
    }
}
