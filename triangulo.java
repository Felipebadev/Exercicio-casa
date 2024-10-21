import java.util.Scanner;

public class triangulo {

//Questão11: Cálculo da Área de um Triângulo
//Implemente um programa em Java que receba a base e a altura de um triângulo e
//imprima sua área. A fórmula da área do triângulo é dada por: 𝐴 = 𝑏𝑎𝑠𝑒 × 𝑎𝑙𝑡𝑢𝑟𝑎 / 2.
 
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double base;
    double altura;
    double area;
    
    System.out.println("Informe a base do triangulo: ");
    base = entrada.nextDouble();

    System.out.println("Informe a altura do triangulo: ");
    altura = entrada.nextDouble();

    area = base * altura / 2;
    
    System.out.println("A área é calculada é: " + area);
    entrada.close();
    }
    

    
}
    

