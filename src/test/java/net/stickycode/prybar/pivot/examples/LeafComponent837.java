package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent837
    implements PrybarComponent {

  private RootComponent837 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent837.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent837.class, "root"));
  }

  public RootComponent837 getRoot() {
    return root;
  }

}
