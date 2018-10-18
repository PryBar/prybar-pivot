package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent96
    implements PrybarComponent {

  private RootComponent96 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent96.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent96.class, "root"));
  }

  public RootComponent96 getRoot() {
    return root;
  }

}
