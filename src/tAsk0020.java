import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class tAsk0020 {
    public static void main(String[] args) {
        Scanner fname=new Scanner(System.in);
        System.out.print(" Please enter your name");
        String name=fname.nextLine();

        Scanner Lname=new Scanner(System.in);
        System.out.print("Please enter your last name");
        String last=Lname.nextLine();

        System.out.println("------------");




                      // ADDED
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your age ");
        int age=input.nextInt();
        System.out.println( "you are " +age+ " years old" );






    }
}
