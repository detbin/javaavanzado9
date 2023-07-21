package FinalProject.Ejercicio9;

abstract public class Estado {
    public Maquina maquina;
            public Estado(Maquina maquina){
            this.maquina=maquina;

            }
            abstract public String esperandomoneda();
            abstract public String sacarproducto();
            abstract public String darcambio();
}
