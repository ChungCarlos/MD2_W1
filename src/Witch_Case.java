import java.util.Scanner;

public class Witch_Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tạo 1 đối tượng mới và đối tượng đó sẽ đọc dữ liệu nhập vào từ bàn phím
        System.out.print("Which month that you want to count days?");
        int month = scanner.nextInt(); // đọc giá trị số nguyên từ bàn phím

        switch (month) {
            case 2:
                System.out.print("The month '2' has or29 days!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("The month '" + month + "' has 31 days!");
                break;
        }
    }
}
