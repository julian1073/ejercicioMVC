/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.ejemplomvc.ejemplomvc;

import Controller.DefaultController;
import Model.Modelo;
import View.Default;

/**
 *
 * @author Julian
 */
public class Main {
    
    public static void main(String[] args) {
        
        Modelo model = new Modelo();
        Default view = new Default();
        DefaultController controller = new DefaultController(view, model);
        
        controller.iniciar();
        view.setVisible(true);
    }
}
