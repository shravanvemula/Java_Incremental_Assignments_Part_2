public class Unicycle implements Cycle {

    @Override
    public void cost(int cost) {
        System.out.println("Cost of Unicycle is Rs."+cost);
    }

    @Override
    public void averageSpeed(int speed) {
        System.out.println("Average Speed of Unicycle is "+speed+" Kmph");
    }

    @Override
    public void numberOfWheels() {
        System.out.println("Number of wheels for Unicycle is 1");
    }
}
