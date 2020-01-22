Public class Dog{

    private boolean fed; 
    private boolean walked; 
    private boolean petted; 

   public Dog(boolean fed, boolean walked, boolean petted){
       this.fed=fed; 
       this.walked=walked; 
       this.petted=petted; 
   } 

    public boolean isHappy(){
        if(fed && walked && petted){
            return true; 
        else{
            return false; 
        }
        }
    }
}