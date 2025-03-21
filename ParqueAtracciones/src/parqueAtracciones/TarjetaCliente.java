package parqueAtracciones;

public class TarjetaCliente {

    private static int cont = 0;
    private int codigo, tickets;
    private int saldoTickets = 10;

    public TarjetaCliente() {
        this.codigo = cont;
        cont++;
    }

    public int getSaldoTickets() {
        return saldoTickets;
    }

    public void setSaldoTickets(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }

    public int getCodigo() {
        return codigo;
    }

    public void comprarTickets(int tickets, Cliente cliente) {
        if (cliente instanceof ClienteVip) {
            System.out.println("Error, cliente VIP no puede comprar.");
        } else {
            this.saldoTickets += tickets;
        }
    }

}