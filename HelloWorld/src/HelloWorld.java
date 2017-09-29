import com.sun.org.apache.xpath.internal.SourceTree;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Customer email = new Customer("fjf");
        System.out.println(email);

    }
}
class Customer {
    String email;
    int balance;
    boolean register;

    Customer (String email){
        email=email;
    }
    void setEmail (String email ){
        this.email=email;
    }
}