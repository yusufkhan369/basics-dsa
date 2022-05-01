package timB.constructors.c1;

public class C3 {
    private int x;
    private int y;
    private int height;
    private int width;

    public C3(){
        this(0,0);
    }

    public C3(int width, int height) {
        this(0,0,width,height);
    }

    public C3(int x, int y, int width, int height) {
        this.x=x;
        this.y=y;
        this.height=height;
        this.width=width;
    }
}
