package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent839
    implements PrybarComponent {

  private RootComponent839 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent839.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent839.class, "root"));
  }

  public RootComponent839 getRoot() {
    return root;
  }

}
