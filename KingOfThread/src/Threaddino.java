import java.math.*;
public class Threaddino implements Runnable {
    private Fermat fermano;
    private int a;
    private BigInteger n = new BigInteger("0");
    private BigInteger end;

    public Threaddino(Fermat f, int a, BigInteger n, BigInteger end) {
        this.fermano = f;
        this.a = a;
        this.n = n;
        this.end = end;
    }

    public void run() {
        //epria gay 
        for(BigInteger i = n; i.min(end) == i; i = i.add(BigInteger.valueOf(1))){
            fermano.algorithm(BigInteger.valueOf(a), i);
        }
        
        System.out.println("ënd");
        
    }
}
