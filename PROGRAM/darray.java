import java.util.Scanner;

public class darray{
    public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of the array:");
    //     int n=sc.nextInt();
    //     int m=sc.nextInt();
        
    //     int[][] array= new int[n][m];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             System.out.println("Enter the element of the array AT POSITION:" + i +" "+j);
    //            array[i][j]=sc.nextInt();
    //         }
    //     }
    //     System.out.println("The the numbers that are stored are:");
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             System.out.print(array[i][j]+" ");
    //         }}


    
    
    System.out.println("Enter the size of the array:");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    System.out.println("Enter the number u want to find:");
    int k=sc.nextInt(); 
    
    int[][] array= new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.println("Enter the element of the array AT POSITION:" + i +" "+j);
           array[i][j]=sc.nextInt();
        }
    }
    System.out.println("The the numbers that are stored are:");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           
            if(array[i][j]==k){
                System.out.print(array[i][j]+" ");
                System.out.println("The number is found at position: "+i+" "+j);
            }
            
        }
}
    }}
