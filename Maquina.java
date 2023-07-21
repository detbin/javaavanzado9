package FinalProject.Ejercicio9;

public class Maquina {
    public Estado estado;
    public Maquina(){
        estado= new EstadoEsperandoMoneda(this);
    }
    public void cambiaestado(Estado estado){
        System.out.println("Estado Inicial:"+this.estado.getClass().getName());
        this.estado=estado;
        System.out.println("Estado Final:"+this.estado.getClass().getName());
    }

    public Estado getEstado() {
        return estado;
    }
}
