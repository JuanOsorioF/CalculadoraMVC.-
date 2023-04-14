INFORME DE CLASES

El código proporcionado consta de tres clases: CalculatorController, CalculatorModel y CalculatorView. A continuación, se detalla la funcionalidad de cada una de ellas:

CalculatorController
La clase CalculatorController es el controlador del patrón de diseño MVC (Modelo-Vista-Controlador). Es el encargado de recibir las interacciones del usuario en la vista, comunicarse con el modelo para realizar los cálculos necesarios y actualizar la vista con los resultados obtenidos.

La clase CalculatorController tiene los siguientes métodos:

public CalculatorController(CalculatorView theView, CalculatorModel theModel): constructor que recibe una instancia de CalculatorView y CalculatorModel. Se encarga de establecer la vista y el modelo que se utilizarán en el controlador.

public void actionPerformed(ActionEvent e): implementa el método actionPerformed de la interfaz ActionListener. Este método es llamado cada vez que el usuario interactúa con la vista. Se encarga de validar los datos ingresados por el usuario, realizar los cálculos necesarios a través del modelo y actualizar la vista con los resultados obtenidos.


CalculatorModel
La clase CalculatorModel es el modelo del patrón de diseño MVC. Es el encargado de realizar los cálculos necesarios para resolver la operación matemática que se le haya solicitado.

La clase CalculatorModel tiene los siguientes métodos:

public void addTwoNumbers(int firstNumber, int secondNumber): recibe dos números enteros y los suma. El resultado de la suma se almacena en una variable privada llamada calculationValue.

public int getCalculationValue(): devuelve el valor almacenado en la variable privada calculationValue.

CalculatorView
La clase CalculatorView es la vista del patrón de diseño MVC. Es el encargado de mostrar al usuario la interfaz gráfica necesaria para que este pueda interactuar con la aplicación.

La clase CalculatorView tiene los siguientes métodos:

public CalculatorView(): constructor que se encarga de configurar la vista y añadir los componentes necesarios.

public int getFirstNumber(): devuelve el valor del primer número ingresado por el usuario como un entero.

public int getSecondNumber(): devuelve el valor del segundo número ingresado por el usuario como un entero.

public int getCalcSolution(): devuelve el valor de la solución calculada como un entero.

public void setCalcSolution(int solution): establece el valor de la solución calculada en la vista.

public void addCalculateListener(ActionListener listenForCalcButton): añade un ActionListener al botón "Calcular" para que este sea capaz de ejecutar el método actionPerformed del controlador cuando sea presionado.

public void displayErrorMessage(String errorMessage): muestra una ventana emergente con el mensaje de error pasado como parámetro.
