package ListaFila;

import jdk.internal.jshell.tool.resources.l10n_ja;

public class TesteFila {

        public static void main (String args[]) {
            Lista l= new Lista();
            l.insereFim(3);
            l.insereFim(4);
            l.insereFim(4);
            l.insereFim(4);
            l.insereFim(10);
            System.out.println(l);

            l.removeInicio();
            l.removeInicio();
            System.out.println(l);
        }
}
