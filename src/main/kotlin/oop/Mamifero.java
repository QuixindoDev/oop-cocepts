package oop;

public class Mamifero extends Animal{
    private String corPelo;

    @Override
    public void locomover(){
        System.out.println("Correndo");
    }

    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Esta emitindo o seu som de mamifero");
    }

    public void setCorPelo(String cor){
        this.corPelo = cor;
    }

    public String getCorPelo(){
        return corPelo;
    }


}
