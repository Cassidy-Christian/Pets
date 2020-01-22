public class Cat{

    private boolean fed;
    private boolean walked;
    private boolean petted;

    public Cat(boolean fed, boolean walked, boolean petted){
        this.fed = fed;
        this.walked = walked;
        this.petted = petted;
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
    public void feedCat(){
        fed = true;
    }
    public void walkCat(){
        walked = true;
    }
    public void petCat(){
        petted = true;
    }

    public boolean isHappy(){
        if (fed && !walked && !petted)
            return true;
        else
            return false;
    }
}