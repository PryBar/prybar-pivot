package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent902
    implements PrybarComponent {

  private RootComponent902 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent902.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent902.class, "root"));
  }

  public RootComponent902 getRoot() {
    return root;
  }

}
