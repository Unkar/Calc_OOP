import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MenuModel {
    private List<MenuEntity> entries = new ArrayList<>();
    public boolean isExit = false;


    public MenuModel() {
        this.entries.add(new MenuEntity("1. Exit.") {
            @Override
            public void run() {
                isExit = true;
            }
        });
    }

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            int choice = Integer.parseInt(line);
            MenuEntity entry = entries.get(choice - 1);
            entry.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> menuList() {
        ArrayList<String> menuList = new ArrayList<>();
        entries.forEach((entry) -> menuList.add(entry.getTitle()));
        return menuList;
    }

    public void addEntry(MenuEntity entry) {
        this.entries.add(entry);
    }

    public List<MenuEntity> getEntries() {
        return this.entries;
    }
}


// 1. Главное меню:
//      1. Калькулятор для натуральных чисел.
//      2. Калькулятор для комплексных чисел.
//      3. Посмотреть логи.
//      4. Выход.

// 2. Меню логов:
//      1. Посмотреть логи.
//      2. Очистить логи.
//      3. Назад.