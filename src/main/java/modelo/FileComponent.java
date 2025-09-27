/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author stev1
 */
public abstract class FileComponent {
    protected String nombre;
    private int size;
    
    public FileComponent(String nombre) {
        this.nombre = nombre;
    }
    public String getName() { return nombre; }
    public abstract int getSize();
    public abstract void mostrarContenido(String indent);
}
