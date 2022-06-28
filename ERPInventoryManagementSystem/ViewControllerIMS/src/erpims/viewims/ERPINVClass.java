package erpims.viewims;

import erpglobals.modelglobals.ERPUserAttribute;

import erpglobals.viewglobals.ERPGlobalsClass;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.controller.ControllerContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichInputFile;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.render.ClientEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;

import org.apache.myfaces.trinidad.model.UploadedFile;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


public class ERPINVClass {
    private Integer ERPuserId;
    private String ERPuserCode = "";
    private ERPUserAttribute ERPUserAttributes;
    private String lIteratorDetailName;
    private String ERPBackActionName="ERPBACKCRUD";
    private String lIteratorName="InvItemCRUDIterator";
    private String erpScreenSize;
    private RichPopup lerpSupervisePopupConfirm;
    private RichPopup lerpUnSupervisePopupConfirm;
    private RichPanelTabbed lErpPanelTabbed;
    private RichPanelTabbed lErpPanelDefaultTabbed;
    private RichInputFile ERPUploadFile;
    private RichInputText ErpFileStoreOn;
    private RichInputText ErpFileStorePath;    
    private RichInputText ERPPrimaryKey;
    private String ERPAddOperation="CreateWithParams";
    
    public ERPINVClass() {
        super();
    }


    public void setERPPrimaryKey(RichInputText ERPPrimaryKey) {
        this.ERPPrimaryKey = ERPPrimaryKey;
    }

    public RichInputText getERPPrimaryKey() {
        return ERPPrimaryKey;
    }

    public void setErpFileStoreOn(RichInputText ErpFileStoreOn) {
        this.ErpFileStoreOn = ErpFileStoreOn;
    }

    public RichInputText getErpFileStoreOn() {
        return ErpFileStoreOn;
    }

    public void setErpFileStorePath(RichInputText ErpFileStorePath) {
        this.ErpFileStorePath = ErpFileStorePath;
    }

    public RichInputText getErpFileStorePath() {
        return ErpFileStorePath;
    }

    public void setERPUploadFile(RichInputFile ERPUploadFile) {
        this.ERPUploadFile = ERPUploadFile;
    }

    public RichInputFile getERPUploadFile() {
        return ERPUploadFile;
    }

    public void setLerpSupervisePopupConfirm(RichPopup lerpSupervisePopupConfirm) {
        this.lerpSupervisePopupConfirm = lerpSupervisePopupConfirm;
    }

    public RichPopup getLerpSupervisePopupConfirm() {
        return lerpSupervisePopupConfirm;
    }

    public void setLerpUnSupervisePopupConfirm(RichPopup lerpUnSupervisePopupConfirm) {
        this.lerpUnSupervisePopupConfirm = lerpUnSupervisePopupConfirm;
    }

    public RichPopup getLerpUnSupervisePopupConfirm() {
        return lerpUnSupervisePopupConfirm;
    }

    public void setErpScreenSize(String erpScreenSize) {
        this.erpScreenSize = erpScreenSize;
    }
    public String getErpScreenSize() {
        return erpScreenSize;
    }

    public void setERPBackActionName(String ERPBackActionName) {
        this.ERPBackActionName = ERPBackActionName;
    }

    public String getERPBackActionName() {
        return ERPBackActionName;
    }

    public void setLIteratorName(String lIteratorName) {
        this.lIteratorName = lIteratorName;
    }

    public String getLIteratorName() {
        return lIteratorName;
    }

    public void setLIteratorDetailName(String lIteratorDetailName) {
        this.lIteratorDetailName = lIteratorDetailName;
    }

    public String getLIteratorDetailName() {
        return lIteratorDetailName;
    }

    public void setERPuserId(Integer ERPuserId) {
        this.ERPuserId = ERPuserId;
    }

    public Integer getERPuserId() {
        return ERPuserId;
    }

    public void setERPuserCode(String ERPuserCode) {
        this.ERPuserCode = ERPuserCode;
    }

    public String getERPuserCode() {
        return ERPuserCode;
    }

    public void setERPUserAttributes(ERPUserAttribute ERPUserAttributes) {
        this.ERPUserAttributes = ERPUserAttributes;
    }

    public ERPUserAttribute getERPUserAttributes() {
        return ERPUserAttributes;
    }

