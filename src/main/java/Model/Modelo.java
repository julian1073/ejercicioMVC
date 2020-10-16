/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Julian
 * @version 1.0.0
 * @since 16/10/2020
 */
public class Modelo {
    
    /**
     * variable tipo double que almacena la estatura
     */
    private double estatura;
    /**
     * variable tipo double que almacena el peso
     */
    private double peso;
    /**
     * variable tipo double que almacena el resultado del calculo de IMC
     */
    private double resultado;
    /**
     * variable tipo string que almacena el concepto de la persona segun el IMC 
     */
    private String concepto;

    //Metodo get para estatura
    public double getEstatura() {
        return estatura;
    }

    //Método set para estatura
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    //Método get para el peso
    public double getPeso() {
        return peso;
    }

    //Método set para el peso
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Método get para el resultado
    public double getResultado() {
        return resultado;
    }

    //Método set para el resultado
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    //Método get para el concepto
    public String getConcepto() {
        return concepto;
    }

    //Método set para el concepto
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    //Método donde se calcula el IMC aplicando la formula
    public double calcularImc(){
        
        estatura = estatura/100; //Se pasan los cm a metros para hacer el calculo
        return peso/(Math.pow((estatura), 2));
    }
}
