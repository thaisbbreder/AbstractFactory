## Padrão de Projeto: Abstract Factory

### Categoria
Criacional

### Definição
O padrão Abstract Factory é uma evolução do Factory Method, adicionando uma camada de abstração a mais: uma fábrica de fábricas. Em vez de criar um único tipo de objeto, ele cria famílias de objetos relacionados por meio de uma interface comum, sem expor as implementações concretas.

### Finalidade
- Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes, sem acoplar o código às classes concretas.
- Agrupar produtos compatíveis dentro de fábricas concretas, garantindo consistência na criação de componentes que devem trabalhar juntos.

### Estrutura e Componentes
- **AbstractFactory**: define a interface com os métodos de criação (ex: createButton(), createForm()).
- **ConcreteFactory**: implementa a AbstractFactory, retornando instâncias concretas de uma família de objetos.
- **Produto Abstrato**: define a interface de um tipo de produto (ex: Button, Form).
- **Produto Concreto**: implementa a interface do produto abstrato (ex: ButtonWindows, FormLinux).
- **Cliente**: utiliza apenas as interfaces das fábricas e produtos, mantendo o código desacoplado.

### Princípios Aplicados
- **Responsabilidade Única (SRP)**: separa claramente o código que cria os objetos do código que os usa.
- **Aberto/Fechado (OCP)**: é possível adicionar novas famílias de produtos (novas fábricas concretas) sem alterar o código existente.
- **Programação orientada a interfaces**: foco total em abstrações, o que permite flexibilidade e baixo acoplamento.

### Aplicação no Projeto
Este projeto implementa o padrão **Abstract Factory** para criação de componentes de interface gráfica para diferentes sistemas operacionais.
Imagine que estamos desenvolvendo um sistema que precisa ter uma interface gráfica. Essa interface gráfica pode conter elementos como botões, formulários e campos de entrada (inputs).
Agora, suponha que nosso sistema precise rodar em diferentes plataformas, como Windows, Linux, macOS ou Android. Cada plataforma possui sua própria maneira de lidar com interfaces gráficas.
Se fôssemos criar classes específicas para cada plataforma, precisaríamos de uma versão diferente de cada componente. Por exemplo, um botão para Windows teria uma implementação diferente de um botão para Linux ou macOS. O mesmo aconteceria para formulários e outros elementos da interface.
Para organizar isso de maneira eficiente, usamos interfaces. Criamos uma interface genérica para cada elemento da interface gráfica, como um `Button` (Botão), e depois implementamos versões específicas para cada plataforma, como `WindowsButton`, `LinuxButton`, `MacButton`, etc.
O problema é garantir que um botão do Windows não seja combinado com um formulário do Linux, pois isso pode causar inconsistências e incompatibilidades.
Para resolver isso, utilizamos o padrão Abstract Factory. Criamos uma fábrica específica para cada sistema operacional. Por exemplo:
- `UIElementsFactoryWindows` -> Cria apenas elementos compatíveis com Windows.
- `UIElementsFactoryLinux` -> Cria apenas elementos compatíveis com Linux.
Cada fábrica garante que os elementos criados pertençam à mesma família, evitando combinações incompatíveis.
Esse padrão é útil para manter a coerência do sistema e garantir que os elementos da interface gráfica sejam sempre compatíveis dentro da mesma plataforma.

