/**
 * 没有工厂时代
 */
public class Customer {
    public static void main(String[] args) {
        Customer bmw320 = new Customer();
        bmw320.createBMW320();
    }
    public void createBMW320(){
            System.out.println("制造-->BMW320");
    }
    public void createBMW521(){
            System.out.println("制造-->BMW523");
    }
}
