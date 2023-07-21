package FinalProject.Ejercicio9;

public abstract class Estadodarcambio extends Estado{

    public Estadodarcambio(Maquina maquina){
            super(maquina);
        }

        @Override
        public String sacarproducto() {
            return "sacarproducto(): YA SU PRODUCTO HA SIDO ENTREGADO";
        }

        @Override
        public String darcambio() {
            maquina.cambiaestado(new EstadoEsperandoMoneda(maquina));
            return "darcambio(): SU CAMBIO ESTA SIENDO PROCESADO";
        }
    }

