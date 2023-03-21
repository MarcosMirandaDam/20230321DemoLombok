
package org.swing.demolombok;

import javax.xml.datatype.XMLGregorianCalendar;
import lombok.Data;

/**
 * 
 * @author sssoc
 */
@Data

public class Coche {
    
    String marca,modelo,matricula;
    int kilometros;
    XMLGregorianCalendar fechaMatriculacion;
    
}
