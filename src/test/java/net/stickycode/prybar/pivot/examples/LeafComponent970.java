package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent970
    implements PrybarComponent {

  private RootComponent970 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent970.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent970.class, "root"));
  }

  public RootComponent970 getRoot() {
    return root;
  }

}
