package view;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public int obtenerDimension() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        return scanner.nextInt();
    }

    public void mostrarMatriz(ArrayList<ArrayList<Integer>> matriz) {
        System.out.println("Matriz transpuesta:");
        for (ArrayList<Integer> fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

