import java.util.Scanner;
public class Capacity{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int S=sc.nextInt();
        int B=sc.nextInt();
        int ans=2*T*S*B*512;
        int res=ans/1024;
        System.out.println(res+" "+"KB");
    }
}