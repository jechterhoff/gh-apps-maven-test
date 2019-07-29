package org.example.GitHubAppsMavenTest;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class Main {

	public static void main(String[] args) {

		if (args.length > 0 && StringUtils.isNotBlank(args[0])) {
			System.out.println(args[0]);
		} else {
			System.out.println("Hello World! Test.");
		}
	}
}
