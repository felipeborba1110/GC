package com.gc.barbie.exceptions;

public class DescontoNegativo extends Exception{
    public DescontoNegativo(){
        super("Seu desconto é menor que 0%");
    }
}
