package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent760
    implements PrybarComponent {

  private RootComponent760 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent760.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent760.class, "root"));
  }

  public RootComponent760 getRoot() {
    return root;
  }

}
