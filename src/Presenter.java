import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Presenter {

    MenuInit menuInit;
    View view;

    public Presenter(MenuInit menuInit, View view) {
        this.menuInit = menuInit;
        this.view = view;
    }

    public void start() {
        this.menuInit.initMainMenu();
        this.menuInit.initLogMenu();
        this.run(menuInit.mainMenu);

    }

    private void run(MenuModel menu) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!menu.isExit) {
            view.printMenu(menu.menuList());
            try {
                String line = reader.readLine();
                int choice = Integer.parseInt(line);
                MenuEntity entry = menu.getEntries().get(choice - 1);
                entry.run();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
