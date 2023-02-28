import java.util.ArrayList;
import java.util.List;

public class MenuContainer {

    List<MenuEntity> list;


    public MenuContainer() {
        MenuEntity mainMenu = new MenuEntity();
        MenuEntity logMenu = new MenuEntity();
        this.list = new ArrayList<>();

        mainMenu.addEntry(new MenuItem("2. Калькулятор действительных чисел") {
            @Override
            public Integer run() {
                System.out.println("real calc run");
                return 0;
            }
        });

        mainMenu.addEntry(new MenuItem("3. Калькулятор комплексных чисел") {
            @Override
            public Integer run() {
                System.out.println("complex calc run");
                return 0;
            }
        });

        mainMenu.addEntry(new MenuItem("4. Логи") {
            @Override
            public Integer run() {
                System.out.println("logmenu run");
                return 1;
            }
        });

        logMenu.addEntry(new MenuItem("2. Посмотреть логи") {
            @Override
            public Integer run() {
                System.out.println("look this log list");
                return 0;
            }
        });

        logMenu.addEntry(new MenuItem("3. Удалить логи") {
            @Override
            public Integer run() {
                System.out.println("log list deleted");
                return 0;
            }
        });

        list.add(mainMenu);
        list.add(logMenu);
    }

    public MenuEntity getMenu(Integer menuNumber){
        return list.get(menuNumber);
    }


}
