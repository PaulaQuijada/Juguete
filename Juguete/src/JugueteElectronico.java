public class JugueteElectronico extends Juguete{
    private int edadMaxima;
    private int recargo;
    public JugueteElectronico(String nombre, int edadMinima, int precioBase, int edadMaxima, int recargo) throws Exception {
        super(nombre, edadMinima, precioBase);
        if(edadMaxima <= edadMinima) throw new Exception("La edad máxima no puede ser superior o igual a la mínima");
        this.edadMaxima = edadMaxima;
        if(recargo > precioBase) throw new Exception("El recargo no puede ser mayor al precio base");
        this.recargo = recargo;
    }

    public JugueteElectronico(String nombre, int numJugadores, int edadMinima, int precioBase, int edadMaxima, int recargo) throws Exception {
        super(nombre, numJugadores, edadMinima, precioBase);
        if(edadMaxima <= edadMinima) throw new Exception("La edad máxima no puede ser superior o igual a la mínima");
        this.edadMaxima = edadMaxima;
        if(recargo > precioBase) throw new Exception("El recargo no puede ser mayor al precio base");
        this.recargo = recargo;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }
    public int getRecargo() {
        return recargo;
    }

    public void setRecargo(int recargo) {
        this.recargo = recargo;
    }
    public int getPrecio(){
        return getPrecioBase() + recargo;
    }
    public void imprimirJugueteElectronico(){
        System.out.println("Nombre: " + getNombre());
        if(getNumJugadores() != 0) System.out.println("Número de jugadores: " + getNumJugadores());
        System.out.println("Edad mínima: " + getEdadMinima());
        System.out.println("Edad máxima: " + edadMaxima);
        System.out.println("Precio base: " + getPrecioBase());
        System.out.println("Recargo: " + recargo);
        System.out.println("El precio total del producto es: " + getPrecio());
    }

}
