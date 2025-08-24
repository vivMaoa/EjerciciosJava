
package p2operadoresarimeticosdouble;

import javax.swing.JOptionPane;

public class P2OperadoresArimeticosDouble {
    
    public static double sumaDouble(double n1, double n2)
    {
        double suma = n1 + n2;
        return suma;
    }
    
    
    public static double resta(double n1, double n2)
    {
    
        double diferencia = n1 - n2;
        return diferencia;
    
    }
    
    public static double multiplicacion(double n1, double n2)
    {
    
        double producto = n1 * n2;
        return producto;
        
    }
    
    public static double division(double n1, double n2) 
    {
    
        double division = n1 / n2;
        return division;
    }
    
    public static void mostrarResultados(double resultado)
    {
    
        JOptionPane.showMessageDialog(null, "Tu resultado es: "+resultado);
        
    }
    

    
    
    public static void main(String[] args) 
    {
        
       boolean seguimos = true;
       
       double input1 = 0, input2 = 0; 
       
       
       JOptionPane.showMessageDialog(null, "Hola, ahora operemos con Double");
       
       while(seguimos) {
       
       JOptionPane.showMessageDialog(null, "Operemos con suma");

       
       input1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu primer sumando: "));
       input2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu segundo sumando: "));
       
       mostrarResultados(sumaDouble(input1, input2));
       
       JOptionPane.showMessageDialog(null, "Ahora hagamos una resta");
       
       input1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu primer numero: "));
       input2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu segundo numero: "));
       
       mostrarResultados(resta(input1, input2));
       
       JOptionPane.showMessageDialog(null, "Ahora hagamos una multiplicacion");
     
       input1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu primer factor: "));
       input2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu segundo factor: "));
       
       mostrarResultados(multiplicacion(input1, input2));
       
       JOptionPane.showMessageDialog(null, "Por ultimo una division");
       
       input1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu dividendo"));
       input2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu divisor"));
       
       mostrarResultados(division(input1, input2));
       
       int seguimosSioNo = JOptionPane.showConfirmDialog(null, "Quieres seguir computando?", "Quieres seguir?", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
       
       if(seguimosSioNo == JOptionPane.NO_OPTION)
       {
          seguimos = false;
       }
       
       }
    }
    
}
