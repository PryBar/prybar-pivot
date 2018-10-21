package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent753
    implements PrybarComponent {

  private RootComponent753 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent753.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent753.class, "root"));
  }

  public RootComponent753 getRoot() {
    return root;
  }

}
