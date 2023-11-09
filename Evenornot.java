import java.util.*;

public class Evenornot {
    public static void main(String[] args){
        System.out.print("Enter the Number to be checked : ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a == b){
        System.out.println("Number is equal");
    }else if(a > b) {
        System.out.println("A is greater");
    }
    else{
        System.out.println("A is lesser");
    }
    }
}
