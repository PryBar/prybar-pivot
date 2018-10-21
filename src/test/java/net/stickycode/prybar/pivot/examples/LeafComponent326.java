package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent326
    implements PrybarComponent {

  private RootComponent326 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent326.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent326.class, "root"));
  }

  public RootComponent326 getRoot() {
    return root;
  }

}
