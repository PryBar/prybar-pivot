package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent609
    implements PrybarComponent {

  private RootComponent609 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent609.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent609.class, "root"));
  }

  public RootComponent609 getRoot() {
    return root;
  }

}
