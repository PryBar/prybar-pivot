package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent566
    implements PrybarComponent {

  private RootComponent566 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent566.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent566.class, "root"));
  }

  public RootComponent566 getRoot() {
    return root;
  }

}
