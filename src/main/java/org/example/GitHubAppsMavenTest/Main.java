/**
 * GitHub Apps Maven Test
 *
 * <p>Copyright 2019 Johannes Echterhoff
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example.GitHubAppsMavenTest;

import org.apache.commons.lang3.StringUtils;

/** Hello world! */
public class Main {

  public static void main(String[] args) {

    if (args.length > 0 && StringUtils.isNotBlank(args[0])) {

      System.out.println(args[0]);
    } else {
      System.out.println("Hello World! Test.");
    }
  }
}
