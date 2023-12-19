package br.infnet.com.lojaremedio.exception;

public class VacinaNotFoundException extends RuntimeException {
    public VacinaNotFoundException(){

    }

    public VacinaNotFoundException(String message){
        super(message);
    }
}
