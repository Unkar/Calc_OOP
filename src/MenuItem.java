public abstract class MenuItem {
    private final String title;

    public MenuItem(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public abstract Integer run();

}
