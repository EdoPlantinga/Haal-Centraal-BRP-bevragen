/*
 * Bevragingen ingeschreven personen
 * API voor het ontsluiten van gegevens van ingeschreven personen en aanverwante gegevens uit de GBA en RNI. Met deze API worden de actuele gegevens van ingeschreven personen, hun kinderen, partners en ouders ontsloten. <br> Heeft een persoon bijvoorbeeld geen geldige nationaliteit, dan wordt nationaliteit niet geretourneerd. <br> Heeft een persoon een beëindigd partnerschap of huwelijk, dan wordt de partner niet geretourneerd. <br> <br> Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/tree/master/features) voor nadere toelichting. <br> 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * De aanduiding van het bijzonder Nederlanderschap: * &#x60;behandeld_als_nederlander&#x60; - B * &#x60;vastgesteld_niet_nederlander&#x60; - V
 */
@JsonAdapter(AanduidingBijzonderNederlanderschapEnum.Adapter.class)
public enum AanduidingBijzonderNederlanderschapEnum {
  
  BEHANDELD_ALS_NEDERLANDER("behandeld_als_nederlander"),
  
  VASTGESTELD_NIET_NEDERLANDER("vastgesteld_niet_nederlander");

  private String value;

  AanduidingBijzonderNederlanderschapEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AanduidingBijzonderNederlanderschapEnum fromValue(String value) {
    for (AanduidingBijzonderNederlanderschapEnum b : AanduidingBijzonderNederlanderschapEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AanduidingBijzonderNederlanderschapEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final AanduidingBijzonderNederlanderschapEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AanduidingBijzonderNederlanderschapEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AanduidingBijzonderNederlanderschapEnum.fromValue(value);
    }
  }
}
