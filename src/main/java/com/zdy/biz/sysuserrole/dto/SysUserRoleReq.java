package com.zdy.biz.sysuserrole.dto;

import java.util.HashMap;
import java.util.Map;

import com.zdy.biz.sysuserrole.model.SysUserRole;
import com.zdy.util.Page;
import lombok.Data;

@Data
public class SysUserRoleReq extends Page {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    /**
     * id       db_column: id 
     */	
	private Long id;
    /**
     * sysUserId       db_column: sys_user_id 
     */	
	private Long sysUserId;
    /**
     * sysRoleId       db_column: sys_role_id 
     */	
	private Long sysRoleId;
	
	private Long custId;
	
	private Long[] ids;

	
	public SysUserRoleReq(){
		
	}
	
	public SysUserRoleReq(SysUserRoleReq sysUserRoleReq){
		if(null != sysUserRoleReq){
				this.setId(sysUserRoleReq.getId());
				this.setSysUserId(sysUserRoleReq.getSysUserId());
				this.setSysRoleId(sysUserRoleReq.getSysRoleId());
				this.setCustId(sysUserRoleReq.getCustId());
		}
	}
	
	public SysUserRoleReq(SysUserRole sysUserRole){
		if(null != sysUserRole){
				this.id = sysUserRole.getId();
				this.sysUserId = sysUserRole.getSysUserId();
				this.sysRoleId = sysUserRole.getSysRoleId();
				this.custId = sysUserRole.getCustId();
		}
	}
	
	public SysUserRole toSysUserRole(){
		SysUserRole  sysUserRole = new SysUserRole();
		sysUserRole.setId(this.id);
		sysUserRole.setSysUserId(this.sysUserId);
		sysUserRole.setSysRoleId(this.sysRoleId);
		sysUserRole.setCustId(this.custId);
		sysUserRole.setPage(this.getPage());
		sysUserRole.setBeginIndex(this.getBeginIndex());
		sysUserRole.setPageSize(this.getPageSize());
		return sysUserRole;
	}
	
	public Map<String,Object> toMap(){
		HashMap<String, Object> map = new HashMap<>();
		map.put("id",this.id);
		map.put("sysUserId",this.sysUserId);
		map.put("sysRoleId",this.sysRoleId);
		map.put("custId", this.custId);
		return map;
	}

 
}

