/*
 * Created on Aug 8, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.internal;

import static org.fest.util.Strings.isEmpty;

import org.fest.assertions.description.Description;

/**
 * Formats the value of a <code>{@link Description}</code> to be included in a failure error.
 *
 * @author Alex Ruiz
 */
class DescriptionFormatter {

  static String format(Description d) {
    String s = (d != null) ? d.value() : null;
    if (isEmpty(s)) return "";
    return String.format("[%s] ", s);
  }

  private DescriptionFormatter() {}
}