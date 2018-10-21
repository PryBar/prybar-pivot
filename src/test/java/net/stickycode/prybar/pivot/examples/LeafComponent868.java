package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent868
    implements PrybarComponent {

  private RootComponent868 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent868.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent868.class, "root"));
  }

  public RootComponent868 getRoot() {
    return root;
  }

}
