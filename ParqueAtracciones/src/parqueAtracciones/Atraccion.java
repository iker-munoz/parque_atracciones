package parqueAtracciones;

public class Atraccion {

    private int codigo;
    private String nombre;
    private int afotoMaximo;
    private int ticketsNecesarios;

    public Atraccion (int codigo, String nombre, int aforoMaximo, int ticketsNecesarios) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.afotoMaximo=aforoMaximo;
        this.ticketsNecesarios=ticketsNecesarios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAfotoMaximo() {
        return afotoMaximo;
    }

    public void setAfotoMaximo(int afotoMaximo) {
        this.afotoMaximo = afotoMaximo;
    }

    public int getTicketsNecesarios() {
        return ticketsNecesarios;
    }

    public void setTicketsNecesarios(int ticketsNecesarios) {
        this.ticketsNecesarios = ticketsNecesarios;
    }

    @Override
    public String toString() {
        return "Atraccion [codigo=" + codigo + ", nombre=" + nombre + ", afotoMaximo=" + afotoMaximo
                + ", ticketsNecesarios=" + ticketsNecesarios + "]";
    }

    //	public void agregarPase() {
//
//	}
//
    public void reservarPlaza(Cliente cliente){

    }



}
