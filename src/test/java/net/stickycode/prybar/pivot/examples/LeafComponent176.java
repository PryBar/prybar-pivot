package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent176
    implements PrybarComponent {

  private RootComponent176 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent176.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent176.class, "root"));
  }

  public RootComponent176 getRoot() {
    return root;
  }

}
