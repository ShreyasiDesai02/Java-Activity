import java.util.Scanner;

public class comanyMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Company Name:");
        String details  = s.nextLine();

        System.out.println("Enter the employes: ");
        String employees = s.nextLine();
       String[] names = employees.split(",");

       System.out.println("Enter team lead: ");
       String lead = s.nextLine();
    //    if(lead = employees){
           
    //    }
        System.out.println("Company Name:" + details);
        System.out.println("Employes:"+ employees);
        System.out.println("Lead:"+ lead);
       if(employees.contains(lead))
       {
           System.out.println("Team Lead "+lead);
       }
       else{
           System.out.println("Invalid input");
       }
    }
}
