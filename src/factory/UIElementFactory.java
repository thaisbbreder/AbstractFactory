package factory;

import components.Button;
import components.Form;

// Interface da Abstract Factory
// Define os métodos para criar famílias de objetos relacionados (botão + formulário)
public interface UIElementFactory {
    Button createButton();
    Form createForm();
}