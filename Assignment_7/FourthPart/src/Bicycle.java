public class Bicycle implements Cycle {

    @Override
    public void cost(int cost) {
        System.out.println("Cost of Bicycle is Rs."+cost);
    }

    @Override
    public void averageSpeed(int speed) {
        System.out.println("Average Speed of Bicycle is "+speed+" Kmph");
    }

    @Override
    public void numberOfWheels() {
        System.out.println("Number of wheels for Bicycle are 2");
    }
}
