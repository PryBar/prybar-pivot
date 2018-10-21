package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent645
    implements PrybarComponent {

  private RootComponent645 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent645.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent645.class, "root"));
  }

  public RootComponent645 getRoot() {
    return root;
  }

}
