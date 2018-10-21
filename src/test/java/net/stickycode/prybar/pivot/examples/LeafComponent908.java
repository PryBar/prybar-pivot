package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent908
    implements PrybarComponent {

  private RootComponent908 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent908.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent908.class, "root"));
  }

  public RootComponent908 getRoot() {
    return root;
  }

}
