import java.util.Scanner;
public class LastDays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int r=y%100;
        System.out.printf("%02d",r);
    }
}