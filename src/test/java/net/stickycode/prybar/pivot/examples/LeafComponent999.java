package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent999
    implements PrybarComponent {

  private RootComponent999 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent999.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent999.class, "root"));
  }

  public RootComponent999 getRoot() {
    return root;
  }

}
