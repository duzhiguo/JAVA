package area;

import java.util.Scanner;

public class divior {
    public  divior(){
        Scanner input = new Scanner(System.in);
        int num =input.nextInt();
        if(num%5==0&&num%6==0){
            System.out.println(num+" is divisible by both 5 and 6");
            System.exit(0);

        }
        else  if (num%5==0||num%6==0){
            System.out.println(num+" is divisible by 5 or 6, but not both");
        }
        else{
            System.out.println(num+" is not divisible by either 5 or 6");
        }

    }
}
