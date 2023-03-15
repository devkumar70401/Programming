import java.util.Scanner;
public class P1 {

    static char ch;
    static int a;
    public static void main(String[] args)
    {
        P1 obj=new P1();
    }

    public static void  Introduction() {
        Scanner scr=new Scanner(System.in);
        System.out.println("Welcome to this Program. \t In this program you can calculate the area of any Regular geometry Shape.");
        System.out.println("Do you want to continue ?\t Type [Y] for yes and [N] for No");
        try {
            ch = scr.next().charAt(0);
            if (ch == 'N' || ch == 'n') {
                System.out.println("Thank you!! \t I hope you will like our another service ");
                System.exit(0);
            } else {
                System.out.println("Invalid Input");
            }
        } catch (Exception e) {
            System.out.println("Invalid output");
        }
        if (ch == 'y' || ch == 'Y')
            Input();
    }
    public static void Input()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Kindly select of which shape you want to calculate area.");
        System.out.println("1-Square \t 2-Rectangle \t 3-Circle \t 4-triangle \t 5-parallelogram \t 6-Rhombus " +
                "\t 7-Pentagon \t 8-Hexagon \t 9-Trapezoid \t 10-Cylinder \t 11-sphere \t 12-cone");
        a=scr.nextByte();
    }
}


