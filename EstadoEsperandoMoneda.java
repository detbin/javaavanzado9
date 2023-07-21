package FinalProject.Ejercicio9;

public abstract class EstadoEsperandoMoneda extends Estado{
    public EstadoEsperandoMoneda(Maquina maquina){
        super(maquina);
    }

    @Override
    public String esperandomoneda() {
        maquina.cambiaestado(new EstadoSacarProducto(maquina));
        return "seleccione el producto";
    }

    @Override
    public String sacarproducto() {
        return"No ha introducido el dinero";
    }

    @Override
    public String darcambio() {
        return "No ha introducido el dinero";
    }
}
