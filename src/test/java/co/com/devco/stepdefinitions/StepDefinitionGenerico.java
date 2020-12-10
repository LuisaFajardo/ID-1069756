package co.com.devco.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

public class StepDefinitionGenerico {
    @Dado("^que Juan se encuentra en el e-commerce$")
    public void queJuanSeEncuentraEnElECommerce() {
        System.out.println("Me encuentro en el DADO");
    }

    @Cuando("^agrega los tennis al carrito$")
    public void agregaLosTennisAlCarrito() {
        System.out.println("Me encuentro en el CUANDO");
    }

    @Cuando("^agrega los siguientes productos al carrito$")
    public void agregaLosSiguientesProductosAlCarrito(List<Map<String, String>> productos) {
        for(int i = 0; i < productos.size(); i++){
            System.out.println("Producto a agregar: " + productos.get(i).get("nombreProducto"));
        }
    }

    @Cuando("^agrega los siguientes por titulo al carrito$")
    public void agregaLosSiguientesProductosPorTitulo(Map<String, String> productos) {
            System.out.println("Producto a agregar: " + productos.get("tennis"));
            System.out.println("Producto a agregar: " + productos.get("camisa"));
    }

    @Cuando("^ha seleccionado la categoria de productos$")
    public void haSeleccionadoLaCategoriaDeProductos() {
        System.out.println("He seleccionado la Categoria solicitada");
    }


    @Cuando("^agrega 1 (.*) al carrito$")
    public void agregaTennisAlCarritoDos(String producto) {
        System.out.println("Agrego el producto " + producto + " al carrito");
    }


    @Entonces("^el deberia ver el producto en el carrito$")
    public void elDeberiaVerElProductoEnElCarrito() {
        System.out.println("Me encuentro en el ENTONCES \n\n");
    }

    @Dado("^que (.*) agrega los siguientes productos al carrito$")
    public void queJuanAgregaLosSiguientesProductosAlCarrito(String nombreActor, List<Map<String, String>> productos) {
        System.out.println("El usuario " + nombreActor + " Ejecuta: ");
        for(int i = 0; i < productos.size(); i++){
            System.out.println("Producto a agregar escenario CUATRO: " + productos.get(i).get("nombreProducto"));
        }
    }


    @Cuando("^realiza el checkput de su compra actualizando sus datos$")
    public void realizaElCheckputDeSuCompraActualizandoSusDatos(List<Map<String, String>> datos) {
        for(int i = 0; i < datos.size(); i++){
            System.out.println("DATOS PERSONALES");
            System.out.println("NOMBRE escenario CUATRO: " + datos.get(i).get("nombre"));
            System.out.println("CEDULA escenario CUATRO: " + datos.get(i).get("cedula"));
            System.out.println("DIRECCION escenario CUATRO: " + datos.get(i).get("direccion"));
            System.out.println("TELEFONO escenario CUATRO: " + datos.get(i).get("telefono"));
            System.out.println("METODO PAGO escenario CUATRO: " + datos.get(i).get("metodoPago"));
        }
    }

    @Entonces("^el deberia ver que su compra fue exitosa$")
    public void elDeberiaVerQueSuCompraFueExitosa() {
        System.out.println("COMPRA EXITOSA ESCENARIO CUATRO \n\n");
    }
}
