public class Desktop extends Computadora{
    private String Grafica;
    private String Pantalla;

    public Desktop (String Grafica, String Pantalla){
        super("ASUS", "Asus21nda ", 2021, "Corei9 ");
        this.Grafica=Grafica;
        this.Pantalla=Pantalla;
    }

    public String getGrafica() {
        return Grafica;
    }

    public void setGrafica(String grafica) {
        Grafica = grafica;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String pantalla) {
        Pantalla = pantalla;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + getNombreDispositivo()+ "Año de Dispositivo: "+ getNombreDispositivo() + "Modelo: " + getModelo() +  "Procesador: " +  getProcesador() + "Grafica: " + getGrafica() + "Pantalla: " + getPantalla() );
    }
}
