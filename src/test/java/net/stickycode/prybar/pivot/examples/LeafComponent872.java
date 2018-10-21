package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent872
    implements PrybarComponent {

  private RootComponent872 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent872.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent872.class, "root"));
  }

  public RootComponent872 getRoot() {
    return root;
  }

}
