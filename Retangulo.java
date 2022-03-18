/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SENAI
 */
public class Retangulo {

    private int base, altura;

    public Retangulo(int initbase, int initaltura) {
        this.base = initbase;
        this.altura = initaltura;

    }

    public void SetBase(int novaBase) {
        base = novaBase;
    }

    public void Setaltura(int NovaAltura) {

        altura = NovaAltura;

    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
   public int calcularArea(){
   return base * altura;
   }
   public int calcularPerimetro(){
   return base + altura;
   
   }
}
