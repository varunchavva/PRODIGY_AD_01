package methods;
import java.util.Scanner;
public class calculatorapp { 
    public static void main(String args[]){
        System.out.println("1-addition \n 2-subtraction \n 3-multiplication \n 4-division");
        System.out.println("choose operator:");
        Scanner sc = new Scanner(System.in);
        int operator = sc.nextInt();
        System.out.println("enter first number:");
        int n1 = sc.nextInt();
        System.out.println("enter second number:");
        int n2 = sc.nextInt();
        sc.close();
        int result = 0;
        switch (operator) {
            case 1:
            result = n1+n2;
                break;
            case 2:
            result = n1-n2;
                break;
            case 3:
            result = n1*n2;
                break;
            case 4:
            result = n1/n2;
                break;
        
            default:
            System.out.println("entered operator is not valid");
                break;
        }
        System.out.println("result is:"+result);

        }
    }

