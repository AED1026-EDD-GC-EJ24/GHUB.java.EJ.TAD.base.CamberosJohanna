public class Persona {
    private String dni;
    private String nombre;
    private Fecha fechaNacimiento;

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}