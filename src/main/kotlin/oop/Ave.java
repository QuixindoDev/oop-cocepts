package oop;

public class Ave extends Animal{
    private String corPena;

    public void fazNinho(){
        System.out.println("Construiu um ninho");
    }

    public void setCorPena(String cor){
        this.corPena = cor;
    }

    public String getCorPena(){
        return corPena;
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo frutas");
    }

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
}
