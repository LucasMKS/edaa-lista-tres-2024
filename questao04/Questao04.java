package questao04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();

        System.out.println("Digite os nomes / Digite '0' para finalizar:");
        String nome;
        while (true) {
            nome = sc.nextLine().toLowerCase();
            if (nome.equalsIgnoreCase("0")) {
                break;
            }
            listaNomes.add(nome);
        }
        
        selectionSort(listaNomes);
        
        System.out.println("Nomes Ordenados:");
        for (String nomeOrdenado : listaNomes) {
            System.out.println(nomeOrdenado);
        }

        sc.close();
    }

    public static void selectionSort(List<String> listaNomes) {
        int n = listaNomes.size();
        for (int i = 0; i < n-1; i++) {
            int menor = i;
            for (int j = i+1; j < n; j++) {
                if (listaNomes.get(j).length() < listaNomes.get(menor).length()) {
                    menor = j;
                }
            }
            // Troca os elementos
            String temp = listaNomes.get(menor);
            listaNomes.set(menor, listaNomes.get(i));
            listaNomes.set(i, temp);
        }
    }
}
