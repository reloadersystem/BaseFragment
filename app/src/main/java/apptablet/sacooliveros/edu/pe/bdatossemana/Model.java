package apptablet.sacooliveros.edu.pe.bdatossemana;

public class Model {

    private String text;
    private boolean habilitar;

    public Model(String text, boolean habilitar) {
        this.text = text;
        this.habilitar = habilitar;
    }

    public Model() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isHabilitar() {
        return habilitar;
    }

    public void setHabilitar(boolean habilitar) {
        this.habilitar = habilitar;
    }

    @Override
    public String toString() {
        return "Model{" +
                "text='" + text + '\'' +
                ", habilitar=" + habilitar +
                '}';
    }
}
