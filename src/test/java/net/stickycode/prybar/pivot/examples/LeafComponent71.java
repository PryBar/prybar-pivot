package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent71
    implements PrybarComponent {

  private RootComponent71 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent71.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent71.class, "root"));
  }

  public RootComponent71 getRoot() {
    return root;
  }

}
