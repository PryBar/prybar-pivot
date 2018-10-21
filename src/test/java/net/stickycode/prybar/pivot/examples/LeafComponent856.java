package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent856
    implements PrybarComponent {

  private RootComponent856 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent856.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent856.class, "root"));
  }

  public RootComponent856 getRoot() {
    return root;
  }

}
