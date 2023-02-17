
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
public class PruebaSubvencion {

    public static void main(String[] args) {
        Subvencion s = new Subvencion(16000, 3000);
        Persona p1 = new Persona("A", 23000);
        Persona p2 = new Persona("B", 26000);
        Persona p3 = new Persona("C", 23500);
        Persona p4 = new Persona("D", 19600);
        Persona p5 = new Persona("E", 21600);
        Persona p6 = new Persona("F", 31000);
        Persona p7 = new Persona("G", 24500);
        Persona p8 = new Persona("H", 24500);

        s.agregaSolicitud(p1);
        s.agregaSolicitud(p2);
        s.agregaSolicitud(p3);
        s.agregaSolicitud(p4);
        s.agregaSolicitud(p5);
        s.agregaSolicitud(p6);
        s.agregaSolicitud(p7);
        s.agregaSolicitud(p8);
        s.agregaSolicitud(new Persona("B", 23000));

        s.adjudicaSubvencion();
        
        

        List ad = s.getAdmitidos();
        List ex = s.getExcluidos();
        Iterator it1 = ad.iterator();
        Iterator it2 = ex.iterator();

        System.out.println("Admitidos:");
        int i = 1;
        while (it1.hasNext()) {
            Persona p = (Persona) it1.next();
            System.out.println(i + " - " + p.getDni() + " - " + p.getRentaAnual() + " €");
            i++;
        }
        i = 1;
        System.out.println("Excluidos:");
        while (it2.hasNext()) {
            Persona p = (Persona) it2.next();
            System.out.println(i + " - " + p.getDni() + " - " + p.getRentaAnual() + " €");
            i++;
        }

    }
}
