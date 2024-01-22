import java.util.Scanner;
public class Height{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int D=sc.nextInt();
        if(N>D){
            System.out.println(N);
        }
        else{
            System.out.println(D);
        }
    }
}