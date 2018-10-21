package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent852
    implements PrybarComponent {

  private RootComponent852 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent852.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent852.class, "root"));
  }

  public RootComponent852 getRoot() {
    return root;
  }

}
