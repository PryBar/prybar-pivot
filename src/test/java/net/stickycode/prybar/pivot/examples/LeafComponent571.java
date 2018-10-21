package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent571
    implements PrybarComponent {

  private RootComponent571 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent571.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent571.class, "root"));
  }

  public RootComponent571 getRoot() {
    return root;
  }

}
