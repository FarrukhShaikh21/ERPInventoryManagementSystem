package erpims.modelims.imsvo;

import erpglobals.modelglobals.ERPViewObjectImpl;

import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 28 16:54:07 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvSubinventoryOrgVOImpl extends ERPViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public InvSubinventoryOrgVOImpl() {
    }

    /**
     * Returns the variable value for P_ADF_SUBINVENTORY_ORG_SNO.
     * @return variable value for P_ADF_SUBINVENTORY_ORG_SNO
     */
    public Integer getP_ADF_SUBINVENTORY_ORG_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_SUBINVENTORY_ORG_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_SUBINVENTORY_ORG_SNO.
     * @param value value to bind as P_ADF_SUBINVENTORY_ORG_SNO
     */
    public void setP_ADF_SUBINVENTORY_ORG_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_SUBINVENTORY_ORG_SNO", value);
    }
    
    @Override
    public void afterRollback(TransactionEvent transactionEvent) {
        // TODO Implement this method
        setErpPkColumn("SubinventoryOrgSno");
        setErpParameterId("P_ADF_SUBINVENTORY_ORG_SNO");
        setErpViewObjectName("InvSubinventoryOrgCRUD");
        
        super.afterRollback(transactionEvent);
    }     
    
}

