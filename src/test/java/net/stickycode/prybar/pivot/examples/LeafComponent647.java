package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent647
    implements PrybarComponent {

  private RootComponent647 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent647.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent647.class, "root"));
  }

  public RootComponent647 getRoot() {
    return root;
  }

}
