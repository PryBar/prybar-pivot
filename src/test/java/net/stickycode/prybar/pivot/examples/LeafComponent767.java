package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent767
    implements PrybarComponent {

  private RootComponent767 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent767.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent767.class, "root"));
  }

  public RootComponent767 getRoot() {
    return root;
  }

}
