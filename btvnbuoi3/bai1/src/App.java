import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      //  System.out.println("Hello, World!");
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      System.out.println("nhập tổng số phần tử của mảng" + n );
      int [] arr = new int [n];

      for(int i = 0; i < arr.length; i++){
          arr[i] = scanner.nextInt();
          
      }
      System.out.println("mang vừa nhập là " );
      for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i] + "\t");
      }
      int min = arr[0];
      for(int i =0; i<n ; i++){
          if(min > arr[i]){
              min = arr[i];
          }
      }
      int max = arr[0];
      for(int i = 0; i<n; i++){
          if(max < arr[i]){
              max = arr[i];
          }
      }
      System.out.println("vậy min là" + min);
      System.out.println("vậy max là" + max);
      for (int i = 0 ; i < n ; i ++ ){
        for( int j = i + 1; j < n ; j++ ){
            if (arr[i] > arr[j]) {
            int a = arr[i];
            arr[i]=arr[j];
            arr[j]=a;
            }

        }
    }
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    for (int i = 0 ; i < n; i++){
        for ( int j = i + 1 ; j < n ; j++){
            if(arr[i] > arr[j] ){
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }
    }
    for (int i = n-1; i < n; i--) {
        System.out.print(arr[i] + " ");
    }
    
    }
}
