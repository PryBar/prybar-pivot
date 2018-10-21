package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent161
    implements PrybarComponent {

  private RootComponent161 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent161.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent161.class, "root"));
  }

  public RootComponent161 getRoot() {
    return root;
  }

}
