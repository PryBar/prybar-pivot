package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent946
    implements PrybarComponent {

  private RootComponent946 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent946.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent946.class, "root"));
  }

  public RootComponent946 getRoot() {
    return root;
  }

}
