package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent291
    implements PrybarComponent {

  private RootComponent291 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent291.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent291.class, "root"));
  }

  public RootComponent291 getRoot() {
    return root;
  }

}
