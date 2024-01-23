import java.util.Scanner;
public class Fever{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>40){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
