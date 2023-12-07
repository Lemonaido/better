import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strsplit = str.split(" ");

        if (strsplit.length != 3) {
            throw new IllegalArgumentException();
        }
        String znak = strsplit[1];
        {
            int num1, num2 ;
            try {
                num1 = Integer.parseInt(strsplit[0]);
                num2 = Integer.parseInt(strsplit[2]);
            } catch (java.lang.NumberFormatException e) {
                throw new NumberFormatException();
            }

            if ((znak.equals("+"))|(znak.equals("-"))|(znak.equals("*"))|(znak.equals("/"))&&((num1 < 11)&&(num1 > 0)&&(num2 < 11)&&(num2 > 0)))
            {
                switch (znak) {
                    case ("+"):
                        System.out.println(num1 + num2);
                        break;
                    case ("-"):
                        System.out.println(num1 - num2);
                        break;
                    case ("*"):
                        System.out.println(num1 * num2);
                        break;
                    case ("/"):
                        System.out.println(num1 / num2);
                        break;
                }}else throw new NumberFormatException();
        }

    }}


