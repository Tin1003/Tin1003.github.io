import java.util.Collections;
import java.util.Scanner;

public class Main {
    static  ProductRepository productRepository;
    public static void main(String[] args) {
        productRepository = new ProductRepository();
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("Bạn có muốn tiếp tục chương trình: \nY để tiếp tục \nQ để thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")){
                Menu.choose();
                System.out.print("Lựa chọn của bạn: ");
                int i = sc.nextInt();
                sc.nextLine();
                switch (i){
                    case 1:
                        Menu.chooseCategory();
                        System.out.print("Lựa chọn của bạn: ");
                        int chooseCategory = sc.nextInt();
                        sc.nextLine();
                        getListByCategory(chooseCategory);
                        break;
                    case 2:
                        System.out.print("Nhập hãng bạn muốn tìm kiếm: ");
                        String brand = sc.nextLine();
                        productRepository.getProductByBrand(brand);
                        break;
                    case 3:
                        Menu.chooseCategory();
                        System.out.print("Lựa chọn của bạn: ");
                        chooseCategory = sc.nextInt();
                        sc.nextLine();
                        getListByCategoryAndPrice(chooseCategory);
                        break;
                    case 4:
                        System.out.print("Nhập tên sản phẩm muốn tìm kiếm: ");
                        String name = sc.nextLine();
                        productRepository.search(name);
                        break;
                       
                    case 5:
                        Menu.chooseCategory();
                        System.out.print("Lựa chọn của bạn: ");
                        chooseCategory = sc.nextInt();
                        sc.nextLine();
                        addProduct(chooseCategory);
                        break;
                    case 6:
                        System.out.print("Nhập tên sản phẩm muốn sửa: ");
                        name = sc.nextLine();
                        productRepository.editProduct(name);
                        break;
                    case 7:
                        System.out.print("Nhập tên sản phẩm muốn xóa: ");
                        name = sc.nextLine();
                        productRepository.deleteProduct(name);
                        break;
                    case 8:
                        System.out.println("sắp xếp theo tên");
                        Collections.sort(productRepository.productList, ProductRepository::comparebyname);
                        productRepository.productList.forEach(System.out::println);
                        break;
                    case 9:
                        System.out.println("Sắp xếp theo giá bán");
                        Collections.sort(productRepository.productList, ProductRepository::comparebyprince);
                        productRepository.productList.forEach(System.out::print);
                    

                    default:
                        System.out.println("Không có lựa chọn này");
                }
            }else if(choice.equalsIgnoreCase("q")){
                System.exit(0);
            }
            // System.out.println("combo sản phẩm : ");
            // System.out.println(
            //         "Nhap 1 de chon combo 4-3-3-1 \nNhap 2 de chon combo 5-4-2-1 \nNhap 3 de chon combo 3-5-2-2 \n");
            // int n = sc.nextInt();
            // sc.nextLine();
            // switch (n) {
            // case 1:
            // System.out.println();
            //     productRepository.combosale(2, 1, 3, 1);
            //     break;
            // case 2:
            //     productRepository.combosale(1, 1, 2, 1);
            //     break;
            // case 3:
            //     productRepository.combosale(3, 1, 2,2);
            //     break;
            // default:
            //     System.out.println("Khong co lua chon nay");
            //     break;
            // }
        }

    }
    public static void getListByCategory(int choose){
        switch (choose) {
            case 1:
                productRepository.getProductByCategory(Category.PHONE);
                productRepository.getListByCategory();
                break;
            case 2:
                productRepository.getProductByCategory(Category.LAPTOP);
                productRepository.getListByCategory();
                break;
            case 3:
                productRepository.getProductByCategory(Category.APPLE);
                productRepository.getListByCategory();
                break;
            case 4:
                productRepository.getProductByCategory(Category.ACCESSORIES);
                productRepository.getListByCategory();
                break;
        }
    }
    public static void getListByCategoryAndPrice(int choose){
        switch (choose){
            case 1:
                productRepository.getProductByCategory(Category.PHONE);
                productRepository.getProductByCategoryAndPrice(Category.PHONE);
                break;
            case 2:
                productRepository.getProductByCategory(Category.LAPTOP);
                productRepository.getProductByCategoryAndPrice(Category.LAPTOP);
                break;
            case 3:
                productRepository.getProductByCategory(Category.APPLE);
                productRepository.getProductByCategoryAndPrice(Category.APPLE);
                break;
            case 4:
                productRepository.getProductByCategory(Category.ACCESSORIES);
                productRepository.getProductByCategoryAndPrice(Category.ACCESSORIES);
                break;
        }
    }
    public static void addProduct(int choose){
        switch (choose){
            case 1:
                productRepository.addProduct(Category.PHONE);
                break;
            case 2:
                productRepository.addProduct(Category.LAPTOP);
                break;
            case 3:
                productRepository.addProduct(Category.APPLE);
                break;
            case 4:
                productRepository.addProduct(Category.ACCESSORIES);
                break;
        }
    }
}
    

