import java.util.Scanner;

public class helo {

        public static void butterFly(String name){
            System.out.println("your name is "+name);
            return;


    }
        public static int add(int a,int b){
            int sum=a+b;
            return sum;
        }
        // this function is not valid for very large numbers for 10 or just some but when this 
        // exced to some large num it wil  cause overflow return false value
        public static int factorial(int a){     
            int fac = 1; 
            for(int i = a; i >= 1; i--){ 
                fac = fac * i; }
            System.out.println(fac);
            return fac;
        }
        
        public static int multiple(int a,int b){
            int multiply=a*b;
            return multiply;
        }
        public static void main(String[] args) {
            System.out.println("enter the num;");
           
            Scanner sc = new Scanner(System.in);
            
            // String a=sc.next();
            // butterFly(a);
            // sc.close();
            int a=sc.nextInt();
           
            System.out.println("enter the 2 num; ");
            int b=sc.nextInt();
            int d=add(a, b);
            int e=multiple(a, b);
            System.out.println("sum of two num; "+d);
            System.out.println("multiple of two num"+e);
            int f=factorial(a);
            System.out.println("factorial of two num; "+f);


        }
    
    
    
}
