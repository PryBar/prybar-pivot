package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent775
    implements PrybarComponent {

  private RootComponent775 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent775.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent775.class, "root"));
  }

  public RootComponent775 getRoot() {
    return root;
  }

}
