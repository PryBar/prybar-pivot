package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent525
    implements PrybarComponent {

  private RootComponent525 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent525.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent525.class, "root"));
  }

  public RootComponent525 getRoot() {
    return root;
  }

}
