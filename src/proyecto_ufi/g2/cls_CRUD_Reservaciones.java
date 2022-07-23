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
public class cls_CRUD_Reservaciones {
    //------INSTANCIAS----
    cls_funciones clsF = new cls_funciones();
    cls_reservacion[] reservacion = new cls_reservacion[4];
    int cont =0;
    private Object codigo;
    private cls_reservacion[] eliminado;
    
    public void agregarReservacion(){
        int desocupados=0;
        
        for (int i = 0; i < reservacion.length; i++) {
            if(reservacion[i]==null){
                desocupados++;
            }
        }

        
        if(desocupados>0){
            
            //--declaracion de variables
            String idReserva="",namePerson="",mailPerson="",dateIn="",dateOut="",idPerson="",numTelPerson="";

            //--SE PIDEN LOS DATOS DE LA PERSONA---
            namePerson=clsF.cadena("DIGITE EL NOMBRE DEL CLIENTE:");
            mailPerson=clsF.cadena("DIGITE EL CORREO DEL CLIENTE:");
            dateIn=clsF.cadena("DIGITE LA FECHA DE ENTRADA CON EL SIGUIENTE FORMATO"
                    + "\ndd/mm/yy");
            dateOut=clsF.cadena("DIGITE LA FECHA DE SALIDA CON EL SIGUIENTE FORMATO"
                    + "\ndd/mm/yy");
            numTelPerson=clsF.cadena("DIGITE EL NUMERO TELEFONICO DEL CLIENTE:");
            idPerson=clsF.cadena("DIGITE EL NUMERO DE CEDULA DEL CLIENTE");
            idReserva=idPerson;

            reservacion[cont]= new cls_reservacion(idReserva, namePerson, mailPerson, dateIn, dateOut, idPerson, numTelPerson);

            cont++;
            
            
        }else{
            JOptionPane.showMessageDialog(null, "NO EXITE ESPACIO DISPONIBLE");
        }
        
               
    }//fin agregarReservacion
    
    public void leerReservacion(){
        
        if(cont==0){
            JOptionPane.showMessageDialog(null, "NO HAY REGISTROS");
            
        }else{
            int ocupados=0;
            
            //explicar a lucina que si dejamos solo el .lengt sin el if entonces va a leer los epacios en total del array
            //para la parte del get del id
            for (int i = 0; i < reservacion.length; i++) {
                if(reservacion[i]!=null){
                    ocupados++;
                }
            }
            
            JOptionPane.showMessageDialog(null, "Exiten:"+ocupados+" Reservaciones");
            
            for (int i = 0; i < ocupados; i++) {
                JOptionPane.showMessageDialog(null,"Nombre: "+reservacion[i].getNombrePersona()+
                        "\nCod Reserva: "+reservacion[i].getCodigoReservacion()+
                        "\nCedula: "+reservacion[i].getCedulaPersona()+
                        "\nFecha de Entrada: "+reservacion[i].getFechaEntrada()+
                        "\nFecha Salida: "+reservacion[i].getFechaSalida()+
                        "\nEmail: "+reservacion[i].getCorreoPersona()+
                        "\nNumero: "+reservacion[i].getNumeroTelPersona());
            }
            
        }
        
    }//fin leerReservacion
    
    public void modificarReservacion(){
        
    }//fin modificarReservacion
    
    public boolean eliminarReservacion(){
        if(reservacion != null){
            String idReserva =clsF.cadena("DIGITE EL CODIGO DE LA RESERVACION A ELIMINAR:");
            for (int i = 0; i<reservacion.length ; i++) {
                if(reservacion[i] !=null){
                    if (idReserva.equals(reservacion[i].getCodigoReservacion())) {
                        reservacion[i] = null; //la elimina
                        clsF.imprimirMensaje("Reservación "+idReserva+ " eliminada");
                        return true; //encontrada y eliminada 
                    }
                }
            }
            clsF.imprimirMensaje("Reservación no encontrada");//No se encontró
            return  false; 
        }else{
           clsF.imprimirMensaje("No hay ninguna reservacion registrada"); 
            return false; //lista nula 
        }
        
    }//fin elimarReservacion
}
