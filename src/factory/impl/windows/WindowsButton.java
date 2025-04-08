package factory.impl.windows;

import components.Button;

//Produto Concreto
// Implementação do botão para Windows
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando botão estilo Windows");
    }
}