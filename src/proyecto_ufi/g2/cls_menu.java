/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_ufi.g2;

import javax.swing.JOptionPane;

/**
 *
 * @author Derek
 */
public class cls_menu {
    //---instacias--
    cls_funciones clsF = new cls_funciones();
    cls_CRUD_Reservaciones clsCR = new cls_CRUD_Reservaciones();
    
    public void menuPrincipal(){
        
        char opcion=' ';
        
        do{
            opcion=clsF.caracter("DIGITE LA OPCION DEL MENU A HACER"
                    + "\n1.AGREGAR RESERVACION"
                    + "\n2.LEER RESERVACION"
                    + "\n3.MODIFICAR RESERVACION"
                    + "\n4.ELIMINAR RESERVACION"
                    + "\n9.SALIR");
            
            
            switch (opcion) {
                case '1':
                    clsCR.agregarReservacion();
                    break;
                case '2':
                    clsCR.leerReservacion();
                    break;
                case '3':
                    clsCR.modificarReservacion();
                    break;
                case '4':
                    clsCR.eliminarReservacion();
                    break;
                case '9':
                    opcion='S';
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
            }
            
            
        }while(opcion!='S');
        JOptionPane.showMessageDialog(null, "GRACIAS POR UTILIZAR LA APLICACION");
        
    }

}