    public void doSetINVErpApplicationGlobals() {
        
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_SNO",1);
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_CODE","FARRUKH");
        ADFContext.getCurrent().getPageFlowScope().put("G_GLOBAL_DEF_COMPANY",1);
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_MODULE_ACTION","SEC_0011");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_COMP_ACCESS_TABLE","temp_admin_company_access");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_DEPT_ACCESS_TABLE","temp_admin_department_access");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_NAME","FARRUKH SHAIKH");
        System.out.println("five erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_PICTURE","PICTURE NAME");
       
         if (1==1) {
            return;
         }

        //System.out.println("one erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_SNO",getERPUserAttributes().getUserId());
        //System.out.println("two erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_CODE",getERPUserAttributes().getUserCode());
        //System.out.println("three erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_GLOBAL_DEF_COMPANY",getERPUserAttributes().getErpDefGloalCompany());
        //System.out.println("four erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_COMP_ACCESS_TABLE",getERPUserAttributes().getErpTempCompanyAccessTable());
        //System.out.println("four erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_DEPT_ACCESS_TABLE",getERPUserAttributes().getErpTempDepartAccessTable());
        ////////////////
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_NAME",getERPUserAttributes().getERPUserName());
        System.out.println("five erp");
        getERPUserAttributes().setUserCode(getERPuserCode());
        getERPUserAttributes().setUserId(getERPuserId());
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_PICTURE",getERPUserAttributes().getERPUserPicture());
        System.out.println("six erp-01-new:"+getERPuserId());
       ////////

    }


    public void setERPAddOperation(String ERPAddOperation) {
        this.ERPAddOperation = ERPAddOperation;
    }

    public String getERPAddOperation() {
        return ERPAddOperation;
    }

    public String doERPAddRecordWithPara() {
    
        if (ERPGlobalsClass.doCheckERPTransactionDirty() ) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Adding Record.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           return null;
        }        
        OperationBinding ob=ERPGlobalsClass.doGetERPOperation(getERPAddOperation());
        ob.execute();
        setERPAddOperation("CreateWithParams");
        //MAINLY THIS WILL WORK FOR SUBINVENTORY 
        //WHEN WE PRESS THE ADD RECORD BUTTON TO CREATE SUBINVENTORY
        //FOR REST IT WONT WORK
        return "ERP-ACT-GOTO-ADD-RECORD";
    }
    
    public void doERPConfirmDelete(DialogEvent erpde) {
         //this is using on form sec_0006_edit
         if (erpde.getOutcome()==DialogEvent.Outcome.yes) {
             OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Delete");
             ob.execute();
             ob = ERPGlobalsClass.doGetERPOperation("Commit");
             Object o= ob.execute();
             doERPShowSaveMessage("Record Deleted Successfully.");      
         }
     }    

    public void doERPShowSaveMessage(String pMessage){
           FacesContext context = FacesContext.getCurrentInstance();
           ExtendedRenderKitService erks = Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
           erks.addScript(context, "showNotificationCallback('"+pMessage+"')");
       }

    public String doBackFromEdit() {
        
        if (ERPGlobalsClass.doCheckERPTransactionDirty()) {
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Going Back.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           
           return null;
                }
        /*if (ERPGlobalsClass.isRecordChanged(lIteratorName).equals("YES") ||(lIteratorDetailName!=null && ERPGlobalsClass.isRecordChanged(lIteratorDetailName).equals("YES"))) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Going Back.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           
           return null;
        } */       
        return ERPBackActionName;
    }
  
    public String doErpUndoRecord() {
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Rollback");
        ob.execute();
        doERPShowSaveMessage("Record Undo Successfully.");
        return null;
    }  
    public String doERPCommitRecord() {
       OperationBinding ob=ERPGlobalsClass.doGetERPOperation("Commit");
        Object execute = ob.execute(); 
        //error occurs during saving the record.
        if (!ob.getErrors().isEmpty()) {
         // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));  
          return null;
        }
          doERPShowSaveMessage("Record Saved Successfully.");      
         return null;
    }


    public String doERPPopSupervisedRecord() {

        OperationBinding ob=ERPGlobalsClass.doGetERPOperation("Commit");
        Object execute = ob.execute(); 
        ob.execute();
        //error occurs during saving the record.
        if (!ob.getErrors().isEmpty()) {
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));  
          return null;
        }
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        this.lerpSupervisePopupConfirm.show(hints); 
         return null;
    }
    
    public void doERPConfirmUnSuperviseDialog(DialogEvent de) {
          ///user wants to save the record
          if (de.getOutcome() == DialogEvent.Outcome.yes) {
              BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
              DCIteratorBinding ib = (DCIteratorBinding) bc.get(lIteratorName);
              ib.getCurrentRow().setAttribute("IsSupervised", "N");
              ib.getCurrentRow().setAttribute("SupervisedDate", null);
              ib.getCurrentRow().setAttribute("SupervisedBy", null);
              ib.getCurrentRow().setAttribute("IsUnsupervised", "Y");
              
              OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Commit");
              ob.execute();
              //error occurs during saving the record.
              if (!ob.getErrors().isEmpty()) {
                  FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));
                  return;
              }
              doERPShowSaveMessage("Record Unupervised Successfully.");   
          }
      }    
    public String doERPPopUnSuperviseRecord() {
         RichPopup.PopupHints hints = new RichPopup.PopupHints();
         this.lerpUnSupervisePopupConfirm.show(hints); 
          return null;
     }
    public void doERPConfirmSuperviseDialog(DialogEvent de) {
        ///user wants to save the record
        if (de.getOutcome() == DialogEvent.Outcome.yes) {
            OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Commit");
            //error occurs during saving the record.
            ob.execute();
            if (!ob.getErrors().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));
                return;
            }
            BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
            DCIteratorBinding ib = (DCIteratorBinding) bc.get(lIteratorName);
            ib.getCurrentRow().setAttribute("IsSupervised", "Y");
            ib.getCurrentRow().setAttribute("IsUnsupervised", "N");
            ib.getCurrentRow().setAttribute("UnSupervisedDate", null);
            ib.getCurrentRow().setAttribute("UnSupervisedBy", null);
            
            ob.execute();
            
            //error occurs during saving the record.
            if (!ob.getErrors().isEmpty()) {
                System.out.println("erorr while supervising");
                //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));
                ib.getCurrentRow().refresh(Row.REFRESH_UNDO_CHANGES);
                return;
            }
            doERPShowSaveMessage("Record Supervised Successfully."); 
        }
    } 
    
    public void invhandleEvent(ClientEvent clientEvent) {
        //UIComponent form = clientEvent.getComponent().getChildren().get(1);
        //form=form.getChildren().get(0);
        AdfFacesContext afContext = AdfFacesContext.getCurrentInstance();
        String screen = clientEvent.getParameters().get("screenSize").toString();
        //ADFContext.getCurrent().getSessionScope().put("screenSize", screen);
       
      setErpScreenSize(screen);
      
        System.out.println("this is inv java script"+ screen);
            System.out.println("setScreenSize"+ getErpScreenSize());
       // afContext.addPartialTarget(getRit());  
        //System.out.println(form.getId() +" get form id");
        }

    public void setLErpPanelTabbed(RichPanelTabbed lErpPanelTabbed) {
        this.lErpPanelTabbed = lErpPanelTabbed;
    }

    public RichPanelTabbed getLErpPanelTabbed() {
        return lErpPanelTabbed;
    }

    public void setLErpPanelDefaultTabbed(RichPanelTabbed lErpPanelDefaultTabbed) {
        this.lErpPanelDefaultTabbed = lErpPanelDefaultTabbed;
    }

    public RichPanelTabbed getLErpPanelDefaultTabbed() {
        return lErpPanelDefaultTabbed;
    }

    public void doUploadItemPic(ValueChangeEvent vce) {
    //    public static void ErpuploadImage(UploadedFile file, String pUploadPath,String pColumnName, String pStoreOn, String pIteratorName) {
        ERPGlobalsClass.ErpuploadImage((UploadedFile)vce.getNewValue(), getErpFileStorePath().getValue().toString(), "ItemPictureName", getErpFileStoreOn().getValue().toString(), "InvItemCRUDIterator",getERPPrimaryKey().getValue().toString(),"2");
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Commit");
        ob.execute();
        getERPUploadFile().resetValue();
        
    }    


    public void ERPINVhandleExceptionShowMessageInPopupDialog(){
      ControllerContext cc = ControllerContext.getInstance();

      Exception ex = cc.getCurrentViewPort().getExceptionData();
      String message = ex.getMessage();
      
      
      FacesContext fc = FacesContext.getCurrentInstance();        
      FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "BTF: " +message, null);
      fc.addMessage(null, facesMessage);

      cc.getCurrentRootViewPort().clearException();
      fc.renderResponse();
      
    }   
    
}

