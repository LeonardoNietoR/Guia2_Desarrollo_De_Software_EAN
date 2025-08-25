package calculoimpuesto.modelo;

public class CalculadoraImpuestos {

    // Método de cálculo
    public double calcularImpuesto(Vehiculo vehiculo) {
        double impuesto = vehiculo.getAvaluoComercial() * 0.015;

        if (vehiculo.getTipoUso().equalsIgnoreCase("Público")) {
            impuesto *= 0.9; // descuento si es público
        }

        return impuesto;
    }
}
