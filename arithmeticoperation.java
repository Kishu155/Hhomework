package homework;
import java.util.*;
public class arithmeticoperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b ;
        int sub = a - b ;
        int mul = a * b ;
        int div = a / b ;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(b--);
        System.out.println(--b);
    }
}
