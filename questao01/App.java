package questao01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        List<Pessoa> listaPessoas = new ArrayList<>();

        String[] nomes = { "Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
        "Breno Vinicius", "Vinícius Raphael", "César Augusto", "Daniela Teixeira",
        "Eduardo Jose", "Emerson Vinicios", "Felipe dos Santos", "Gabriel Felipe",
        "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva", "Henrique Cezar",
        "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira",
        "Marcus Paulo", "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe",
        "Nátali Isaltino", "Paulo Vítor", "Rogério Lopes", "Thiago Luis", "Víctor Henrique",
        "Vinicius Garcia", "Vinícius Paiva", "Wesley Carvalho", "Weslley Ferreira",
        "Caio Alves", "Lucas Marques", "Marcela Maria" };

        for (String nome : nomes) {
            int idade = random.nextInt(99) + 1;
            listaPessoas.add(new App().new Pessoa(nome, idade));
        }


        System.out.println("Ordem alfabética");
        Collections.sort(listaPessoas, (pessoa1, pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome()));

        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());
        }
    }

    private class Pessoa {
        String nome;
        int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }
    }
}

