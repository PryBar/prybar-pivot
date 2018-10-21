package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent123
    implements PrybarComponent {

  private RootComponent123 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent123.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent123.class, "root"));
  }

  public RootComponent123 getRoot() {
    return root;
  }

}
