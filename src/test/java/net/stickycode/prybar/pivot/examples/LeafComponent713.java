package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent713
    implements PrybarComponent {

  private RootComponent713 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent713.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent713.class, "root"));
  }

  public RootComponent713 getRoot() {
    return root;
  }

}
