package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent175
    implements PrybarComponent {

  private RootComponent175 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent175.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent175.class, "root"));
  }

  public RootComponent175 getRoot() {
    return root;
  }

}
