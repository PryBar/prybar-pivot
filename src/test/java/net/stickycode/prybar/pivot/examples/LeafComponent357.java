package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent357
    implements PrybarComponent {

  private RootComponent357 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent357.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent357.class, "root"));
  }

  public RootComponent357 getRoot() {
    return root;
  }

}
