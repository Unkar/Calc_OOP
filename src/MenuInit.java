import java.util.HashMap;

public class MenuInit {

    MenuModel mainMenu;
    MenuModel logMenu;

    private boolean isExit = false;

    public MenuInit() {
        this.mainMenu = new MenuModel();
        this.logMenu = new MenuModel();
    }

    public void initMainMenu() {
        mainMenu.addEntry(new MenuEntity("2. Калькулятор действительных чисел") {
            @Override
            public void run() {
                System.out.println("real calc run");
            }
        });

        mainMenu.addEntry(new MenuEntity("3. Калькулятор комплексных чисел") {
            @Override
            public void run() {
                System.out.println("complex calc run");
            }
        });

        mainMenu.addEntry(new MenuEntity("4. Логи") {
            @Override
            public void run() {
                System.out.println("logmenu run");
            }
        });
    }

    public void initLogMenu() {
        logMenu.addEntry(new MenuEntity("2. Посмотреть логи") {
            @Override
            public void run() {
                System.out.println("look this log list");
            }
        });

        logMenu.addEntry(new MenuEntity("3. Удалить логи") {
            @Override
            public void run() {
                System.out.println("log list deleted");
            }
        });
    }

}
