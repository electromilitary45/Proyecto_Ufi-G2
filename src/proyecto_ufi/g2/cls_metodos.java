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
        String user="admin",pass="admin";
        if(JF_inicioSesion.jtf_user.getText().isEmpty() ||JF_inicioSesion.jpf_pass.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Debe rellenar los espacios");
        }else if(JF_inicioSesion.jtf_user.getText().equals(user) && JF_inicioSesion.jpf_pass.getText().equals(pass)){
            ini=true;
        }else{
            JOptionPane.showMessageDialog(null, "Credenciales Incorrectas");
        }
        return ini;
    }//fin inicio sesion
    
    
    
}//fin class
