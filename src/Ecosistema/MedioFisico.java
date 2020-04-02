package Ecosistema;

public class MedioFisico {
    private String nombre;
    private String flora;
    private String fauna;


    /*CONSTRUCTOR*/
    public MedioFisico(String nombre,String flora,String fauna){
        this.nombre=nombre;
        this.flora=flora;
        this.fauna=fauna;

    }

    /*METODOS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFlora() {
        return flora;
    }

    public void setFlora(String flora) {
        this.flora = flora;
    }

    public String getFauna() {
        return fauna;
    }

    public void setFauna(String fauna) {
        this.fauna = fauna;
    }

    @Override
    public String toString() {
        return "MedioFisico{" +
                "nombre='" + nombre + '\'' +
                ", flora='" + flora + '\'' +
                ", fauna='" + fauna + '\'' +
                '}';
    }
}
