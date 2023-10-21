import controller.ValidationController;
import model.ValidationModel;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        ValidationModel model = new ValidationModel();
        Menu view = new Menu();
        ValidationController controller = new ValidationController(model, view);

        System.out.println("====== Validate Program ======");
        controller.validateData();
    }
}