package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent922
    implements PrybarComponent {

  private RootComponent922 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent922.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent922.class, "root"));
  }

  public RootComponent922 getRoot() {
    return root;
  }

}
