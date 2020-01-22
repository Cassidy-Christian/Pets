public class Dog extends Pet{

    public Dog(String name){
        super(name); 
    }

    public boolean isHappy(){
        return hasBeenFed() && hasBeenWalked() && hasBeenPetted();
    }

    public String talk(){
        return isHappy() ? "woof :)" : "woof :(";
    }
}