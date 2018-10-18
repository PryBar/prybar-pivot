package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent181
    implements PrybarComponent {

  private RootComponent181 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent181.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent181.class, "root"));
  }

  public RootComponent181 getRoot() {
    return root;
  }

}
