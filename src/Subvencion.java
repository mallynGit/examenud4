
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class Subvencion {

    private double presupuesto, cantPorPersona;
    private List solicitantes;
    private boolean plazoAbierto;
    private HashSet admitidos, excluidos;

    public Subvencion(double p, double cant) {
        this.presupuesto = p;
        this.cantPorPersona = cant;
        this.plazoAbierto = true;
        this.solicitantes = new ArrayList();
        this.admitidos = new HashSet();
        this.excluidos = new HashSet();
    }

    public void agregaSolicitud(Persona per) {
        if (plazoAbierto == true) {
            if (solicitantes.contains(per)) {
                solicitantes.remove(solicitantes.indexOf(per));
            }
            solicitantes.add(per);
        } else {
            System.out.println("El plazo de solicitud esta cerrado");
        }
    }

    public void adjudicaSubvencion() {
        this.plazoAbierto = false;
        Collections.sort(solicitantes);
        Iterator iter = solicitantes.iterator();
        while (iter.hasNext()) {
            if (this.presupuesto >= this.cantPorPersona) {
                admitidos.add(iter.next());
                presupuesto = presupuesto - cantPorPersona;
            } else {
                excluidos.add(iter.next());
            }
        }
    }

    public List getAdmitidos() {
        ArrayList array = new ArrayList(admitidos);
        Collections.sort(array);
        return array;
    }

    public List getExcluidos() {
        ArrayList array = new ArrayList(excluidos);
        Collections.sort(array);
        return array;
    }

}
