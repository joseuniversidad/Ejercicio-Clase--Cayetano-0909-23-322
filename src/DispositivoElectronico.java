abstract class DispositivoElectronico {
    private String NombreDispositivo;
    private int AnioDeDispositivo;

    public DispositivoElectronico(String NombreDispositivo, int AniodeDispositivo){
        this.NombreDispositivo= NombreDispositivo;
        this.AnioDeDispositivo=AniodeDispositivo;
    }

    public String getNombreDispositivo() {
        return NombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        NombreDispositivo = nombreDispositivo;
    }

    public int getAñoDeDispositivo() {
        return AnioDeDispositivo;
    }

    public void setAñoDeDispositivo(int añoDeDispositovo) {
        AnioDeDispositivo = añoDeDispositovo;
    }

    public abstract void mostrar();

}
