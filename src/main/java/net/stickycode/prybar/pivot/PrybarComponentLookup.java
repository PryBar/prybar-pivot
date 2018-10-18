package net.stickycode.prybar.pivot;

public class PrybarComponentLookup
    implements PrybarMessage {

  private String fieldName;

  private PrybarComponent component;

  private Class<?> type;

  public String getFieldName() {
    return fieldName;
  }

  public PrybarComponent getComponent() {
    return component;
  }

  public Class<?> getType() {
    return type;
  }

  public PrybarComponentLookup(PrybarComponent component, Class type, String fieldName) {
    this.component = component;
    this.type = type;
    this.fieldName = fieldName;
  }

  @Override
  public String toString() {
    return String.format("%s: %s %s could not be resolved", component.getClass().getSimpleName(), type.getSimpleName(), fieldName);
  }

}
