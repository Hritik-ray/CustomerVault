import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("\n what would you want to do?");
            System.out.println("1. Add a new Customer");
            System.out.println("2. Search for a Customer");
            System.out.println("3. Exit");

            System.out.println("Enter your choice: ");

            int choice=sc.nextInt();

            switch(choice){
                case 1:
                FileManager.AddCustomer();
                break;

                case 2:
                FileManager.RetriveCustomer();
                break;

                case 3:
                System.out.println("Exiting the program. Have a great day!");
                sc.close();
                return;

                default:
                System.out.println("Invalid choice");
            }
            
        }
    }
    
}
