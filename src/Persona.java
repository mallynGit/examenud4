
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author usuario
 */
public class Persona implements Comparable {

    private String dni;
    private double rentaAnual;

    public Persona(String dni, double rentaAnual) {
        this.dni = dni;
        this.rentaAnual = rentaAnual;
    }

    public String getDni() {
        return dni;
    }

    public double getRentaAnual() {
        return rentaAnual;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;
        int i = (int) (this.rentaAnual - p.getRentaAnual());
        return i;
    }

}
