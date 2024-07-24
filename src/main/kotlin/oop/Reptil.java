package oop;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Se locomoveu");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentou");
    }

    @Override
    public void emitirSom() {
        System.out.println("Esta emitindo seu som.");
    }
}
