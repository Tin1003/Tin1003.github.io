import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
       
		int a = 1;
		for (int i = 1; i <= n; i++) {
			
			a = a* i;
		}
		System.out.println("kết quả là :"+ a);
    }

}
