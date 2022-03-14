import java.util.*;

class Contratacion{
static double e = 2.71828;
  
// Para encontrar el entero más cercano de num.
static int roundNo(float num)
{
    return (int) (num < 0 ? 
                  num - 0.5 : num + 0.5);
}
  
// Encuentra el mejor candidato usando la regla n/e. candidato[]
// representa los talentos de n candidatos.
static void imprMejorCand(int candidate[], int n)
{
    // Cálculo del tamaño de la muestra para la evaluación
    int sample_size = roundNo((float) (n / e));
    System.out.println("\n\nEl tamaño de la muestra es " + sample_size);
  
    // Encontrar el mejor candidato en tamaño de muestra
    int best = 0; 
    for (int i = 1; i < sample_size; i++)
        if (candidate[i] > candidate[best])
            best = i;
  
    // Encontrar el primer mejor candidato que es
    // mejor que el conjunto de referencia.
    for (int i = sample_size; i < n; i++)
        if (candidate[i] >= candidate[best])
        {
            best = i;
            break;
        }
  
    if (best >= sample_size)
        System.out.println("\nEl mejor candidato encontrado es " + 
                           (best + 1) + "con talento" + 
                            candidate[best]);
    else
        System.out.print("No se pudo encontrar el mejor candidato\n");
}
  
// Código del controlador
public static void main(String[] args)
{
    int n = 8;
  
    // n = 8 candidatos y la matriz de candidatos contiene
    // talentos de n candidato donde el mayor
    // el número significa el candidato con mayor talento.
    int []candidate = new int[n];
  
    // generando números aleatorios entre 1 y 8
    // por el talento del candidato
    Random rand = new Random();
    for (int i = 0; i < n; i++)
        candidate[i] = 1 + rand.nextInt((8 - 1) + 1);
  
    System.out.print("Candidato : ");
    for (int i = 0; i < n; i++)
        System.out.print(i + 1 + " ");
    System.out.println();
    System.out.print("Talentos : ");
    for (int i = 0; i < n; i++)
        System.out.print(candidate[i] + " ");
      
    imprMejorCand(candidate, n);
}
}