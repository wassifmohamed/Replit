public class carD1 {
    public static void main(String[] args) {
        carD nissan= new carD();
        nissan.make= "nissan versa";
        nissan.price= 15000;
        nissan.year=2012;
        nissan.color= "black";
        carD toyota = new carD();
        toyota.make= "toyota Rav4";
        toyota.price=21000;
        toyota.year=2020;
        toyota.color="red";
        carD honda= new carD();
        honda.color= "red";
        honda.year=2020;
        honda.price=30000;
        honda.make="civic";

        System.out.println("This " + nissan.make + " is worth $" + nissan.price +
                ". It was built in " + nissan.year + ". It   is " + nissan.color + ".\n");
        System.out.println("This " + toyota.make + " is worth $" + toyota.price +
                ". It was built in " + toyota.year + ". It is " + toyota.color + ".\n");
        System.out.println("This " + honda.make + " is worth $" + honda.price +
                ". It was built in " + honda.year + ". It is " + honda.color + ".");


    }
}