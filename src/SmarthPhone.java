public class SmarthPhone extends DispositivoMovil{
    private String Tamanio;
    private String contrasenia;

    public SmarthPhone (String Tamanio, String contrasenia){
        super("Samsung ",2020, "Verde ", "8GB " );
        this.Tamanio=Tamanio;
        this.contrasenia=contrasenia;
    }

    public String getTamanio() {
        return Tamanio;
    }

    public void setTamanio(String tamanio) {
        Tamanio = tamanio;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    @Override
    public void mostrar() {
        System.out.println("Nombre: " +  getNombreDispositivo() +  "Año de Dispositivo: " + getAñoDeDispositivo() + "Color: " + getColor() + "Memoria: " + getMemoria() + "Tamaño: " + Tamanio + "Contrasenia: " + contrasenia );
    }
}
