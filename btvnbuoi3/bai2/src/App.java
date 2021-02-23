import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
        
       System.out.println("Độ dài chuỗi là :" + n );
       int [] arr = new int [n];
       

       
       for(int i = 0; i < arr.length ; i++){
        while (i <= 0) {
            System.out.println("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
            i = scanner.nextInt();
          arr[i] = scanner.nextInt();
         
          
       }}
       System.out.println("Mảng vừa nhập là :");{
           for(int  i = 0; i < arr.length ; i++){
               System.out.println( arr[i]  );
           }

       }
    }
}
