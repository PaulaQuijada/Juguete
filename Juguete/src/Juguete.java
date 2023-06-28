public class Juguete {
    private String nombre;
    private int numJugadores;
    private int edadMinima;
    private int precioBase;

    public Juguete(String nombre, int edadMinima, int precioBase) throws EinvalidPropertyException{
        if(nombre == null) throw new EinvalidPropertyException("Tiene que haber un nombre");
        this.nombre = nombre;
        if(edadMinima < 0) throw new EinvalidPropertyException("La edad mínima no puede ser menor a 0");
        this.edadMinima = edadMinima;
        if(precioBase < 0) throw new EinvalidPropertyException("El precio base no puede ser menor a 0");
        this.precioBase = precioBase;
    }

    public Juguete(String nombre, int numJugadores, int edadMinima, int precioBase) throws EinvalidPropertyException{
        if(nombre == null) throw new EinvalidPropertyException("Tiene que haber un nombre");
        this.nombre = nombre;
        if(numJugadores < 0) throw new EinvalidPropertyException("El número de jugadores no puede ser menor a 0");
        this.numJugadores = numJugadores;
        if(edadMinima < 0) throw new EinvalidPropertyException("La edad mínima no puede ser menor a 0");
        this.edadMinima = edadMinima;
        if(precioBase < 0) throw new EinvalidPropertyException("El precio base no puede ser menor a 0");
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void imprimirJuguete(){
        System.out.println("Nombre: " + nombre);
        if (numJugadores != 0) System.out.println("Número de jugadores: " + numJugadores);
        System.out.println("Edad mínima: " + edadMinima);
        System.out.println("Precio: " + precioBase);
    }
}
