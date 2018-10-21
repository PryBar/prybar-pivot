package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent703
    implements PrybarComponent {

  private RootComponent703 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent703.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent703.class, "root"));
  }

  public RootComponent703 getRoot() {
    return root;
  }

}
