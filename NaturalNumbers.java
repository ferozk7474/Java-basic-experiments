import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int sum = 0;
        System.out.print("Enter the Number to find the Sum of it : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);

    }
}
