public class Main {
    public static void main(String[] args) throws Exception {
        try{
            JugueteElectronico juguete = new JugueteElectronico("Tamagotchi",4,5,10,3);
            juguete.imprimirJugueteElectronico();
        }
        catch (EinvalidPropertyException e){
            System.out.println(e.getMessage());
        }


    }
}