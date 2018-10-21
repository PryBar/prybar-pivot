package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent828
    implements PrybarComponent {

  private RootComponent828 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent828.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent828.class, "root"));
  }

  public RootComponent828 getRoot() {
    return root;
  }

}
