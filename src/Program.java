import java.util.Scanner;

public class Program {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Crie um programa que  armazene 5 nomes no array e os mostre em seguida");

        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite um nome: ");
            nomes[i] = sc.next();
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


        System.out.println("2.Crie um programa que  armazene 10 notas em um array e os mostre em seguida");

        int[] notas = new int[10];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
            notas[i] = (i+1);
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("Crie um programa que  armazene 10 notas em um array e mostre a maior nota, a menor nota, e a média");

        //usuario digita as notas
        int[] notas2 = new int[10];
        for (int i = 0; i < notas2.length; i++) {
            notas2[i] = sc.nextInt();
            notas2[i] = (i+1);
        }

        //encontra a maior, menor e media das notas
        int maiorNota = notas2[0];
        int menorNota = notas2[0];
        int soma = notas2[0];

        for (int i = 0; i < notas2.length; i++) {
            if (notas2[i] > maiorNota) {
                maiorNota = notas2[i];
            }
            if (notas2[i] < menorNota) {
                menorNota = notas2[i];
            }

            soma += notas2[i];
        }

        int media = soma / 10;

        //exibi os resultados
        System.out.println("A maior nota: " + maiorNota);
        System.out.println("A menor nota: " + menorNota);
        System.out.println("A media das notas: " + media);


        System.out.println("Preencha e mostre uma Matriz de inteiro 2x2");

        int[][] numeros = new int[2][2];
        //entrada de valores
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                numeros[i][j] = sc.nextInt();
            }
        }

        //mostrando valores
        System.out.println("Matriz 2x2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Crie um programa que peça um número e gere automaticamente a sua tabuada deve multiplicar do 1 ao 10 !  A taboada deve ser guardada na Matriz: NUMERO DIGITADO, NUMERO BASE, RESULTADO.");

        System.out.println("Digite um numero: ");
        int numeroDigitado = sc.nextInt();

        int[][] tabuada = new int[10][3];

        for (int i = 0; i < 10; i++) {
            int numeroBase = i + 1;
            int resultado = numeroDigitado * numeroBase;

            tabuada[i][0] = numeroDigitado;
            tabuada[i][1] = numeroBase;
            tabuada[i][2] = resultado;
        }

        //exibi a tabuada
        System.out.println("Tabuada de" + numeroDigitado + ":");
        System.out.println("Numero digitado | Numero base | Resultado");
        for (int i = 0; i < 10; i++) {
            System.out.println(tabuada[i][0] + "               | " + tabuada[i][1] + "           | " + tabuada[i][2]);
        }
    }
}

