public class Pet{
<<<<<<< HEAD
    private String name;
    private boolean hasBeenFed;
    private boolean hasBeenWalked;
    private boolean hasBeenPetted;

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
=======
    private boolean hasBeenFed; 
    private boolean hasBeenWalked; 
    private boolean hasBeenPetted;
    private String name;  

    public Pet(String name){
        this.name = name; 
    }
    public void pet(){
        hasBeenPetted = true ; 
    }
    public void walk(){
        hasBeenWalked = true; 
    }
    public void feed(){
        hasBeenFed = true; 
    }
}
>>>>>>> 15f87faec2badbfd59517e0644ff80ff298ce0a3
