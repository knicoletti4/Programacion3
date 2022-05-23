package App.Clase21HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class ListaConjunto implements ILista {
    private HashSet<Empleado> listaEmpleados;

    public ListaConjunto() {
        listaEmpleados = new HashSet<>();
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);

    }

    @Override
    public String listado() {
        StringBuilder builder = new StringBuilder();
        Iterator<Empleado> it = listaEmpleados.iterator();

        while (it.hasNext()){
            builder.append(it.next()+"\n"); //devuelve el objeto y avanza un elmeento del cursor
        }
         return builder.toString();
    }

    @Override
    public int contar() {
        return listaEmpleados.size();
    }

    @Override
    public void eliminar(Empleado emple) {
        listaEmpleados.remove(emple);
    }

    @Override
    public String toString() {
        return listaEmpleados.toString();
    }


}
