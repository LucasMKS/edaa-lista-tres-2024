package questao03;

import java.util.Scanner;

public class Questao03 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Digite uma string: ");
            String add = sc.nextLine();
    
            String ordenada = bubbleSort(add);
            System.out.println("String ordenada: " + ordenada);

            sc.close();
        }
    
        public static String bubbleSort(String str) {
            char[] charArray = str.toLowerCase().toCharArray();
    
            int n = charArray.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (charArray[j] > charArray[j + 1]) {
                        char temp = charArray[j];
                        charArray[j] = charArray[j + 1];
                        charArray[j + 1] = temp;
                    }
                }
            }
    
            return new String(charArray);
        }
    }

