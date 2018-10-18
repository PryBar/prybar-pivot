package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent364
    implements PrybarComponent {

  private RootComponent364 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent364.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent364.class, "root"));
  }

  public RootComponent364 getRoot() {
    return root;
  }

}
