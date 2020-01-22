public class Iguana extends Pet {

    public Iguana(String name){
        super(name);
    }

    public boolean isHappy(){
        return hasBeenFed() && hasBeenWalked() && !hasBeenPetted();
    }

    public String talk(){
        return isHappy() ? "schhhlurp" : "ggghhhhhrrggghhh";
    }
}