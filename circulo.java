import java.util.Scanner;

public class circulo {

    public static void main(String[] args) {
        Scanner entrada =  new Scanner (System.in);
        
        System.out.println("digite a area do circulo");
        double raio = entrada.nextDouble();
        
        entrada.close();

        double area = 3.14 * raio * raio;

        System.out.println("Area do circulo: " +area);
    
    }
    
}
