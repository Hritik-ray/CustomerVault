import java.io.*;
 class Customer implements Serializable {
    String customer_ID;
    String name;
    String phone_no;

    static int count=1;

    public Customer( String name, String phone_no) {
        this.customer_ID ="C"+ count;
        count++;
        this.name = name;
        this.phone_no = phone_no;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer details:= "+"\ncustomer_ID=" + customer_ID + "\nName=" + name + "\nPhone_no=" + phone_no;
    }
    
}
