/*
 * @author Juan David Osorio Forero
 */
package controller;

// El Controlador coordina las interacciones entre la Vista y el Modelo

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController{

     /**
     * La vista de la calculadora.
     */

    CalculatorView theView;

    /**
     * El modelo de la calculadora.
     */

    CalculatorModel theModel;

    /**
     * Avisa a la vista que suempre que el botón Calcular se hace clic se ejecuta el
     * método actionPerformed en la clase interna CalculateListener
     * 
     * @param theView
     * @param theModel
     */
    
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new CalculateListener(this));
    }
}

    