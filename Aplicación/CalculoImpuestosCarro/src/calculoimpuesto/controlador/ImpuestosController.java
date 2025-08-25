package calculoimpuesto.controlador;
import javax.swing.JOptionPane;

import calculoimpuesto.modelo.Vehiculo;
import calculoimpuesto.modelo.CalculadoraImpuestos;
import calculoimpuesto.vista.ImpuestosView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImpuestosController implements ActionListener {
    private ImpuestosView vista;
    private CalculadoraImpuestos calculadora;

    public ImpuestosController(ImpuestosView vista, CalculadoraImpuestos calculadora) {
        this.vista = vista;
        this.calculadora = calculadora;
        this.vista.btnCalcular.addActionListener(this);
    }

    public void iniciar() {
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String marca = vista.txtMarca.getText();
            String modelo = vista.txtModelo.getText();
            int anio = Integer.parseInt(vista.txtAnio.getText());
            int cilindraje = Integer.parseInt(vista.txtCilindraje.getText());
            double avaluo = Double.parseDouble(vista.txtAvaluo.getText());
            String tipoUso = (String) vista.cbTipoUso.getSelectedItem();

            Vehiculo vehiculo = new Vehiculo(marca, modelo, anio, cilindraje, avaluo, tipoUso);
            double impuesto = calculadora.calcularImpuesto(vehiculo);

            vista.mostrarResultado(impuesto);
        } catch (Exception ex) {
            vista.mostrarResultado(0.0);
            JOptionPane.showMessageDialog(vista, "Error en los datos ingresados: " + ex.getMessage());
        }
    }
}
