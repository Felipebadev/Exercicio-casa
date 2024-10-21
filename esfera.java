import java.util.Scanner;

public class esfera {

//Questão 10: Cálculo do Volume de uma Esfera
//Implemente um programa em Java que receba o raio de uma esfera e retorne seu
//volume. A fórmula do volume de uma esfera é dado por: 𝑉 = 4 / 3 × 𝜋 × 𝑟³

    
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double raio;
    double volume;
    double Pi;
    
    System.out.println("Informe o raio da esfera: ");
    raio = entrada.nextDouble();

    Pi = 3.14;
    volume = (4 / 3) * Pi * Math.pow(raio, 3);
       
    System.out.println("O volume da esfera é de: " + volume);
    entrada.close();
    }
}
