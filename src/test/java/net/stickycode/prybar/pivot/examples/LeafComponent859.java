package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent859
    implements PrybarComponent {

  private RootComponent859 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent859.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent859.class, "root"));
  }

  public RootComponent859 getRoot() {
    return root;
  }

}
