package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent229
    implements PrybarComponent {

  private RootComponent229 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent229.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent229.class, "root"));
  }

  public RootComponent229 getRoot() {
    return root;
  }

}
