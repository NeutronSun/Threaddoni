import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.math.*;

public class MainThread {
    public static void main(String[] args) throws Exception {
        BigInteger n = new  BigInteger("1");
		//n = n.pow(1);
		BigInteger end = new  BigInteger("100");
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
        //t4.setName("T4");
        t1.start();
        t2.start();
        t3.start();
        Thread.currentThread().sleep(500);
        //t4.start();
        /*
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.currentThread().sleep(1000);
        }
        */
        fermano.mergeArray();
        for(int i = 0; i < fermano.finalValues.size(); i++) {
            System.out.println(fermano.finalValues.get(i));
        }
        
    }
}
