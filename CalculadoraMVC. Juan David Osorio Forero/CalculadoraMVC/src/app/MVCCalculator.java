/*
 * @author Juan David Osorio Forero
 */
package app;

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

public class MVCCalculator {
     /**
     * El método principal de la aplicación. Crea un objeto CalculatorView y un objeto CalculatorModel,
     * y luego crea un objeto CalculatorController que toma como parámetros la vista y el modelo.
     * La vista se hace visible al final del método main.
     */

    public static void main(String[]args) {
        // Crea un objeto CalculatorView y un objeto CalculatorModel.
        view.CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new model.CalculatorModel();
        
        //CalculatorController theController = new CalculatorController(theView, theModel);
        // Para no generar un error se instancia un objeto de calcularController
        new CalculatorController(theView, theModel);
        theView.setVisible(true);
    }
}
