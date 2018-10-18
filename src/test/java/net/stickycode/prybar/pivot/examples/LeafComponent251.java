package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent251
    implements PrybarComponent {

  private RootComponent251 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent251.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent251.class, "root"));
  }

  public RootComponent251 getRoot() {
    return root;
  }

}
