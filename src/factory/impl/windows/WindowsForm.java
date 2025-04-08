package factory.impl.windows;

import components.Form;

//Produto Concreto
// Implementação do formulário para Windows
public class WindowsForm implements Form {
    @Override
    public void render() {
        System.out.println("Renderizando formulário estilo Windows");
    }
}