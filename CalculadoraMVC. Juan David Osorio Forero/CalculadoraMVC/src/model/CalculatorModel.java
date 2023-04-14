/*
 * @author Juan David Osorio Forero
 */
package model;

public class CalculatorModel {
    // Holds the value of the sum of the number entered in the view

    // Variable privada que almacena el valor de la suma de los números ingresados en la vista
    private int calculationValue;
    
    /**
     * Suma dos números enteros y almacena el resultado en la variable calculationValue.
     * @param firstNumber el primer número a sumar
     * @param secondNumber el segundo número a sumar
     */

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = firstNumber + secondNumber;
    }

    /**
     * Devuelve el valor almacenado en la variable calculationValue.
     */

    public int getCalculationValue() {
        return calculationValue;
    }   
}