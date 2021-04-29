package ed.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Mauricio");
        fila.adiciona("Guilherme");

        System.out.println(fila);

        String x1 = fila.remove();

        System.out.println(x1);
        System.out.println(fila);

        System.out.println(fila.vazia());

        Queue<String> filaDoJava = new LinkedList<>();

        filaDoJava.add("Mauricio");
        String x2 = filaDoJava.poll();

        System.out.println(x2);
    }
}
