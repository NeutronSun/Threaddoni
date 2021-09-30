import java.math.*;
public class Fermat {

    public BigInteger[][] values;
    private int contOne;
    private int contTwo;
    private int contThree;

    public Fermat(int n){
        values = new BigInteger[n][3];
        contOne = 0;
        contTwo = 0;
        contThree = 0;
    
    }

    public synchronized void algorithm(BigInteger a, BigInteger p){

        if(a.modPow(p.subtract(BigInteger.ONE), p).equals(BigInteger.ONE)){
            if(a.equals(BigInteger.valueOf(2))){
                values[contOne][0] = p;  
                contOne++;
                return;
            }

            if(a.equals(BigInteger.valueOf(3))){
                values[contTwo][1] = p;
                contTwo++;
                return;
            }

            if(a.equals(BigInteger.valueOf(5))){
                values[contThree][2] = p;
                contThree++;
                return;
            }
        }

    }            
}
