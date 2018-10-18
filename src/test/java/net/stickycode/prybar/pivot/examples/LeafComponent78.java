package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent78
    implements PrybarComponent {

  private RootComponent78 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent78.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent78.class, "root"));
  }

  public RootComponent78 getRoot() {
    return root;
  }

}
