package timB.polymorphism;

class Movie{
    private String name;

    public String getName() {
        return name;
    }

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here.";
    }
}class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats a lot of people.";
    }
}class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence");
    }

    @Override
    public String plot() {
        return "Aliens attempt to takeover planet earth.";
    }
}class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}class StarWars extends Movie{
    public StarWars() {
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe.";
    }
}class ForgettableMovie extends Movie{
    public ForgettableMovie() {
        super("Forgettable");
    }

}

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<11; i++){
            Movie m = RandomMovie();
            System.out.println(m.getName());
            System.out.println(m.plot());
        }
    }

    public static Movie RandomMovie(){
        int randomNumber = (int) (Math.random()*5)+1;
        System.out.println(randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }
        return null;
    }
}
