import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("Enter the salary:");
        double salary= sh.nextInt();
       
        System.out.println("Enter the shifts");
        int shift = sh.nextInt();
        if(salary>8000)
        {
            System.out.println("Salary too large");

        }
        else{
            double food = salary*0.2;
            double travel = salary*0.3;
            double extra = salary*shift*0.02;
            double expense = food + travel;
            double saved = (salary-expense)+extra;
            
            System.out.println("Total"+ " " +saved);
        }
        if(shift <2)
        {
            System.out.println("Shift too small");
        }
        else
        {
            System.out.println("Shift too small so salary less");
        }
    }
}
