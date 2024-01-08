import java.util.Scanner;
public class Loss{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        int sp=sc.nextInt();
        float loss=cp-sp;
        float per=(loss*100)/cp;
        System.out.printf("%.2f",per);
    }
}