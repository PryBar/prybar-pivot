package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent842
    implements PrybarComponent {

  private RootComponent842 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent842.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent842.class, "root"));
  }

  public RootComponent842 getRoot() {
    return root;
  }

}
