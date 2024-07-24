package oop;

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha(){
        System.out.println("Esta soltando bolhas");
    }

    public void setCorEscama(String cor) {
        this.corEscama = cor;
    }

    public String getCorEscama() {
        return corEscama;
    }

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom(){
        System.out.println("Peixe n faz som");
    }
}
