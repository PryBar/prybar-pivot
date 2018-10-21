package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent742
    implements PrybarComponent {

  private RootComponent742 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent742.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent742.class, "root"));
  }

  public RootComponent742 getRoot() {
    return root;
  }

}
