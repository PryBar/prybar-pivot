package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent821
    implements PrybarComponent {

  private RootComponent821 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent821.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent821.class, "root"));
  }

  public RootComponent821 getRoot() {
    return root;
  }

}
