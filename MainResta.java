import java.util.Scanner;
public class MainResta{ 
    

    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        int y,x;

         System.out.println("ingresa un numero entero");

         x=op.nextInt();

         System.out.println("ingresa otro numero entero");

         y=op.nextInt();

         Resta evaluar = new Resta();
         evaluar.setX(x);
         evaluar.setY(y);
        System.out.println("el resultado es:" +evaluar.mostrarResultado());
    }

}
