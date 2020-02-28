public class Mouse extends Rodent {
   Mouse(){
        System.out.println("A mouse, plural mice, is a small rodent characteristically having a pointed snout," +
                " small rounded ears, a body-length scaly tail, and a high breeding rate. ");
   }

    @Override
   public void eat(){
        System.out.println("Mouse is eating");
    }
    @Override
   public void run(){
        System.out.println("Mouse is running");
    }
    @Override
    public void jump(){
        System.out.println("Mouse is jumping");
    }
}
