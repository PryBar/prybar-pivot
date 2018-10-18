package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent501
    implements PrybarComponent {

  private RootComponent501 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent501.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent501.class, "root"));
  }

  public RootComponent501 getRoot() {
    return root;
  }

}
