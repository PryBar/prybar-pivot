package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent262
    implements PrybarComponent {

  private RootComponent262 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent262.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent262.class, "root"));
  }

  public RootComponent262 getRoot() {
    return root;
  }

}
