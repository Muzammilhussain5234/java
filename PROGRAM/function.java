import java.util.Scanner;

public class function {
//   average of three num
    public static int ave(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static int sumofo(int a) {
        // used to find the sum of odd num
        int sum = 0;
        for (int i = 1; i <= a; i++) { 
            if (i % 2 != 0) { 
                sum += i; 
            }
        }
        return sum;
    }

    public static String comparison(int a, int b) {
        if (a > b) {
            // compare the num
            return a + " is greater than " + b;
        } else {
            return b + " is greater than " + a;
        }
    }
    public static String vote(int age) {
        if (age >=18) {
            // used to calculate voting eligibility
            
            return  "u can vote";
        } else {
            return "u cannot vote";
        }
    }

    public static float circumference(int a) {
        // used to find the circumference
        return 2 * 3.14159f * a; 
    }
    
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter the numbers to find average:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int d = ave(a, b, c);
        int e = sumofo(a);
        float f = circumference(a);
        
        System.out.println("The average is: " + d);
        System.out.println("The sum of odd numbers up to " + a + " is: " + e);
        System.out.println("The circumference is: " + f);
        System.out.println(comparison(a, b));
        System.out.println(vote(a));
    }
}
