import java.io.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("from path: ");
        String path1 = scanner.next();
        System.out.print("to path: ");
        String path2 = scanner.next();

        InputStream inputStream=new FileInputStream(path1);
        OutputStream outputStream=new FileOutputStream(path2);

        int a;
        while((a= inputStream.read())!=-1){
            outputStream.write((char)(a));
        }

        outputStream.flush();

    }
}

