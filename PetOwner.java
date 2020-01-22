public class PetOwner{

private Cat cat;
private Dog dog;

    public PetOwner(Cat cat, Dog dog){
        this.cat = cat;
        this.dog = dog;
    }

    public boolean isHappy(){
        return cat.isHappy() && dog.isHappy();
    }
}