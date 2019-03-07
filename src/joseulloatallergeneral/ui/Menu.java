package joseulloatallergeneral.ui;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class Menu {
    
    public Menu(){
        this.principal();
    }
    
    private final String opciones = "Agencia de viajes\n"
            + "1) Ver los paquetes.\n"
            + "2) Ver las busetas.\n"
            + "3) Agregar paquetes.\n"
            + "4) Agregar clientes.\n"
            + "5) Salir.\n";
    
    private void principal(){   
        int opt = 0;
        while(opt != 5){
            try {
                opt = Integer.parseInt(JOptionPane.showInputDialog(opciones));
                switch(opt){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Adios!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción digitada no existe", 
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } catch(HeadlessException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "La entrada digitada no es válida", 
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
