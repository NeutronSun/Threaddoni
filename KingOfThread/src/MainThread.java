import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.math.*;

public class MainThread {
    public static void main(String[] args) throws Exception {
        BigInteger n = new  BigInteger("1");
		//n = n.pow(1);
		BigInteger end = new  BigInteger("100000");
		//end = end.pow(5);
		BigInteger cont = new BigInteger("0");
        Fermat fermano = new  Fermat(end.intValue());

        Thread t1 = new Thread(new Threaddino(fermano, 2, n, end));
        Thread t2 = new Thread(new Threaddino(fermano, 3, n, end));
        Thread t3 = new Thread(new Threaddino(fermano, 5, n, end));
        Thread t4 = new Thread(new Threaddozzo(fermano, 5, n, end));
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");
        t1.start();
        t2.start();
        t3.start();
        Thread.currentThread().sleep(500);
        t4.start();
        
        Thread.currentThread().sleep(5000);
    
        for(int i = 0; i < end.intValue(); i++){
            System.out.print(i + "  ");
            for(BigInteger j = new BigInteger("0"); j.min(BigInteger.valueOf(2)).equals(j); j = j.add(BigInteger.ONE)){
                System.out.print(fermano.values[i][j.intValue()] + " ");
    
            }
            if(fermano.values[i][0] == null && fermano.values[i][1] == null && fermano.values[i][2] == null)
            break;
            System.out.println("");	
        }
        
    }
}
