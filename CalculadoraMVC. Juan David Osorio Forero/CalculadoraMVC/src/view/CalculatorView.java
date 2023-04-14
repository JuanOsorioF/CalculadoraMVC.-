/*
 * @author Juan David Osorio Forero
 */
package view;
// Esta es la Vista, su único trabajo es mostrar lo que el usuario ve
// No ejecuta ningún cálculo, sino que solamente pasa la información ingresada por el usuario a quien la necesite
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {
    private static final long serialVersionUID =1L;
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calcular");
	private JTextField calculateSolution = new JTextField(10);
	
    /**
     * Configura la vista y añade los componentes
     */

	/**
 	* Constructor de la clase CalculatorView. Configura la vista y añade los componentes necesarios.
 	* No recibe parámetros y no devuelve nada.
 	*/
    public CalculatorView()  { 
		JPanel calculatePanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		calculatePanel.add(firstNumber);
		calculatePanel.add(additionLabel);
		calculatePanel.add(secondNumber);
		calculatePanel.add(calculateButton);
		calculatePanel.add(calculateSolution);
		this.add(calculatePanel);
		// Fin de configuración de componentes
    }
	
	// Bloque de getters/setters para proveer acceso a los valores de números (getters), así como para establecer
	// la solución del cálculo realizado (setter), ya que la vista "no sabe" sobre la existencia del modelo
	
	/**
    * Obtiene el valor del primer número ingresado por el usuario en la vista.
    * No recibe parámetros.
    * @return El valor del primer número ingresado como un entero.
    */

	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText()); 
	}

	/**
    * Obtiene el valor del segundo número ingresado por el usuario en la vista.
    * No recibe parámetros.
    * @return El valor del segundo número ingresado como un entero.
    */

	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}

	/**
    * Obtiene el valor de la solución calculada por el modelo y mostrada en la vista.
    * No recibe parámetros.
    * @return La solución calculada como un entero.
    */

	public int getCalcSolution() {		
		return Integer.parseInt(calculateSolution.getText());
	}

	/**
    * Establece el valor de la solución calculada en la vista.
    * Recibe como parámetro un entero que representa la solución calculada.
    * No devuelve nada.
    */
	
	public void setCalcSolution(int solution) {
		calculateSolution.setText(Integer.toString(solution)); 
	}

	/**
     * Si se hace clic en CalculateButton, ejecutr un método en el controlador llamado actionPerformed()
	 *@param listenForCalcButton
     */ 
	public void addCalculateListener(ActionListener listenForCalcButton) {
		calculateButton.addActionListener(listenForCalcButton);
	}
	
	/**
     * Abrimos una ventana emergente que contiene el mensaje de error pasado 
	 * @param  errorMessage
     */
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);	
	}

}