import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // Khai bao doi tuong Scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat();//Nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Nhập chiều dài

        float area = width * height;

        System.out.println("Area is: " + area);
    }
}