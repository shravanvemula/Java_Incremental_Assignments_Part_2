/**
 * Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods
 * that are common to all Rodents, and override these in the derived classes to perform different behaviors
 * depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types
 * of Rodents, and call your base-class methods to see what happens. Make the methods of Rodent abstract
 * whenever possible and all classes should have default constructors that print a message about that class.
 */

public class RodentsHirerarchy {
    public static void main(String args[]) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[0].eat();
        rodents[0].run();
        rodents[0].jump();

        rodents[1] = new Gerbil();
        rodents[1].eat();
        rodents[1].run();
        rodents[1].jump();

        rodents[2] = new Hamster();
        rodents[2].eat();
        rodents[2].run();
        rodents[2].jump();

    }

}
