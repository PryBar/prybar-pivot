package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent30
    implements PrybarComponent {

  private RootComponent30 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.require(new PrybarComponentLookup(this, RootComponent30.class, "root"));
  }

  public RootComponent30 getRoot() {
    return root;
  }

}