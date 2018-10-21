package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent774
    implements PrybarComponent {

  private RootComponent774 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent774.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent774.class, "root"));
  }

  public RootComponent774 getRoot() {
    return root;
  }

}
