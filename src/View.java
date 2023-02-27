import java.util.ArrayList;
import java.util.Scanner;

public class View {

    Scanner in = new Scanner(System.in);

    public String getValue(String title){
        System.out.printf("%s", title);
        return in.next();
    }

    public void print(String title, String data){
        System.out.printf("%s %s", title, data);
    }

    public void printMenu(ArrayList<String> menu){
        for (String line : menu){
            System.out.println(line);

        }
        System.out.println("\n");
    }
}
