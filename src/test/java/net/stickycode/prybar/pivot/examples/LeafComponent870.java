package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent870
    implements PrybarComponent {

  private RootComponent870 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent870.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent870.class, "root"));
  }

  public RootComponent870 getRoot() {
    return root;
  }

}
