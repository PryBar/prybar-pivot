package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent429
    implements PrybarComponent {

  private RootComponent429 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent429.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent429.class, "root"));
  }

  public RootComponent429 getRoot() {
    return root;
  }

}
