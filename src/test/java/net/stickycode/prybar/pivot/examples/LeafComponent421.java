package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent421
    implements PrybarComponent {

  private RootComponent421 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent421.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent421.class, "root"));
  }

  public RootComponent421 getRoot() {
    return root;
  }

}
