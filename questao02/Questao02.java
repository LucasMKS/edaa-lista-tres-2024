package questao02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes / Digite '0' para finalizar:");
        String nome;
        while (true) {
            nome = sc.nextLine().toLowerCase();
            if (nome.equalsIgnoreCase("0")) {
                break;
            }
            Ordernador(nomes, nome);
        }

        System.out.println("Nomes ordenados:");
        for (String n : nomes) {
            System.out.println(n);
        }

        sc.close(); 
    }

    public static void Ordernador(List<String> lista, String nome) {
        int i;
        for (i = 0; i < lista.size(); i++) {
            if (nome.compareToIgnoreCase(lista.get(i)) < 0) {
                break;
            }
        }
        lista.add(i, nome);

    }
}
