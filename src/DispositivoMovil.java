public class DispositivoMovil extends DispositivoElectronico{
    private String Color;
    private String Memoria;

    public DispositivoMovil(String NombreDispositivo, int AñodeDispostivo, String Color, String Memoria){
        super(NombreDispositivo, AñodeDispostivo);
        this.Color=Color;
        this.Memoria=Memoria;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMemoria() {
        return Memoria;
    }

    public void setMemoria(String memoria) {
        Memoria = memoria;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " +  getNombreDispositivo() +  "Año de Dispositivo: " + getAñoDeDispositivo() + "Color: " + Color + "Memoria: " + Memoria);
    }
}
