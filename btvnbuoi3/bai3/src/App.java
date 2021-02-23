import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      //  System.out.println("Hello, World!");
      int n;
      int sum ;
      Scanner scanner = new Scanner(System.in);

      System.out.println("Nhập vào bậc của ma trận: ");
      n = scanner.nextInt();
       int A [] [] = new int [n][n];
       int B [] [] = new int [n][n];
       System.out.println("Nhập các phần tử của ma trận");
       for(int i = 0; i < n; i++) {
           for (int j = 0; j < n ; j++){
               System.out.printf("A[" + i + "][" + j + "] = ");
               A[i][j] = scanner.nextInt();
           }
       }
            System.out.println("Ma trận A vừa nhập là:");
            for (int i = 0 ; i < n ; i++){
                for( int j = 0 ; j < n ; j++ ){
                    System.out.println( A[i][j] + "\t");
                }
                System.out.println("\n");
            }
            
            System.out.println("Nhập các phần tử của ma trận");
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < n ; j++){
                    System.out.printf("B[" + i + "][" + j + "] = ");
                    A[i][j] = scanner.nextInt();
                }
            }
                 System.out.println("Ma trận B vừa nhập là:");
                 for (int i = 0 ; i < n ; i++){
                     for( int j = 0 ; j < n ; j++ ){
                         System.out.println( B[i][j] + "\t");
                     }
                     System.out.println("\n");
                 }
                 for(int i = 0 ; i < n; i++){
                     for( int j =0 ; j < n ; j++ ){
                        sum = A[i][j] + B[i][j];
                     }
                 }
                 
                }

}
