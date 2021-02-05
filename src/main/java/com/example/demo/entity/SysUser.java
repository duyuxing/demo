package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * sys_user
 * @author 
 */
public class SysUser implements Serializable {
    /**
     * 账号ID
     */
    private Long userId;

    /**
     * 人员编码
     */
    private String personCode;

    /**
     * 账号
     */
    private String accountCode;

    /**
     * 姓名
     */
    private String nickName;

    /**
     * 账号类型：（数据字典维护）
     */
    private String userType;

    /**
     * 账号直属组织
     */
    private String deptCode;

    /**
     * 证件号
     */
    private String psptId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 性别（0男 1女 2未知）
     */
    private String sex;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 密码
     */
    private String password;

    /**
     * 账号状态（0正常 1停用）
     */
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    /**
     * 所属省份编码
     */
    private String provinceCode;

    /**
     * 所属省份名称
     */
    private String provinceName;

    /**
     * 所属城市编码
     */
    private String cityCode;

    /**
     * 所属城市名称
     */
    private String cityName;

    /**
     * 所属区域编码
     */
    private String areaCode;

    /**
     * 所属区域名称
     */
    private String areaName;

    /**
     * 生效时间
     */
    private Date beginDate;

    /**
     * 失效时间
     */
    private Date endDate;

    /**
     * 最后登录IP
     */
    private String loginIp;

    /**
     * 最后登录时间
     */
    private Date loginDate;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 系统唯一标识
     */
    private String appid;

    /**
     * 历史密码，保存前9次修改的密码
     */
    private String originalPwd;

    /**
     * 明文密码
     */
    private String plaintextPwd;

    /**
     * 密码更新时间
     */
    private Date pwdUpdateDate;

    /**
     * 是否提醒更改密码 1:提醒 0:不提醒 
     */
    private Integer isRemindPwd;

    /**
     * 主账号
     */
    private String manageMainAccount;

    /**
     * 责任人部门编码
     */
    private String managePersonOrgCode;

    /**
     * 责任人账号
     */
    private String manageAccountCode;

    /**
     * 联系人(责任人，项目经理)用户中心人员编码
     */
    private String managePersonCode;

    /**
     * 联系人(责任人，项目经理)姓名
     */
    private String managePersonName;

    /**
     * 鉴权appID，逗号分隔 *代表所有系统鉴权
     */
    private String accountAuthority;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getPsptId() {
        return psptId;
    }

