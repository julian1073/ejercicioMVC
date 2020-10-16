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
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class DefaultController implements ActionListener{

    private Default vista;
    private Modelo modelo;

    public DefaultController(Default vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnCalcular.addActionListener(this);
    }
    
    public void iniciar(){
        
        vista.setTitle("Calculo IMC");
        vista.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        
        double imc;
        String concepto = "";
        
        if (validacion()){
            
            modelo.setEstatura(Integer.parseInt(vista.txtEstatura.getText()));
            modelo.setPeso(Integer.parseInt(vista.txtPeso.getText()));

            imc = modelo.calcularImc();

            if (vista.rbtnHombre.isSelected()){
                if(imc < 17 )
                    concepto = "Desnutricion";
                else if(imc >= 17 && imc < 21)
                    concepto = "Bajo peso";
                else if(imc > 20 && imc < 26)
                    concepto = "Peso normal";
                else if(imc > 25 && imc < 31)
                    concepto = "Sobrepeso";
                else if(imc > 30 && imc < 36)
                    concepto = "Obesidad";
                else if(imc > 35 && imc < 41)
                    concepto = "Obesidad marcada";
                else if(imc > 40 )
                    concepto = "Obesidad morbida";
            }
        
            if (vista.rbtnMujer.isSelected()) {
                if(imc < 16 )
                    concepto = "Desnutricion";
                else if(imc > 16 && imc < 21)
                    concepto = "Bajo peso";
                else if(imc > 20 && imc < 25)
                    concepto = "Peso normal";
                else if(imc > 24 && imc < 30)
                    concepto = "Sobrepeso";
                else if(imc > 29 && imc < 35)
                    concepto = "Obesidad";
                else if(imc > 34 && imc < 40)
                    concepto = "Obesidad marcada";
                else if(imc >= 40 )
                    concepto = "Obesidad morbida";
            }    
        
            
            vista.lblConcepto.setText(concepto);
            vista.lblResultado.setText(Double.toString(imc));
        }
    }

    private boolean validacion() {
        
        if (Integer.parseInt(vista.txtEstatura.getText()) <=0 || Integer.parseInt(vista.txtPeso.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "El valor no puede ser menor o igual a cero");
            return false;
        }
        else if (vista.txtEstatura.getText().equals("") || vista.txtPeso.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe digitar ambos campos");
            return false;
        }
        else{
            return true;
        }
    }
}
