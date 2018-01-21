package prácticaunidad3;

/**
 *
 * @author PROFESOR
 */
public class CuentaCorriente {

    private String numCuenta;
    private double saldo;

    public CuentaCorriente(String cuenta, double cantidad) {
        numCuenta = cuenta;
        saldo = cantidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
        /*Comentario para añadir al commit*/
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        } else if (saldo < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        } else {
            saldo = saldo - cantidad;
        }
    }

    public void visualiza() {
        System.out.println("Cuenta " + numCuenta + ", saldo: " + saldo);
    }

}
