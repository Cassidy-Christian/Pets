public class Pet{
    private String name;
    private boolean hasBeenFed;
    private boolean hasBeenWalked;
    private boolean hasBeenPetted;
    private String name;  

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void feed(){
        this.hasBeenFed = true;
    }
    public void walk(){
        this.hasBeenWalked = true;
    }
    public void pet(){
        this.hasBeenPetted = true;
    }