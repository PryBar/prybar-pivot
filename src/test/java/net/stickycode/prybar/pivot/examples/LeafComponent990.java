package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent990
    implements PrybarComponent {

  private RootComponent990 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent990.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent990.class, "root"));
  }

  public RootComponent990 getRoot() {
    return root;
  }

}
