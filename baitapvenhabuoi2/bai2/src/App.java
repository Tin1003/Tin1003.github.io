import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      //  System.out.println("Hello, World!");
      int count, num1 = 0, num2 = 1;
      System.out.println("Nhập vào số lượng các số mà bạn muốn hiển thị: ");
      Scanner scanner = new Scanner(System.in);
      count = scanner.nextInt();
      scanner.close();
      System.out.print("Chuỗi Fibonacci với "+count+" số là: ");
      int i=1;
      while(i<=count)
      {
          System.out.print(num1+" ");
          int a = num1 + num2;
          num1 = num2;
          num2 = a;
          i++;
      }
      System.out.println();
    }
}
