package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent456
    implements PrybarComponent {

  private RootComponent456 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent456.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent456.class, "root"));
  }

  public RootComponent456 getRoot() {
    return root;
  }

}
