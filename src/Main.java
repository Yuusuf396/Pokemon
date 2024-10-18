public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        PokemonGame game=new PokemonGame("pika","water");
        System.out.println(game.simulate(2500));
        game.print();
    }
}