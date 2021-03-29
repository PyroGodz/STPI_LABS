package by.belstu.it.myadel.basejava;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.lang.Math.*;

public class JavaTest {

/*
    @return 0
    @throws 1
    @param agrs
 */

    //  c)
    final int constant1 = 123;
    public final int constant2 = 321;
    public static final int constant3=666;

    /*
    @value 15
    @see 15
     */

    private static int sint;
    // a)
    public static void main(String[] args) {
        //b)
        char simbol = 'c';
        int whole = 25;
        double dwhole = 25.5d;
        short swhole = 5;
        byte dre = 1;
        long lwhole = 125;
        boolean life = false;
        String simbolss = "bass";

        String zero = simbolss+ whole;
        System.out.println("String + int: " + zero);

        String zeroCh = simbolss + simbol;
        System.out.println("String + char: " +zeroCh);

        String zerod = simbolss + dwhole;
        System.out.println("Sring + double: "+ zerod);

        byte drdre = (byte)(dre + whole);
        System.out.println("Byte + int: "+ drdre);

        int iwhole = (int)(dwhole + lwhole);
        System.out.println("Int = double + int: " + iwhole);

        long ll = 0 + 2147483647;
        System.out.println("long = int + 2147483647: "+ ll);

        System.out.println(sint);

        boolean bb = life && life;
        System.out.println("boolean && boolean:  "+ bb);

        boolean bbb = life ^ life;
        System.out.println("boolean ^ boolean:  "+ bbb);

        long lll = 9223372036854775807l;
        long llx = 0x7fff_ffff_fffl;

        System.out.println(lll);
        System.out.println(llx);

        char chch = 'a';
        char chacha = '\u0061';
        char chichi = 91;

        System.out.println(chch);
        System.out.println(chacha);
        System.out.println(chichi);

        System.out.println((char)(chch + chacha + chichi));

        System.out.println(3.45 % 2.4);
        System.out.println(1.0/0);
        System.out.println(0.0/0.0);
        System.out.println(Math.log(-345));

        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));

        //  d)
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(Math.E));

        System.out.println(Math.min(Math.PI,Math.E));

        System.out.println(Math.random());

        // e)
        Boolean be2 = true;
        Character newChar = 'W';
        Integer in2 = 3;
        Byte robotdolb = 3;
        Short sh2 = 2;
        Long lg2 = 1l;
        Double db2 = 3.3;

        System.out.println(in2>>2);
        System.out.println(in2>>>3);
        System.out.println(in2=~3);
        System.out.println(in2 * sh2);
        System.out.println(db2 - in2);
        System.out.println(sh2 + in2);

        System.out.println(Long.MAX_VALUE + ": max; min: "+ Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE + "max; min: "+ Double.MIN_VALUE);

        //упаковка
        int a = 11;
        Integer AI = a;

        byte bbs = 11;
        Byte BB = bbs;

        //распаковка
        int ai = AI;
        byte bybys = BB;

        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.toHexString(123));
        System.out.println(Integer.compare(123,32));
        System.out.println(Integer.toString(123));
        System.out.println(Integer.bitCount(123));
        System.out.println(Float.isNaN(a));

        // f)

        String s34 = "2345";
        int IIIII = Integer.valueOf(s34);
        IIIII = Integer.parseInt(s34);
        byte[] hb = s34.getBytes();
        System.out.println(hb);
        System.out.println(new String(hb));

        String tim = "tima";
        String timmy = "tima";

        System.out.println(tim == timmy);
        System.out.println(tim.equals(timmy));
        System.out.println(tim.compareTo(timmy));

        System.out.println(tim.split("1234"));
        System.out.println(tim.contains("123"));
        System.out.println(tim.hashCode());
        System.out.println(tim.indexOf("2"));
        System.out.println(tim.length());
        System.out.println(tim.replace('t','d'));

        // g)
        char[][] c1;
        char c2[];
        char c3[];

        c1 = new char[3][];
        c1[0] = new char[4];
        c1[1] = new char[5];
        c1[2] = new char[6];
        System.out.println(c1.length);
        System.out.println(c1[0].length);
        System.out.println(c1[1].length);
        System.out.println(c1[2].length);

        c2 = new char[]{'1','2','3'};
        c3 = new char[]{'5','2','3'};
        boolean comRez = c2==c3;
        System.out.println(comRez);

        c2 = c3;
        System.out.println(c2);

        for (char k : c3) {
            System.out.println(k);
        }

        //for (int i = 0; i < c3.length+1; i++) {
        //    System.out.println(c3[i]);
        //}

        // h)
        WrapperString str1 = new WrapperString("cochan");
        str1.replace('c','h');

        WrapperString str2 = new WrapperString("Itadori") {
            @Override
            public void replace(char oldChar, char newChar) {
                System.out.println("replaced");
            }

            public void delete(char newChar) {
                System.out.println(newChar);
            }
        };
    }
}
