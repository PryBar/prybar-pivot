package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent226
    implements PrybarComponent {

  private RootComponent226 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent226.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent226.class, "root"));
  }

  public RootComponent226 getRoot() {
    return root;
  }

}
