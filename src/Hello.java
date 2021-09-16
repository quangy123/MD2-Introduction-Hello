import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập tên của bạn : ");

        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
