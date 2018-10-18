package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent278
    implements PrybarComponent {

  private RootComponent278 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent278.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent278.class, "root"));
  }

  public RootComponent278 getRoot() {
    return root;
  }

}
