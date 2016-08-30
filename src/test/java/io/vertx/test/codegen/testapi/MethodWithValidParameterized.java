package io.vertx.test.codegen.testapi;

import io.vertx.codegen.annotations.VertxGen;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface MethodWithValidParameterized {

  void meth1(GenericInterface<Void> arg);
  void meth2(GenericInterface<String> arg);
  void meth3(GenericInterface<VertxGenClass1> arg);

}
