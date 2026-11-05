

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {

            System.out.println("-----CALCULADORA-----");
            System.out.println("Qual das operações você deseja utilizar?");
            System.out.println("1 => Soma");
            System.out.println("2 => Subtração");
            System.out.println("3 => Multiplicação");
            System.out.println("4 => Divisão");
            System.out.println("0 => Sair");
            opcao = sc.nextInt();
            double resultado;

            if (opcao >= 1 && opcao <= 4) {

                System.out.println("Digite o primeiro número:");
                double num1 = sc.nextDouble();

                System.out.println("Digite o segundo número:");
                double num2 = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Erro: divisão por zero.");
                        }
                        break;

                }
            } else if (opcao == 0) {
                System.out.println("Até mais!");
            } else {
                System.out.println("Operação Inválida.");
            }
        }
        sc.close();
    }
}




