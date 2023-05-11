public class Mail {
    private String tema;
    private String origen;
    private String destirino;

    public Mail(String tema, String origen, String destirino) {
        this.tema = tema;
        this.origen = origen;
        this.destirino = destirino;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestirino() {
        return destirino;
    }

    public void setDestirino(String destirino) {
        this.destirino = destirino;
    }
}
