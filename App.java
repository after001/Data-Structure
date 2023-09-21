public class App {
    public static void main(String[] args) throws Exception {

        final int x = 5;
        final int y = 2;
        int[] z = {1, 2, 3, 4, 5};
        int length = z.length;
        final int n = 0;

        System.out.println(Recursividade.soma(x));
        System.out.println(Recursividade.exponencial(x, y));
        Recursividade.exibeVetor(z, length);
        System.out.println(Recursividade.somaVetor(z, length));
        Recursividade.inverteVetor(z, n, length);

        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    }
}
