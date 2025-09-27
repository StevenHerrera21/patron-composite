/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

import controlador.FileSystemController;
import modelo.FileComponent;
import modelo.FileLeaf;
import modelo.FolderComposite;

/**
 *
 * @author stev1
 */
public class VistaFileSystem {

    public static void main(String[] args) {
        FolderComposite carpetaPrincipal = new FolderComposite("Mis Documentos");
        FolderComposite subCarpeta = new FolderComposite("Patrones de diseño");
        FileSystemController controller = new FileSystemController(carpetaPrincipal);
        controller.addFolder(carpetaPrincipal, subCarpeta);
        controller.addFile(subCarpeta, "unidad02.pdf", 100);
        controller.addFile(subCarpeta, "actividad02.docx", 200);
        controller.addFile(carpetaPrincipal, "datos.xlsx", 300);
        mostrarEstructura(controller.getRoot(), "");
        System.out.println("\nPeso total de root: " + carpetaPrincipal.getSize() + " KB");
    }
    
    private static void mostrarEstructura(FileComponent component, String indent) {
        if (component instanceof FileLeaf) {
            System.out.println(indent + "- " + component.getName() + " (" + component.getSize() + " KB)");
        } else if (component instanceof FolderComposite) {
            System.out.println(indent + "+ Carpeta: " + component.getName() + " (" + component.getSize() + " KB)");
            for (FileComponent child : component.getHijos()) {
                mostrarEstructura(child, indent + "   ");
            }
        }
    }
}
