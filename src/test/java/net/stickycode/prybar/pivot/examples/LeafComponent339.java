package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent339
    implements PrybarComponent {

  private RootComponent339 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent339.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent339.class, "root"));
  }

  public RootComponent339 getRoot() {
    return root;
  }

}
