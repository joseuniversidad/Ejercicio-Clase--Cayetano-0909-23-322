public class Laptop extends Computadora{
    private String DiscoDuro;
    private String Grafica;

    public Laptop (String DiscoDuro, String Grafica){
        super("Apple ", "5d4a5s ", 2021,  "Corei5 " );
        this.DiscoDuro= DiscoDuro;
        this.Grafica=Grafica;
    }

    public String getDiscoDuro() {
        return DiscoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        DiscoDuro = discoDuro;
    }

    public String getGrafica() {
        return Grafica;
    }

    public void setGrafica(String grafica) {
        Grafica = grafica;
    }
    @Override
    public void mostrar() {
        System.out.println("Nombre; " + getNombreDispositivo()+ "Año de Dispositivo: "+ getAñoDeDispositivo() + "Modelo: " + getModelo() +  "Procesador: " +  getProcesador() + "Disco Duro: " +  DiscoDuro +  "Grafica: " + Grafica);
    }
}
