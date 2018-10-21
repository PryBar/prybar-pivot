package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent938
    implements PrybarComponent {

  private RootComponent938 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent938.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent938.class, "root"));
  }

  public RootComponent938 getRoot() {
    return root;
  }

}
