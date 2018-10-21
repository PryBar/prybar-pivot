package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent244
    implements PrybarComponent {

  private RootComponent244 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent244.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent244.class, "root"));
  }

  public RootComponent244 getRoot() {
    return root;
  }

}
