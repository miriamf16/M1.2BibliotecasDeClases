package Ecosistema;

public class Bacterias extends OrganismoVivo {

    private String forma;

    /*CONSTRUCTOR*/
    public Bacterias(String nombre, String tipoAlimentacion,String forma) {
        super(nombre, tipoAlimentacion);

        this.forma=forma;
    }

    /*METODOS*/


    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Bacterias{" +
                "forma='" + forma + '\'' +
                '}';
    }
}
