package calculoimpuesto;

import calculoimpuesto.controlador.ImpuestosController;
import calculoimpuesto.modelo.CalculadoraImpuestos;
import calculoimpuesto.vista.ImpuestosView;

public class Main {
    public static void main(String[] args) {
        ImpuestosView vista = new ImpuestosView();
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();
        ImpuestosController controlador = new ImpuestosController(vista, calculadora);
        controlador.iniciar();
    }
}

