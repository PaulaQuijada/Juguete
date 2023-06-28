public class JugueteEducativo extends Juguete{
    private int edadMaxima;
    private int bonificacion;
    public JugueteEducativo(String nombre, int edadMinima, int precioBase, int bonificacion, int edadMaxima) throws  EinvalidPropertyException {
        super(nombre, edadMinima, precioBase);
        if(edadMaxima <= edadMinima) throw new EinvalidPropertyException("La edad máxima no puede ser superior o igual a la mínima");
        this.edadMaxima = edadMaxima;
        if(bonificacion > precioBase) throw new EinvalidPropertyException("La bonificación no puede ser mayor al precio base");
        this.bonificacion = bonificacion;
    }

    public JugueteEducativo(String nombre, int numJugadores, int edadMinima, int precioBase, int bonificacion, int edadMaxima) throws EinvalidPropertyException {
        super(nombre, numJugadores, edadMinima, precioBase);
        if(edadMaxima <= edadMinima) throw new EinvalidPropertyException("La edad máxima no puede ser superior o igual a la mínima");
        this.edadMaxima = edadMaxima;
        if(bonificacion > precioBase) throw new EinvalidPropertyException("La bonificación no puede ser mayor al precio base");
        this.bonificacion = bonificacion;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }
    public int getPrecio(){
        return getPrecioBase() - bonificacion;
    }
    public void imprimirJugueteEducativo(){
        System.out.println("Nombre: " + getNombre());
        if(getNumJugadores() != 0) System.out.println("Número de jugadores: " + getNumJugadores());
        System.out.println("Edad mínima: " + getEdadMinima());
        System.out.println("Edad máxima: " + edadMaxima);
        System.out.println("Precio base: " + getPrecioBase());
        System.out.println("Bonificación: " + bonificacion);
        System.out.println("El precio total del producto es: " + getPrecio());
    }

}
