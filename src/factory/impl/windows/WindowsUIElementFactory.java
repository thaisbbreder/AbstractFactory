package factory.impl.windows;

import components.Button;
import components.Form;
import factory.UIElementFactory;

//ConcreteFactory
// Factory concreta que cria os elementos da interface para Windows
public class WindowsUIElementFactory implements UIElementFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Form createForm() {
        return new WindowsForm();
    }
}