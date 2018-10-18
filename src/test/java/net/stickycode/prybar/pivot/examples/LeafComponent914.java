package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent914
    implements PrybarComponent {

  private RootComponent914 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent914.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent914.class, "root"));
  }

  public RootComponent914 getRoot() {
    return root;
  }

}
