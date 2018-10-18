package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent189
    implements PrybarComponent {

  private RootComponent189 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent189.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent189.class, "root"));
  }

  public RootComponent189 getRoot() {
    return root;
  }

}
