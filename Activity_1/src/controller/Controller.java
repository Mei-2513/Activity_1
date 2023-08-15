package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Model;
import view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void ejecutar() {
        int n = view.obtenerDimension();
        model.crearMatriz(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el valor para la posición (" + i + ", " + j + "): ");
                int valor = scanner.nextInt();
                model.setElemento(i, j, valor);
            }
        }


        ArrayList<ArrayList<Integer>> matrizTranspuesta = model.obtenerMatrizTranspuesta();
        view.mostrarMatriz(matrizTranspuesta);
    }

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.ejecutar();
    }
}

