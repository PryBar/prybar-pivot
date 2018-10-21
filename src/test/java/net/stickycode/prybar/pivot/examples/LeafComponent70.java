package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent70
    implements PrybarComponent {

  private RootComponent70 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent70.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent70.class, "root"));
  }

  public RootComponent70 getRoot() {
    return root;
  }

}
