package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent786
    implements PrybarComponent {

  private RootComponent786 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent786.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent786.class, "root"));
  }

  public RootComponent786 getRoot() {
    return root;
  }

}
