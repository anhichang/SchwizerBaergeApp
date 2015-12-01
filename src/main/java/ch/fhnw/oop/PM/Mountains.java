package ch.fhnw.oop.PM;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by piotr on 27.11.15.
 */
public class Mountains {

    private final StringProperty bergNr = new SimpleStringProperty();
    private final StringProperty bergName = new SimpleStringProperty();
    private final FloatProperty bergHoehe = new SimpleFloatProperty();
    private final StringProperty bergGipfelArt = new SimpleStringProperty();
    private final StringProperty bergGebiet = new SimpleStringProperty();
    private final StringProperty bergKantone = new SimpleStringProperty();
    private final StringProperty bergRegion = new SimpleStringProperty();
    private final FloatProperty  bergDominanz = new SimpleFloatProperty();
    private final StringProperty bergDominanzGipfel = new SimpleStringProperty();
    private final FloatProperty bergScharte = new SimpleFloatProperty();
    private final StringProperty bergSchartenGipfel = new SimpleStringProperty();
    private final StringProperty Bildunterschrift = new SimpleStringProperty();

    public Mountains(String[] line){
        setBergNr(line[0]);
        setBergName(line[1]);
        setBergHoehe(Float.valueOf(line[2]));
        setBergGipfelArt(line[3]);
        setBergGebiet(line[4]);
        setBergKantone(line[5]);
        setBergRegion(line[6]);
        setBergDominanz(Float.valueOf(line[7]));
        setBergDominanzGipfel(line[8]);
        setBergScharte(Float.valueOf(line[9]));
        setBergSchartenGipfel(line[10]);
        setBildunterschrift(line[11]);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Mountains resultat = (Mountains) o;

        return getBergNr().equals(resultat.getBergNr());
    }

    @Override
    public int hashCode(){
        return bergNr.hashCode();
    }

    public String infoAsLine(){
        return String.join("\t",
                getBergNr(),
                getBergName(),
                Float.toString(getBergHoehe()),
                getBergGipfelArt(),
                getBergGebiet(),
                getBergKantone(),
                getBergRegion(),
                Float.toString(getBergDominanz()),
                getBergDominanzGipfel(),
                Float.toString(getBergScharte()),
                getBergSchartenGipfel(),
                getBildunterschrift()
        );
    }

    @Override
    public String toString(){
        return infoAsLine();
    }

    public String getBergNr() {
        return bergNr.get();
    }

    public StringProperty bergNrProperty() {
        return bergNr;
    }

    public void setBergNr(String bergNr) {
        this.bergNr.set(bergNr);
    }

    public String getBergName() {
        return bergName.get();
    }

    public StringProperty bergNameProperty() {
        return bergName;
    }

    public void setBergName(String bergName) {
        this.bergName.set(bergName);
    }

    public float getBergHoehe() {
        return bergHoehe.get();
    }

    public FloatProperty bergHoeheProperty() {
        return bergHoehe;
    }

    public void setBergHoehe(float bergHoehe) {
        this.bergHoehe.set(bergHoehe);
    }

    public String getBergGipfelArt() {
        return bergGipfelArt.get();
    }

    public StringProperty bergGipfelArtProperty() {
        return bergGipfelArt;
    }

    public void setBergGipfelArt(String bergGipfelArt) {
        this.bergGipfelArt.set(bergGipfelArt);
    }

    public String getBergGebiet() {
        return bergGebiet.get();
    }

    public StringProperty bergGebietProperty() {
        return bergGebiet;
    }

    public void setBergGebiet(String bergGebiet) {
        this.bergGebiet.set(bergGebiet);
    }

    public String getBergKantone() {
        return bergKantone.get();
    }

    public StringProperty bergKantoneProperty() {
        return bergKantone;
    }

    public void setBergKantone(String bergKantone) {
        this.bergKantone.set(bergKantone);
    }

    public String getBergRegion() {
        return bergRegion.get();
    }

    public StringProperty bergRegionProperty() {
        return bergRegion;
    }

    public void setBergRegion(String bergRegion) {
        this.bergRegion.set(bergRegion);
    }

    public float getBergDominanz() {
        return bergDominanz.get();
    }

    public FloatProperty bergDominanzProperty() {
        return bergDominanz;
    }

    public void setBergDominanz(float bergDominanz) {
        this.bergDominanz.set(bergDominanz);
    }

    public String getBergDominanzGipfel() {
        return bergDominanzGipfel.get();
    }

    public StringProperty bergDominanzGipfelProperty() {
        return bergDominanzGipfel;
    }

    public void setBergDominanzGipfel(String bergDominanzGipfel) {
        this.bergDominanzGipfel.set(bergDominanzGipfel);
    }

    public float getBergScharte() {
        return bergScharte.get();
    }

    public FloatProperty bergScharteProperty() {
        return bergScharte;
    }

    public void setBergScharte(float bergScharte) {
        this.bergScharte.set(bergScharte);
    }

    public String getBergSchartenGipfel() {
        return bergSchartenGipfel.get();
    }

    public StringProperty bergSchartenGipfelProperty() {
        return bergSchartenGipfel;
    }

    public void setBergSchartenGipfel(String bergSchartenGipfel) {
        this.bergSchartenGipfel.set(bergSchartenGipfel);
    }

    public String getBildunterschrift() {
        return Bildunterschrift.get();
    }

    public StringProperty bildunterschriftProperty() {
        return Bildunterschrift;
    }

    public void setBildunterschrift(String bildunterschrift) {
        this.Bildunterschrift.set(bildunterschrift);
    }
}
