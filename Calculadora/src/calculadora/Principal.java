
package calculadora;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        do{
        System.out.println("¿Desea calculadora en:\n1 consola\n2 interfaz grafica?");
        Scanner miEscaner=new Scanner(System.in);
        int opcion=miEscaner.nextInt();
        
        switch(opcion){
            case 1:{
                Consola interfazConsola=new Consola();
                interfazConsola.imprimir();
            }break;
            case 2:{
                Grafica interfazGrafica=new Grafica();
                interfazGrafica.setVisible(true);
                             
            }break;
        }
        }while(1==1);
    }
    
    
}
