package legoset;

import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Year;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        Legoset legoset = new Legoset();
        legoset.setNumber(75211);
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        legoset.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoset.setMinifigs(List.of(
                new Minifig("Imperial Mudtrooper", 1),
                new Minifig("Imperial Pilot", 2),
                new Minifig("Mimban Stormtrooper", 3)
        ));
        legoset.setWeight(new Weight(0.89, "kg"));

        JAXBHelper.toXML(legoset, System.out);

        JAXBHelper.toXML(legoset, new FileOutputStream("album.xml"));
        System.out.println(JAXBHelper.fromXML(Legoset.class, new FileInputStream("album.xml")));
    }

}
