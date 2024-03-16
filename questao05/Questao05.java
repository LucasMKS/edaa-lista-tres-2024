package questao05;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Digite uma string: ");
        String add = sc.nextLine().toLowerCase();
        char[] caracteres = add.toCharArray();

        quickSort(caracteres, 0, caracteres.length - 1);
        String ordenado = new String(caracteres);
        System.out.println("String ordenada: " + ordenado);

        sc.close();
    }

    public static void quickSort(char[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = partition(array, inicio, fim);
            quickSort(array, inicio, pivo - 1);
            quickSort(array, pivo + 1, fim);
        }
    }

    private static int partition(char[] array, int inicio, int fim) {
        char pivo = array[fim];
        int i = (inicio - 1);

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        char temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        return i + 1;
    }
}
