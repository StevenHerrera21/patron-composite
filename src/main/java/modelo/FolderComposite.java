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
    
    public void add(FileComponent component){
        this.hijos.add(component);
    }
    
    public void delete(FileComponent component){
        this.hijos.remove(component);
    }
    
    @Override
    public List<FileComponent> getHijos() { return hijos; }

}
