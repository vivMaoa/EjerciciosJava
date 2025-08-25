
package pkg4poperadoresaritmeticoslong;

import javax.swing.JOptionPane;


public class Main {
        
    public static long sumaLong(long n1, long n2)
    {
    
        long suma = n1 + n2;
        return suma;
    }
    
    public static long restaLong(long n1, long n2)
    {
        long diferencia = n1 - n2;
        return diferencia;
    }
    
    public static long multiplicacionLong(long n1, long n2)
    {
    
      long producto = n1 * n2;
      return producto;
        
    }
    
    public static long divisionLong(long n1, long n2)
    {
    
        long cociente = n1 / n2;
        return cociente;
    }
    
    public static long moduloLong(long n1, long n2)
    {
        
        long modulo = n1 % n2;
        return modulo;
    
    }
    
    public static void mostrarResultados(long resultado)
    {
    
    JOptionPane.showMessageDialog(null, "Tu resultado es: "+ resultado);
    
    }
            
    
    public static void main(String[] args) {
    
    long input1, input2; 
    boolean seguimos = true; 
        
    JOptionPane.showMessageDialog(null, "Hola, ahora trabajaremos con tipo de data long");
    
    while(seguimos)
    {
        //Aqui haremos la suma, asignaremos valores a cada input y mostraremos el resultado
        input1 = Long.parseLong(JOptionPane.showInputDialog("Ingresa tu primer sumando: "));
        input2 = Long.parseLong(JOptionPane.showInputDialog("Ingresa tu segundo sumando: "));
        mostrarResultados(sumaLong(input1, input2));
        //Aqui el usuario empieza a hacer la resta, re-definiendo el valor de las variables input
       JOptionPane.showMessageDialog(null, "Ahora iremos con la resta, hagamos una resta.");
       input1 = Long.parseLong(JOptionPane.showInputDialog("Ingresa tu minuendo: "));
       input2 = Long.parseLong(JOptionPane.showInputDialog("Ingresa tu sustraendo: "));
       mostrarResultados(restaLong(input1, input2));
       //Aqui el usuario empieza con la etapa de multiplicacion, re-asignando valor a los input
       JOptionPane.showMessageDialog(null, "Ahora hagamos una multiplicacion");
       input1 = Long.parseLong(JOptionPane.showInputDialog("Ingresa tu primer factor"));
       input2 = Long.parseLong(JOptionPane.showInputDialog("Ingresa tu segundo factor"));
       mostrarResultados(multiplicacionLong(input1, input2));
       //Aqui el usuario empieza con la etapa de multiplicacion, volviendo a definir el valor de los input//
       JOptionPane.showMessageDialog(null, "Antes de ir a la parte final, dividamos: ");
       input1 = Long.parseLong(JOptionPane.showInputDialog("Ingrese su dividendo: "));
       input2 = Long.parseLong(JOptionPane.showInputDialog("Ingrese su divisor: "));
       mostrarResultados(divisionLong(input1, input2));
       //Aqui finalmente vamos con ultima fase, la de modulo.
       JOptionPane.showMessageDialog(null, "Finalmente. vamos con el modulo");
       input1 = Long.parseLong(JOptionPane.showInputDialog("Ingrese su dividendo"));
       input2= Long.parseLong(JOptionPane.showInputDialog("Ingrese su divisor"));
       mostrarResultados(moduloLong(input1, input2));
       
       //Aqui vamos a implementar el codigo que decide si seguimos operando o no
       
       int seguimosSioNo = JOptionPane.showConfirmDialog(null, "Quieres seguir operando?", "Quieres seguir", JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE );
       if (seguimosSioNo == JOptionPane.NO_OPTION) 
       {
       
           seguimos = false;
       
       }
    }
    }
    
}
