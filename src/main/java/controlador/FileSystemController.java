/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.FileComponent;
import modelo.FileLeaf;
import modelo.FolderComposite;

/**
 *
 * @author stev1
 */
public class FileSystemController {
    private FolderComposite root;
    
    public FileSystemController(FolderComposite root) {
        this.root = root;
    }
    
    public void addFile(FolderComposite folder, String name, int size) {
        FileLeaf file = new FileLeaf(name, size);
        folder.add(file);
    }

    public void addFolder(FolderComposite parent, FolderComposite folder) {
        parent.add(folder);
    }
    
    public void remove(FolderComposite parent, FileComponent component) {
        parent.delete(component);
    }
    
    public FolderComposite getRoot() {
        return root;
    }
}
