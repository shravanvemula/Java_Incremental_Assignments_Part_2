/**
 * Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method.
 * Create a class by implementing the new interface and also inheriting from a concrete class.
 * Now write four methods, each of which takes one of the four interfaces as an argument.
 * In main( ), create an object of your class and pass it to each of the methods.
 *
 * My three interfaces are IBatsmen,IBowler,IFielder and the fourth interface that  combines the three interfaces is IAllrounder.
 * My Concrete class is Scorecard that provides implementations for all the methods in the four interfaces .
 * My class that implements the fourth interface(IAllrounder) and the concrete class (Scorecard) is Statistics.
 * This class has four methods,each of which takes one of the four interfaces as an argument.
 * In main(), I have created object for Scorecard class and passed it to each of the methods.
 */


//Main class
public class Statistics extends Scorecard implements IAllrounder  {

    //method1
    public void calculateBatsmenStatistics(IBatsmen batsmen){
        System.out.println("Batsmen Statistics are");
        batsmen.numberOfRuns();
        batsmen.numberOfSixes();
    }
    //method2
    public void calculateBowlerStatistics(IBowler bowler){
        System.out.println("Bowler Statistics are");
        bowler.numberOfRunsConceded();
        bowler.numberOfWickets();
    }
    //method3
    public void calculateFielderStatistics(IFielder fielder){
        System.out.println("Fielder Statistics are");
        fielder.numberOfCatches();
        fielder.numberOfRunsStopped();
    }
    //method4
    public void calculateAllrounderStatistics(IAllrounder allrounder){
        System.out.println("Allrounder Statistics are");
        allrounder.numberOfFours();
        allrounder.numberOfCatches();
        allrounder.numberOfRuns();
        allrounder.numberOfRunsConceded();
        allrounder.numberOfSixes();
        allrounder.numberOfRunsStopped();
        allrounder.numberOfWickets();
    }

    public static void main(String args[]){
        Statistics statistics=new Statistics();
        Scorecard scorecard=new Scorecard();

        statistics.calculateBatsmenStatistics(scorecard);
        statistics.calculateBowlerStatistics(scorecard);
        statistics.calculateFielderStatistics(scorecard);
        statistics.calculateAllrounderStatistics(scorecard);
    }
}
