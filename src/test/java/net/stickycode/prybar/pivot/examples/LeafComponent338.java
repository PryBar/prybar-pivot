package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent338
    implements PrybarComponent {

  private RootComponent338 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent338.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent338.class, "root"));
  }

  public RootComponent338 getRoot() {
    return root;
  }

}
