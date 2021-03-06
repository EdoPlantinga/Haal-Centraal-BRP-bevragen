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
import org.openapitools.client.model.DatumOnvolledig;

/**
 * Geeft aan welke gegevens van de de ouder in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/in_onderzoek.feature) 
 */
@ApiModel(description = "Geeft aan welke gegevens van de de ouder in onderzoek zijn. Zie de [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/v1.1.0/features/in_onderzoek.feature) ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-02T08:18:19.408Z[Etc/UTC]")
public class OuderInOnderzoek {
  public static final String SERIALIZED_NAME_BURGERSERVICENUMMER = "burgerservicenummer";
  @SerializedName(SERIALIZED_NAME_BURGERSERVICENUMMER)
  private Boolean burgerservicenummer;

  public static final String SERIALIZED_NAME_DATUM_INGANG_FAMILIERECHTELIJKE_BETREKKING = "datumIngangFamilierechtelijkeBetrekking";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_FAMILIERECHTELIJKE_BETREKKING)
  private Boolean datumIngangFamilierechtelijkeBetrekking;

  public static final String SERIALIZED_NAME_GESLACHTSAANDUIDING = "geslachtsaanduiding";
  @SerializedName(SERIALIZED_NAME_GESLACHTSAANDUIDING)
  private Boolean geslachtsaanduiding;

  public static final String SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK = "datumIngangOnderzoek";
  @SerializedName(SERIALIZED_NAME_DATUM_INGANG_ONDERZOEK)
  private DatumOnvolledig datumIngangOnderzoek;


  public OuderInOnderzoek burgerservicenummer(Boolean burgerservicenummer) {
    
    this.burgerservicenummer = burgerservicenummer;
    return this;
  }

   /**
   * Get burgerservicenummer
   * @return burgerservicenummer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBurgerservicenummer() {
    return burgerservicenummer;
  }


  public void setBurgerservicenummer(Boolean burgerservicenummer) {
    this.burgerservicenummer = burgerservicenummer;
  }


  public OuderInOnderzoek datumIngangFamilierechtelijkeBetrekking(Boolean datumIngangFamilierechtelijkeBetrekking) {
    
    this.datumIngangFamilierechtelijkeBetrekking = datumIngangFamilierechtelijkeBetrekking;
    return this;
  }

   /**
   * Get datumIngangFamilierechtelijkeBetrekking
   * @return datumIngangFamilierechtelijkeBetrekking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDatumIngangFamilierechtelijkeBetrekking() {
    return datumIngangFamilierechtelijkeBetrekking;
  }


  public void setDatumIngangFamilierechtelijkeBetrekking(Boolean datumIngangFamilierechtelijkeBetrekking) {
    this.datumIngangFamilierechtelijkeBetrekking = datumIngangFamilierechtelijkeBetrekking;
  }


  public OuderInOnderzoek geslachtsaanduiding(Boolean geslachtsaanduiding) {
    
    this.geslachtsaanduiding = geslachtsaanduiding;
    return this;
  }

   /**
   * Get geslachtsaanduiding
   * @return geslachtsaanduiding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGeslachtsaanduiding() {
    return geslachtsaanduiding;
  }


  public void setGeslachtsaanduiding(Boolean geslachtsaanduiding) {
    this.geslachtsaanduiding = geslachtsaanduiding;
  }


  public OuderInOnderzoek datumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    
    this.datumIngangOnderzoek = datumIngangOnderzoek;
    return this;
  }

   /**
   * Get datumIngangOnderzoek
   * @return datumIngangOnderzoek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumIngangOnderzoek() {
    return datumIngangOnderzoek;
  }


  public void setDatumIngangOnderzoek(DatumOnvolledig datumIngangOnderzoek) {
    this.datumIngangOnderzoek = datumIngangOnderzoek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuderInOnderzoek ouderInOnderzoek = (OuderInOnderzoek) o;
    return Objects.equals(this.burgerservicenummer, ouderInOnderzoek.burgerservicenummer) &&
        Objects.equals(this.datumIngangFamilierechtelijkeBetrekking, ouderInOnderzoek.datumIngangFamilierechtelijkeBetrekking) &&
        Objects.equals(this.geslachtsaanduiding, ouderInOnderzoek.geslachtsaanduiding) &&
        Objects.equals(this.datumIngangOnderzoek, ouderInOnderzoek.datumIngangOnderzoek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(burgerservicenummer, datumIngangFamilierechtelijkeBetrekking, geslachtsaanduiding, datumIngangOnderzoek);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuderInOnderzoek {\n");
    sb.append("    burgerservicenummer: ").append(toIndentedString(burgerservicenummer)).append("\n");
    sb.append("    datumIngangFamilierechtelijkeBetrekking: ").append(toIndentedString(datumIngangFamilierechtelijkeBetrekking)).append("\n");
    sb.append("    geslachtsaanduiding: ").append(toIndentedString(geslachtsaanduiding)).append("\n");
    sb.append("    datumIngangOnderzoek: ").append(toIndentedString(datumIngangOnderzoek)).append("\n");
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

