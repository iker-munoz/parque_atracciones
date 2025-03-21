package parqueAtracciones;

public class Pase {

    private final int MAXIMO_CLIENTES = 10;
    private String hora;
    private Cliente[] colaEspera = new Cliente[MAXIMO_CLIENTES];
    private int numClientes = 0;

    public Pase(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Cliente[] getColaEspera() {
        return colaEspera;
    }

    public boolean añadirClienteACola(Cliente cliente) {
        if (numClientes < MAXIMO_CLIENTES) {
            if (cliente instanceof ClienteVip) {
                for (int i = 0; i < numClientes; i++) {
                    if (colaEspera[i] instanceof ClienteVip) {

                    } else {
                        colaEspera[numClientes] = colaEspera[i];
                        colaEspera[i] = cliente;
                        numClientes++;
                        return true;
                    }
                }
            } else {
                colaEspera[numClientes] = cliente;
                numClientes++;

                return true;
            }
        }

        return false;

    }

}
