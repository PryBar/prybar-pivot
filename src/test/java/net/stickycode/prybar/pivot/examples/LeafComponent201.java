package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent201
    implements PrybarComponent {

  private RootComponent201 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent201.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent201.class, "root"));
  }

  public RootComponent201 getRoot() {
    return root;
  }

}
