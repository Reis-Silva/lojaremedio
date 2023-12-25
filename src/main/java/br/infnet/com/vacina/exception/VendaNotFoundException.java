package br.infnet.com.vacina.exception;

public class VendaNotFoundException extends RuntimeException {
    public VendaNotFoundException(){

    }

    public VendaNotFoundException(String message){
        super(message);
    }
}
