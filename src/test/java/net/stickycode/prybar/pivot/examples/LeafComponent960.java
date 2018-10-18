package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent960
    implements PrybarComponent {

  private RootComponent960 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent960.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent960.class, "root"));
  }

  public RootComponent960 getRoot() {
    return root;
  }

}
