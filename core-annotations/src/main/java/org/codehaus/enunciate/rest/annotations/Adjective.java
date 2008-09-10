/*
 * Copyright 2006-2008 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.enunciate.rest.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Indicates that the annotated parameter is an adjective that describes the noun
 * of its associated method.
 *
 * @author Ryan Heaton
 */
@Retention ( RetentionPolicy.RUNTIME )
@Target ( ElementType.PARAMETER )
public @interface Adjective {

  /**
   * The name of the adjective.
   *
   * @return The name of the adjective.
   */
  String name() default "##default";

  /**
   * Whether the noun value is optional.
   *
   * @return Whether the noun value is optional.
   */
  boolean optional() default true;

  /**
   * Whether the adjective is complex.
   *
   * @return Whether the adjective is complex.
   */
  boolean complex() default false;

  /**
   * The converter to use.
   *
   * @return The converter to use.
   */
  Class converter() default DEFAULT.class;

  /**
   * Default converter class.
   */
  public static final class DEFAULT  {
    private DEFAULT() { }
  }
}