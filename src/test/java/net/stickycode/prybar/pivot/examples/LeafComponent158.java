package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent158
    implements PrybarComponent {

  private RootComponent158 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent158.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent158.class, "root"));
  }

  public RootComponent158 getRoot() {
    return root;
  }

}
