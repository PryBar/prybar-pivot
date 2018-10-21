package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent802
    implements PrybarComponent {

  private RootComponent802 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent802.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent802.class, "root"));
  }

  public RootComponent802 getRoot() {
    return root;
  }

}
