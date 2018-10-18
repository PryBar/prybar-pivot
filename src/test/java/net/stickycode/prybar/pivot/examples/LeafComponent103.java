package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent103
    implements PrybarComponent {

  private RootComponent103 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent103.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent103.class, "root"));
  }

  public RootComponent103 getRoot() {
    return root;
  }

}
