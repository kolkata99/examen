// hacer una matriz de 2x2  
package examen;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Examen {
public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int [][] matriz1 = new int [2][2];
        int i,j;
        for(i=0;i<2;i++){
        for(j=0;j<2;j++){
        System.out.println("digite el valor que desea ubicar en la posicion "+ " fila "+i + " columna "+j );
        matriz1[i][j]= teclado.nextInt();
        }
        }
        for(i=0;i<2;i++){
        for(j=0;j<2;j++){
        System.out.print(matriz1[i][j]);
        System.out.print("\t");
        
        }
       System.out.print("\n"); 
        }
           /* String num1 = JOptionPane.showInputDialog("Digite el primer numero");
        String num2 = JOptionPane.showInputDialog("Digite el segundo numero");
        String operador = JOptionPane.showInputDialog("seleccione el operador deseado : * , / , + , - ");
        int res;
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        switch (operador){
        
            case ("*"):
                 res= n1*n2; 
                JOptionPane.showMessageDialog(null,"el resultado es " + res);
                break;
                
            case ("/"):
               res= n1/n2;  
                JOptionPane.showMessageDialog(null,"el resultado es " + res);
                break;
                
            case ("+"):
                 res = n1 + n2;
               JOptionPane.showMessageDialog(null,"el resultado es " + res);
                break;
                
            case ("-"):
                 res = n1-n2;
                JOptionPane.showMessageDialog(null,"el resultado es " + res);
                break;
        
        
        }
        */ 
    }
   
}
