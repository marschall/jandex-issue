package com.github.marschall.module2;

import com.github.marschall.module1.ABaseClass;


@Deprecated // Any annotation will do
public class AClass extends ABaseClass {
  
  private final com.github.marschall.module1.AClass other;
  
  public AClass() {
    this.other = new com.github.marschall.module1.AClass();
  }
  

}
