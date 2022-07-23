/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_ufi.g2;

/**
 *
 * @author Derek
 */
public class cls_reservacion {
    
    //-----declaracion de variables------
    private String codigoReservacion,nombrePersona
            ,correoPersona,fechaEntrada,fechaSalida
            ,cedulaPersona,numeroTelPersona, estado;
    
    


    //---Creacion Constructor---
    
    public cls_reservacion(String idReserva, String namePerson, String mailPerson, String dateIn, String dateOut, String idPerson, String numPerson) {
        this.codigoReservacion=idReserva;
        this.nombrePersona=namePerson;
        this.correoPersona=mailPerson;
        this.fechaEntrada=dateIn;
        this.fechaSalida=dateOut;
        this.cedulaPersona=idPerson;
        this.numeroTelPersona=numPerson;
    }
    
    //-------GETTERS Y SETTERS------------

    public String getCodigoReservacion() {
        return codigoReservacion;
    }

    public void setCodigoReservacion(String codigoReservacion) {
        this.codigoReservacion = codigoReservacion;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public String getNumeroTelPersona() {
        return numeroTelPersona;
    }

    public void setNumeroTelPersona(String numeroTelPersona) {
        this.numeroTelPersona = numeroTelPersona;
    }

    
    
    
    
}//fin class
