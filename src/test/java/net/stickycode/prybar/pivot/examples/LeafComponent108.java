package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent108
    implements PrybarComponent {

  private RootComponent108 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent108.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent108.class, "root"));
  }

  public RootComponent108 getRoot() {
    return root;
  }

}
