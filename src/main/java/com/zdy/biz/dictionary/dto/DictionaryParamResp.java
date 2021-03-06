package com.zdy.biz.dictionary.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.zdy.biz.dictionary.model.DictionaryParam;
import lombok.Data;

@Data
public class DictionaryParamResp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    /**
     * id       db_column: id 
     */	
	private Long id;
    /**
     * dictionaryId       db_column: dictionary_id 
     */	
	private Long dictionaryId;
    /**
     * paramKey       db_column: param_key 
     */	
	private String paramKey;
    /**
     * paramDesc       db_column: param_desc 
     */	
	private String paramDesc;
    /**
     * remark       db_column: remark 
     */	
	private String remark;
    /**
     * createTime       db_column: create_time 
     */	
	private Date createTime;
    /**
     * createUser       db_column: create_user 
     */	
	private Long createUser;
    /**
     * operTime       db_column: oper_time 
     */	
	private Date operTime;

	public DictionaryParamResp(){
		
	}
	
	public DictionaryParamResp(DictionaryParamResp dictionaryParamResp){
		if(null != dictionaryParamResp){
				this.setId(dictionaryParamResp.getId());
				this.setDictionaryId(dictionaryParamResp.getDictionaryId());
				this.setParamKey(dictionaryParamResp.getParamKey());
				this.setParamDesc(dictionaryParamResp.getParamDesc());
				this.setRemark(dictionaryParamResp.getRemark());
				this.setCreateTime(dictionaryParamResp.getCreateTime());
				this.setCreateUser(dictionaryParamResp.getCreateUser());
				this.setOperTime(dictionaryParamResp.getOperTime());
		}
	}
	
	public DictionaryParamResp(DictionaryParam dictionaryParam){
		if(null != dictionaryParam){
				this.id = dictionaryParam.getId();
				this.dictionaryId = dictionaryParam.getDictionaryId();
				this.paramKey = dictionaryParam.getParamKey();
				this.paramDesc = dictionaryParam.getParamDesc();
				this.remark = dictionaryParam.getRemark();
				this.createTime = dictionaryParam.getCreateTime();
				this.createUser = dictionaryParam.getCreateUser();
				this.operTime = dictionaryParam.getOperTime();
		}
	}
	
	public DictionaryParam toDictionaryParam(){
		DictionaryParam  dictionaryParam = new DictionaryParam();
		dictionaryParam.setId(this.id);
		dictionaryParam.setDictionaryId(this.dictionaryId);
		dictionaryParam.setParamKey(this.paramKey);
		dictionaryParam.setParamDesc(this.paramDesc);
		dictionaryParam.setRemark(this.remark);
		dictionaryParam.setCreateTime(this.createTime);
		dictionaryParam.setCreateUser(this.createUser);
		dictionaryParam.setOperTime(this.operTime);
		return dictionaryParam;
	}
	public Map<String,Object> toMap(){
		HashMap<String, Object> map = new HashMap<>();
		map.put("id",this.id);
		map.put("dictionaryId",this.dictionaryId);
		map.put("paramKey",this.paramKey);
		map.put("paramDesc",this.paramDesc);
		map.put("remark",this.remark);
		map.put("createTime",this.createTime);
		map.put("createUser",this.createUser);
		map.put("operTime",this.operTime);
		return map;
	}
	

}

