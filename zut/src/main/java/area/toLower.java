package area;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class toLower {
    public toLower(){
        Scanner input = new Scanner(System.in);
        double [] num = new double[3];
        for (int i = 0; i < 3; i++) {
            num[i] = input.nextDouble();
        }
        sort(num);
        for (int i = 0; i <3 ; i++) {
            System.out.println("第"+(i+1)+"个:"+num[i]);
        }

    }
}
