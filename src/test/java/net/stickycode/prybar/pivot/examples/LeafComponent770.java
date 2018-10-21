package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent770
    implements PrybarComponent {

  private RootComponent770 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent770.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent770.class, "root"));
  }

  public RootComponent770 getRoot() {
    return root;
  }

}
