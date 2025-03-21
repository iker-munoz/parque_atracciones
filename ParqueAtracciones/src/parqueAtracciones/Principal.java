package parqueAtracciones;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dni, nombre;
        int telefono, tickets, codigoAtraccion;
        Cliente cliTemp;
        Parque parque01 = new Parque();

        String menu = "1 - Alta de cliente normal.\n" + "2 - Alta de cliente VIP.\n" + "3 - Compra de tickets.\n"
                + "4 - Reserva para el pase de una atracción.\n" + "5 - Entrada a la atracción.\n"
                + "6 - Ver todos los clientes.\n" + "7 - Salir.";
        int opcion = 0;

        do {
            System.out.println(menu);
            System.out.println("Dime tu elección:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dime el nombre del cliente:");
                    nombre = sc.next();
                    System.out.println("Dime el dni del cliente:");
                    dni = sc.next();
                    System.out.println("Dime el teléfono del cliente:");
                    telefono = sc.nextInt();
                    parque01.altaClienteNormal(dni, nombre, telefono);
                    System.out.println("-----------------------------------------");
                    break;
                case 2:
                    System.out.println("Dime el nombre del cliente:");
                    nombre = sc.next();
                    System.out.println("Dime el dni del cliente:");
                    dni = sc.next();
                    System.out.println("Dime el teléfono del cliente:");
                    telefono = sc.nextInt();
                    parque01.altaClienteVip(dni, nombre, telefono);
                    System.out.println("-----------------------------------------");
                    break;
                case 3:
                    System.out.println("Dime el DNI del cliente que quiere comprar tickets");
                    dni = sc.next();
                    System.out.println("Dime cuántos tickets quieres comprar: ");
                    tickets = sc.nextInt();
                    cliTemp = parque01.buscarCliente(dni);
                    if (cliTemp != null) {
                        cliTemp.getTarjeta().comprarTickets(tickets, cliTemp);
                    } else {
                        System.out.println("Ese cliente no existe");
                    }
                    System.out.println("-----------------------------------------");
                    break;
                case 4:
                    System.out.println("Dime el DNI del cliente que quiere hacer la reserva:");
                    dni = sc.next();
                    System.out.println("Dame el código de la atraccion: 12-Shambala, 15-Lanzadera");
                    codigoAtraccion = sc.nextInt();
                    System.out.println("A qué hora quieres el pase?");
                    String horaPase = sc.next();
                    Pase pase = new Pase(horaPase);
                    parque01.reservarAtraccion(dni, codigoAtraccion, pase);
                    System.out.println("-----------------------------------------");
                    break;
                case 5:
                    System.out.println("-----------------------------------------");
                    break;
                case 6:
                    parque01.verClientes();
                    System.out.println("-----------------------------------------");
                    break;
                case 7:
                    System.out.println("...SALIENDO...");
                    System.out.println("-----------------------------------------");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    System.out.println("-----------------------------------------");
            }

        } while (opcion != 7);
    }
}
