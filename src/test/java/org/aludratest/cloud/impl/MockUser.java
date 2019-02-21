/*
 * Copyright (C) 2010-2015 AludraTest.org and the contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aludratest.cloud.impl;

import java.util.HashMap;
import java.util.Map;

import org.aludratest.cloud.user.User;

public class MockUser implements User {

	private String name;

	private Map<String, String> attributes = new HashMap<>();

	public MockUser(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String[] getDefinedUserAttributes() {
		return attributes.keySet().toArray(new String[0]);
	}

	@Override
	public String getUserAttribute(String attributeKey) {
		return attributes.get(attributeKey);
	}

	@Override
	public String getSource() {
		return "test";
	}

	@Override
	public boolean isAdmin() {
		return false;
	}

}