package br.infnet.com.lojaremedio.exception;

public class VendaNotFoundException extends RuntimeException {
    public VendaNotFoundException(){

    }

    public VendaNotFoundException(String message){
        super(message);
    }
}
