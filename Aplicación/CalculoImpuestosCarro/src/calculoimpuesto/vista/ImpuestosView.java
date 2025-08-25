package calculoimpuesto.vista;

import javax.swing.*;

public class ImpuestosView extends JFrame {
    public JTextField txtMarca, txtModelo, txtAnio, txtCilindraje, txtAvaluo;
    public JComboBox<String> cbTipoUso;
    public JButton btnCalcular;
    public JLabel lblResultado;

    public ImpuestosView() {
        setTitle("Cálculo de Impuestos");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lbl1 = new JLabel("Marca:");
        lbl1.setBounds(20, 20, 100, 20);
        add(lbl1);
        txtMarca = new JTextField();
        txtMarca.setBounds(120, 20, 130, 20);
        add(txtMarca);

        JLabel lbl2 = new JLabel("Modelo:");
        lbl2.setBounds(20, 50, 100, 20);
        add(lbl2);
        txtModelo = new JTextField();
        txtModelo.setBounds(120, 50, 130, 20);
        add(txtModelo);

        JLabel lbl3 = new JLabel("Año:");
        lbl3.setBounds(20, 80, 100, 20);
        add(lbl3);
        txtAnio = new JTextField();
        txtAnio.setBounds(120, 80, 130, 20);
        add(txtAnio);

        JLabel lbl4 = new JLabel("Cilindraje:");
        lbl4.setBounds(20, 110, 100, 20);
        add(lbl4);
        txtCilindraje = new JTextField();
        txtCilindraje.setBounds(120, 110, 130, 20);
        add(txtCilindraje);

        JLabel lbl5 = new JLabel("Avalúo:");
        lbl5.setBounds(20, 140, 100, 20);
        add(lbl5);
        txtAvaluo = new JTextField();
        txtAvaluo.setBounds(120, 140, 130, 20);
        add(txtAvaluo);

        JLabel lbl6 = new JLabel("Uso:");
        lbl6.setBounds(20, 170, 100, 20);
        add(lbl6);
        cbTipoUso = new JComboBox<>(new String[]{"Particular", "Público"});
        cbTipoUso.setBounds(120, 170, 130, 20);
        add(cbTipoUso);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(80, 210, 120, 25);
        add(btnCalcular);

        lblResultado = new JLabel("Impuesto: ");
        lblResultado.setBounds(20, 240, 200, 20);
        add(lblResultado);
    }

    public void mostrarResultado(double impuesto) {
        lblResultado.setText("Impuesto: $" + String.format("%.2f", impuesto));
    }
}
