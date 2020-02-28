public class Bicycle extends Cycle{

    @Override
    public void cost(){
        System.out.println("Bicycle's cost is Rs.4000");
    }
    @Override
    public void averageSpeed(){
        System.out.println("Average speed of Bicycle is 12 Kmph");
    }

    public void balance(){
        System.out.println("Bicycle should be balanced");
    }


}
