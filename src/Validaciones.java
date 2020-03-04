
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daniel
 */
public class Validaciones {
    
    
    public static void PatronNC(String cadena) {
        Pattern pat = Pattern.compile("((0|1)([0-9]))(09)([0-4])\\d\\d\\d");
        Matcher mat = pat.matcher(cadena);
        if (mat.find()) {
        } else {
        }
    }

    public static void PatronFecha(String cadena) {
        Pattern pat = Pattern.compile("(^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\\\/](19|20)\\d{2}$)");

        Matcher mat = pat.matcher(cadena);
        if (mat.find()) {
        } else {
            JOptionPane.showMessageDialog(null, "El formato de fecha es incorrecto");
        }
    }

}
