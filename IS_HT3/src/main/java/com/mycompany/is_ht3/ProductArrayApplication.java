
package com.mycompany.is_ht3;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;



/**
 *
 * @author aylin
 */

public class ProductArrayApplication {
    
         public static void main(String[] args) {
             
        //Ejemplo1    
        long[] input = new long[]{1, 2, 3, 4, 5};
        long [] resultado = calculateProductArrayBasic(input); 
        System.out.println("El resultado de la cadena {1, 2, 3, 4, 5} es: ");
        for (int i = 0; i < resultado.length; i++){
                System.out.println( resultado[i]);
        }
         System.out.println("\n");
        
         
        //Ejemplo2    
        long[] input2 = new long[]{};
        long [] resultado2 = calculateProductArrayBasic(input2); 
         System.out.println("El resultado de la cadena []{} es: ");
        for (int i = 0; i < resultado2.length; i++){
                System.out.println(resultado2[i]);
        }
         System.out.println("\n");
         
         
        //Ejemplo3    
        long[] input3 = new long[]{0};
        long [] resultado3 = calculateProductArrayBasic(input3); 
         System.out.println("El resultado de la cadena []{0} es: ");
        for (int i = 0; i < resultado3.length; i++){
                System.out.println(resultado3[i]);
        }
         System.out.println("\n");
         
         
         //Ejemplo4    
        long[] input4 = new long[]{1};
        long [] resultado4 = calculateProductArrayBasic(input4); 
         System.out.println("El resultado de la cadena []{1} es: ");
        for (int i = 0; i < resultado4.length; i++){
                System.out.println(resultado4[i]);
        }
         System.out.println("\n");
         
         
        //Ejemplo5    
        long[] input5 = new long[]{1, 2};
        long [] resultado5 = calculateProductArrayBasic(input5); 
         System.out.println("El resultado de la cadena []{1, 2} es: ");
        for (int i = 0; i < resultado5.length; i++){
                System.out.println(resultado5[i]);
        }
         System.out.println("\n");
        
         
        //Ejemplo6    
        long[] input6 = null;
        long [] resultado6 = calculateProductArrayBasic(input6); 
        System.out.println("El resultado de la cadena null es: ");
        System.out.println(resultado6);
        System.out.println("\n");

        
        //Ejemplo7    
        long[] input7 = new long[0];
        long [] resultado7 = calculateProductArrayBasic(input7); 
        System.out.println("El resultado de la cadena [0] es: ");
        for (int i = 0; i < resultado7.length; i++){
                System.out.println(resultado7[i]);
        }
         System.out.println("\n");
        
        
         
        //Ejemplo8    
        long[] input8 = new long[]{1, 0, 3, 0, 5};
        long [] resultado8 = calculateProductArrayBasic(input8); 
        System.out.println("El resultado de la cadena {1, 0, 3, 0, 5} es: ");
        for (int i = 0; i < resultado8.length; i++){
                System.out.println(resultado8[i]);
        }
         System.out.println("\n");
         
         
         //Ejemplo9    
        long[] input9 = new long[]{1, 2, 3, 0, 5};
        long [] resultado9 = calculateProductArrayBasic(input9); 
        System.out.println("El resultado de la cadena {1, 2, 3, 0, 5} es: ");
        for (int i = 0; i < resultado9.length; i++){
                System.out.println(resultado9[i]);
        }
         System.out.println("\n");

         
         //Ejemplo10    
        long[] inputA = new long[]{9, 8, 3, 4, 5};
        long [] resultadoA = calculateProductArrayBasic(inputA); 
        System.out.println("El resultado de la cadena {9, 8, 3, 4, 5} es: ");
        for (int i = 0; i < resultadoA.length; i++){
                System.out.println(resultadoA[i]);
        }
         System.out.println("\n");
                 
        
        
       }
         
         public static long[] calculateProductArrayBasic(long[] input)
         {
            if (input == null)
            return null;
        
        long[] Arreglo1 = new long[input.length];
        long[] Arreglo2 = new long[input.length]; 
        long[] result = new long[input.length];
       
        long[] aux = null;
        
        for (int x=0; x< input.length;x++){
            Arreglo1 = Arrays.copyOfRange(input, 0, x);
            Arreglo2 = Arrays.copyOfRange(input, x+1, input.length);
            aux = ArrayUtils.addAll(Arreglo1,Arreglo2);

            long total = Arrays.stream(aux).reduce((subtotal, element) -> subtotal * element).orElse(1);
            result[x]=total;
        }
            
        return result;
    }
}
    
