public class Tablet extends DispositivoMovil{
    private int codigo;
    private String PorcentajeBateria;

    public Tablet (int codigo, String PorcentajeBateria){
        super("Xiaomi ", 2022,"Blanco ", "16gb ");
        this.codigo=codigo;
        this.PorcentajeBateria=PorcentajeBateria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPorcentajeBateria() {
        return PorcentajeBateria;
    }

    public void setPorcentajeBateria(String porcentajeBateria) {
        PorcentajeBateria = porcentajeBateria;
    }
    @Override
    public void mostrar() {
        System.out.println("Nombre: " +  getNombreDispositivo() +  "Año de Dispositivo: " + getAñoDeDispositivo() + "Color: " + getColor()+ "Memoria: " + getMemoria() + "Codigo: " + codigo + "Bateria: " + getPorcentajeBateria());
    }
}
