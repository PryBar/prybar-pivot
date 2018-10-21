package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent16
    implements PrybarComponent {

  private RootComponent16 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent16.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent16.class, "root"));
  }

  public RootComponent16 getRoot() {
    return root;
  }

}
