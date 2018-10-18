package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent651
    implements PrybarComponent {

  private RootComponent651 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent651.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent651.class, "root"));
  }

  public RootComponent651 getRoot() {
    return root;
  }

}
