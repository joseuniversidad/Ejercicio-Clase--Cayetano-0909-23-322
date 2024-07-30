public class Computadora extends DispositivoElectronico{
    private String Modelo;
    private String Procesador;

    public Computadora(String NombreDispositivo, String Modelo, int AniodeDispositivo, String Procesador){
        super(NombreDispositivo, AniodeDispositivo);
        this.Modelo= Modelo;
        this.Procesador= Procesador;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre; " + getNombreDispositivo()+ "Año de Dispositivo: "+ getNombreDispositivo() + "Modelo: " + getModelo() +  "Procesador: " +  Procesador);
    }
}
