package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent539
    implements PrybarComponent {

  private RootComponent539 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent539.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent539.class, "root"));
  }

  public RootComponent539 getRoot() {
    return root;
  }

}