    public void setPsptId(String psptId) {
        this.psptId = psptId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getOriginalPwd() {
        return originalPwd;
    }

    public void setOriginalPwd(String originalPwd) {
        this.originalPwd = originalPwd;
    }

    public String getPlaintextPwd() {
        return plaintextPwd;
    }

    public void setPlaintextPwd(String plaintextPwd) {
        this.plaintextPwd = plaintextPwd;
    }

    public Date getPwdUpdateDate() {
        return pwdUpdateDate;
    }

    public void setPwdUpdateDate(Date pwdUpdateDate) {
        this.pwdUpdateDate = pwdUpdateDate;
    }

    public Integer getIsRemindPwd() {
        return isRemindPwd;
    }

    public void setIsRemindPwd(Integer isRemindPwd) {
        this.isRemindPwd = isRemindPwd;
    }

    public String getManageMainAccount() {
        return manageMainAccount;
    }

    public void setManageMainAccount(String manageMainAccount) {
        this.manageMainAccount = manageMainAccount;
    }

    public String getManagePersonOrgCode() {
        return managePersonOrgCode;
    }

    public void setManagePersonOrgCode(String managePersonOrgCode) {
        this.managePersonOrgCode = managePersonOrgCode;
    }

    public String getManageAccountCode() {
        return manageAccountCode;
    }

    public void setManageAccountCode(String manageAccountCode) {
        this.manageAccountCode = manageAccountCode;
    }

    public String getManagePersonCode() {
        return managePersonCode;
    }

    public void setManagePersonCode(String managePersonCode) {
        this.managePersonCode = managePersonCode;
    }

    public String getManagePersonName() {
        return managePersonName;
    }

    public void setManagePersonName(String managePersonName) {
        this.managePersonName = managePersonName;
    }

    public String getAccountAuthority() {
        return accountAuthority;
    }

    public void setAccountAuthority(String accountAuthority) {
        this.accountAuthority = accountAuthority;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysUser other = (SysUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPersonCode() == null ? other.getPersonCode() == null : this.getPersonCode().equals(other.getPersonCode()))
            && (this.getAccountCode() == null ? other.getAccountCode() == null : this.getAccountCode().equals(other.getAccountCode()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getDeptCode() == null ? other.getDeptCode() == null : this.getDeptCode().equals(other.getDeptCode()))
            && (this.getPsptId() == null ? other.getPsptId() == null : this.getPsptId().equals(other.getPsptId()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getProvinceCode() == null ? other.getProvinceCode() == null : this.getProvinceCode().equals(other.getProvinceCode()))
            && (this.getProvinceName() == null ? other.getProvinceName() == null : this.getProvinceName().equals(other.getProvinceName()))
            && (this.getCityCode() == null ? other.getCityCode() == null : this.getCityCode().equals(other.getCityCode()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
            && (this.getAreaName() == null ? other.getAreaName() == null : this.getAreaName().equals(other.getAreaName()))
            && (this.getBeginDate() == null ? other.getBeginDate() == null : this.getBeginDate().equals(other.getBeginDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getLoginIp() == null ? other.getLoginIp() == null : this.getLoginIp().equals(other.getLoginIp()))
            && (this.getLoginDate() == null ? other.getLoginDate() == null : this.getLoginDate().equals(other.getLoginDate()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid()))
            && (this.getOriginalPwd() == null ? other.getOriginalPwd() == null : this.getOriginalPwd().equals(other.getOriginalPwd()))
            && (this.getPlaintextPwd() == null ? other.getPlaintextPwd() == null : this.getPlaintextPwd().equals(other.getPlaintextPwd()))
            && (this.getPwdUpdateDate() == null ? other.getPwdUpdateDate() == null : this.getPwdUpdateDate().equals(other.getPwdUpdateDate()))
            && (this.getIsRemindPwd() == null ? other.getIsRemindPwd() == null : this.getIsRemindPwd().equals(other.getIsRemindPwd()))
            && (this.getManageMainAccount() == null ? other.getManageMainAccount() == null : this.getManageMainAccount().equals(other.getManageMainAccount()))
            && (this.getManagePersonOrgCode() == null ? other.getManagePersonOrgCode() == null : this.getManagePersonOrgCode().equals(other.getManagePersonOrgCode()))
            && (this.getManageAccountCode() == null ? other.getManageAccountCode() == null : this.getManageAccountCode().equals(other.getManageAccountCode()))
            && (this.getManagePersonCode() == null ? other.getManagePersonCode() == null : this.getManagePersonCode().equals(other.getManagePersonCode()))
            && (this.getManagePersonName() == null ? other.getManagePersonName() == null : this.getManagePersonName().equals(other.getManagePersonName()))
            && (this.getAccountAuthority() == null ? other.getAccountAuthority() == null : this.getAccountAuthority().equals(other.getAccountAuthority()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPersonCode() == null) ? 0 : getPersonCode().hashCode());
        result = prime * result + ((getAccountCode() == null) ? 0 : getAccountCode().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getDeptCode() == null) ? 0 : getDeptCode().hashCode());
        result = prime * result + ((getPsptId() == null) ? 0 : getPsptId().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getProvinceCode() == null) ? 0 : getProvinceCode().hashCode());
        result = prime * result + ((getProvinceName() == null) ? 0 : getProvinceName().hashCode());
        result = prime * result + ((getCityCode() == null) ? 0 : getCityCode().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getAreaName() == null) ? 0 : getAreaName().hashCode());
        result = prime * result + ((getBeginDate() == null) ? 0 : getBeginDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getLoginIp() == null) ? 0 : getLoginIp().hashCode());
        result = prime * result + ((getLoginDate() == null) ? 0 : getLoginDate().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
        result = prime * result + ((getOriginalPwd() == null) ? 0 : getOriginalPwd().hashCode());
        result = prime * result + ((getPlaintextPwd() == null) ? 0 : getPlaintextPwd().hashCode());
        result = prime * result + ((getPwdUpdateDate() == null) ? 0 : getPwdUpdateDate().hashCode());
        result = prime * result + ((getIsRemindPwd() == null) ? 0 : getIsRemindPwd().hashCode());
        result = prime * result + ((getManageMainAccount() == null) ? 0 : getManageMainAccount().hashCode());
        result = prime * result + ((getManagePersonOrgCode() == null) ? 0 : getManagePersonOrgCode().hashCode());
        result = prime * result + ((getManageAccountCode() == null) ? 0 : getManageAccountCode().hashCode());
        result = prime * result + ((getManagePersonCode() == null) ? 0 : getManagePersonCode().hashCode());
        result = prime * result + ((getManagePersonName() == null) ? 0 : getManagePersonName().hashCode());
        result = prime * result + ((getAccountAuthority() == null) ? 0 : getAccountAuthority().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", personCode=").append(personCode);
        sb.append(", accountCode=").append(accountCode);
        sb.append(", nickName=").append(nickName);
        sb.append(", userType=").append(userType);
        sb.append(", deptCode=").append(deptCode);
        sb.append(", psptId=").append(psptId);
        sb.append(", email=").append(email);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", sex=").append(sex);
        sb.append(", avatar=").append(avatar);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", provinceCode=").append(provinceCode);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", cityCode=").append(cityCode);
        sb.append(", cityName=").append(cityName);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", areaName=").append(areaName);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", loginDate=").append(loginDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", appid=").append(appid);
        sb.append(", originalPwd=").append(originalPwd);
        sb.append(", plaintextPwd=").append(plaintextPwd);
        sb.append(", pwdUpdateDate=").append(pwdUpdateDate);
        sb.append(", isRemindPwd=").append(isRemindPwd);
        sb.append(", manageMainAccount=").append(manageMainAccount);
        sb.append(", managePersonOrgCode=").append(managePersonOrgCode);
        sb.append(", manageAccountCode=").append(manageAccountCode);
        sb.append(", managePersonCode=").append(managePersonCode);
        sb.append(", managePersonName=").append(managePersonName);
        sb.append(", accountAuthority=").append(accountAuthority);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}