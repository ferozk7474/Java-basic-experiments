import java.util.*;
class BasicCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        float num1 = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        float num2 = sc.nextInt();

        System.out.println("Enter the operator(+,-,*,/) : ");

        char operator = sc.next().charAt(0);

        double result;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2==0){
                    System.out.println("Invalid Division");
                }
                else{
                result = num1 / num2;
                break;
                }
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(result);
    }
}
