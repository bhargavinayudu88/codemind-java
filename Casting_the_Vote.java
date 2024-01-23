import java.util.Scanner;
public class Vote{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>=18){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}