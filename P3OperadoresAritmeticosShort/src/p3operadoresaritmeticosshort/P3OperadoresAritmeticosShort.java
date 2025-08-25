/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3operadoresaritmeticosshort;

import javax.swing.JOptionPane;

/**
 *
 * @author milto_
 */
public class P3OperadoresAritmeticosShort {

    public static short sumaShorts(short num1, short num2)
    {
        
    short suma = (short)(num1 + num2);   
        
    return suma;
    }
    
    
    public static short restaShort(short n1, short n2)
    {
    
        short diferencia = (short)(n1 -  n2);
        
        return diferencia;
    }
    
    public static short multiplicacionShort(short n1, short n2)
    {
    
        short producto = (short)(n1 * n2);
        return producto;
        
    }
    
    public static short divisionShort(short n1, short n2) 
    {
    
     short resultado = (short)(n1 / n2);
     return resultado;
    }
    
    public static void mostrarResultados(short resultado)
    {
        JOptionPane.showMessageDialog(null, "Tu resultado es: \n" + resultado);
    }
    
    public static void main(String[] args) {
    boolean seguimos = true;
    short input1, input2;
    
    JOptionPane.showMessageDialog(null, "Hola, ahora trabajaremos con tipos de dato Short");
       
    while(seguimos)
    {
    JOptionPane.showMessageDialog(null, "Vamos a sumar tipos de dato Short");
    
    input1 = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu primer sumando: "));
    input2 = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu segundo sumando: "));
    
    mostrarResultados(sumaShorts(input1, input2));
    
    JOptionPane.showMessageDialog(null, "Ahora haremos la resta.");
    
    input1 = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu primer numero: "));
    input2 = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu segundo numero: "));
    
    mostrarResultados(restaShort(input1, input2));
    
    JOptionPane.showMessageDialog(null, "Y si obtenemos el producto de una multiplicacion?");
    
    input1 = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu primer factor"));
    input2 = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu segundo factor"));
    
    mostrarResultados(multiplicacionShort(input1, input2));
    
    JOptionPane.showMessageDialog(null, "Por ultimo, una division");
    
    input1 = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu dividendo"));
    input2 = Short.parseShort(JOptionPane.showInputDialog("Ingresa tu divisor"));
    
    mostrarResultados(divisionShort(input1, input2));
    
    int seguimosSioNo = JOptionPane.showConfirmDialog(null, "Seguimos computando?", "Seguimos?", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
    
        if (seguimosSioNo == JOptionPane.NO_OPTION)
        {
            seguimos = false;
        }
    
    }
        
    }
    
}
