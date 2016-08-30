package io.vertx.codegen.testmodel;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class ReifiedGenericRefedInterfaceImpl<T> extends GenericRefedInterfaceImpl<RefedInterface1> implements ReifiedGenericRefedInterface {

  @Override
  public void setValue(RefedInterface1 value) {
    super.setValue(value);
  }

  @Override
  public RefedInterface1 getValue() {
    return super.getValue();
  }
}
