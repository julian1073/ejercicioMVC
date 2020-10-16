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
 * @version 1.0.0
 * @since 16/10/2020
 */
public class DefaultController {

    /**
     * Instancia de la clase Default (vista)
     */
    private Default vista;
    /**
     * Instancia de la clase Modelo (modelo)
     */
    private Modelo modelo;

    /**
     * Constructor de la clase
     * @param vista
     * @param modelo 
     */
    public DefaultController(Default vista, Modelo modelo) {
        
        this.vista = vista;
        this.modelo = modelo;
    }
    
    //Metodo para iniciar la ventana y los eventos de la ventana
    public void iniciar(){
        
        vista.setTitle("Calculo IMC");
        vista.setLocationRelativeTo(null);
        iniciarEventos();
    }
    
    public void iniciarEventos(){
        
        //Evento disparado al hacer clic en el boton calcular
        this.vista.btnCalcular.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                //Variables locales del método
                double imc;
                String concepto = "";

                //Llamada al método validación
                if (validacion()){

                    //Se toman los valores de las cajas de texto
                    modelo.setEstatura(Double.parseDouble(vista.txtEstatura.getText()));
                    modelo.setPeso(Double.parseDouble(vista.txtPeso.getText()));

                    //Se llama al metodo calcularImc de la clase Modelo
                    imc = modelo.calcularImc();

                    //Si el radioboton para el calculo imc de un hombre es seleccionado
                    if (vista.rbtnHombre.isSelected()){
                        //Definicion del concepto
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

                    //Si el radioboton para el calculo imc de una mujer es seleccionado
                    if (vista.rbtnMujer.isSelected()) {
                        //Definicion del concepto
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

                    //Envio de parametros a los elementos de la vista
                    vista.pnlResultado.setVisible(true);
                    vista.lblConcepto.setText(concepto);
                    vista.lblResultado.setText(Double.toString(imc));
                    
                    //Establecer el resultado
                    modelo.setResultado(imc);
                }
            }
        });
        
        //Evento disparado al seleccionar el radioboton hombre
        this.vista.rbtnHombre.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                //Limpiar cajas de texto
                vista.txtEstatura.setText("");
                vista.txtPeso.setText("");
                //Ocultar paneles
                vista.pnlCalcular.setVisible(true);
                vista.pnlResultado.setVisible(false);
            }
        });
        
        //Evento disparado al seleccionar el radioboton mujer
        this.vista.rbtnMujer.addActionListener(new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e){
                
                //Limpiar cajas de texto
                vista.txtEstatura.setText("");
                vista.txtPeso.setText("");
                //Ocultar paneles
                vista.pnlCalcular.setVisible(true);
                vista.pnlResultado.setVisible(false);
            }
        });
    }
    
    //Método para validar los campos de texto de la ventana
    private boolean validacion() {
        
        try{
            //Si los campos de texto son menores o iguales a cero
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
        //Captura de la excepcion numberFormatException
        catch(NumberFormatException e){
            
            //Se envia mensaje de recomendacion
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
