package factory.impl.linux;

import components.Form;

//Produto Concreto
// Implementação do formulário para Linux
public class LinuxForm implements Form {
    @Override
    public void render() {
        System.out.println("Renderizando formulário estilo Linux");
    }
}
