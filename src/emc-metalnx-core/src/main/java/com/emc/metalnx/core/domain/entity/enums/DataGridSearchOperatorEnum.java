/*
 * Copyright (c) 2015-2017, Dell EMC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.emc.metalnx.core.domain.entity.enums;

public enum DataGridSearchOperatorEnum {

	EQUAL("="), 
	NOT_EQUAL("!="), 
	LIKE("ILIKE"), 
	NOT_LIKE("NOT ILIKE"),
	BIGGER_THAN(">"),
	LESS_THAN("<");

	private String stringType;

	private DataGridSearchOperatorEnum(String type) {
		this.stringType = type;
	}

	public String toString() {
		return this.stringType;
	}

}