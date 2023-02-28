import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class View {

    Scanner in = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String getValue(String title){
        System.out.printf("%s", title);
        return in.next();
    }

    public Integer choiceMenu(String title){
        try {
            System.out.printf("%s",title);
            String line = reader.readLine();
            return Integer.parseInt(line);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Integer choiceMenu(){
        try {
            String line = reader.readLine();
            return Integer.parseInt(line);
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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
