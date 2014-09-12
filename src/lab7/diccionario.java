/*
	Angel Basegoda,		13256
	Sergio Cancinos,	13062
	
	diccionario.java
		Se utiliza en un texto que tiene la oración en ingles y se busca en el diccionario por último se 
                traduce
*/

package lab7;

import lab7.BinaryTree;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List; 
import java.util.*;

/**
 *
 * @author konoha
 */
public class diccionario {
    

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<asociacion> comp = new ArrayList();
        // TODO code application logic here
        File f = new File( "src/diccionario2.txt" );
        BufferedReader input;
        try {
        input = new BufferedReader( new FileReader( f ) );
        String enunciado;
        
        
       
        
        enunciado = input.readLine();
        
       
            while(input.ready()){
                enunciado = input.readLine();

                String vector[] = enunciado.split(",");
                asociacion separado = new asociacion();
                separado.addAsociation( vector[0].substring(1), vector[1].substring(0,vector[1].length()-1));

                comp.add(separado);

            }

        }catch (IOException e) {
        e.printStackTrace();
        }
        
        System.out.println(comp.size());
        System.out.println(comp);
        BinaryTree diccionario2 = new BinaryTree();
        
        for (int x = 0; x < comp.size(); x++){
            diccionario2.addNode(comp.get(x).getKey().toString(), comp.get(x).getValor().toString());
        }
        
        System.out.println(diccionario2);
        diccionario2.inOrderTraverseTree(diccionario2.root);
        int contador = comp.size();
        System.out.println(contador); 
       

        File f1 = new File( "src/texto.txt" );
        BufferedReader input2;
        try {
            input2 = new BufferedReader( new FileReader( f1 ) );
            String enunciado2;
            enunciado2 = input2.readLine();
            enunciado2 = enunciado2.toLowerCase();
            System.out.println(enunciado2);
            
            
            String[] palabras = enunciado2.split(" ");
            String cadena = "";
            for (int x =0; x < palabras.length; x++){
                System.out.println(palabras[x]);
                String traducir = diccionario2.findName(palabras[x].toString());
                System.out.println(traducir);
                if(palabras[x].equals("tree")|| palabras[x].equals("tangent")|| palabras[x].equals("love") || palabras[x].equals("lunch") || palabras[x].equals("computer")|| palabras[x].equals("camera") || palabras[x].equals("nacho") || palabras[x].equals("shirt") || palabras[x].equals("cellphone")){
                    cadena += traducir + " ";
                }else{
                    cadena += " *"+palabras[x]+"* ";
                }
            }
            
            System.out.println(cadena);
            
            
        }catch (IOException e) {
        e.printStackTrace();
        }   
        
         
    }
    
    
}
