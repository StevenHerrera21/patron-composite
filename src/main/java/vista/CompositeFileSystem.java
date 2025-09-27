/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

import modelo.FileLeaf;
import modelo.FolderComposite;

/**
 *
 * @author stev1
 */
public class CompositeFileSystem {

    public static void main(String[] args) {
        FileLeaf file1 = new FileLeaf("unidad01.pdf", 100);
        FileLeaf file2 = new FileLeaf("unidad02.pdf", 100);
        FileLeaf file3 = new FileLeaf("notas.docx", 200);
        FileLeaf file4 = new FileLeaf("datos.xls", 500);
        
        FolderComposite carpetaPrincipal = new FolderComposite("Mis Documentos");
        FolderComposite subCarpeta = new FolderComposite("Patrones de diseño");
        subCarpeta.add(file1);
        subCarpeta.add(file2);
        carpetaPrincipal.add(subCarpeta);
        carpetaPrincipal.add(file3);
        carpetaPrincipal.add(file4);
        
        System.out.println("Mostrando contenido...");
        carpetaPrincipal.mostrarContenido("");
        System.out.println("Peso de la carpeta en total "+carpetaPrincipal.getSize());
        
        
        
        
    }
}
