package enchere.convertXml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import enchere.xml.*;
import enchere.xml.impl.EnchereTypeImpl;
import enchere.xml.impl.PersonneTypeImpl;

/**
 * Cr�ation d'un xml depuis du java
 * @author Mika�l
 */
public class Creer {   
    public static void main( String[] args ) {
        try {
            JAXBContext jc = JAXBContext.newInstance( "enchere.xml" ); //"enchere.xml" nom du package 
            ObjectFactory factory = new ObjectFactory();
            //Cr�ation des objets � faire
            
            //Cr�ation d'un propri�taire
            PersonneType pers1 = new PersonneTypeImpl();
            pers1.setLogin("Jarnak");
            pers1.setMail("Jarmak@gfail.com");
            pers1.setNom("Asec");
            pers1.setPrenom("Jean");
            //Cr�ation d'une enchere
            EnchereType enchere1 = new EnchereTypeImpl();
            enchere1.setDescriptif("Vase chinois");
            enchere1.setTitre("Ming");
            enchere1.setPrix(900);
            enchere1.setMeilleurPrix("1000");
            enchere1.setPropri�taire(pers1);
            
            
            Marshaller m = jc.createMarshaller();
            m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(enchere1, System.out);
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
