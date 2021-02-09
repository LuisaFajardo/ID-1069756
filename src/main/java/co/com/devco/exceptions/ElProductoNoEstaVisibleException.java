package co.com.devco.exceptions;

public class ElProductoNoEstaVisibleException extends AssertionError{
    public static final String ARTICULO_NO_VISIBLE = "Tu articulo no esta visible";

    public ElProductoNoEstaVisibleException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
