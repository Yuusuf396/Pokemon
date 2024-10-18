public class PokemonGame {
    private String name,type;
    private int level,experience;
    private boolean isFanted ;
    private Move[] moves;
//    int level,int experience,boolean isFanted

    public PokemonGame(String name,String type){
        this.name=name;
        this.type=type;
        this.level=1;

        this.experience=0;
        this.isFanted=false;

    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getLevel(){
        return this.level;
    }
    public int getExperience(){
        return this.experience;
    }
    public boolean getIsFainted(){
        return this.isFanted;
    }
    public boolean ISFainted(){
        return this.isFanted;

    }
    public void levelUp(int increase){
        if (this.level+increase<=100){
            this.level+= increase;

        }else{
            this.level=100;

        }
    }
    public void revive(){
        this.isFanted=false;
    }
    public boolean simulate(int exp){

        this.experience+=exp;
        return checkForLevelUp();


    }
    public void print(){
        System.out.print("level : "+this.level+"exp points : " +this.experience);
    }
    public boolean checkForLevelUp( ){

        if(this.experience>=1000){

                int num=this.experience/1000;

                this.level+=num;
                this.experience=this.experience%1000;

                return true;

        }
        return false;
    }
    public void faint(){
        this.isFanted=true;
    }

}
