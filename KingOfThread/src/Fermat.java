import java.math.*;
import java.util.ArrayList;
public class Fermat {

    public BigInteger[][] values;
    public ArrayList<BigInteger> finalValues;  
    private int n;
    private int contOne;
    private int contTwo;
    private int contThree;

    public Fermat(int n){
        this.n = n;
        values = new BigInteger[n][3];
        finalValues = new ArrayList<BigInteger>();
        contOne = 1;
        contTwo = 1;
        contThree = 1;

    }

    public void mergeArray(){                             
        int i = 0, j = 0, k = 0;
        do{                                                    
            if(values[i][0].equals(values[j][1]) && values[j][1].equals(values[k][2])){
                finalValues.add(values[i][0]);
                i++;
                j++;
                k++;
            }
            else{
                if(values[i][0].compareTo(values[j][1]) < 0)
                    i++;
                else if(values[i][0].compareTo(values[k][2]) < 0)
                    j++;
                else
                    k++;
            }
        }while((values[i][0] != null) && (values[j][1] != null) && (values[k][2] != null));
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
