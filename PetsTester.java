public class PetsTester{
    public static void main(String[] args){

        Cat scout = new Cat(true, false, false);
        Dog spot = new Dog(true, true, false); 
        PetOwner cassidy = new PetOwner(scout, spot);

        if (spot.isHappy())
            System.out.println("Woof!");
        else 
            System.out.println("woof");

        if (scout.isHappy())
            System.out.println("meow");
        else 
            System.out.println("hiss");

        if (cassidy.isHappy())
            System.out.println("yeet");
        else 
            System.out.println("sad boi hours :(");

        scout.petCat();
        spot.petDog();

        if (spot.isHappy())
        System.out.println("Woof!");
        else 
            System.out.println("woof");

        if (scout.isHappy())
            System.out.println("meow");
        else 
            System.out.println("hiss");

        if (cassidy.isHappy())
            System.out.println("yeet");
        else 
            System.out.println("sad boi hours :(");
    }
}