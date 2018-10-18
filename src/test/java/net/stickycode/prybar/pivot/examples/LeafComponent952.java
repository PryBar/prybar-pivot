package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent952
    implements PrybarComponent {

  private RootComponent952 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent952.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent952.class, "root"));
  }

  public RootComponent952 getRoot() {
    return root;
  }

}
