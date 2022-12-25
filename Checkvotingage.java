package homework;
import java.util.*;
public class Checkvotingage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>18){
            System.out.println("candidate is eligible for voting");
        }
        else {
            System.out.println("candidate is not eligible for voting");
        }
    }
}
