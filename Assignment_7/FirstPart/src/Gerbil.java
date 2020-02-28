public class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("A gerbil is a small mammal of the subfamily Gerbillinae in the order Rodentia. Once known as desert rats");
    }

    @Override
    public void eat(){
        System.out.println("Gerbil is eating");
    }
    @Override
    public void run(){
        System.out.println("Gerbil is running");
    }
    @Override
    public void jump(){
        System.out.println("Gerbil is jumping");
    }
}

