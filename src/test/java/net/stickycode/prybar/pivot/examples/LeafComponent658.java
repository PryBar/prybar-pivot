package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent658
    implements PrybarComponent {

  private RootComponent658 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent658.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent658.class, "root"));
  }

  public RootComponent658 getRoot() {
    return root;
  }

}
