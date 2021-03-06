package com.zdy.web.role.vo;

import java.util.HashMap;
import java.util.Map;

import com.zdy.biz.sysrole.model.SysRole;
import com.zdy.util.Page;
import lombok.Data;

@Data
public class RoleVO extends Page implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id db_column: id
	 */
	private Long id;
	/**
	 * name db_column: name
	 */
	private String name;
	/**
	 * 是否可用,1：可用，0不可用 db_column: available
	 */
	private String available;
	
	private Long custId;

	public RoleVO() {
	}

	public RoleVO(Long id) {
		this.id = id;
	}

	public RoleVO(RoleVO sysRole) {
		if (null != sysRole) {
			this.setId(sysRole.getId());
			this.setName(sysRole.getName());
			this.setAvailable(sysRole.getAvailable());
			this.setCustId(sysRole.getCustId());
		}
	}

	public Map<String, Object> toMap() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("id", this.id);
		map.put("name", this.name);
		map.put("available", this.available);
		map.put("custId", this.custId);
		return map;
	}


	public SysRole toSysRole() {
		SysRole sysRole = new SysRole();
		sysRole.setId(this.id);
		sysRole.setName(this.name);
		sysRole.setAvailable(this.available);
		sysRole.setCustId(this.custId);
		return sysRole;
	}

}
