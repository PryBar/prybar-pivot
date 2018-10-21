package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent917
    implements PrybarComponent {

  private RootComponent917 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent917.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent917.class, "root"));
  }

  public RootComponent917 getRoot() {
    return root;
  }

}
