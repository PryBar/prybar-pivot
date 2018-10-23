package net.stickycode.prybar.pivot.examples;

import javax.inject.Inject;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent1
    implements PrybarComponent {

  @Inject
  private RootComponent1 root;

  @Inject
  private RootComponent2 root2;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent1.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent1.class, "root"));

    this.root2 = r.find(RootComponent2.class);
    if (root2 == null)
      r.failure(new PrybarComponentLookup(this, RootComponent1.class, "root2"));
  }

  public RootComponent1 getRoot() {
    return root;
  }

}
