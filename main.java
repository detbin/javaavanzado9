package FinalProject.Ejercicio9;

public class main {
    public static void main(String[] arg) {
        Maquina maquina= new Maquina();
        System.out.println(maquina.estado.esperandomoneda());
        System.out.println(maquina.estado.darcambio());
        System.out.println(maquina.estado.sacarproducto());
        System.out.println(maquina.estado.darcambio());

    }
}
