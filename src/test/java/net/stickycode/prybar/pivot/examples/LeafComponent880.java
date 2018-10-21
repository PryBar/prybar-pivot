package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent880
    implements PrybarComponent {

  private RootComponent880 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent880.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent880.class, "root"));
  }

  public RootComponent880 getRoot() {
    return root;
  }

}
