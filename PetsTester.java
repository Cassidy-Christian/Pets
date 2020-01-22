public class PetsTester{
    public static void main(String[] args){

        Cat scout = new Cat(true, true, false);
        Cat sammy = new Cat(true, false, false);

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