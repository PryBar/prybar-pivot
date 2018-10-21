package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent940
    implements PrybarComponent {

  private RootComponent940 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent940.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent940.class, "root"));
  }

  public RootComponent940 getRoot() {
    return root;
  }

}
