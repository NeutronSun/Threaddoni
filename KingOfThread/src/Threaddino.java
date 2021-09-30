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
        if(n.compareTo(BigInteger.valueOf(3)) == -1){
            fermano.values[0][0] = new BigInteger("2");
            fermano.values[0][1] = new BigInteger("2");
            fermano.values[0][2] = new BigInteger("2");
            n = BigInteger.valueOf(3);
        }
        else if(n.remainder(BigInteger.TWO).compareTo(BigInteger.ZERO) != 0){
            n = n.add(BigInteger.ONE);
        }
        for(BigInteger i = n; i.min(end) == i; i = i.add(BigInteger.valueOf(2))){
            fermano.algorithm(BigInteger.valueOf(a), i);
        }
        
        System.out.println("ënd");
        
    }
}
