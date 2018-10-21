package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent606
    implements PrybarComponent {

  private RootComponent606 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent606.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent606.class, "root"));
  }

  public RootComponent606 getRoot() {
    return root;
  }

}
