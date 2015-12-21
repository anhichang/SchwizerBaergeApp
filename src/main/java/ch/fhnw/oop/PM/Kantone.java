package ch.fhnw.oop.PM;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by scatman on 21.12.15.
 */


    public class Kantone {

    private final StringProperty kanton = new SimpleStringProperty();
    private final StringProperty kürzel = new SimpleStringProperty();
    private final StringProperty kantonsNummer = new SimpleStringProperty();
    private final FloatProperty standesstimme = new SimpleFloatProperty();
    private final StringProperty beitritt = new SimpleStringProperty();
    private final StringProperty hauptort = new SimpleStringProperty();
    private final StringProperty einwohner = new SimpleStringProperty();
    private final StringProperty ausländer = new SimpleStringProperty();
    private final FloatProperty fläche = new SimpleFloatProperty();
    private final StringProperty einwohnerdichte = new SimpleStringProperty();
    private final FloatProperty gemeinden = new SimpleFloatProperty();
    private final StringProperty amtssprache = new SimpleStringProperty();

    public Kantone(String[] line) {
        setKanton(line[0]);
        setKürzel(line[1]);
        setKantonsNummer(line[2]);
        setStandesstimme(Float.valueOf(line[3]));
        setBeitritt(line[4]);
        setHauptort(line[5]);
        setEinwohner(line[6]);
        setAusländer(line[7]);
        setFläche(Float.valueOf(line[8]));
        setEinwohnerdichte(line[9]);
        setGemeinden(Float.valueOf(line[10]));
        setAmtssprache(line[11]);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Kantone resultat = (Kantone) o;

        return getKürzel().equals(resultat.getKürzel());
    }

       /* @Override
        public int hashCode(){
            return bergNr.hashCode();
        }*/

    public String infoAsLine() {
        return String.join("\t",
                getKanton(),
                getKürzel(),
                getKantonsNummer(),
                Float.toString(getStandesstimme()),
                getBeitritt(),
                getEinwohner(),
                getAusländer(),
                Float.toString(getFläche()),
                getEinwohnerdichte(),
                Float.toString(getGemeinden()),
                getAmtssprache()


                );
    }

    @Override
    public String toString() {
        return infoAsLine();
    }


    public String getKanton() {
        return kanton.get();
    }

    public StringProperty kantonProperty() {
        return kanton;
    }

    public void setKanton(String kanton) {
        this.kanton.set(kanton);
    }

    public String getKürzel() {
        return kürzel.get();
    }

    public StringProperty kürzelProperty() {
        return kürzel;
    }

    public void setKürzel(String kürzel) {
        this.kürzel.set(kürzel);
    }

    public float getStandesstimme() {
        return standesstimme.get();
    }

    public FloatProperty standesstimmeProperty() {
        return standesstimme;
    }

    public void setStandesstimme(float standesstimme) {
        this.standesstimme.set(standesstimme);
    }

    public String getBeitritt() {
        return beitritt.get();
    }

    public StringProperty beitrittProperty() {
        return beitritt;
    }

    public void setBeitritt(String beitritt) {
        this.beitritt.set(beitritt);
    }

    public String getHauptort() {
        return hauptort.get();
    }

    public StringProperty hauptortProperty() {
        return hauptort;
    }

    public void setHauptort(String hauptort) {
        this.hauptort.set(hauptort);
    }

    public String getEinwohner() {
        return einwohner.get();
    }

    public StringProperty einwohnerProperty() {
        return einwohner;
    }

    public void setEinwohner(String einwohner) {
        this.einwohner.set(einwohner);
    }

    public String getAusländer() {
        return ausländer.get();
    }

    public StringProperty ausländerProperty() {
        return ausländer;
    }

    public void setAusländer(String ausländer) {
        this.ausländer.set(ausländer);
    }

    public float getFläche() {
        return fläche.get();
    }

    public FloatProperty flächeProperty() {
        return fläche;
    }

    public void setFläche(float fläche) {
        this.fläche.set(fläche);
    }

    public String getEinwohnerdichte() {
        return einwohnerdichte.get();
    }

    public StringProperty einwohnerdichteProperty() {
        return einwohnerdichte;
    }

    public void setEinwohnerdichte(String einwohnerdichte) {
        this.einwohnerdichte.set(einwohnerdichte);
    }

    public float getGemeinden() {
        return gemeinden.get();
    }

    public FloatProperty gemeindenProperty() {
        return gemeinden;
    }

    public void setGemeinden(float gemeinden) {
        this.gemeinden.set(gemeinden);
    }

    public String getAmtssprache() {
        return amtssprache.get();
    }

    public StringProperty amtsspracheProperty() {
        return amtssprache;
    }

    public void setAmtssprache(String amtssprache) {
        this.amtssprache.set(amtssprache);
    }

    public String getKantonsNummer() {
        return kantonsNummer.get();
    }

    public StringProperty kantonsNummerProperty() {
        return kantonsNummer;
    }

    public void setKantonsNummer(String kantonsNummer) {
        this.kantonsNummer.set(kantonsNummer);
    }
 }



