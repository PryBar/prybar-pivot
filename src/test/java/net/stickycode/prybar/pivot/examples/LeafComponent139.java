package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent139
    implements PrybarComponent {

  private RootComponent139 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent139.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent139.class, "root"));
  }

  public RootComponent139 getRoot() {
    return root;
  }

}
