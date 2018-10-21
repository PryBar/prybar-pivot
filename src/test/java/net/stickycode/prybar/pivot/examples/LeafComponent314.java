package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent314
    implements PrybarComponent {

  private RootComponent314 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent314.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent314.class, "root"));
  }

  public RootComponent314 getRoot() {
    return root;
  }

}
