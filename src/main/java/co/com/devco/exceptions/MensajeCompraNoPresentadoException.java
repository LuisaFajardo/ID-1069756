package co.com.devco.exceptions;

public class MensajeCompraNoPresentadoException extends AssertionError{
    public static final String MENSAJE_COMPRA_FALLIDA = "La compra no se ha realizado";

    public MensajeCompraNoPresentadoException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
