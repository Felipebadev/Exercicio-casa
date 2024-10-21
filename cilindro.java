import java.util.Scanner;

public class cilindro {

//Questão 12: Cálculo do Volume de um Cilindro
//Implemente um programa em Java que receba o raio da base e a altura de um
//cilindro e retorne seu volume. A fórmula do volume do cilindro é: 𝑉 = 𝜋 × 𝑟² × ℎ.

public class Lista12 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    double raio, altura, volume, Pi;
        
    System.out.println("Informe o raio do cilindro: ");
    raio = entrada.nextDouble();

    System.out.println("Informe a altura do cilindro: ");
    altura = entrada.nextDouble();

    Pi = 3.14;
    volume = Pi * (raio*raio) * altura;
       
    System.out.println("O volume do cilindro é de: " + volume);
    entrada.close();
    }
  }
}
