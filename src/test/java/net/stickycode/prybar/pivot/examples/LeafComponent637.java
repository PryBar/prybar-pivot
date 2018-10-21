package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent637
    implements PrybarComponent {

  private RootComponent637 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent637.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent637.class, "root"));
  }

  public RootComponent637 getRoot() {
    return root;
  }

}
