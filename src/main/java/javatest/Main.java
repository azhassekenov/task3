package javatest;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Task3 task = new Task3();
        System.out.println("Enter: ");
        Scanner scanner1 = new Scanner(System.in);
        String line1 = scanner1.nextLine();
        String line2 = scanner1.nextLine();
        String line3 = scanner1.nextLine();
        String line4 = scanner1.nextLine();
        String line5 = scanner1.nextLine();
        String line6 = scanner1.nextLine();
        String line7 = scanner1.nextLine();
        String line8 = scanner1.nextLine();
        String line9 = scanner1.nextLine();
        String line10 = scanner1.nextLine();

        String finalA="";
        finalA=line1+line2+line3+line4+line5+line6+line7+line8+line9+line10;
        System.out.println(task.yesOrNo(finalA));
    }
}