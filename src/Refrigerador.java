public class Refrigerador extends Electrodomestico{
    private String Temperatura;
    private String Consumido;

    public Refrigerador(String Temperatura, String Consumido){
        super("Mabe ", 2019, "Congelador ", "50v ");
        this.Temperatura= Temperatura;
        this.Consumido= Consumido;
    }

    public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String temperatura) {
        Temperatura = temperatura;
    }

    public String getConsumido() {
        return Consumido;
    }

    public void setConsumido(String consumido) {
        Consumido = consumido;
    }
    @Override
    public void mostrar() {
        System.out.println("Nombre: " + getNombreDispositivo() + "Año " + getAñoDeDispositivo() + "Tipo: " + getTipo() + "EnergiaNecesita: " + getEnergiaNecesita() + "Temperatura: " + getTemperatura() + "Consumido: " + getConsumido());
    }
}
