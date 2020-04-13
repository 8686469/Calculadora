/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**Prueba de edición directamente en el repositorio
 *añadiendo nuevo comentario desde Netbeans
 * @author María Dolores Romero Martínez
 * @version 23/03/20 v.1
 */
public class Calculadora {
    private int num1;
    private int num2;
    
    /**
     * Constructor 
     * @param a
     * @param b 
     */
    public Calculadora (int a, int b){
        num1=a;
        num2=b;
                
    }
    
    
    /**
     * Método suma, realiza suma las variables de la clase
     * @return resultado
     */
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    /**
     * Método resta, realiza la resta de las variables de la clase
     * @return resultado
     */
    public int resta(){
        int result=num1-num2;
        return result;
    }
    
    /**
     * Método multiplica, realiza el producto de las variables de la clase
     * @return resultado
     */
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    /**
     * Método divide, realiza la división entre las variables de la clase
     * @return resultado
     * @throws ArithmeticException divisón por 0
     */
    public int divide(){
        if (num2==0){
            throw new java.lang.ArithmeticException("División por 0");
        }else{
        int result=num1/num2;
        return result;
        }
    }
}
