public class TricycleFactory {
    public void buildTricycles(){
        Tricycle tricycle1=new Tricycle();
        tricycle1.cost(5000);
        tricycle1.averageSpeed(8);
        tricycle1.numberOfWheels();

        Tricycle tricycle2=new Tricycle();
        tricycle2.cost(5500);
        tricycle2.averageSpeed(15);
    }
}
