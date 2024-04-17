/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author giovanic
 */
public class CreacionHTML {

    private String path;
    private File archivo;

    public CreacionHTML() {
    }

    public CreacionHTML(String path) {
        this.path = path;
        File temp = new File(path);
        if (temp.exists()) {
            archivo = temp;
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "El archivo no existe, verifique la ruta",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void crearNuevo() {

    }
}
