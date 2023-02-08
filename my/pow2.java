import java.util.Scanner;
public class pow2 {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sh.nextInt();
        
        if((a!=0) && ((a & (a-1)) ==0)){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        }
    
    }

