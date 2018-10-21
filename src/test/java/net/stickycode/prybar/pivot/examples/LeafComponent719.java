package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent719
    implements PrybarComponent {

  private RootComponent719 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent719.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent719.class, "root"));
  }

  public RootComponent719 getRoot() {
    return root;
  }

}
