/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_ufi.g2;

import javax.swing.JOptionPane;
import vistas.JF_inicioSesion;
import vistas.JF_menu;

/**
 *
 * @author Derek
 */
public class cls_metodos {
    cls_funciones clsF = new cls_funciones();
    //Metodo de inicio de sesion para la vista 'JF_incioSesion'
    
    public boolean inicioSesion(){
        
        boolean ini=false;
        //---variables---
        String user="admin",pass="admin";
        
        //----------PROCESO INICIO SESION------------------
        if(JF_inicioSesion.jtf_user.getText().isEmpty() ||JF_inicioSesion.jpf_pass.getText().isEmpty() ){ //Si los espacios estan vacios manda un mensaje para que rellene los campos
            JOptionPane.showMessageDialog(null, "Debe rellenar los espacios"); //mensaje
        }else if(JF_inicioSesion.jtf_user.getText().equals(user) && JF_inicioSesion.jpf_pass.getText().equals(pass)){//Si los espacios son iguales a las variables 'user' y 'pass' entonces 
            ini=true; //la varable 'ini' se convierte en true para avisar al JF que los las credenciales son correctas
        }else{
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            
        }
        
        //-----------RETORNO-----------------
        return ini;
        
    }//fin inicio sesion
    
    //Metodo para creacion de reserva
    
    public void creacionReserva(){
        String nombre="",correo="",fechaEnt="",fechaSal="",id="",numeroTel="";
        
        
        nombre=JF_menu.jtf_nomPersona.getText();
        correo=JF_menu.jtf_correoPers.getText();
        fechaEnt=JF_menu.jtf_fechaEnt1.getText();
        id=JF_menu.jtf_idPers.getText();
        numeroTel=JF_menu.jtf_numPersona.getText();
        
        //id= clsF.numero(JF_menu.jtf_idPers.getText());
        
        if(JF_menu.jtf_correoPers.getText().isEmpty() || JF_menu.jtf_fechaEnt1.getText().isEmpty() || JF_menu.jtf_fechaSal.getText().isEmpty() || JF_menu.jtf_idPers.getText().isEmpty() || 
                JF_menu.jtf_nomPersona.getText().isEmpty() || JF_menu.jtf_numPersona.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los espacios");
        }else{//entra a este else porque ningun espacio esta vacio
            if(id.length() != 9){
                JF_menu.jtf_idPers.setText("");
                JOptionPane.showMessageDialog(null, "La cedula de la persona debe ser igual a 9 digitos");
            }else if(numeroTel.length() !=8){
                JF_menu.jtf_numPersona.setText("");
                JOptionPane.showMessageDialog(null, "El numero de telefono debe ser igual a 8 digitos");
            }else if(id.length()!=9 && numeroTel.length()!=8){
                JF_menu.jtf_idPers.setText("");
                JF_menu.jtf_numPersona.setText("");
                JOptionPane.showMessageDialog(null, "El numero de telefono y el numero de cedula tiene un tamaño incorrecto");
                
            }/*else if(){
            }*///aqui debe ir una conducion p para que en caso de quue todos los dato 
        }
        
        
        
    }//fin creacion reserva 
    
    //------------METODOS PARA LIMPIAR ESPACIOS-------------------
    
    
    public void limpiarInicioSesion(){//
        JF_inicioSesion.jtf_user.setText("");
        JF_inicioSesion.jpf_pass.setText("");
    }
    
}//fin class
