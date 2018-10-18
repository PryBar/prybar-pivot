package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent233
    implements PrybarComponent {

  private RootComponent233 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent233.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent233.class, "root"));
  }

  public RootComponent233 getRoot() {
    return root;
  }

}
