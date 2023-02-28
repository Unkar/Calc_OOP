import java.util.ArrayList;
import java.util.List;

public class MenuEntity {
    private final List<MenuItem> entries = new ArrayList<>();


    public MenuEntity() {
        this.entries.add(new MenuItem("1. Exit.") {
            @Override
            public Integer run() {
                return -1;
            }
        });
    }


    public ArrayList<String> menuList() {
        ArrayList<String> menuList = new ArrayList<>();
        entries.forEach((entry) -> menuList.add(entry.getTitle()));
        return menuList;
    }

    public void addEntry(MenuItem entry) {
        this.entries.add(entry);
    }

    public List<MenuItem> getEntries() {
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