package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent698
    implements PrybarComponent {

  private RootComponent698 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent698.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent698.class, "root"));
  }

  public RootComponent698 getRoot() {
    return root;
  }

}
