package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the width and the length a rectangle to calculate area");

        int width = scan.nextInt();

        int length = scan.nextInt();

        System.out.println("The area is" + width* length);

        System.out.println("To perimeter is " + 2*(width+length));



    }



}
