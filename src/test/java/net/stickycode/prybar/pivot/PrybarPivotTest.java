package net.stickycode.prybar.pivot;

import static org.assertj.core.api.StrictAssertions.assertThat;

import org.junit.Test;

public class PrybarPivotTest {

  @Test
  public void pivot() {
    Prybar prybar = new Prybar();
    SingletonScope scope = new SingletonScope();
    scope.add(LeafComponent.class);
    scope.add(RootComponent.class);
    prybar.addScope(scope);
    PrybarPivot pivot = prybar.pivot();

    assertThat(pivot.find(LeafComponent.class)).isNotNull();
    assertThat(pivot.find(LeafComponent.class).getRoot()).isNotNull();
  }

}
