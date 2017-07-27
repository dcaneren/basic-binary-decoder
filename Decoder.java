import java.util.Scanner;

/**
 * Created by Can on 03/07/2017.
 */
public class Decoder {

    public static void main(String [] args){
        System.out.print("Enter binary: ");
        Scanner scan = new Scanner(System.in);
        String binary = scan.next();

        int start, end;
        start = 0;
        end = 8;
        System.out.print("\nDecoded string is: ");
        while( end <= binary.length()) {
            String part = binary.substring(start, end);
            int charCode = Integer.parseInt(part, 2);
            String str = new Character((char)charCode).toString();
            System.out.print(str);
            start += 8;
            end += 8;
        }
    }
}
