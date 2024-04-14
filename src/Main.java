
public class Main {
    public static void main(String[] args) {
        // criando os países
        Pais brasil = new Pais("Brasil", 212559417, 8515770);
        Pais argentina = new Pais("Argentina", 46185813, 2780400);
        Pais uruguai = new Pais("Uruguai", 3551724, 176215);

        // criando o continente
        Continente americaDoSul = new Continente("América do Sul");

        // adicionando países no continente
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(uruguai);

        // mostrar informações no console
        americaDoSul.mostrarInformacoes();

    }
}