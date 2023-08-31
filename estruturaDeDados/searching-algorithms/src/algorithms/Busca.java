package algorithms;

public class Busca implements Busca_IF {

    public int[] geraVetorNumericoOrdenado(int tamanho) {
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    public boolean buscaLinear_iterativa(int[] numeros, int k) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == k) return true;
        }

        return false;
    }

    private boolean aux_buscaLinear_recursiva(int[] numeros, int index, int k) {
        if (index == 0) return false;
        if (numeros[index - 1] == k) return true;

        return aux_buscaLinear_recursiva(numeros, index - 1, k);
    }

    public boolean buscaLinear_recursiva(int[] numeros, int k) {
        return aux_buscaLinear_recursiva(numeros, numeros.length, k);
    }

    public boolean buscaLinear_iterativa_duasPontas(int[] numeros, int k) {
        int j = numeros.length - 1;

        for (int i = 0; i < numeros.length / 2; i++) {
            if (numeros[i] == k || numeros[j] == k) return true;
            j--;
        }

        return false;
    }

    public boolean buscaBinaria_iterativa(int[] numeros, int k) {
        int left = 0, right = numeros.length - 1;

        while (left <= right) {
            int middle = left + (right - 1) / 2;

            if (numeros[middle] == k) return true;

            if (numeros[middle] < k) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return false;
    }

    private boolean aux_buscaBinaria_recursiva(int[] numeros, int left, int right, int k) {
        if (right >= left) {
            int middle = left + (right - 1) / 2;

            if (numeros[middle] == k)
                return true;

            if (numeros[middle] > k)
                return aux_buscaBinaria_recursiva(numeros, left, middle - 1, k);

            return aux_buscaBinaria_recursiva(numeros, middle + 1, right, k);
        }

        return false;
    }

    public boolean buscaBinaria_recursiva(int[] numeros, int k) {
        return aux_buscaBinaria_recursiva(numeros, 0, numeros.length - 1, k);
    }
}
