package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent835
    implements PrybarComponent {

  private RootComponent835 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent835.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent835.class, "root"));
  }

  public RootComponent835 getRoot() {
    return root;
  }

}
