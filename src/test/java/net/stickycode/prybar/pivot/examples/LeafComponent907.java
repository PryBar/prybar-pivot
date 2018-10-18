package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent907
    implements PrybarComponent {

  private RootComponent907 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent907.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent907.class, "root"));
  }

  public RootComponent907 getRoot() {
    return root;
  }

}
