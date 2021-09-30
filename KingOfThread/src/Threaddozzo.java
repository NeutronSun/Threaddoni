import java.math.*;

public class Threaddozzo implements Runnable{
    private Fermat fermano;
    private int a;
    private BigInteger n;
    private BigInteger end;

    public Threaddozzo(Fermat f, int a, BigInteger n, BigInteger end) {
        this.fermano = f;
        this.a = a;
        this.n = n;
        this.end = end;
    }

    /*
    [11][11][11]
    [13][13][13]
    [15][15][15]
    [17][17][15]
    */

    public void run() {

        for(BigInteger i = BigInteger.ZERO; i.min(end) == i; i = i.add(BigInteger.valueOf(1))){
            if(fermano.values[i.intValue()][0].equals(fermano.values[i.intValue()][1]) 
            && fermano.values[i.intValue()][1].equals(fermano.values[i.intValue()][2])){
                System.out.println(fermano.values[i.intValue()][1] + " è un god");
            }
            
        }
    }
}
