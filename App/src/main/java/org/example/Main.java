package org.example;

import org.example.controller.html_kit.Componente;
import org.example.controller.html_kit.ConstructorHTML;

public class Main {

    public static void main(String[] args) {

//        FlatMacLightLaf.setup();
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            ClienteForm cf = new ClienteForm();
//            cf.setLocationRelativeTo(null);
//            cf.setVisible(true);
//            ServerForm sf = new ServerForm();
//            sf.setVisible(true);
//        });
        String body;

        Componente componente = new Componente();
        body = componente.write("Hola mundo", "CENTRAR","#5A5A5A");
        ConstructorHTML constructorHTML = new ConstructorHTML();
        constructorHTML.crearNuevo("example", "<title> ejemplo </title>", body);
    }
}
