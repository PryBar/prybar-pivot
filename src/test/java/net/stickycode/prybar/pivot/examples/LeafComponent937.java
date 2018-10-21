package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent937
    implements PrybarComponent {

  private RootComponent937 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent937.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent937.class, "root"));
  }

  public RootComponent937 getRoot() {
    return root;
  }

}
