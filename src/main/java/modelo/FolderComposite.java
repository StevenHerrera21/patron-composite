/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stev1
 */
public class FolderComposite extends FileComponent{
    private List<FileComponent> hijos = new ArrayList<FileComponent>();    

    public FolderComposite(String nombre) {
        super(nombre);
    }
    
    @Override
    public int getSize() {
        int total = 0;
        for (FileComponent hijo : hijos) {
            total += hijo.getSize();
        }
        return total;
    }
    
    public void add(FileComponent figura){
        this.hijos.add(figura);
    }
    
    public void delete(FileComponent figura){
        this.hijos.remove(figura);
    }

    public List<FileComponent> getHijos() {
        return hijos;
    }

    @Override
    public void mostrarContenido(String indent) {
        System.out.println(indent  +" + Carpeta: " + nombre + " (" + getSize() + " KB)");
        for (FileComponent hijo : hijos) {
            hijo.mostrarContenido(indent + "    ");
        }
    }
}
