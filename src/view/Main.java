package view;

import br.edu.fateczl.pilha.PilhaInt;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] a = new int[] {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
        int len = a.length;

        PilhaInt pilhaInt = new PilhaInt();

        for (int i = 0; i < len; i++) {
            if (a[i] >= 0) {
                pilhaInt.push(a[i]);
            }
            else {
                int p1 = pilhaInt.pop();
                int p2 = pilhaInt.pop();
                int p1p2 = p1 + p2;
                pilhaInt.push(a[i]);
                pilhaInt.push(p1p2);
            }
        }
        System.out.println("Qnt de itens na pilha: " + pilhaInt.size());
    }
}
