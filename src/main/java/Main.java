import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String author, quote = "";
            System.out.print("What is the quote? ");
            quote = scan.nextLine();
            System.out.print("Who said it? ");
            author = scan.nextLine();
            System.out.println(author + " says, \"" + quote + "\"");
        }
    }
}
