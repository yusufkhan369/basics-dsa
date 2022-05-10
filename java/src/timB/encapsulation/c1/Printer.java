package timB.encapsulation.c1;

public class Printer {
    private int tonerlevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerlevel, boolean duplex) {
        if(tonerlevel>-1 && tonerlevel<=100){
            this.tonerlevel=tonerlevel;
        }else {
            this.tonerlevel=-1;
        }
        this.tonerlevel = tonerlevel;
        this.duplex = duplex;
        this.pagesPrinted=0;
    }

    public int addToner(int tonerAmt){
        if(tonerAmt>0 && tonerAmt <=100){
            if(tonerAmt+this.tonerlevel >100){
                return -1;
            }else {
                return tonerAmt+this.tonerlevel;
            }
        }else{
            return -1;
        }
    }
}
