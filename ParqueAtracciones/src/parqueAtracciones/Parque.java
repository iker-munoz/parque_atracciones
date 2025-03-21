package parqueAtracciones;

import java.util.ArrayList;

public class Parque {

    Atraccion atraccion01 = new Atraccion(12, "Shambala", 15, 4);
    Atraccion atraccion02 = new Atraccion(15, "Lanzadera", 10, 2);

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void altaClienteNormal(String dni, String nombre, int telefono) {
        clientes.add(new ClienteNormal(dni, nombre, telefono));
    }

    public void altaClienteVip(String dni, String nombre, int telefono) {
        clientes.add(new ClienteVip(dni, nombre, telefono));
    }

    public Cliente buscarCliente(String dni) {
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }

    public void reservarAtraccion(String dni, int codigoAtraccion, Pase pase) {
        Cliente cliente = buscarCliente(dni);
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        Atraccion atraccion = null;
        if (atraccion01.getCodigo() == codigoAtraccion) {
            atraccion = atraccion01;
        } else if (atraccion02.getCodigo() == codigoAtraccion) {
            atraccion = atraccion02;
        }

        if (atraccion == null) {
            System.out.println("Atracción no encontrada.");
            return;
        }

        Reserva reserva = new Reserva(cliente, atraccion, pase);
        if (reserva.realizarReserva()) {
            System.out.println("Reserva realizada con éxito para la atracción: " + atraccion.getNombre());
        } else {
            System.out.println("No se pudo realizar la reserva");
        }
    }

    public void verClientes() {
        System.out.println("Clientes normales: ");
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteNormal) {
                System.out.println(cliente);
            }
        }

        System.out.println();
        System.out.println("Clientes VIP: ");
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteVip) {
                System.out.println(cliente);
            }
        }
    }
}
