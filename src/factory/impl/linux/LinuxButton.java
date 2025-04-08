package factory.impl.linux;

import components.Button;

//Produto Concreto
// Implementação do botão para Linux
public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando botão estilo Linux");
    }
}