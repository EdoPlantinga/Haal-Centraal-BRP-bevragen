/*
 * Bevragen Ingeschreven Personen
 * API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.1.0/features) voor nadere toelichting. 
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.Naam;
import org.openapitools.client.model.NaamInOnderzoek;
import org.openapitools.client.model.NaamPersoonAllOf;
import org.openapitools.client.model.NaamgebruikEnum;
import org.openapitools.client.model.Waardetabel;

/**
 * NaamPersoon
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-02T08:18:19.408Z[Etc/UTC]")
public class NaamPersoon {
  public static final String SERIALIZED_NAME_GESLACHTSNAAM = "geslachtsnaam";
  @SerializedName(SERIALIZED_NAME_GESLACHTSNAAM)
  private String geslachtsnaam;

  public static final String SERIALIZED_NAME_VOORLETTERS = "voorletters";
  @SerializedName(SERIALIZED_NAME_VOORLETTERS)
  private String voorletters;

  public static final String SERIALIZED_NAME_VOORNAMEN = "voornamen";
  @SerializedName(SERIALIZED_NAME_VOORNAMEN)
  private String voornamen;

  public static final String SERIALIZED_NAME_VOORVOEGSEL = "voorvoegsel";
  @SerializedName(SERIALIZED_NAME_VOORVOEGSEL)
  private String voorvoegsel;

  public static final String SERIALIZED_NAME_IN_ONDERZOEK = "inOnderzoek";
  @SerializedName(SERIALIZED_NAME_IN_ONDERZOEK)
  private NaamInOnderzoek inOnderzoek;

  public static final String SERIALIZED_NAME_AANHEF = "aanhef";
  @SerializedName(SERIALIZED_NAME_AANHEF)
  private String aanhef;

  public static final String SERIALIZED_NAME_AANSCHRIJFWIJZE = "aanschrijfwijze";
  @SerializedName(SERIALIZED_NAME_AANSCHRIJFWIJZE)
  private String aanschrijfwijze;

  public static final String SERIALIZED_NAME_REGEL_VOORAFGAAND_AAN_AANSCHRIJFWIJZE = "regelVoorafgaandAanAanschrijfwijze";
  @SerializedName(SERIALIZED_NAME_REGEL_VOORAFGAAND_AAN_AANSCHRIJFWIJZE)
  private String regelVoorafgaandAanAanschrijfwijze;

  public static final String SERIALIZED_NAME_GEBRUIK_IN_LOPENDE_TEKST = "gebruikInLopendeTekst";
  @SerializedName(SERIALIZED_NAME_GEBRUIK_IN_LOPENDE_TEKST)
  private String gebruikInLopendeTekst;

  public static final String SERIALIZED_NAME_AANDUIDING_NAAMGEBRUIK = "aanduidingNaamgebruik";
  @SerializedName(SERIALIZED_NAME_AANDUIDING_NAAMGEBRUIK)
  private NaamgebruikEnum aanduidingNaamgebruik;

  public static final String SERIALIZED_NAME_ADELLIJKE_TITEL_PREDIKAAT = "adellijkeTitelPredikaat";
  @SerializedName(SERIALIZED_NAME_ADELLIJKE_TITEL_PREDIKAAT)
  private Waardetabel adellijkeTitelPredikaat;


  public NaamPersoon geslachtsnaam(String geslachtsnaam) {
    
    this.geslachtsnaam = geslachtsnaam;
    return this;
  }

   /**
   * De achternaam van een persoon. 
   * @return geslachtsnaam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Vries", value = "De achternaam van een persoon. ")

  public String getGeslachtsnaam() {
    return geslachtsnaam;
  }


  public void setGeslachtsnaam(String geslachtsnaam) {
    this.geslachtsnaam = geslachtsnaam;
  }


  public NaamPersoon voorletters(String voorletters) {
    
    this.voorletters = voorletters;
    return this;
  }

   /**
   * De voorletters van de persoon, afgeleid van de voornamen. 
   * @return voorletters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P.J.", value = "De voorletters van de persoon, afgeleid van de voornamen. ")

  public String getVoorletters() {
    return voorletters;
  }


  public void setVoorletters(String voorletters) {
    this.voorletters = voorletters;
  }


  public NaamPersoon voornamen(String voornamen) {
    
    this.voornamen = voornamen;
    return this;
  }

   /**
   * De verzameling namen voor de geslachtsnaam, gescheiden door spaties. 
   * @return voornamen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Pieter Jan", value = "De verzameling namen voor de geslachtsnaam, gescheiden door spaties. ")

  public String getVoornamen() {
    return voornamen;
  }


  public void setVoornamen(String voornamen) {
    this.voornamen = voornamen;
  }


  public NaamPersoon voorvoegsel(String voorvoegsel) {
    
    this.voorvoegsel = voorvoegsel;
    return this;
  }

   /**
   * Get voorvoegsel
   * @return voorvoegsel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "de", value = "")

  public String getVoorvoegsel() {
    return voorvoegsel;
  }


  public void setVoorvoegsel(String voorvoegsel) {
    this.voorvoegsel = voorvoegsel;
  }


  public NaamPersoon inOnderzoek(NaamInOnderzoek inOnderzoek) {
    
    this.inOnderzoek = inOnderzoek;
    return this;
  }

   /**
   * Get inOnderzoek
   * @return inOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NaamInOnderzoek getInOnderzoek() {
    return inOnderzoek;
  }


  public void setInOnderzoek(NaamInOnderzoek inOnderzoek) {
    this.inOnderzoek = inOnderzoek;
  }


  public NaamPersoon aanhef(String aanhef) {
    
    this.aanhef = aanhef;
    return this;
  }

   /**
   * Kun je gebruiken als aanhef in een brief gericht aan persoon. 
   * @return aanhef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hoogwelgeboren heer", value = "Kun je gebruiken als aanhef in een brief gericht aan persoon. ")

  public String getAanhef() {
    return aanhef;
  }


  public void setAanhef(String aanhef) {
    this.aanhef = aanhef;
  }


  public NaamPersoon aanschrijfwijze(String aanschrijfwijze) {
    
    this.aanschrijfwijze = aanschrijfwijze;
    return this;
  }

   /**
   * Samengestelde naam die je kunt gebruiken in de communicatie met de persoon. 
   * @return aanschrijfwijze
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "H.W. baron van den Aedel", value = "Samengestelde naam die je kunt gebruiken in de communicatie met de persoon. ")

  public String getAanschrijfwijze() {
    return aanschrijfwijze;
  }


  public void setAanschrijfwijze(String aanschrijfwijze) {
    this.aanschrijfwijze = aanschrijfwijze;
  }


  public NaamPersoon regelVoorafgaandAanAanschrijfwijze(String regelVoorafgaandAanAanschrijfwijze) {
    
    this.regelVoorafgaandAanAanschrijfwijze = regelVoorafgaandAanAanschrijfwijze;
    return this;
  }

   /**
   * Deze regel moet als aparte regel boven de aanschrijfwijze worden geplaatst. Komt alleen voor bij personen met een adellijke titel of predicaat. 
   * @return regelVoorafgaandAanAanschrijfwijze
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "De hoogwelgeboren heer", value = "Deze regel moet als aparte regel boven de aanschrijfwijze worden geplaatst. Komt alleen voor bij personen met een adellijke titel of predicaat. ")

  public String getRegelVoorafgaandAanAanschrijfwijze() {
    return regelVoorafgaandAanAanschrijfwijze;
  }


  public void setRegelVoorafgaandAanAanschrijfwijze(String regelVoorafgaandAanAanschrijfwijze) {
    this.regelVoorafgaandAanAanschrijfwijze = regelVoorafgaandAanAanschrijfwijze;
  }


  public NaamPersoon gebruikInLopendeTekst(String gebruikInLopendeTekst) {
    
    this.gebruikInLopendeTekst = gebruikInLopendeTekst;
    return this;
  }

   /**
   * Naam van persoon die je kunt gebruiken als je in lopende tekst (bijvoorbeeld in een brief) aan persoon refereert. 
   * @return gebruikInLopendeTekst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "baron Van den Aedel", value = "Naam van persoon die je kunt gebruiken als je in lopende tekst (bijvoorbeeld in een brief) aan persoon refereert. ")

  public String getGebruikInLopendeTekst() {
    return gebruikInLopendeTekst;
  }


  public void setGebruikInLopendeTekst(String gebruikInLopendeTekst) {
    this.gebruikInLopendeTekst = gebruikInLopendeTekst;
  }


  public NaamPersoon aanduidingNaamgebruik(NaamgebruikEnum aanduidingNaamgebruik) {
    
    this.aanduidingNaamgebruik = aanduidingNaamgebruik;
    return this;
  }

   /**
   * Get aanduidingNaamgebruik
   * @return aanduidingNaamgebruik
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NaamgebruikEnum getAanduidingNaamgebruik() {
    return aanduidingNaamgebruik;
  }


  public void setAanduidingNaamgebruik(NaamgebruikEnum aanduidingNaamgebruik) {
    this.aanduidingNaamgebruik = aanduidingNaamgebruik;
  }


  public NaamPersoon adellijkeTitelPredikaat(Waardetabel adellijkeTitelPredikaat) {
    
    this.adellijkeTitelPredikaat = adellijkeTitelPredikaat;
    return this;
  }

   /**
   * Get adellijkeTitelPredikaat
   * @return adellijkeTitelPredikaat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Waardetabel getAdellijkeTitelPredikaat() {
    return adellijkeTitelPredikaat;
  }


  public void setAdellijkeTitelPredikaat(Waardetabel adellijkeTitelPredikaat) {
    this.adellijkeTitelPredikaat = adellijkeTitelPredikaat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaamPersoon naamPersoon = (NaamPersoon) o;
    return Objects.equals(this.geslachtsnaam, naamPersoon.geslachtsnaam) &&
        Objects.equals(this.voorletters, naamPersoon.voorletters) &&
        Objects.equals(this.voornamen, naamPersoon.voornamen) &&
        Objects.equals(this.voorvoegsel, naamPersoon.voorvoegsel) &&
        Objects.equals(this.inOnderzoek, naamPersoon.inOnderzoek) &&
        Objects.equals(this.aanhef, naamPersoon.aanhef) &&
        Objects.equals(this.aanschrijfwijze, naamPersoon.aanschrijfwijze) &&
        Objects.equals(this.regelVoorafgaandAanAanschrijfwijze, naamPersoon.regelVoorafgaandAanAanschrijfwijze) &&
        Objects.equals(this.gebruikInLopendeTekst, naamPersoon.gebruikInLopendeTekst) &&
        Objects.equals(this.aanduidingNaamgebruik, naamPersoon.aanduidingNaamgebruik) &&
        Objects.equals(this.adellijkeTitelPredikaat, naamPersoon.adellijkeTitelPredikaat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geslachtsnaam, voorletters, voornamen, voorvoegsel, inOnderzoek, aanhef, aanschrijfwijze, regelVoorafgaandAanAanschrijfwijze, gebruikInLopendeTekst, aanduidingNaamgebruik, adellijkeTitelPredikaat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaamPersoon {\n");
    sb.append("    geslachtsnaam: ").append(toIndentedString(geslachtsnaam)).append("\n");
    sb.append("    voorletters: ").append(toIndentedString(voorletters)).append("\n");
    sb.append("    voornamen: ").append(toIndentedString(voornamen)).append("\n");
    sb.append("    voorvoegsel: ").append(toIndentedString(voorvoegsel)).append("\n");
    sb.append("    inOnderzoek: ").append(toIndentedString(inOnderzoek)).append("\n");
    sb.append("    aanhef: ").append(toIndentedString(aanhef)).append("\n");
    sb.append("    aanschrijfwijze: ").append(toIndentedString(aanschrijfwijze)).append("\n");
    sb.append("    regelVoorafgaandAanAanschrijfwijze: ").append(toIndentedString(regelVoorafgaandAanAanschrijfwijze)).append("\n");
    sb.append("    gebruikInLopendeTekst: ").append(toIndentedString(gebruikInLopendeTekst)).append("\n");
    sb.append("    aanduidingNaamgebruik: ").append(toIndentedString(aanduidingNaamgebruik)).append("\n");
    sb.append("    adellijkeTitelPredikaat: ").append(toIndentedString(adellijkeTitelPredikaat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

