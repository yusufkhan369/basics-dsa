package timB.composition.c2;

public class Wall {
    private String direction;

    public Wall(String ws) {
    }

    public String direction(String direction){
        return this.direction=direction;
    }

    public String getDirection(){
        return direction;
    }
}
