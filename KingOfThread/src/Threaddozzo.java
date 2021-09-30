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
    [337][317][15] 3 3 3
    [341][331][17] 3 4 4
    [347][349][19] 4 5 5
    [23][349][21]
    */

    public void run() {

        for(BigInteger i = BigInteger.ZERO; i.min(end) == i; i = i.add(BigInteger.valueOf(1))){
            if(fermano.values[i.intValue()][0].equals(fermano.values[i.intValue()][1]) 
            && fermano.values[i.intValue()][1].equals(fermano.values[i.intValue()][2])){
                System.out.println(fermano.values[i.intValue()][1] + " è un god");
            }else{
                
            }
            
        }
    }
}
