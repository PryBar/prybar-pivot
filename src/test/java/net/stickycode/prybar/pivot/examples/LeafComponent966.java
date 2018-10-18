package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent966
    implements PrybarComponent {

  private RootComponent966 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent966.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent966.class, "root"));
  }

  public RootComponent966 getRoot() {
    return root;
  }

}
