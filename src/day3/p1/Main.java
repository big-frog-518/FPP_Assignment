package day3.p1;

/**
 * @Author Jinxu Zheng
 * @Date 5/31/2023
 **/
public class Main {
    public static void main(String[] args) {
        Customer c1= new Customer("Jinxu","Zheng","1234");
        c1.setBillingAddress("Iowa");
        // 1000 N 4th ST MR #xx, Fairfield, IA, 52557
        Address a1 = new Address("1000 N 4th", "Fairfield", "Iowa", "52557");
        Address a2 = new Address("1000 S 4th", "Heights", "Chicago", "52557");
        c1.setShippingAddress(a1);
        Customer c2= new Customer("Jack","Ma","2345");
        c2.setBillingAddress("Chicago");
        c2.setShippingAddress(a2);
        Customer c3= new Customer("David","Lin","3456");
        c3.setBillingAddress("Chicago");
        c3.setShippingAddress(a2);

        Customer[] cArr = new Customer[3];
        cArr[0]=c1;
        cArr[1]=c2;
        cArr[2]=c3;

        for (Customer o : cArr) {
            Address address = o.getShippingAddress();
            if ("Chicago".equals(address.getState())){
                System.out.println(o.toString());
            }
        }
    }
}
