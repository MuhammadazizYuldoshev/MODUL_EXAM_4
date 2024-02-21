import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("masala.txt");

        Scanner scanner = new Scanner(inputStream);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int yegindi = number1+number2;
        System.out.println(yegindi);

        FileWriter writer = new FileWriter("yegindi.txt");
        writer.write(yegindi+"");
        writer.flush();

    }
}
