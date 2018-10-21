package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent735
    implements PrybarComponent {

  private RootComponent735 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent735.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent735.class, "root"));
  }

  public RootComponent735 getRoot() {
    return root;
  }

}
