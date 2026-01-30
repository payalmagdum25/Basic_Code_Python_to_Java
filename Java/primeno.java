
import java.util.Scanner;

class primeno{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num :");
        int num=sc.nextInt();
        int flag=0;
        int i;

       if(num<=1){
        flag=1;
       } else{
                 for(i =2;i<=num/2;i++){
            if(num % i==0){
                flag=1;
                break;
            }
        }  
    }  
    if(flag ==0){
                System.out.println("It is prime");
    }else{
        System.out.println("Not prime");
    }   
    }
}  
    
