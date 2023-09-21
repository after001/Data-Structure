public class Recursividade {

    public static int soma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + soma(n - 1);
        }
    }

    public static int exponencial(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * exponencial(x, y - 1);
        }
    }

    public static void exibeVetor(int[] z, int length) {
        if (length != 0) {
            System.out.println(z[length - 1]);
            exibeVetor(z, length - 1);
        }
    }

    public static int somaVetor(int[] z, int length) {
        if (length == 0) {
            return 0;
        } else {
            return z[length - 1] + somaVetor(z, length - 1);
        }
    }

    public static void inverteVetor(int[] z, int n, int length) {
        if (n < length) {
            int aux = z[n];
            z[n] = z[length - 1];
            z[length - 1] = aux;
            inverteVetor(z, n + 1, length - 1);
        }
    }

    public static int retornaMenor(int[] z, int length) {
        if (length == 1) {
            return z[0];
        }

        int menor = retornaMenor(z, length - 1);

        if (menor < z[length - 1]) {
            return menor;
        } else {
            return z[length - 1];
        }
    }

    public static int buscaBinaria(int[] v, int chave, int esq, int dir) {
        if (esq > dir) {
            return -1;
        }

        if (chave < v[esq] || chave > v[dir]) {
            return -1;
        }

        int meio = (esq + dir) / 2;

        if (v[meio] == chave) {
            return meio;
        } else if (v[meio] < chave) {
            return buscaBinaria(v, chave, meio + 1, dir);
        } else {
            return buscaBinaria(v, chave, esq, meio - 1);
        }
    }
}
