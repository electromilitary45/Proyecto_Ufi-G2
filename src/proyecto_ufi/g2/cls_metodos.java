/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_ufi.g2;

import javax.swing.JOptionPane;
import vistas.JF_inicioSesion;

/**
 *
 * @author Derek
 */
public class cls_metodos {
    
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
    
    
    //------------METODOS PARA LIMPIAR ESPACIOS-------------------
    public void limpiarInicioSesion(){//
        JF_inicioSesion.jtf_user.setText("");
        JF_inicioSesion.jpf_pass.setText("");
    }
    
}//fin class
