package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent205
    implements PrybarComponent {

  private RootComponent205 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent205.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent205.class, "root"));
  }

  public RootComponent205 getRoot() {
    return root;
  }

}
