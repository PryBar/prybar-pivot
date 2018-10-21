package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent639
    implements PrybarComponent {

  private RootComponent639 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent639.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent639.class, "root"));
  }

  public RootComponent639 getRoot() {
    return root;
  }

}
