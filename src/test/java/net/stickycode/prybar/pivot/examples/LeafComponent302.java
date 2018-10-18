package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent302
    implements PrybarComponent {

  private RootComponent302 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent302.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent302.class, "root"));
  }

  public RootComponent302 getRoot() {
    return root;
  }

}
