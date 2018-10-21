package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent255
    implements PrybarComponent {

  private RootComponent255 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent255.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent255.class, "root"));
  }

  public RootComponent255 getRoot() {
    return root;
  }

}
