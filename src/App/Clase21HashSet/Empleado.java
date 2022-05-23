package App.Clase21HashSet;

public class Empleado {
    private int legajo;
    private String nombre;

    public Empleado(int legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  //chequeo la dirección de memoria
        if (!(o instanceof Empleado)) return false;  //chequeo la instancia
        Empleado empleado = (Empleado) o;  //Genero una variable empelado y la casteo
        return empleado.nombre == nombre && empleado.legajo == legajo;  // comparo los atributos que necesito.
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();  // tiene el resultado hash de la variable tipo string
        result = result * 31 + Integer.hashCode(legajo);  // para enteros invoco directamente desde la variable nativa.
        return result;
    }
}
