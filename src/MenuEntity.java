public abstract class MenuEntity {
    private String title;

    public MenuEntity(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public abstract void run();

}
