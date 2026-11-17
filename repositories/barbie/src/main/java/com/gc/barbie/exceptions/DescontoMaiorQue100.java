package com.gc.barbie.exceptions;

public class DescontoMaiorQue100 extends Exception{
    public DescontoMaiorQue100(){
        super("Seu desconto é maior que 100%");
    }
}
