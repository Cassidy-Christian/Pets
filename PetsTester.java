public class PetsTester{
    public static void main(String[] args){

        Cat scout = new Cat(true, true, false);
        Cat sammy = new Cat(true, false, false);

        Dog spot = new Dog(true, true, true); 

        if (spot.isHappy())
            System.out.println("Woof!");
        else 
            System.out.println("woof");


        if (scout.isHappy())
            System.out.println("meow");
        else 
            System.out.println("hiss");

        if (sammy.isHappy())
            System.out.println("meow");
        else 
            System.out.println("hiss");

    }
}