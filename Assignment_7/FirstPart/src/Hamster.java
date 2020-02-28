public class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamsters are rodents belonging to the subfamily Cricetinae, which contains 18 species classified in seven genera.");
    }

    @Override
    public void eat(){
        System.out.println("Hamster is eating");
    }
    @Override
    public void run(){
        System.out.println("Hamster is running");
    }
    @Override
    public void jump(){
        System.out.println("Hamster is jumping");
    }

}
