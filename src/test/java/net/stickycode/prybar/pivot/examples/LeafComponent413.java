package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent413
    implements PrybarComponent {

  private RootComponent413 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent413.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent413.class, "root"));
  }

  public RootComponent413 getRoot() {
    return root;
  }

}
