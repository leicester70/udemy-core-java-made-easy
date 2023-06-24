package section9;

import java.util.Random;

public class section9 {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(1000);
        if (x < 1000 && x > 500) {
            block1: {
                System.out.println("block1 executed and got value\t" + x);
                break block1;
            }
            ;
            block2: {
                String y = String.valueOf(x);
                char[] charArr = y.toCharArray();
                System.out.println("block2: pick the last int of x\t" + charArr[2]);
            }
        } else {
            System.out.println("Nope, no blocks, x:\t" + x);
        }
    }
}
