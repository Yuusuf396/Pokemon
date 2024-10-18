public class PokemonTeam {
    private PokemonGame[] list ;
    private int size;
    public PokemonTeam(){
        this.list=new PokemonGame[6];
        this.size=0;

    }
     int levelTeam(int add){
        int num = 0;
        for(int i=0;i<= this.list.length;i++){
            boolean curr=this.list[i].simulate(add);
            if (curr){
                num++;
            }

        }
        return num;
    }
}
