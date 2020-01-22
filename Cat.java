public class Cat extends Pet {

    public Cat(String name){
        super(name);
    }

    public boolean isHappy(){
        return hasBeenFed() && !hasBeenWalked() && !hasBeenPetted();
    }

    public String talk(){
        return isHappy() ? "meow" : "hiss";
    }