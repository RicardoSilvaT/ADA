import java.util.Arrays;

public class CountingSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        int countArrayLength = 255;
        // La matriz de salida que habrá ordenado arr
        int[] output = new int[n];

        int[] count = new int[countArrayLength];
        Arrays.fill(count, 0);

        // almacena el conteo de cada elemento
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];

        for (int i = 1; i < countArrayLength; i++)
            count[i] += count[i - 1];

        // Construir la matriz de salida
        for (int i = 0; i < n; ++i) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        // Copie la matriz de salida en arr, 
        //de modo que arr ahora contenga elementos ordenados
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }
}