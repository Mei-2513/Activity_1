package model;
import java.util.ArrayList;

public class Model {
    private ArrayList<ArrayList<Integer>> matriz;

    public Model() {
        matriz = new ArrayList<>();
    }

    public void crearMatriz(int n) {
        matriz.clear();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> fila = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                fila.add(0);
            }
            matriz.add(fila);
        }
    }

    public void setElemento(int fila, int columna, int valor) {
        matriz.get(fila).set(columna, valor);
    }

    public ArrayList<ArrayList<Integer>> obtenerMatrizTranspuesta() {
        ArrayList<ArrayList<Integer>> matrizTranspuesta = new ArrayList<>();
        int n = matriz.size();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> filaTranspuesta = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                filaTranspuesta.add(matriz.get(j).get(i));
            }
            matrizTranspuesta.add(filaTranspuesta);
        }

        return matrizTranspuesta;
    }
}
