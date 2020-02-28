/**
 * 2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 * Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
 * Create instances of all three types and upcast them to an array of Cycle.
 * Try to call balance( ) on each element of the array and observe the results.
 * Downcast and call balance( ) and observe what happens.
 */
public class CycleHierarchy {
    public static void main(String args[]){

        Bicycle bicycle=new Bicycle();
        Unicycle unicycle=new Unicycle();
        Tricycle tricycle=new Tricycle();
        //UPCASTING
        Cycle[] cycles=new Cycle[3];
        //Upcasting means casting to a supertype
        cycles[0]=(Cycle)bicycle;
        cycles[1]=(Cycle)unicycle;
        cycles[2]=(Cycle)tricycle;

        for(int i=0;i<3;i++){
            cycles[i].cost();
            cycles[i].averageSpeed();
            /*
             *  java: cannot find symbol
             *  symbol:   method balance()
             *  location: class Cycle
             *
             * The below statement gives above error because Cycle class do not have balance() method.
             *
             */
          // cycles[i].balance();

        }

        //DOWNCASTING

        Cycle cycle1=new Bicycle();
        Cycle cycle2=new Unicycle();
        Cycle cycle3=new Tricycle();

        //Downcasting is casting to a subtype.
        Bicycle bicycle1=(Bicycle) cycle1;
        Unicycle unicycle1=(Unicycle) cycle2;
        Tricycle tricycle1=(Tricycle) cycle3;

        bicycle1.cost();
        bicycle1.averageSpeed();
        bicycle1.balance();

        unicycle1.cost();
        unicycle1.averageSpeed();
        unicycle1.balance();


        tricycle1.cost();
        tricycle1.averageSpeed();

        /*
         * Error:java: cannot find symbol
         * symbol:   method balance()
         *  location: variable tricycle1 of type Tricycle
         * The below statement gives above error because TriCycle class do not have balance() method.
         *
         */
        //tricycle1.balance();


    }



}
