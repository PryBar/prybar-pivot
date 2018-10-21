package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent79
    implements PrybarComponent {

  private RootComponent79 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent79.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent79.class, "root"));
  }

  public RootComponent79 getRoot() {
    return root;
  }

}
