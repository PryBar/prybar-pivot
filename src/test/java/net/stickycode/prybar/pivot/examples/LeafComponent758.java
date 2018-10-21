package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent758
    implements PrybarComponent {

  private RootComponent758 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent758.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent758.class, "root"));
  }

  public RootComponent758 getRoot() {
    return root;
  }

}
