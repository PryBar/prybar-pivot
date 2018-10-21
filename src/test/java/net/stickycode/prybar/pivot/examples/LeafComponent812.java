package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent812
    implements PrybarComponent {

  private RootComponent812 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent812.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent812.class, "root"));
  }

  public RootComponent812 getRoot() {
    return root;
  }

}
