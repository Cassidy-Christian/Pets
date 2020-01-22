public class PetOwner{

    public PetOwner(Cat cat, Dog dog){
        this.cat = cat;
        this.dog = dog;
    }

    public boolean isHappy(){
        if (cat.isHappy() && dog.isHappy())
            return true;
        else
            return false;
    }
}