
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author daniel
 */
public class Validaciones {
    
    public void soloLetras(KeyEvent evt){
        Character s;
        s = evt.getKeyChar();
        if(!Character.isLetter(s)){
            evt.consume();
        }
    }
    public void soloLetrasEsp(KeyEvent evt){
        Character s;
        s = evt.getKeyChar();
        if(!Character.isLetter(s) && s != KeyEvent.VK_SPACE){
            evt.consume();
        }
    }
    public static Date sumaDias(Date fecha, int dias) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        cal.add(Calendar.DAY_OF_YEAR, dias);
        return cal.getTime();
    }
    /*
    
    public static void PatronNC(String cadena) {
        Pattern pat = Pattern.compile("((0|1)([0-9]))(09)([0-4])\\d\\d\\d");
        Matcher mat = pat.matcher(cadena);
        if (mat.find()) {
        } else {
        }
    }*/

}
