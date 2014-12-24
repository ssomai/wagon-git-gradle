/*******************************************************************************
 * Copyright (c) 2012 Pivotal Software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Pivotal Software, Inc. - initial API and implementation
 *******************************************************************************/
package com.ssomai.gradle.wagongit;

import org.gradle.api.invocation.Gradle;

import ar.com.synergian.wagongit.GitWagon;

public class GitWagonGradle {
	
	public static void niceMethod(String name) {
		GitWagon gitwagon;
		System.out.println(name + " is really nice");
	}

}
