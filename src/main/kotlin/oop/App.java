package oop;

public class App {
    public static void main(String[] args) {
        Ave a = new Ave();
        Reptil r = new Reptil();
        Peixe p = new Peixe();

        Mamifero m = new Mamifero();
        m.setCorPelo("Castanho");
        m.setPeso(80.3);
        m.setIdade(10);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        Cachorro c = new Cachorro();
        c.alimentar();


    }
}
