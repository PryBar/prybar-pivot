package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent638
    implements PrybarComponent {

  private RootComponent638 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent638.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent638.class, "root"));
  }

  public RootComponent638 getRoot() {
    return root;
  }

}
