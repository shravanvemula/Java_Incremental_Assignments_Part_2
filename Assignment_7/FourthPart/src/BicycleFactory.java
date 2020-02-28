public class BicycleFactory {
    public void buildBicycles(){
        Bicycle bicycle1=new Bicycle();
        bicycle1.cost(4000);
        bicycle1.averageSpeed(12);
        bicycle1.numberOfWheels();

        Bicycle bicycle2=new Bicycle();
        bicycle2.cost(4500);
        bicycle2.averageSpeed(14);
    }
}
