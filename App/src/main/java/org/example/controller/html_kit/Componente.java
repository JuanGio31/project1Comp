package org.example.controller.html_kit;

public class Componente {
    String path;

    public Componente(String path) {
        this.path = path;
    }

    public Componente() {
    }

    public String write(String titulo) {
        return "<title> " + titulo + "</title>\n";
    }

    public String write(String titulo, String alineacion, String color) {
        String align = switch (alineacion) {
            case "CENTRAR" -> "center";
            case "DERECHA" -> "rigth";
            case "IZQUIERDA" -> "left";
            case "JUSTIFICAR" -> "justify";
            default -> "";
        };
        //para el color del texto-> style = "color: CODIGO"
        //para la alineacion del texto -> aling = "left | rigth | center | justify "
        if (alineacion.isEmpty() && !color.isEmpty()) {
            return "<h1 style = \"color:" + color + "\" >\n" + titulo + "\n</h1>\n";
        } else if (color.isEmpty() && !alineacion.isEmpty()) {
            return "<h1 align = \"" + align + "\" >\n" + titulo + "\n</h1>\n";
        } else if (alineacion.isEmpty() && color.isEmpty()) {
            return "<h1\n>" + titulo + "\n</h1>\n";
        }
        return "<h1 style = \"color:" + color + "\" align = \"" + align + "\" >\n" + titulo + "\n</h1>\n";
    }
}
