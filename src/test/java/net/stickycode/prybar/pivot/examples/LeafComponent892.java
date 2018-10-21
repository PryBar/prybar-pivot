package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent892
    implements PrybarComponent {

  private RootComponent892 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent892.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent892.class, "root"));
  }

  public RootComponent892 getRoot() {
    return root;
  }

}
