package com.wordnik.swagger.models.parameters;

public class FormParameter extends AbstractSerializableParameter<FormParameter> {

  public FormParameter() {
    super.setIn("formData");
  }
}
