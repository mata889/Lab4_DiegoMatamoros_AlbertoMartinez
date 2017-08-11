/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_diego_alberto;

/**
 *
 * @author Alberto
 */
public class usuario {
    public String nombre;
    public int edad;
    public String lugar;
    public String username;
    public String sexo;

    public usuario() {
    }

    public usuario(String nombre, int edad, String lugar, String username, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugar = lugar;
        this.username = username;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", edad=" + edad + ", lugar=" + lugar + ", username=" + username + ", sexo=" + sexo + '}';
    }
    
    
    
    
}
