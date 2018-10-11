package area;

public class manyDivior {
    public  manyDivior(){
        int sum = 0;
        for (int i = 100; i <=1000 ; i++) {
            if (sum==10){
                System.out.println(" ");
                sum=0;
            }
            if(i%5==0&&i%6==0){
                System.out.print(i+" ");
                sum++;
            }


        }
    }
}
