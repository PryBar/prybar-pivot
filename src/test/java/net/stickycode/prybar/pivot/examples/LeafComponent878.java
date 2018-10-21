package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent878
    implements PrybarComponent {

  private RootComponent878 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent878.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent878.class, "root"));
  }

  public RootComponent878 getRoot() {
    return root;
  }

}
