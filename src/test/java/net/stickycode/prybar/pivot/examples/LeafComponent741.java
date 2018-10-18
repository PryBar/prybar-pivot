package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent741
    implements PrybarComponent {

  private RootComponent741 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent741.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent741.class, "root"));
  }

  public RootComponent741 getRoot() {
    return root;
  }

}
