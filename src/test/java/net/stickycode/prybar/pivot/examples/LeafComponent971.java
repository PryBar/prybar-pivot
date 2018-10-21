package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent971
    implements PrybarComponent {

  private RootComponent971 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent971.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent971.class, "root"));
  }

  public RootComponent971 getRoot() {
    return root;
  }

}
