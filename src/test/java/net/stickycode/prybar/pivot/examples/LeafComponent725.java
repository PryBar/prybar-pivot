package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent725
    implements PrybarComponent {

  private RootComponent725 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent725.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent725.class, "root"));
  }

  public RootComponent725 getRoot() {
    return root;
  }

}
