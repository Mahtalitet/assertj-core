/*
 * Created on Nov 24, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.internal;

/**
 * @author Alex Ruiz
 */
class EnumerableValidations {

  // TODO remove duplication
  static void validateArrayOfValuesToLookForIsNotEmptyOrNull(Object[] values) {
    if (values == null) throw new NullPointerException("The array of values to look for should not be null");
    if (values.length == 0) throw new IllegalArgumentException("The array of values to look for should not be empty");
  }

  private EnumerableValidations() {}
}