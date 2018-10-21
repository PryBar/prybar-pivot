package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent594
    implements PrybarComponent {

  private RootComponent594 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent594.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent594.class, "root"));
  }

  public RootComponent594 getRoot() {
    return root;
  }

}
