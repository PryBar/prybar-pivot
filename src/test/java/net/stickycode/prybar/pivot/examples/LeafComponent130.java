package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent130
    implements PrybarComponent {

  private RootComponent130 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent130.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent130.class, "root"));
  }

  public RootComponent130 getRoot() {
    return root;
  }

}
