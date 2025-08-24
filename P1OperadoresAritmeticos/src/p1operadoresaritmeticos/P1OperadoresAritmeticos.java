
package p1operadoresaritmeticos;

import javax.swing.JOptionPane;

public class P1OperadoresAritmeticos {

     public static int suma(int sumando1, int sumando2) 
     {
     
        int suma = sumando1 + sumando2;
         
         return suma;
     }
     
     public static int resta(int numero1, int numero2) 
     {
     
         int diferencia = numero1 - numero2;
         
         return diferencia;
     }
     
     public static int multiplicacion(int numero1, int numero2)
     {
     
         int producto = numero1 * numero2;
         return producto;
     
     }
    
    
    public static int division(int n1, int n2)
    {
        int resultado;
        resultado = n1 / n2;
        
        return resultado;
    }
    
    public static void mostrar(int resultado)
    {
    
        JOptionPane.showMessageDialog(null, "Su resultado es: "+resultado);
        
       
    
    }
    
    
    
    public static void main(String[] args) {
        
        
        
        
        int ingresado1, ingresado2, resultado;
        boolean seguimos = true;
        
        JOptionPane.showMessageDialog(null, "Hola, este es mi primer programa en Java.");
        
        
        while(seguimos) 
        {
        
        JOptionPane.showMessageDialog(null, "Vamos a calcular la suma de dos enteros");
          
        ingresado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu primer sumando"));
        ingresado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu segundo sumando"));
        
        resultado = suma(ingresado1, ingresado2);
        
        mostrar(resultado);
        
        JOptionPane.showMessageDialog(null, "Ahora vamos a hacer una resta");
        
        ingresado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu primer digito"));
        ingresado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu segundo digito"));
        
        resultado = resta(ingresado1, ingresado2);
        
        mostrar(resultado);
        
        JOptionPane.showMessageDialog(null, "Que te parece una multiplicacion?");
        
        ingresado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu primer factor"));
        ingresado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu segundo factor"));
        
        resultado = multiplicacion(ingresado1, ingresado2);

        mostrar(resultado);
        
        JOptionPane.showMessageDialog(null, "Por ultimo, una division");

        ingresado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu dividendo"));
        ingresado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu divisor"));
        
        resultado = division(ingresado1, ingresado2);
        mostrar(resultado);
        
        int codigo = JOptionPane.showConfirmDialog(null, "Quieres seguir computando?","Seguimos?",JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            if(codigo == JOptionPane.YES_OPTION)
            {
                seguimos = true;
            } else if(codigo == JOptionPane.NO_OPTION)
            {
                seguimos = false;
            }
            
        
        }
    }
    
}
