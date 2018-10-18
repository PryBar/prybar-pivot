package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent711
    implements PrybarComponent {

  private RootComponent711 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent711.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent711.class, "root"));
  }

  public RootComponent711 getRoot() {
    return root;
  }

}
