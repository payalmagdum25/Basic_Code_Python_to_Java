
import java.util.Scanner;
class  countfre{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a num :");
        int num=sc.nextInt();
        System.out.println("Enter a digit that want to count :");
        int digit=sc.nextInt();
        int count=0;

        while (num>0){
            if(num % 10 == digit ){
                count ++;
            }
                 num =num/10;
            }
            System.out.println("Frequency ="+ count);
        }
    }
