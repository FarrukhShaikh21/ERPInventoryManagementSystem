package erpims.modelims.imsvo;

import erpims.modelims.imseo.InvSubinventoryOrgImpl;

import java.sql.Date;
import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 28 16:54:07 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvSubinventoryOrgVORowImpl extends ViewRowImpl {


    public static final int ENTITY_INVSUBINVENTORYORG = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SubinventoryOrgSno,
        SubinventoryOrgCode,
        SubinventoryOrgShortName,
        SubinventoryTypeSno,
        OpenDate,
        StartDate,
        EndDate,
        InventoryOrgSno,
        PhoneNo,
        FaxNo,
        MobileNo,
        ContactPerson,
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
        SubinventoryDescription,
        IsActive,
        txtInventoryOrgName,
        CompanyId,
        InvInventoryOrgVO,
        InvPoReceiveLinesVO,
        InvItemReceiveLinesVO,
        AccSysGeneralValueVO,
        AccSysGeneralValueActiveVO;
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


    public static final int SUBINVENTORYORGSNO = AttributesEnum.SubinventoryOrgSno.index();
    public static final int SUBINVENTORYORGCODE = AttributesEnum.SubinventoryOrgCode.index();
    public static final int SUBINVENTORYORGSHORTNAME = AttributesEnum.SubinventoryOrgShortName.index();
    public static final int SUBINVENTORYTYPESNO = AttributesEnum.SubinventoryTypeSno.index();
    public static final int OPENDATE = AttributesEnum.OpenDate.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int INVENTORYORGSNO = AttributesEnum.InventoryOrgSno.index();
    public static final int PHONENO = AttributesEnum.PhoneNo.index();
    public static final int FAXNO = AttributesEnum.FaxNo.index();
    public static final int MOBILENO = AttributesEnum.MobileNo.index();
    public static final int CONTACTPERSON = AttributesEnum.ContactPerson.index();
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
    public static final int SUBINVENTORYDESCRIPTION = AttributesEnum.SubinventoryDescription.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int TXTINVENTORYORGNAME = AttributesEnum.txtInventoryOrgName.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int INVINVENTORYORGVO = AttributesEnum.InvInventoryOrgVO.index();
    public static final int INVPORECEIVELINESVO = AttributesEnum.InvPoReceiveLinesVO.index();
    public static final int INVITEMRECEIVELINESVO = AttributesEnum.InvItemReceiveLinesVO.index();
    public static final int ACCSYSGENERALVALUEVO = AttributesEnum.AccSysGeneralValueVO.index();
    public static final int ACCSYSGENERALVALUEACTIVEVO = AttributesEnum.AccSysGeneralValueActiveVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public InvSubinventoryOrgVORowImpl() {
    }

    /**
     * Gets InvSubinventoryOrg entity object.
     * @return the InvSubinventoryOrg
     */
    public InvSubinventoryOrgImpl getInvSubinventoryOrg() {
        return (InvSubinventoryOrgImpl) getEntity(ENTITY_INVSUBINVENTORYORG);
    }

    /**
     * Gets the attribute value for subinventory_org_sno using the alias name SubinventoryOrgSno.
     * @return the subinventory_org_sno
     */
    public Integer getSubinventoryOrgSno() {
        return (Integer) getAttributeInternal(SUBINVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for subinventory_org_sno using the alias name SubinventoryOrgSno.
     * @param value value to set the subinventory_org_sno
     */
    public void setSubinventoryOrgSno(Integer value) {
        setAttributeInternal(SUBINVENTORYORGSNO, value);
    }

    /**
     * Gets the attribute value for subinventory_org_code using the alias name SubinventoryOrgCode.
     * @return the subinventory_org_code
     */
    public Integer getSubinventoryOrgCode() {
        return (Integer) getAttributeInternal(SUBINVENTORYORGCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for subinventory_org_code using the alias name SubinventoryOrgCode.
     * @param value value to set the subinventory_org_code
     */
    public void setSubinventoryOrgCode(Integer value) {
        setAttributeInternal(SUBINVENTORYORGCODE, value);
    }

    /**
     * Gets the attribute value for subinventory_org_short_name using the alias name SubinventoryOrgShortName.
     * @return the subinventory_org_short_name
     */
    public String getSubinventoryOrgShortName() {
        return (String) getAttributeInternal(SUBINVENTORYORGSHORTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for subinventory_org_short_name using the alias name SubinventoryOrgShortName.
     * @param value value to set the subinventory_org_short_name
     */
    public void setSubinventoryOrgShortName(String value) {
        setAttributeInternal(SUBINVENTORYORGSHORTNAME, value);
    }

    /**
     * Gets the attribute value for subinventory_type_sno using the alias name SubinventoryTypeSno.
     * @return the subinventory_type_sno
     */
    public String getSubinventoryTypeSno() {
        return (String) getAttributeInternal(SUBINVENTORYTYPESNO);
    }

    /**
     * Sets <code>value</code> as attribute value for subinventory_type_sno using the alias name SubinventoryTypeSno.
     * @param value value to set the subinventory_type_sno
     */
    public void setSubinventoryTypeSno(String value) {
        setAttributeInternal(SUBINVENTORYTYPESNO, value);
    }

    /**
     * Gets the attribute value for open_date using the alias name OpenDate.
     * @return the open_date
     */
    public Date getOpenDate() {
        return (Date) getAttributeInternal(OPENDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for open_date using the alias name OpenDate.
     * @param value value to set the open_date
     */
    public void setOpenDate(Date value) {
        setAttributeInternal(OPENDATE, value);
    }

    /**
     * Gets the attribute value for start_date using the alias name StartDate.
     * @return the start_date
     */
    public Date getStartDate() {
        return (Date) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for start_date using the alias name StartDate.
     * @param value value to set the start_date
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for end_date using the alias name EndDate.
     * @return the end_date
     */
    public Date getEndDate() {
        return (Date) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for end_date using the alias name EndDate.
     * @param value value to set the end_date
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for inventory_org_sno using the alias name InventoryOrgSno.
     * @return the inventory_org_sno
     */
    public Integer getInventoryOrgSno() {
        return (Integer) getAttributeInternal(INVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for inventory_org_sno using the alias name InventoryOrgSno.
     * @param value value to set the inventory_org_sno
     */
    public void setInventoryOrgSno(Integer value) {
        setAttributeInternal(INVENTORYORGSNO, value);
    }

    /**
     * Gets the attribute value for phone_no using the alias name PhoneNo.
     * @return the phone_no
     */
    public String getPhoneNo() {
        return (String) getAttributeInternal(PHONENO);
    }

    /**
     * Sets <code>value</code> as attribute value for phone_no using the alias name PhoneNo.
     * @param value value to set the phone_no
     */
    public void setPhoneNo(String value) {
        setAttributeInternal(PHONENO, value);
    }

    /**
     * Gets the attribute value for fax_no using the alias name FaxNo.
     * @return the fax_no
     */
    public String getFaxNo() {
        return (String) getAttributeInternal(FAXNO);
    }

    /**
     * Sets <code>value</code> as attribute value for fax_no using the alias name FaxNo.
     * @param value value to set the fax_no
     */
    public void setFaxNo(String value) {
        setAttributeInternal(FAXNO, value);
    }

    /**
     * Gets the attribute value for mobile_no using the alias name MobileNo.
     * @return the mobile_no
     */
    public String getMobileNo() {
        return (String) getAttributeInternal(MOBILENO);
    }

    /**
     * Sets <code>value</code> as attribute value for mobile_no using the alias name MobileNo.
     * @param value value to set the mobile_no
     */
    public void setMobileNo(String value) {
        setAttributeInternal(MOBILENO, value);
    }

    /**
     * Gets the attribute value for contact_person using the alias name ContactPerson.
     * @return the contact_person
     */
    public String getContactPerson() {
        return (String) getAttributeInternal(CONTACTPERSON);
    }

    /**
     * Sets <code>value</code> as attribute value for contact_person using the alias name ContactPerson.
     * @param value value to set the contact_person
     */
    public void setContactPerson(String value) {
        setAttributeInternal(CONTACTPERSON, value);
    }

    /**
     * Gets the attribute value for address using the alias name Address.
     * @return the address
     */
    public String getAddress() {
        return (String) getAttributeInternal(ADDRESS);
    }

    /**
     * Sets <code>value</code> as attribute value for address using the alias name Address.
     * @param value value to set the address
     */
    public void setAddress(String value) {
        setAttributeInternal(ADDRESS, value);
    }

    /**
     * Gets the attribute value for created_by using the alias name CreatedBy.
     * @return the created_by
     */
    public Integer getCreatedBy() {
        return (Integer) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for created_by using the alias name CreatedBy.
     * @param value value to set the created_by
     */
    public void setCreatedBy(Integer value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for created_date using the alias name CreatedDate.
     * @return the created_date
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for created_date using the alias name CreatedDate.
     * @param value value to set the created_date
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for last_updated_by using the alias name LastUpdatedBy.
     * @return the last_updated_by
     */
    public Integer getLastUpdatedBy() {
        return (Integer) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for last_updated_by using the alias name LastUpdatedBy.
     * @param value value to set the last_updated_by
     */
    public void setLastUpdatedBy(Integer value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for last_updated_date using the alias name LastUpdatedDate.
     * @return the last_updated_date
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for last_updated_date using the alias name LastUpdatedDate.
     * @param value value to set the last_updated_date
     */
    public void setLastUpdatedDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for is_supervised using the alias name IsSupervised.
     * @return the is_supervised
     */
    public String getIsSupervised() {
        return (String) getAttributeInternal(ISSUPERVISED);
    }

    /**
     * Sets <code>value</code> as attribute value for is_supervised using the alias name IsSupervised.
     * @param value value to set the is_supervised
     */
    public void setIsSupervised(String value) {
        setAttributeInternal(ISSUPERVISED, value);
    }

    /**
     * Gets the attribute value for supervised_date using the alias name SupervisedDate.
     * @return the supervised_date
     */
    public Timestamp getSupervisedDate() {
        return (Timestamp) getAttributeInternal(SUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for supervised_date using the alias name SupervisedDate.
     * @param value value to set the supervised_date
     */
    public void setSupervisedDate(Timestamp value) {
        setAttributeInternal(SUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for is_unsupervised using the alias name IsUnsupervised.
     * @return the is_unsupervised
     */
    public String getIsUnsupervised() {
        return (String) getAttributeInternal(ISUNSUPERVISED);
    }

    /**
     * Sets <code>value</code> as attribute value for is_unsupervised using the alias name IsUnsupervised.
     * @param value value to set the is_unsupervised
     */
    public void setIsUnsupervised(String value) {
        setAttributeInternal(ISUNSUPERVISED, value);
    }

    /**
     * Gets the attribute value for un_supervised_date using the alias name UnSupervisedDate.
     * @return the un_supervised_date
     */
    public Timestamp getUnSupervisedDate() {
        return (Timestamp) getAttributeInternal(UNSUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for un_supervised_date using the alias name UnSupervisedDate.
     * @param value value to set the un_supervised_date
     */
    public void setUnSupervisedDate(Timestamp value) {
        setAttributeInternal(UNSUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for supervised_by using the alias name SupervisedBy.
     * @return the supervised_by
     */
    public Integer getSupervisedBy() {
        return (Integer) getAttributeInternal(SUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for supervised_by using the alias name SupervisedBy.
     * @param value value to set the supervised_by
     */
    public void setSupervisedBy(Integer value) {
        setAttributeInternal(SUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for un_supervised_by using the alias name UnSupervisedBy.
     * @return the un_supervised_by
     */
    public Integer getUnSupervisedBy() {
        return (Integer) getAttributeInternal(UNSUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for un_supervised_by using the alias name UnSupervisedBy.
     * @param value value to set the un_supervised_by
     */
    public void setUnSupervisedBy(Integer value) {
        setAttributeInternal(UNSUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for subinventory_description using the alias name SubinventoryDescription.
     * @return the subinventory_description
     */
    public String getSubinventoryDescription() {
        return (String) getAttributeInternal(SUBINVENTORYDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for subinventory_description using the alias name SubinventoryDescription.
     * @param value value to set the subinventory_description
     */
    public void setSubinventoryDescription(String value) {
        setAttributeInternal(SUBINVENTORYDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for is_active using the alias name IsActive.
     * @return the is_active
     */
    public String getIsActive() {
        return (String) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as attribute value for is_active using the alias name IsActive.
     * @param value value to set the is_active
     */
    public void setIsActive(String value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * Gets the attribute value for txt_Inventory_Org_Name using the alias name txtInventoryOrgName.
     * @return the txt_Inventory_Org_Name
     */
    public String gettxtInventoryOrgName() {
        return (String) getAttributeInternal(TXTINVENTORYORGNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Inventory_Org_Name using the alias name txtInventoryOrgName.
     * @param value value to set the txt_Inventory_Org_Name
     */
    public void settxtInventoryOrgName(String value) {
        setAttributeInternal(TXTINVENTORYORGNAME, value);
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
     * Gets the associated <code>Row</code> using master-detail link InvInventoryOrgVO.
     */
    public Row getInvInventoryOrgVO() {
        return (Row) getAttributeInternal(INVINVENTORYORGVO);
    }

    /**
     * Sets the master-detail link InvInventoryOrgVO between this object and <code>value</code>.
     */
    public void setInvInventoryOrgVO(Row value) {
        setAttributeInternal(INVINVENTORYORGVO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvPoReceiveLinesVO.
     */
    public RowIterator getInvPoReceiveLinesVO() {
        return (RowIterator) getAttributeInternal(INVPORECEIVELINESVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link InvItemReceiveLinesVO.
     */
    public RowIterator getInvItemReceiveLinesVO() {
        return (RowIterator) getAttributeInternal(INVITEMRECEIVELINESVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysGeneralValueVO.
     */
    public RowSet getAccSysGeneralValueVO() {
        return (RowSet) getAttributeInternal(ACCSYSGENERALVALUEVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysGeneralValueActiveVO.
     */
    public RowSet getAccSysGeneralValueActiveVO() {
        return (RowSet) getAttributeInternal(ACCSYSGENERALVALUEACTIVEVO);
    }
    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getIsSupervised().toString().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
    
}

