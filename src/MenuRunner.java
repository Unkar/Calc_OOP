public class MenuRunner {

    private Integer status = 0;
    MenuContainer menuContainer;
    View view;

    public MenuRunner(MenuContainer menuContainer, View view) {
        this.menuContainer = menuContainer;
        this.view = view;
    }

    public void start() {

        this.run(menuContainer.getMenu(0));

    }

    public void run(MenuEntity menu) {
        while (status != -1){
            view.printMenu(menu.menuList());
            MenuItem entry = menu.getEntries().get(view.choiceMenu("Введите № пункта меню: ") - 1);
            status = entry.run();
            if ((status != 0) && (status != -1)){
                this.run(menuContainer.getMenu(status));
                status = 0;
            }
        }
    }


}
