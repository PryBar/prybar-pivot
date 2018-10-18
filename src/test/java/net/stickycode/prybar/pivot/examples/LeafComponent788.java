package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent788
    implements PrybarComponent {

  private RootComponent788 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.require(new PrybarComponentLookup(this, RootComponent788.class, "root"));
  }

  public RootComponent788 getRoot() {
    return root;
  }

}