public class App {
    public static void main(String[] args) throws Exception {

    // Variáveis Para Teste:
        final int x = 5;
        final int y = 2;
        int[] z = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int length = z.length;
        int n = 0;
        int esq = 1;
        int dir = 10;
        int chave = 9;

    // Execução dos métodos
        System.out.println(Recursividade.soma(x));
        System.out.println();

        System.out.println(Recursividade.exponencial(x, y));
        System.out.println();

        Recursividade.exibeVetor(z, length);
        System.out.println();

        System.out.println(Recursividade.somaVetor(z, length));
        System.out.println();

        Recursividade.inverteVetor(z, n, length);
        // Exibe vetor invertido
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
        System.out.println();

        System.out.println(Recursividade.retornaMenor(z, length));
        System.out.println();

        System.out.println(Recursividade.buscaBinaria(z, chave, esq, dir));
        System.out.println();
    }
}
