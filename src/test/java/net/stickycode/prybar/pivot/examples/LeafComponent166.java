package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent166
    implements PrybarComponent {

  private RootComponent166 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent166.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent166.class, "root"));
  }

  public RootComponent166 getRoot() {
    return root;
  }

}
