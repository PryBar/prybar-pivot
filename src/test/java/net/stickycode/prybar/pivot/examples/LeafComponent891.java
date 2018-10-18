package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent891
    implements PrybarComponent {

  private RootComponent891 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent891.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent891.class, "root"));
  }

  public RootComponent891 getRoot() {
    return root;
  }

}
