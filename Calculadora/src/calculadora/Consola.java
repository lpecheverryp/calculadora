/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Consola {
    
    Calculadora numerosConsola=new Calculadora();
    
    public void imprimir(){
        int Seleccion;
        System.out.println("Selecciones operacion\n1 Sumar\n2 Restar\n3 Multiplicar\n4 Dividir");
        Scanner miEscaner=new Scanner(System.in); 
        Seleccion=miEscaner.nextInt();
        System.out.println("Ingrese el primer número:");
        numerosConsola.numero1=miEscaner.nextInt();
        System.out.println("Ingrese el segundo número:");
        numerosConsola.numero2=miEscaner.nextInt();
        System.out.println("Respuesta:");
        switch(Seleccion){
            case 1:{
                System.out.println(numerosConsola.Sumar());
            }break;
            case 2:{
                System.out.println(numerosConsola.Restar());
            }break;
            case 3:{
                System.out.println(numerosConsola.Multiplicar());
            }break;
            case 4:{
                System.out.println(numerosConsola.Dividir());
            }break;
        }
            
        }
        
    }
    

