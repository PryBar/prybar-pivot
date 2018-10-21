package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent237
    implements PrybarComponent {

  private RootComponent237 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent237.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent237.class, "root"));
  }

  public RootComponent237 getRoot() {
    return root;
  }

}
