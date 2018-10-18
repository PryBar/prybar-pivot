package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent242
    implements PrybarComponent {

  private RootComponent242 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent242.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent242.class, "root"));
  }

  public RootComponent242 getRoot() {
    return root;
  }

}
