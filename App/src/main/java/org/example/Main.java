package org.example;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import org.example.view.ClienteForm;
import org.example.view.ServerForm;

public class Main {

    public static void main(String[] args) {

        FlatMacLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            ClienteForm cf = new ClienteForm();
            cf.setLocationRelativeTo(null);
            cf.setVisible(true);
            ServerForm sf = new ServerForm();
            sf.setVisible(true);
        });
    }
}
