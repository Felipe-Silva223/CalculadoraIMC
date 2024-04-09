import java.util.Scanner;

import ClassePrincipal.AlturaxPeso;

public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlturaxPeso digitarInfo = new AlturaxPeso();

        System.out.println("==== Digite a sua Altura (ex.: 1,70) ====");
        Double altura = scanner.nextDouble();
        digitarInfo.setAltura(altura);

        System.out.println("==== Digite o seu PESO (ex.: 69,2) ====");
        Double peso = scanner.nextDouble();
        digitarInfo.setPeso(peso);

        double imc = digitarInfo.retornarResultado();
        String imcFormat = String.format("%.2f", imc);
        System.out.println("Seu IMC: " + imcFormat);

        if (imc < 18.5) {
            System.out.println("Classificação: MAGREZA");
            System.out.println("Grau: 0");
        } else if (imc == 18.5 || imc <= 24.9) {
            System.out.println("Classificação: NORMAL");
            System.out.println("Grau: 0");
        } else if (imc == 25.0 || imc <= 29.9) {
            System.out.println("Classificação: SOBREPESO");
            System.out.println("Grau: I");
        } else if (imc == 30.0 || imc <= 39.9) {
            System.out.println("Classificação: OBESIDADE");
            System.out.println("Grau: II");
        } else {
            System.out.println("Classificação: OBESIDADE GRAVE");
            System.out.println("Grau: III");
        }
        
        scanner.close();
    }
}
