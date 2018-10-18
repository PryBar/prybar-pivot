package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent207
    implements PrybarComponent {

  private RootComponent207 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent207.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent207.class, "root"));
  }

  public RootComponent207 getRoot() {
    return root;
  }

}
