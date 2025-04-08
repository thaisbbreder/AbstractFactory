package factory.impl.linux;

import components.Button;
import components.Form;
import factory.UIElementFactory;

//ConcreteFactory
// Fábrica concreta que cria os elementos da interface para Linux
//Cria apenas elementos compatíveis com Linux
public class LinuxUIElementFactory implements UIElementFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Form createForm() {
        return new LinuxForm();
    }
}
