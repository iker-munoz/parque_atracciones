package parqueAtracciones;

public class Reserva {
    private Cliente cliente;
    private Atraccion atraccion;
    private Pase pase;

    public Reserva(Cliente cliente, Atraccion atraccion, Pase pase) {
        this.cliente = cliente;
        this.atraccion = atraccion;
        this.pase = pase;
    }

    public boolean realizarReserva() {
        if (cliente instanceof ClienteVip) {
            if (pase.añadirClienteACola(cliente)) {
                return true; // reserva hecha
            } else {
                System.out.println("La cola de espera está llena para este pase.");
                return false;
            }
        } else if (cliente.getTarjeta().getSaldoTickets() >= atraccion.getTicketsNecesarios()) {
            if (pase.añadirClienteACola(cliente)) {
                cliente.getTarjeta()
                        .setSaldoTickets(cliente.getTarjeta().getSaldoTickets() - atraccion.getTicketsNecesarios());
                return true; // reserva hecha
            } else {
                System.out.println("La cola de espera está llena para este pase.");
                return false;
            }
        } else {
            System.out.println("No tienes suficientes tickets para esta atracción.");
            return false;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Atraccion getAtraccion() {
        return atraccion;
    }

    public Pase getPase() {
        return pase;
    }
}