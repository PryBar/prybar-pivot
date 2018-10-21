package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent558
    implements PrybarComponent {

  private RootComponent558 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent558.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent558.class, "root"));
  }

  public RootComponent558 getRoot() {
    return root;
  }

}
