/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller.html_kit;

import org.example.controller.FilesControl;

import java.io.File;
import javax.swing.JOptionPane;

/**
 * @author giovanic
 */
public class ConstructorHTML {

    private String path;
    private final FilesControl control;

    public ConstructorHTML() {
        control = new FilesControl();
    }

    public ConstructorHTML(String path) {
        control = new FilesControl();

        this.path = path;
        File temp = new File(path);
        if (temp.exists()) {
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

    public void crearNuevo(String id, String head, String body) {
        String stringBuilder = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\">\n" +
                head +
                "\n</head>\n" +
                "<body>\n" +
                body +
                "\n</body>\n" +
                "</html>";

        control.crearDirectorio(id);
        control.escribirEnFile(stringBuilder, id + "/index");
    }
}
