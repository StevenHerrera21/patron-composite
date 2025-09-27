/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author stev1
 */
public class FileLeaf extends FileComponent{
    private int size;

    public FileLeaf(String nombre, int size) {
        super(nombre);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void mostrarContenido(String indent) {
        System.out.println(indent + "- " + nombre + " (" + size + " KB)");
    }
    
}
