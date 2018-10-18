package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent737
    implements PrybarComponent {

  private RootComponent737 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent737.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent737.class, "root"));
  }

  public RootComponent737 getRoot() {
    return root;
  }

}
