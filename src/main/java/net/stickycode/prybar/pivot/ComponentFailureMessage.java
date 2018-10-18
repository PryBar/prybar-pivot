package net.stickycode.prybar.pivot;

public class ComponentFailureMessage
    implements PrybarMessage {

  private String message;

  public ComponentFailureMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return message;
  }

}
