package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent684
    implements PrybarComponent {

  private RootComponent684 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent684.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent684.class, "root"));
  }

  public RootComponent684 getRoot() {
    return root;
  }

}
