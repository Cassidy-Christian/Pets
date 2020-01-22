public class Pet{
    private boolean fed; 
    private boolean walked; 
    private boolean petted;
    private String name;  

    public Pet(String name ){
        this.name=name; 
    }

    public boolean isHappy(){
        if(fed && walked && petted){
            return true; }
        else{
            return false; 
    
        }
    
    public boolean getFed(){
        return fed; 
    }
    public boolean getWalked(){
        return walked; 
    }   
    public boolean getPetted(){
        return petted; 
    }
    public void petDog(){
        petted =true ; 
    }
    public void walkDog(){
        walked= true; 
    }
    public void fedDog(){
        fed= true; 
    }


    }
}