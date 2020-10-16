/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Modelo;
import View.Default;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class DefaultController {

    private Default vista;
    private Modelo modelo;

    public DefaultController(Default vista, Modelo modelo) {
        
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void iniciar(){
        
        vista.setTitle("Calculo IMC");
        vista.setLocationRelativeTo(null);
        iniciarEventos();
    }
    
    public void iniciarEventos(){
        
        this.vista.btnCalcular.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                double imc;
                String concepto = "";

                if (validacion()){

                    modelo.setEstatura(Double.parseDouble(vista.txtEstatura.getText()));
                    modelo.setPeso(Double.parseDouble(vista.txtPeso.getText()));

                    imc = modelo.calcularImc();

                    if (vista.rbtnHombre.isSelected()){
                        if(imc < 17 )
                            concepto = "Desnutricion";
                        else if(imc >= 17 && imc < 21)
                            concepto = "Bajo peso";
                        else if(imc >= 21 && imc < 26)
                            concepto = "Peso normal";
                        else if(imc >= 26 && imc < 31)
                            concepto = "Sobrepeso";
                        else if(imc >= 31 && imc < 36)
                            concepto = "Obesidad";
                        else if(imc >= 36 && imc < 41)
                            concepto = "Obesidad marcada";
                        else if(imc >= 41 )
                            concepto = "Obesidad morbida";
                    }

                    if (vista.rbtnMujer.isSelected()) {
                        if(imc < 16 )
                            concepto = "Desnutricion";
                        else if(imc > 16 && imc < 21)
                            concepto = "Bajo peso";
                        else if(imc >= 21 && imc < 25)
                            concepto = "Peso normal";
                        else if(imc >= 25 && imc < 30)
                            concepto = "Sobrepeso";
                        else if(imc >= 30 && imc < 35)
                            concepto = "Obesidad";
                        else if(imc >= 35 && imc < 40)
                            concepto = "Obesidad marcada";
                        else if(imc >= 40 )
                            concepto = "Obesidad morbida";
                    }    

                    vista.pnlResultado.setVisible(true);
                    vista.lblConcepto.setText(concepto);
                    vista.lblResultado.setText(Double.toString(imc));
                    modelo.setResultado(imc);
                }
            }
        });
        
        this.vista.rbtnHombre.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                vista.txtEstatura.setText("");
                vista.txtPeso.setText("");
                vista.pnlCalcular.setVisible(true);
                vista.pnlResultado.setVisible(false);
            }
        });
        
        this.vista.rbtnMujer.addActionListener(new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e){
                
                vista.txtEstatura.setText("");
                vista.txtPeso.setText("");
                vista.pnlCalcular.setVisible(true);
                vista.pnlResultado.setVisible(false);
            }
        });
    }
    
    private boolean validacion() {
        
        try{
            if (Double.parseDouble(vista.txtEstatura.getText()) <=0 || Double.parseDouble(vista.txtPeso.getText()) <= 0) {
                
                JOptionPane.showMessageDialog(null, "El valor no puede ser menor o igual a cero");
                vista.txtEstatura.setText("");
                vista.txtPeso.setText("");
                return false;
            }
            else{
                return true;
            }
        }
        catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(null, "Debe digitar los campos y deben ser numericos");
            vista.txtEstatura.setText("");
            vista.txtPeso.setText("");
            return false;
        }
        catch(Exception ex){
            
            Logger.getLogger(DefaultController.class.getName()).log(Level.SEVERE, null, ex);
            vista.txtEstatura.setText("");
            vista.txtPeso.setText("");
            return false;
        }
    }
}
