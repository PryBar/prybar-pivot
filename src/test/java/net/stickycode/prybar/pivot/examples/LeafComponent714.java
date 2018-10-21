package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent714
    implements PrybarComponent {

  private RootComponent714 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent714.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent714.class, "root"));
  }

  public RootComponent714 getRoot() {
    return root;
  }

}
