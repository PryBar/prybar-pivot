package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent484
    implements PrybarComponent {

  private RootComponent484 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent484.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent484.class, "root"));
  }

  public RootComponent484 getRoot() {
    return root;
  }

}
