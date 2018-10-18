package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent750
    implements PrybarComponent {

  private RootComponent750 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent750.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent750.class, "root"));
  }

  public RootComponent750 getRoot() {
    return root;
  }

}
