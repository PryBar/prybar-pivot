package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent190
    implements PrybarComponent {

  private RootComponent190 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent190.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent190.class, "root"));
  }

  public RootComponent190 getRoot() {
    return root;
  }

}
