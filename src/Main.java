public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new MenuInit(), new View());
        presenter.start();


    }
}