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
package com.emc.metalnx.core.domain.entity;

public class DataGridGroupPermission {

	private Integer dataGridId;
	private String groupName;
	private String permission;

	/**
	 * @return the dataGridId
	 */
	public Integer getDataGridId() {
		return dataGridId;
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @return the permission
	 */
	public String getPermission() {
		return permission;
	}

	/**
	 * @param dataGridId
	 *            the dataGridId to set
	 */
	public void setDataGridId(Integer dataGridId) {
		this.dataGridId = dataGridId;
	}

	/**
	 * @param groupName
	 *            the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @param permission
	 *            the permission to set
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataGridGroupPermission [");
		if (dataGridId != null) {
			builder.append("dataGridId=").append(dataGridId).append(", ");
		}
		if (groupName != null) {
			builder.append("groupName=").append(groupName).append(", ");
		}
		if (permission != null) {
			builder.append("permission=").append(permission);
		}
		builder.append("]");
		return builder.toString();
	}

}
