import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("ВВЕДИТЕ СВОЁ ИМЯ: ");
        Scanner n  = new Scanner(System.in);
        String name = n.nextLine();
        int w =name.length();
        char last=name.charAt(w -1);
        if(last=='а'||last=='я'||last=='и')
            System.out.println("ПРИИВЕТИК!");
        else
            System.out.println("ЗДАРОВА!");
    }
}