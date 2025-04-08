import components.Button;
import components.Form;
import factory.UIElementFactory;

// Essa classe [e pra simular o uso da interface gráfica
// Recebe a fábrica no construtor e cria os elementos certos para a plataforma
public class Application {
    private final Button button;
    private final Form form;

    // O cliente não precisa saber quais implementações estão sendo usadas
    // Ele só interage com as interfaces
    public Application(UIElementFactory factory) {
        this.button = factory.createButton();
        this.form = factory.createForm();
    }

    // Renderiza a interface com os elementos criados pela factory
    public void renderUI() {
        button.render();
        form.render();
    }
}
