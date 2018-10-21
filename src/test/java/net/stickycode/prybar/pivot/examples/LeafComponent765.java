package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent765
    implements PrybarComponent {

  private RootComponent765 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent765.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent765.class, "root"));
  }

  public RootComponent765 getRoot() {
    return root;
  }

}
