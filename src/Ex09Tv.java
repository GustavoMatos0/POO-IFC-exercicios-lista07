
public class Ex09Tv {

    private int canal;
    private int volume;

    public Ex09Tv() {
        this.canal = 1;
        this.volume = 1;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal <= 100) {
            this.canal = canal;
        }
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 0 && volume <= 20) {
            this.volume = volume;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ex09Tv{");
        sb.append("canal=").append(canal);
        sb.append(", volume=").append(volume);
        sb.append('}');
        return sb.toString();
    }

    public String aumentaVolume() {
        StringBuilder sb = new StringBuilder();
        if (this.getVolume() == 20) {
            sb.append("Volume maximo: ").append(this.getVolume());
        } else {
            this.setVolume(this.getVolume() + 1);
            sb.append("Volume: ").append(this.getVolume());
        }
        return sb.toString();
    }

    public String diminuiVolume() {
        StringBuilder sb = new StringBuilder();
        if (this.getVolume() == 1) {
            sb.append("Volume Mínimo: ").append(this.getVolume());
        } else {
            this.setVolume(this.getVolume() - 1);
            sb.append("Volume: ").append(this.getVolume());
        }
        return sb.toString();
    }

    public String trocaCanal(int canal) {
        StringBuilder sb = new StringBuilder();
        if (canal > 0 && canal <= 100) {
            this.setCanal(canal);
            sb.append("Canal: ").append(canal).append(" selecionado");
        } else {
            sb.append("Canal Invalido [1 a 100]");
        }
        return sb.toString();
    }

}
