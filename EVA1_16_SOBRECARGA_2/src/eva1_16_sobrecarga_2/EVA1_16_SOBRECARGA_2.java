/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_sobrecarga_2;

/**
 *
 * @author invitado
 */
public class EVA1_16_SOBRECARGA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Suma: "+suma(2,3));
        System.out.println("Suma: "+suma(2.2,3.8));
        System.out.println("Suma: "+suma("h","ola"));
        suma();
    }
    
    
    
    
                            //firma suma(int,int)
                            //solo cuenta como firma el tipo de variables, o cantidad de parametros
    public static int suma(int n1, int n2){
        return n1+n2;
    }
    
    public static double suma(double n1, double n2){
        return n1+n2;
    }
    
    public static String suma(String n1, String n2){
        return n1+n2;
    }
    
    
    public static void suma(){
        System.out.println("nada");
    }
}
