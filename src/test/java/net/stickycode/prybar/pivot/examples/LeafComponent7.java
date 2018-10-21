package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent7
    implements PrybarComponent {

  private RootComponent7 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent7.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent7.class, "root"));
  }

  public RootComponent7 getRoot() {
    return root;
  }

}
