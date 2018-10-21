package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent809
    implements PrybarComponent {

  private RootComponent809 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent809.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent809.class, "root"));
  }

  public RootComponent809 getRoot() {
    return root;
  }

}
