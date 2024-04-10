package CustomException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("enter ur email");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        try {
            if (a.length() <= 8) {
                throw new EmailException("enter the letters  8 characters and above");
            } else {
                System.out.println("done...");
            }
        } catch (EmailException ae) {
            System.out.println(ae.getMessage());

        } finally {
            System.out.println("superr..");
        }
        try {

            int d = EmailException.div();
            System.out.println(d);
        } catch (ArithmeticException e) {
            System.out.println("give the correct number");
        } catch (InputMismatchException ip) {
            System.out.println(ip);
        }
    }

}

class EmailException extends Exception {
    public EmailException(String str) {
        super(str);
    }

    static int div() throws ArithmeticException, InputMismatchException {
        System.out.println("enter the number to divide");
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt();
        int b = ss.nextInt();
        int c = a / b;
        ss.close();
        return c;
    }
}