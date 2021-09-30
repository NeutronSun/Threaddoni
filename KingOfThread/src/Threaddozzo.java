import java.math.*;
public class Threaddozzo {
    private Fermat fermano;
    private int a;
    private BigInteger n;
    private BigInteger end;

    public Threaddozzo(Fermat f, int a, BigInteger n, BigInteger end) {
        this.fermano = f;
        this.a = a;
        this.n = n;
    }

    public void run() {
        for(BigInteger i = n; i.min(end) == i; i = i.add(BigInteger.valueOf(2))){
            
        }
    }
}
