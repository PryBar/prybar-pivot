package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent641
    implements PrybarComponent {

  private RootComponent641 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent641.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent641.class, "root"));
  }

  public RootComponent641 getRoot() {
    return root;
  }

}
