import java.util.Scanner;

public class demoShape {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double d1,d2;
        System.out.println("Enter d1:");
        d1=input.nextDouble();
        System.out.println("Enter d2:");
        d2=input.nextDouble();
        rectangle rect = new rectangle(d1,d2);
        rect.display();
        System.out.println("Rectangle area: "+rect.area());

        triangle tri = new triangle(d1,d2);
        System.out.println("Triangle area: "+tri.area());
    }
}
