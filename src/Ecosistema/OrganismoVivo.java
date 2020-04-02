package Ecosistema;

public class OrganismoVivo {
    private String nombre;
    private String tipoAlimentacion;

    /*CONSTRUCTOR*/
    public OrganismoVivo(String nombre,String tipoAlimentacion){
        this.nombre=nombre;
        this.tipoAlimentacion=tipoAlimentacion;
    }

    /*METODOS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    @Override
    public String toString() {
        return "OrganismoVivo{" +
                "nombre='" + nombre + '\'' +
                ", tipoAlimentacion='" + tipoAlimentacion + '\'' +
                '}';
    }
}
