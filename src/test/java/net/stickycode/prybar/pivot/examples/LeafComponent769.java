package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent769
    implements PrybarComponent {

  private RootComponent769 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent769.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent769.class, "root"));
  }

  public RootComponent769 getRoot() {
    return root;
  }

}
