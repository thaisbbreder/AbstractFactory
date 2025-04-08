import factory.UIElementFactory;
import factory.impl.windows.WindowsUIElementFactory;

// Classe principal: define qual fábrica usar (Windows ou Linux) e inicializa a aplicação com ela
public class Main {
    public static void main(String[] args) {
        UIElementFactory factory = new WindowsUIElementFactory(); // ou new UIElementFactoryLinux();
        Application app = new Application(factory);
        app.renderUI();
    }
}
