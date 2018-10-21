package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent157
    implements PrybarComponent {

  private RootComponent157 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent157.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent157.class, "root"));
  }

  public RootComponent157 getRoot() {
    return root;
  }

}
