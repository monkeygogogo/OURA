package com.monkesoft.oura.inter;

import com.github.pagehelper.Page;
import com.monkesoft.oura.entity.OrganizationInfo;

import java.util.List;

/**
 * 组织服务接口
 */
public interface IOrganizationService {

    public void insertUser(OrganizationInfo orgInfo);

    public void updateUser(OrganizationInfo orgInfo);

    public void deleteUser(String orgId);

    public OrganizationInfo getOrgById(String id);

    public List<OrganizationInfo> getSubOrgs(String parentId);

    public Page<OrganizationInfo> getSubOrgsByPage(String parentId,int pageNum,int pageSize);

    public List<OrganizationInfo> getOrgsOfUser(String userId);

    public Page<OrganizationInfo> getOrgs(int pageNum,int pageSize);

}