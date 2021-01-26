import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        // double height, weight, bmi;

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Nhap chieu cao: ");
        // height = scanner.nextDouble();
        // System.out.println("nhap can nang: ");
        // weight = scanner.nextDouble();
        // bmi = weight / (height * height);

        // System.out.printf("Chi so bmi cua ban la: %1.2f \n ", bmi);
        // scanner.close();

        //bai 1
        // double C, S, r;
        // Scanner scanner = new Scanner(System.in);
        // System.out.println(" Nhập đường kính r: ");
        // r = scanner.nextDouble();
        // C = Math.PI * r * 2 ;

        // System.out.printf(" chu vi đường tròn: %1.2f \n ", C );
        
        // S = Math.PI * r * r ;

        // System.out.printf(" diện tích là đường tròn : %1.2f  ", S );
        //   scanner.close();

        //bai2  
        // int A;
        // Scanner chanle = new Scanner(System.in);
        // System.out.println("Nhập số A:");
        // A = chanle.nextInt();
        // if (A % 2 == 0) {
        //     System.out.println(A + " là số chẵn!");
        // } else {
        //     System.out.println(A + " là số lẻ");
        // }
        // chanle.close();
        //bai3
        double No, Laithang, Lainam, totallaitrathang;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tổng nợ: ");
        No = scanner.nextDouble();
        Lainam = 0.12 * No;
        Laithang = Lainam/12;
        totallaitrathang = No/12 + Laithang;
        System.out.println("tổng lãi hàng tháng phải trả:  " + totallaitrathang );
        scanner.close();




    }
}
