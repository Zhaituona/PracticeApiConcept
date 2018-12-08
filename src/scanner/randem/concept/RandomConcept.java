package scanner.randem.concept;

import java.lang.reflect.Array;
import java.util.Random;

public class RandomConcept {

    public static void main(String[] args) {

        Random rd = new Random();

        int [] a= new int [5];

        int [] b = new int [7];
        System.out.println(b.length);

        for(int q =0; q<b.length ;q++){
            b[q] = rd.nextInt(30);
            int index = rd.nextInt(b.length);
            System.out.println("index : "+ " " + b[q]);
        }

        int c= rd.nextInt(20);
        double d = rd.nextDouble();

        int v = rd.nextInt(4);
        System.out.println(c);
        System.out.println(d);

        for(int x = 0; x<a.length;x++){
            a[x] = rd.nextInt(20);
            int index = rd.nextInt(a.length);
            System.out.println("index is : " + index + " "+ a[x]);
        }
        System.out.println(a[v]);

    }
}
