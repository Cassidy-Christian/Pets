public class Pet{
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