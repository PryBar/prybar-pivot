package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent726
    implements PrybarComponent {

  private RootComponent726 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent726.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent726.class, "root"));
  }

  public RootComponent726 getRoot() {
    return root;
  }

}
