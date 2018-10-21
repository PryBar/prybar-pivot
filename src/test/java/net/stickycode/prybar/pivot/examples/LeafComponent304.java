package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent304
    implements PrybarComponent {

  private RootComponent304 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent304.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent304.class, "root"));
  }

  public RootComponent304 getRoot() {
    return root;
  }

}
