package enchere.convertXml;

import java.io.FileInputStream;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import enchere.xml.*;

public class Transform {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance("enchere.xml");
            Unmarshaller u = jc.createUnmarshaller();
            EnchereType en =
                (EnchereType)u.unmarshal(new FileInputStream("./xml/test.xml"));
                 // Ecrire un printer pour la liste des enchere récupérer
            	System.out.println(en.getTitre());
            	System.out.println(en.getDescriptif());
            	System.out.println(en.getPrix());
            	System.out.println(en.getMeilleurPrix());
            	System.out.println(en.getPropriétaire().getNom());
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
