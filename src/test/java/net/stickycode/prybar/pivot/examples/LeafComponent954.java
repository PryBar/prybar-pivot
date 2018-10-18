package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent954
    implements PrybarComponent {

  private RootComponent954 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.require(new PrybarComponentLookup(this, RootComponent954.class, "root"));
  }

  public RootComponent954 getRoot() {
    return root;
  }

}