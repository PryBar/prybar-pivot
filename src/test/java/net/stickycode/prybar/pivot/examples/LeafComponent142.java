package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent142
    implements PrybarComponent {

  private RootComponent142 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent142.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent142.class, "root"));
  }

  public RootComponent142 getRoot() {
    return root;
  }

}
