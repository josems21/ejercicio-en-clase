
package metodos;

import javax.swing.JOptionPane;


public class Main {
    public static void  main (String []args){
        int n1=Integer.parseInt(JOptionPane.showInputDialog("dijite un numero:"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("dijite un numero:"));
        operacion op=new operacion();
        
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.division(n1, n2);
        op.resultados();
        
    }
}
