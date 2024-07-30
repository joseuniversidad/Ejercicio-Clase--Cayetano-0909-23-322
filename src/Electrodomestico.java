public class Electrodomestico extends  DispositivoElectronico{
    private String Tipo;
    private String EnergiaNecesita;

    public Electrodomestico (String NombreDispositivo, int AñodeDispositivo, String Tipo, String EnergiaNecesita){
        super(NombreDispositivo,AñodeDispositivo);
        this.Tipo=Tipo;
        this.EnergiaNecesita= EnergiaNecesita;

    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getEnergiaNecesita() {
        return EnergiaNecesita;
    }

    public void setEnergiaNecesita(String energiaNecesita) {
        EnergiaNecesita = energiaNecesita;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + getNombreDispositivo() + "Año " + getAñoDeDispositivo() + "Tipo: " + Tipo + "EnergiaNecesita: " + EnergiaNecesita);
    }
}
