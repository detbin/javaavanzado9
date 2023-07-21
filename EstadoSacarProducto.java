package FinalProject.Ejercicio9;

public abstract class EstadoSacarProducto extends Estado{
    public String EstadoSacarProducto(Maquina maquina){
        super(maquina);
    }
    public String sacarproducto() {
        maquina.cambiaestado(new Estadodarcambio(maquina));
        return "aqui tiene su cambio";
    }

    @Override
    public String esperandomoneda() {
        return"esperandomoneda(): YA HAZ INTRODUCIDO EL DINERO";
    }

    @Override
    public String darcambio() {
        return "darcambio(): ESPERE A TERMINAR DE SACAR EL PRODUCTO";
    }
}