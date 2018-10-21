package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent766
    implements PrybarComponent {

  private RootComponent766 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent766.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent766.class, "root"));
  }

  public RootComponent766 getRoot() {
    return root;
  }

}
