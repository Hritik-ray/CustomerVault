import java.io.*;
import java.util.*;
public class FileManager {

    private static final String File_Name="customerdata.dat";

    public static void AddCustomer() throws Exception{

        Scanner sc=new Scanner(System.in);

        List<Customer> customerList=new ArrayList<>();

        File file=new File(File_Name);
        if(file.exists() && file.length()>0){
           try( ObjectInputStream ois=new ObjectInputStream(new FileInputStream(File_Name))){
            customerList=(ArrayList<Customer>)ois.readObject();
           }

        }

        while(true){
            System.out.println("Enter the name of the customer:");
            String name=sc.nextLine();

            System.out.println("Enter phone number:");
            String phone= sc.nextLine();

            customerList.add(new Customer(name, phone));

            System.out.println("Do you want to add another customer? (yes/no): ");
            String ans=sc.nextLine();
            if(!ans.trim().equalsIgnoreCase("yes")){
                break;
            }
        }

        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(File_Name))){
            oos.writeObject(customerList);
        }

        System.out.println("Customer added successfully");



    }




    public static void RetriveCustomer() throws Exception{

        File file=new File(File_Name);
        if(!file.exists() && file.length()==0){
            System.out.println("No customer records found");
            return;
        }

        List<Customer> customerList;
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(File_Name))){
            customerList=(ArrayList<Customer>)ois.readObject();
        }

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name of the customer to search: ");

        String name=sc.nextLine();

        boolean found=false;

        for(Customer c : customerList){
            if(c.name.equalsIgnoreCase(name)){
                System.out.println("\n Customer Details Found:\n"+c);

                found=true;
                break;
            }
        }

        if(found==false){
            System.out.println("Customer not found");
        }





    }
    
}
