package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent174
    implements PrybarComponent {

  private RootComponent174 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent174.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent174.class, "root"));
  }

  public RootComponent174 getRoot() {
    return root;
  }

}
