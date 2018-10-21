package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent783
    implements PrybarComponent {

  private RootComponent783 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent783.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent783.class, "root"));
  }

  public RootComponent783 getRoot() {
    return root;
  }

}
