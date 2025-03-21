package parqueAtracciones;

public class Cliente {

    private String dni;
    private String nombre;
    private int telefono;
    private TarjetaCliente tarjeta;

    public Cliente (String dni, String nombre, int telefono) {
        this.dni=dni;
        this.nombre=nombre;
        this.telefono=telefono;
        this.tarjeta=tarjeta;
        this.tarjeta = new TarjetaCliente();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public TarjetaCliente getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCliente tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono +
                ", tarjeta número=" + tarjeta.getCodigo() +", saldo: " + tarjeta.getSaldoTickets() +
                " tickets" + "]";
    }


}