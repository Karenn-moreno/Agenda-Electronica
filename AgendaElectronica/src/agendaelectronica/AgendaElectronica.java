
package agendaelectronica;

import agendaelectronica.igu.Principal;
import javax.swing.UIManager;


public class AgendaElectronica {
    
    public static void main(String[] args) {
         
        try {
             UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");  
         } catch (Exception e) {
            System.out.println("No se pudo aplicar el Look and Feel");
        }
        
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
    
}
