package erpims.modelims.imsvo;

import erpglobals.modelglobals.ERPViewRowImpl;

import erpims.modelims.imseo.InvInventoryOrgImpl;

import java.sql.Date;
import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jan 22 15:45:31 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvInventoryOrgVORowImpl extends ERPViewRowImpl {


    public static final int ENTITY_INVINVENTORYORG = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        InventoryOrgSno,
        InventoryOrgCode,
        OrgShortName,
        OrgDescription,
        OpenDate,
        ParentInventoryOrgSno,
        LocationId,
        CompanyId,
        GlobalCompanyId,
        IsActive,
        CountrySno,
        CitySno,
        Address,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        IsSupervised,
        SupervisedDate,
        IsUnsupervised,
        UnSupervisedDate,
        SupervisedBy,
        UnSupervisedBy,
        PhoneNo,
        FaxNo,
        MobileNo,
        ContactPerson,
        txtLocationName,
        txtParentOrgName,
        txtCountryName,
        txtCityName,
        EndDate,
        OrgHierarchyPath,
        StartDate,
        LevelNo,
        txtCompanyHierarchyPath,
        AdminCompanyVO,
        ParentInventoryOrgSnoInvInventoryOrgVO,
        InvInventoryOrgVO,
        SmCityVO,
        AdminCompanyVO1,
        InvSubinventoryOrgVO,
        InvPoReceiveHeaderVO,
        InvItemReceiveHeaderVO,
        AccSysGeneralValueVO,
        AccSysGeneralValueSubInvTypeVO,
        AccAdminCompanyVO,
        AccInvInventoryOrgVO,
        AccSmCountryVO,
        AccSmCityVO;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int INVENTORYORGSNO = AttributesEnum.InventoryOrgSno.index();
    public static final int INVENTORYORGCODE = AttributesEnum.InventoryOrgCode.index();
    public static final int ORGSHORTNAME = AttributesEnum.OrgShortName.index();
    public static final int ORGDESCRIPTION = AttributesEnum.OrgDescription.index();
    public static final int OPENDATE = AttributesEnum.OpenDate.index();
    public static final int PARENTINVENTORYORGSNO = AttributesEnum.ParentInventoryOrgSno.index();
    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int COUNTRYSNO = AttributesEnum.CountrySno.index();
    public static final int CITYSNO = AttributesEnum.CitySno.index();
    public static final int ADDRESS = AttributesEnum.Address.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ISSUPERVISED = AttributesEnum.IsSupervised.index();
    public static final int SUPERVISEDDATE = AttributesEnum.SupervisedDate.index();
    public static final int ISUNSUPERVISED = AttributesEnum.IsUnsupervised.index();
    public static final int UNSUPERVISEDDATE = AttributesEnum.UnSupervisedDate.index();
    public static final int SUPERVISEDBY = AttributesEnum.SupervisedBy.index();
    public static final int UNSUPERVISEDBY = AttributesEnum.UnSupervisedBy.index();
    public static final int PHONENO = AttributesEnum.PhoneNo.index();
    public static final int FAXNO = AttributesEnum.FaxNo.index();
    public static final int MOBILENO = AttributesEnum.MobileNo.index();
    public static final int CONTACTPERSON = AttributesEnum.ContactPerson.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int TXTPARENTORGNAME = AttributesEnum.txtParentOrgName.index();
    public static final int TXTCOUNTRYNAME = AttributesEnum.txtCountryName.index();
    public static final int TXTCITYNAME = AttributesEnum.txtCityName.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int ORGHIERARCHYPATH = AttributesEnum.OrgHierarchyPath.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int LEVELNO = AttributesEnum.LevelNo.index();
    public static final int TXTCOMPANYHIERARCHYPATH = AttributesEnum.txtCompanyHierarchyPath.index();
    public static final int ADMINCOMPANYVO = AttributesEnum.AdminCompanyVO.index();
    public static final int PARENTINVENTORYORGSNOINVINVENTORYORGVO =
        AttributesEnum.ParentInventoryOrgSnoInvInventoryOrgVO.index();
    public static final int INVINVENTORYORGVO = AttributesEnum.InvInventoryOrgVO.index();
    public static final int SMCITYVO = AttributesEnum.SmCityVO.index();
    public static final int ADMINCOMPANYVO1 = AttributesEnum.AdminCompanyVO1.index();
    public static final int INVSUBINVENTORYORGVO = AttributesEnum.InvSubinventoryOrgVO.index();
    public static final int INVPORECEIVEHEADERVO = AttributesEnum.InvPoReceiveHeaderVO.index();
    public static final int INVITEMRECEIVEHEADERVO = AttributesEnum.InvItemReceiveHeaderVO.index();
    public static final int ACCSYSGENERALVALUEVO = AttributesEnum.AccSysGeneralValueVO.index();
    public static final int ACCSYSGENERALVALUESUBINVTYPEVO = AttributesEnum.AccSysGeneralValueSubInvTypeVO.index();
    public static final int ACCADMINCOMPANYVO = AttributesEnum.AccAdminCompanyVO.index();
    public static final int ACCINVINVENTORYORGVO = AttributesEnum.AccInvInventoryOrgVO.index();
    public static final int ACCSMCOUNTRYVO = AttributesEnum.AccSmCountryVO.index();
    public static final int ACCSMCITYVO = AttributesEnum.AccSmCityVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InvInventoryOrgVORowImpl() {
    }

    /**
     * Gets InvInventoryOrg entity object.
     * @return the InvInventoryOrg
     */
    public InvInventoryOrgImpl getInvInventoryOrg() {
        return (InvInventoryOrgImpl) getEntity(ENTITY_INVINVENTORYORG);
    }

    /**
     * Gets the attribute value for INVENTORY_ORG_SNO using the alias name InventoryOrgSno.
     * @return the INVENTORY_ORG_SNO
     */
    public Integer getInventoryOrgSno() {
        return (Integer) getAttributeInternal(INVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for INVENTORY_ORG_SNO using the alias name InventoryOrgSno.
     * @param value value to set the INVENTORY_ORG_SNO
     */
    public void setInventoryOrgSno(Integer value) {
        setAttributeInternal(INVENTORYORGSNO, value);
    }

    /**
     * Gets the attribute value for INVENTORY_ORG_CODE using the alias name InventoryOrgCode.
     * @return the INVENTORY_ORG_CODE
     */
    public Integer getInventoryOrgCode() {
        return (Integer) getAttributeInternal(INVENTORYORGCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for INVENTORY_ORG_CODE using the alias name InventoryOrgCode.
     * @param value value to set the INVENTORY_ORG_CODE
     */
    public void setInventoryOrgCode(Integer value) {
        setAttributeInternal(INVENTORYORGCODE, value);
    }

    /**
     * Gets the attribute value for ORG_SHORT_NAME using the alias name OrgShortName.
     * @return the ORG_SHORT_NAME
     */
    public String getOrgShortName() {
        return (String) getAttributeInternal(ORGSHORTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_SHORT_NAME using the alias name OrgShortName.
     * @param value value to set the ORG_SHORT_NAME
     */
    public void setOrgShortName(String value) {
        setAttributeInternal(ORGSHORTNAME, value);
    }

    /**
     * Gets the attribute value for ORG_DESCRIPTION using the alias name OrgDescription.
     * @return the ORG_DESCRIPTION
     */
    public String getOrgDescription() {
        return (String) getAttributeInternal(ORGDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_DESCRIPTION using the alias name OrgDescription.
     * @param value value to set the ORG_DESCRIPTION
     */
    public void setOrgDescription(String value) {
        setAttributeInternal(ORGDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for OPEN_DATE using the alias name OpenDate.
     * @return the OPEN_DATE
     */
    public Date getOpenDate() {
        return (Date) getAttributeInternal(OPENDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for OPEN_DATE using the alias name OpenDate.
     * @param value value to set the OPEN_DATE
     */
    public void setOpenDate(Date value) {
        setAttributeInternal(OPENDATE, value);
    }

    /**
     * Gets the attribute value for PARENT_INVENTORY_ORG_SNO using the alias name ParentInventoryOrgSno.
     * @return the PARENT_INVENTORY_ORG_SNO
     */
    public Integer getParentInventoryOrgSno() {
        return (Integer) getAttributeInternal(PARENTINVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for PARENT_INVENTORY_ORG_SNO using the alias name ParentInventoryOrgSno.
     * @param value value to set the PARENT_INVENTORY_ORG_SNO
     */
    public void setParentInventoryOrgSno(Integer value) {
        setAttributeInternal(PARENTINVENTORYORGSNO, value);
    }

    /**
     * Gets the attribute value for LOCATION_ID using the alias name LocationId.
     * @return the LOCATION_ID
     */
    public Integer getLocationId() {
        return (Integer) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATION_ID using the alias name LocationId.
     * @param value value to set the LOCATION_ID
     */
    public void setLocationId(Integer value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for COMPANY_ID using the alias name CompanyId.
     * @return the COMPANY_ID
     */
    public Integer getCompanyId() {
        return (Integer) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANY_ID using the alias name CompanyId.
     * @param value value to set the COMPANY_ID
     */
    public void setCompanyId(Integer value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for GLOBAL_COMPANY_ID using the alias name GlobalCompanyId.
     * @return the GLOBAL_COMPANY_ID
     */
    public Integer getGlobalCompanyId() {
        return (Integer) getAttributeInternal(GLOBALCOMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for GLOBAL_COMPANY_ID using the alias name GlobalCompanyId.
     * @param value value to set the GLOBAL_COMPANY_ID
     */
    public void setGlobalCompanyId(Integer value) {
        setAttributeInternal(GLOBALCOMPANYID, value);
    }

    /**
     * Gets the attribute value for IS_ACTIVE using the alias name IsActive.
     * @return the IS_ACTIVE
     */
    public String getIsActive() {
        return (String) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_ACTIVE using the alias name IsActive.
     * @param value value to set the IS_ACTIVE
     */
    public void setIsActive(String value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * Gets the attribute value for COUNTRY_SNO using the alias name CountrySno.
     * @return the COUNTRY_SNO
     */
    public Integer getCountrySno() {
        return (Integer) getAttributeInternal(COUNTRYSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for COUNTRY_SNO using the alias name CountrySno.
     * @param value value to set the COUNTRY_SNO
     */
    public void setCountrySno(Integer value) {
        setAttributeInternal(COUNTRYSNO, value);
    }

    /**
     * Gets the attribute value for CITY_SNO using the alias name CitySno.
     * @return the CITY_SNO
     */
    public Integer getCitySno() {
        return (Integer) getAttributeInternal(CITYSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for CITY_SNO using the alias name CitySno.
     * @param value value to set the CITY_SNO
     */
    public void setCitySno(Integer value) {
        setAttributeInternal(CITYSNO, value);
    }

    /**
     * Gets the attribute value for ADDRESS using the alias name Address.
     * @return the ADDRESS
     */
    public String getAddress() {
        return (String) getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as attribute value for ADDRESS using the alias name Address.
     * @param value value to set the ADDRESS
     */
    public void setAddress(String value) {
        setAttributeInternal(ADDRESS, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Integer getCreatedBy() {
        return (Integer) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Integer value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Integer getLastUpdatedBy() {
        return (Integer) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Integer value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for IS_SUPERVISED using the alias name IsSupervised.
     * @return the IS_SUPERVISED
     */
    public String getIsSupervised() {
        return (String) getAttributeInternal(ISSUPERVISED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_SUPERVISED using the alias name IsSupervised.
     * @param value value to set the IS_SUPERVISED
     */
    public void setIsSupervised(String value) {
        setAttributeInternal(ISSUPERVISED, value);
    }

    /**
     * Gets the attribute value for SUPERVISED_DATE using the alias name SupervisedDate.
     * @return the SUPERVISED_DATE
     */
    public Timestamp getSupervisedDate() {
        return (Timestamp) getAttributeInternal(SUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPERVISED_DATE using the alias name SupervisedDate.
     * @param value value to set the SUPERVISED_DATE
     */
    public void setSupervisedDate(Timestamp value) {
        setAttributeInternal(SUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for IS_UNSUPERVISED using the alias name IsUnsupervised.
     * @return the IS_UNSUPERVISED
     */
    public String getIsUnsupervised() {
        return (String) getAttributeInternal(ISUNSUPERVISED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_UNSUPERVISED using the alias name IsUnsupervised.
     * @param value value to set the IS_UNSUPERVISED
     */
    public void setIsUnsupervised(String value) {
        setAttributeInternal(ISUNSUPERVISED, value);
    }

    /**
     * Gets the attribute value for UN_SUPERVISED_DATE using the alias name UnSupervisedDate.
     * @return the UN_SUPERVISED_DATE
     */
    public Timestamp getUnSupervisedDate() {
        return (Timestamp) getAttributeInternal(UNSUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for UN_SUPERVISED_DATE using the alias name UnSupervisedDate.
     * @param value value to set the UN_SUPERVISED_DATE
     */
    public void setUnSupervisedDate(Timestamp value) {
        setAttributeInternal(UNSUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for SUPERVISED_BY using the alias name SupervisedBy.
     * @return the SUPERVISED_BY
     */
    public Integer getSupervisedBy() {
        return (Integer) getAttributeInternal(SUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPERVISED_BY using the alias name SupervisedBy.
     * @param value value to set the SUPERVISED_BY
     */
    public void setSupervisedBy(Integer value) {
        setAttributeInternal(SUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for UN_SUPERVISED_BY using the alias name UnSupervisedBy.
     * @return the UN_SUPERVISED_BY
     */
    public Integer getUnSupervisedBy() {
        return (Integer) getAttributeInternal(UNSUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for UN_SUPERVISED_BY using the alias name UnSupervisedBy.
     * @param value value to set the UN_SUPERVISED_BY
     */
    public void setUnSupervisedBy(Integer value) {
        setAttributeInternal(UNSUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for PHONE_NO using the alias name PhoneNo.
     * @return the PHONE_NO
     */
    public String getPhoneNo() {
        return (String) getAttributeInternal(PHONENO);
    }

    /**
     * Sets <code>value</code> as attribute value for PHONE_NO using the alias name PhoneNo.
     * @param value value to set the PHONE_NO
     */
    public void setPhoneNo(String value) {
        setAttributeInternal(PHONENO, value);
    }

    /**
     * Gets the attribute value for FAX_NO using the alias name FaxNo.
     * @return the FAX_NO
     */
    public String getFaxNo() {
        return (String) getAttributeInternal(FAXNO);
    }

    /**
     * Sets <code>value</code> as attribute value for FAX_NO using the alias name FaxNo.
     * @param value value to set the FAX_NO
     */
    public void setFaxNo(String value) {
        setAttributeInternal(FAXNO, value);
    }

    /**
     * Gets the attribute value for MOBILE_NO using the alias name MobileNo.
     * @return the MOBILE_NO
     */
    public String getMobileNo() {
        return (String) getAttributeInternal(MOBILENO);
    }

    /**
     * Sets <code>value</code> as attribute value for MOBILE_NO using the alias name MobileNo.
     * @param value value to set the MOBILE_NO
     */
    public void setMobileNo(String value) {
        setAttributeInternal(MOBILENO, value);
    }

    /**
     * Gets the attribute value for CONTACT_PERSON using the alias name ContactPerson.
     * @return the CONTACT_PERSON
     */
    public String getContactPerson() {
        return (String) getAttributeInternal(CONTACTPERSON);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTACT_PERSON using the alias name ContactPerson.
     * @param value value to set the CONTACT_PERSON
     */
    public void setContactPerson(String value) {
        setAttributeInternal(CONTACTPERSON, value);
    }

    /**
     * Gets the attribute value for txt_Location_Name using the alias name txtLocationName.
     * @return the txt_Location_Name
     */
    public String gettxtLocationName() {
        return (String) getAttributeInternal(TXTLOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Location_Name using the alias name txtLocationName.
     * @param value value to set the txt_Location_Name
     */
    public void settxtLocationName(String value) {
        setAttributeInternal(TXTLOCATIONNAME, value);
    }

    /**
     * Gets the attribute value for txt_Parent_Org_Name using the alias name txtParentOrgName.
     * @return the txt_Parent_Org_Name
     */
    public String gettxtParentOrgName() {
        return (String) getAttributeInternal(TXTPARENTORGNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Parent_Org_Name using the alias name txtParentOrgName.
     * @param value value to set the txt_Parent_Org_Name
     */
    public void settxtParentOrgName(String value) {
        setAttributeInternal(TXTPARENTORGNAME, value);
    }

    /**
     * Gets the attribute value for txt_Country_Name using the alias name txtCountryName.
     * @return the txt_Country_Name
     */
    public String gettxtCountryName() {
        return (String) getAttributeInternal(TXTCOUNTRYNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Country_Name using the alias name txtCountryName.
     * @param value value to set the txt_Country_Name
     */
    public void settxtCountryName(String value) {
        setAttributeInternal(TXTCOUNTRYNAME, value);
    }

    /**
     * Gets the attribute value for txt_City_Name using the alias name txtCityName.
     * @return the txt_City_Name
     */
    public String gettxtCityName() {
        return (String) getAttributeInternal(TXTCITYNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_City_Name using the alias name txtCityName.
     * @param value value to set the txt_City_Name
     */
    public void settxtCityName(String value) {
        setAttributeInternal(TXTCITYNAME, value);
    }

    /**
     * Gets the attribute value for END_DATE using the alias name EndDate.
     * @return the END_DATE
     */
    public Date getEndDate() {
        return (Date) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate.
     * @param value value to set the END_DATE
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for ORG_HIERARCHY_PATH using the alias name OrgHierarchyPath.
     * @return the ORG_HIERARCHY_PATH
     */
    public String getOrgHierarchyPath() {
        return (String) getAttributeInternal(ORGHIERARCHYPATH);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_HIERARCHY_PATH using the alias name OrgHierarchyPath.
     * @param value value to set the ORG_HIERARCHY_PATH
     */
    public void setOrgHierarchyPath(String value) {
        setAttributeInternal(ORGHIERARCHYPATH, value);
    }

    /**
     * Gets the attribute value for START_DATE using the alias name StartDate.
     * @return the START_DATE
     */
    public Date getStartDate() {
        return (Date) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for START_DATE using the alias name StartDate.
     * @param value value to set the START_DATE
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for LEVEL_NO using the alias name LevelNo.
     * @return the LEVEL_NO
     */
    public Integer getLevelNo() {
        return (Integer) getAttributeInternal(LEVELNO);
    }

    /**
     * Sets <code>value</code> as attribute value for LEVEL_NO using the alias name LevelNo.
     * @param value value to set the LEVEL_NO
     */
    public void setLevelNo(Integer value) {
        setAttributeInternal(LEVELNO, value);
    }

    /**
     * Gets the attribute value for txt_Company_Hierarchy_Path using the alias name txtCompanyHierarchyPath.
     * @return the txt_Company_Hierarchy_Path
     */
    public String gettxtCompanyHierarchyPath() {
        return (String) getAttributeInternal(TXTCOMPANYHIERARCHYPATH);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Company_Hierarchy_Path using the alias name txtCompanyHierarchyPath.
     * @param value value to set the txt_Company_Hierarchy_Path
     */
    public void settxtCompanyHierarchyPath(String value) {
        setAttributeInternal(TXTCOMPANYHIERARCHYPATH, value);
    }


    /**
     * Gets the associated <code>Row</code> using master-detail link AdminCompanyVO.
     */
    public Row getAdminCompanyVO() {
        return (Row) getAttributeInternal(ADMINCOMPANYVO);
    }

    /**
     * Sets the master-detail link AdminCompanyVO between this object and <code>value</code>.
     */
    public void setAdminCompanyVO(Row value) {
        setAttributeInternal(ADMINCOMPANYVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ParentInventoryOrgSnoInvInventoryOrgVO.
     */
    public Row getParentInventoryOrgSnoInvInventoryOrgVO() {
        return (Row) getAttributeInternal(PARENTINVENTORYORGSNOINVINVENTORYORGVO);
    }

    /**
     * Sets the master-detail link ParentInventoryOrgSnoInvInventoryOrgVO between this object and <code>value</code>.
     */
    public void setParentInventoryOrgSnoInvInventoryOrgVO(Row value) {
        setAttributeInternal(PARENTINVENTORYORGSNOINVINVENTORYORGVO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvInventoryOrgVO.
     */
    public RowIterator getInvInventoryOrgVO() {
        return (RowIterator) getAttributeInternal(INVINVENTORYORGVO);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SmCityVO.
     */
    public Row getSmCityVO() {
        return (Row) getAttributeInternal(SMCITYVO);
    }

    /**
     * Sets the master-detail link SmCityVO between this object and <code>value</code>.
     */
    public void setSmCityVO(Row value) {
        setAttributeInternal(SMCITYVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link AdminCompanyVO1.
     */
    public Row getAdminCompanyVO1() {
        return (Row) getAttributeInternal(ADMINCOMPANYVO1);
    }

    /**
     * Sets the master-detail link AdminCompanyVO1 between this object and <code>value</code>.
     */
    public void setAdminCompanyVO1(Row value) {
        setAttributeInternal(ADMINCOMPANYVO1, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvSubinventoryOrgVO.
     */
    public RowIterator getInvSubinventoryOrgVO() {
        return (RowIterator) getAttributeInternal(INVSUBINVENTORYORGVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvPoReceiveHeaderVO.
     */
    public RowIterator getInvPoReceiveHeaderVO() {
        return (RowIterator) getAttributeInternal(INVPORECEIVEHEADERVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvItemReceiveHeaderVO.
     */
    public RowIterator getInvItemReceiveHeaderVO() {
        return (RowIterator) getAttributeInternal(INVITEMRECEIVEHEADERVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysGeneralValueVO.
     */
    public RowSet getAccSysGeneralValueVO() {
        return (RowSet) getAttributeInternal(ACCSYSGENERALVALUEVO);
    }


    /**
     * Gets the view accessor <code>RowSet</code> AccSysGeneralValueSubInvTypeVO.
     */
    public RowSet getAccSysGeneralValueSubInvTypeVO() {
        return (RowSet) getAttributeInternal(ACCSYSGENERALVALUESUBINVTYPEVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAdminCompanyVO.
     */
    public RowSet getAccAdminCompanyVO() {
        return (RowSet) getAttributeInternal(ACCADMINCOMPANYVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInvInventoryOrgVO.
     */
    public RowSet getAccInvInventoryOrgVO() {
        return (RowSet) getAttributeInternal(ACCINVINVENTORYORGVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSmCountryVO.
     */
    public RowSet getAccSmCountryVO() {
        return (RowSet) getAttributeInternal(ACCSMCOUNTRYVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSmCityVO.
     */
    public RowSet getAccSmCityVO() {
        return (RowSet) getAttributeInternal(ACCSMCITYVO);
    }
    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getIsSupervised().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

