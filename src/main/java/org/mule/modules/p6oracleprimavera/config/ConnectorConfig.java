package org.mule.modules.p6oracleprimavera.config;

import java.util.ArrayList;
import java.util.List;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.WsdlProvider;
import org.mule.api.annotations.display.Password;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Optional;
import org.mule.api.annotations.ws.WsdlSecurity;
import org.mule.api.annotations.ws.WsdlServiceEndpoint;
import org.mule.api.annotations.ws.WsdlServiceRetriever;
import org.mule.api.annotations.ws.WsdlTransportRetriever;
import org.mule.devkit.api.ws.authentication.WsdlSecurityStrategy;
import org.mule.devkit.api.ws.authentication.WsdlUsernameToken;
import org.mule.devkit.api.ws.definition.DefaultServiceDefinition;
import org.mule.devkit.api.ws.definition.ServiceDefinition;
import org.mule.devkit.api.ws.transport.HttpRequesterConfigWsdlTransport;
import org.mule.devkit.api.ws.transport.WsdlTransport;
import org.mule.module.http.api.requester.HttpRequesterConfig;
import org.mule.module.ws.security.PasswordType;

@WsdlProvider(friendlyName = "Configuration")
public class ConnectorConfig {
	
	@Configurable
	@Placement (order = 0)
	private HttpRequesterConfig requesterConfig;

    @Configurable
    @Placement(order = 1)
    private String username;

    @Configurable
    @Placement(order = 2)
    @Password
    @Optional
    private String password;

    @WsdlServiceRetriever
    public List<ServiceDefinition> getServiceDefinitions() {

        final List<ServiceDefinition> serviceDefinitions = new ArrayList<ServiceDefinition>();

        serviceDefinitions.add(new DefaultServiceDefinition(
                "SpreadService_SpreadPort",
                "SpreadService",
                "http://primavera:8206/p6ws/services/SpreadService?wsdl",
                "SpreadService",
                "SpreadPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskThresholdLevelService_RiskThresholdLevelPort",
                "RiskThresholdLevelService",
                "http://primavera:8206/p6ws/services/RiskThresholdLevelService?wsdl",
                "RiskThresholdLevelService",
                "RiskThresholdLevelPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "UDFCodeService_UDFCodePort",
                "UDFCodeService",
                "http://primavera:8206/p6ws/services/UDFCodeService?wsdl",
                "UDFCodeService",
                "UDFCodePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectIssueService_ProjectIssuePort",
                "ProjectIssueService",
                "http://primavera:8206/p6ws/services/ProjectIssueService?wsdl",
                "ProjectIssueService",
                "ProjectIssuePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "EPSFundingService_EPSFundingPort",
                "EPSFundingService",
                "http://primavera:8206/p6ws/services/EPSFundingService?wsdl",
                "EPSFundingService",
                "EPSFundingPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "EPSNoteService_EPSNotePort",
                "EPSNoteService",
                "http://primavera:8206/p6ws/services/EPSNoteService?wsdl",
                "EPSNoteService",
                "EPSNotePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "BaselineTypeService_BaselineTypePort",
                "BaselineTypeService",
                "http://primavera:8206/p6ws/services/BaselineTypeService?wsdl",
                "BaselineTypeService",
                "BaselineTypePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskMatrixThresholdService_RiskMatrixThresholdPort",
                "RiskMatrixThresholdService",
                "http://primavera:8206/p6ws/services/RiskMatrixThresholdService?wsdl",
                "RiskMatrixThresholdService",
                "RiskMatrixThresholdPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskMatrixScoreService_RiskMatrixScorePort",
                "RiskMatrixScoreService",
                "http://primavera:8206/p6ws/services/RiskMatrixScoreService?wsdl",
                "RiskMatrixScoreService",
                "RiskMatrixScorePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "CBSService_CBSPort",
                "CBSService",
                "http://primavera:8206/p6ws/services/CBSService?wsdl",
                "CBSService",
                "CBSPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "WBSCategoryService_WBSCategoryPort",
                "WBSCategoryService",
                "http://primavera:8206/p6ws/services/WBSCategoryService?wsdl",
                "WBSCategoryService",
                "WBSCategoryPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "EPSSpendingPlanService_EPSSpendingPlanPort",
                "EPSSpendingPlanService",
                "http://primavera:8206/p6ws/services/EPSSpendingPlanService?wsdl",
                "EPSSpendingPlanService",
                "EPSSpendingPlanPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityPeriodActualService_ActivityPeriodActualPort",
                "ActivityPeriodActualService",
                "http://primavera:8206/p6ws/services/ActivityPeriodActualService?wsdl",
                "ActivityPeriodActualService",
                "ActivityPeriodActualPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectCodeTypeService_ProjectCodeTypePort",
                "ProjectCodeTypeService",
                "http://primavera:8206/p6ws/services/ProjectCodeTypeService?wsdl",
                "ProjectCodeTypeService",
                "ProjectCodeTypePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceRoleService_ResourceRolePort",
                "ResourceRoleService",
                "http://primavera:8206/p6ws/services/ResourceRoleService?wsdl",
                "ResourceRoleService",
                "ResourceRolePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "DocumentCategoryService_DocumentCategoryPort",
                "DocumentCategoryService",
                "http://primavera:8206/p6ws/services/DocumentCategoryService?wsdl",
                "DocumentCategoryService",
                "DocumentCategoryPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "UDFTypeService_UDFTypePort",
                "UDFTypeService",
                "http://primavera:8206/p6ws/services/UDFTypeService?wsdl",
                "UDFTypeService",
                "UDFTypePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectResourceCategoryService_ProjectResourceCategoryPort",
                "ProjectResourceCategoryService",
                "http://primavera:8206/p6ws/services/ProjectResourceCategoryService?wsdl",
                "ProjectResourceCategoryService",
                "ProjectResourceCategoryPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectSpendingPlanService_ProjectSpendingPlanPort",
                "ProjectSpendingPlanService",
                "http://primavera:8206/p6ws/services/ProjectSpendingPlanService?wsdl",
                "ProjectSpendingPlanService",
                "ProjectSpendingPlanPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceTeamService_ResourceTeamPort",
                "ResourceTeamService",
                "http://primavera:8206/p6ws/services/ResourceTeamService?wsdl",
                "ResourceTeamService",
                "ResourceTeamPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ExportService_ExportPort",
                "ExportService",
                "http://primavera:8206/p6ws/services/ExportService?wsdl",
                "ExportService",
                "ExportPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityExpenseService_ActivityExpensePort",
                "ActivityExpenseService",
                "http://primavera:8206/p6ws/services/ActivityExpenseService?wsdl",
                "ActivityExpenseService",
                "ActivityExpensePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectService_ProjectPort",
                "ProjectService",
                "http://primavera:8206/p6ws/services/ProjectService?wsdl",
                "ProjectService",
                "ProjectPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "FinancialPeriodService_FinancialPeriodPort",
                "FinancialPeriodService",
                "http://primavera:8206/p6ws/services/FinancialPeriodService?wsdl",
                "FinancialPeriodService",
                "FinancialPeriodPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceService_ResourcePort",
                "ResourceService",
                "http://primavera:8206/p6ws/services/ResourceService?wsdl",
                "ResourceService",
                "ResourcePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectThresholdService_ProjectThresholdPort",
                "ProjectThresholdService",
                "http://primavera:8206/p6ws/services/ProjectThresholdService?wsdl",
                "ProjectThresholdService",
                "ProjectThresholdPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskServiceV1_RiskPort",
                "RiskService",
                "http://primavera:8206/p6ws/services/V1/RiskService?wsdl",
                "RiskServiceV1",
                "RiskPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskResponsePlanService_RiskResponsePlanPort",
                "RiskResponsePlanService",
                "http://primavera:8206/p6ws/services/RiskResponsePlanService?wsdl",
                "RiskResponsePlanService",
                "RiskResponsePlanPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "WBSServiceV1_WBSPort",
                "WBSService",
                "http://primavera:8206/p6ws/services/V1/WBSService?wsdl",
                "WBSServiceV1",
                "WBSPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectNoteService_ProjectNotePort",
                "ProjectNoteService",
                "http://primavera:8206/p6ws/services/ProjectNoteService?wsdl",
                "ProjectNoteService",
                "ProjectNotePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "TimesheetDelegateService_TimesheetDelegatePort",
                "TimesheetDelegateService",
                "http://primavera:8206/p6ws/services/TimesheetDelegateService?wsdl",
                "TimesheetDelegateService",
                "TimesheetDelegatePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RoleTeamService_RoleTeamPort",
                "RoleTeamService",
                "http://primavera:8206/p6ws/services/RoleTeamService?wsdl",
                "RoleTeamService",
                "RoleTeamPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RoleLimitService_RoleLimitPort",
                "RoleLimitService",
                "http://primavera:8206/p6ws/services/RoleLimitService?wsdl",
                "RoleLimitService",
                "RoleLimitPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ShiftService_ShiftPort",
                "ShiftService",
                "http://primavera:8206/p6ws/services/ShiftService?wsdl",
                "ShiftService",
                "ShiftPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "DocumentStatusCodeService_DocumentStatusCodePort",
                "DocumentStatusCodeService",
                "http://primavera:8206/p6ws/services/DocumentStatusCodeService?wsdl",
                "DocumentStatusCodeService",
                "DocumentStatusCodePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "UserLicenseService_UserLicensePort",
                "UserLicenseService",
                "http://primavera:8206/p6ws/services/UserLicenseService?wsdl",
                "UserLicenseService",
                "UserLicensePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceRateService_ResourceRatePort",
                "ResourceRateService",
                "http://primavera:8206/p6ws/services/ResourceRateService?wsdl",
                "ResourceRateService",
                "ResourceRatePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "OverheadCodeService_OverheadCodePort",
                "OverheadCodeService",
                "http://primavera:8206/p6ws/services/OverheadCodeService?wsdl",
                "OverheadCodeService",
                "OverheadCodePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskCategoryService_RiskCategoryPort",
                "RiskCategoryService",
                "http://primavera:8206/p6ws/services/RiskCategoryService?wsdl",
                "RiskCategoryService",
                "RiskCategoryPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RoleRateService_RoleRatePort",
                "RoleRateService",
                "http://primavera:8206/p6ws/services/RoleRateService?wsdl",
                "RoleRateService",
                "RoleRatePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "DocumentService_DocumentPort",
                "DocumentService",
                "http://primavera:8206/p6ws/services/DocumentService?wsdl",
                "DocumentService",
                "DocumentPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "AuthenticationService_AuthenticationServiceSOAP12port_http",
                "AuthenticationService",
                "http://primavera:8206/p6ws/services/AuthenticationService?wsdl",
                "AuthenticationService",
                "AuthenticationServiceSOAP12port_http"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectFundingService_ProjectFundingPort",
                "ProjectFundingService",
                "http://primavera:8206/p6ws/services/ProjectFundingService?wsdl",
                "ProjectFundingService",
                "ProjectFundingPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityNoteService_ActivityNotePort",
                "ActivityNoteService",
                "http://primavera:8206/p6ws/services/ActivityNoteService?wsdl",
                "ActivityNoteService",
                "ActivityNotePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityService_ActivityPort",
                "ActivityService",
                "http://primavera:8206/p6ws/services/ActivityService?wsdl",
                "ActivityService",
                "ActivityPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "NotebookTopicService_NotebookTopicPort",
                "NotebookTopicService",
                "http://primavera:8206/p6ws/services/NotebookTopicService?wsdl",
                "NotebookTopicService",
                "NotebookTopicPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "UDFValueService_UDFValuePort",
                "UDFValueService",
                "http://primavera:8206/p6ws/services/UDFValueService?wsdl",
                "UDFValueService",
                "UDFValuePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskResponseActionService_RiskResponseActionPort",
                "RiskResponseActionService",
                "http://primavera:8206/p6ws/services/RiskResponseActionService?wsdl",
                "RiskResponseActionService",
                "RiskResponseActionPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskThresholdServiceV1_RiskThresholdPort",
                "RiskThresholdService",
                "http://primavera:8206/p6ws/services/V1/RiskThresholdService?wsdl",
                "RiskThresholdServiceV1",
                "RiskThresholdPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "TimesheetPeriodService_TimesheetPeriodPort",
                "TimesheetPeriodService",
                "http://primavera:8206/p6ws/services/TimesheetPeriodService?wsdl",
                "TimesheetPeriodService",
                "TimesheetPeriodPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityCommentService_ActivityCommentPort",
                "ActivityCommentService",
                "http://primavera:8206/p6ws/services/ActivityCommentService?wsdl",
                "ActivityCommentService",
                "ActivityCommentPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceCodeTypeService_ResourceCodeTypePort",
                "ResourceCodeTypeService",
                "http://primavera:8206/p6ws/services/ResourceCodeTypeService?wsdl",
                "ResourceCodeTypeService",
                "ResourceCodeTypePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceHourService_ResourceHourPort",
                "ResourceHourService",
                "http://primavera:8206/p6ws/services/ResourceHourService?wsdl",
                "ResourceHourService",
                "ResourceHourPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "CurrencyService_CurrencyPort",
                "CurrencyService",
                "http://primavera:8206/p6ws/services/CurrencyService?wsdl",
                "CurrencyService",
                "CurrencyPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ScheduleOptionsService_ScheduleOptionsPort",
                "ScheduleOptionsService",
                "http://primavera:8206/p6ws/services/ScheduleOptionsService?wsdl",
                "ScheduleOptionsService",
                "ScheduleOptionsPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ScheduleCheckOptionService_ScheduleCheckOptionPort",
                "ScheduleCheckOptionService",
                "http://primavera:8206/p6ws/services/ScheduleCheckOptionService?wsdl",
                "ScheduleCheckOptionService",
                "ScheduleCheckOptionPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceCodeAssignmentService_ResourceCodeAssignmentPort",
                "ResourceCodeAssignmentService",
                "http://primavera:8206/p6ws/services/ResourceCodeAssignmentService?wsdl",
                "ResourceCodeAssignmentService",
                "ResourceCodeAssignmentPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskImpactService_RiskImpactPort",
                "RiskImpactService",
                "http://primavera:8206/p6ws/services/RiskImpactService?wsdl",
                "RiskImpactService",
                "RiskImpactPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskResponseActionImpactService_RiskResponseActionImpactPort",
                "RiskResponseActionImpactService",
                "http://primavera:8206/p6ws/services/RiskResponseActionImpactService?wsdl",
                "RiskResponseActionImpactService",
                "RiskResponseActionImpactPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "BaselineProjectServiceV1_BaselineProjectPort",
                "BaselineProjectService",
                "http://primavera:8206/p6ws/services/V1/BaselineProjectService?wsdl",
                "BaselineProjectServiceV1",
                "BaselineProjectPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceAssignmentService_ResourceAssignmentPort",
                "ResourceAssignmentService",
                "http://primavera:8206/p6ws/services/ResourceAssignmentService?wsdl",
                "ResourceAssignmentService",
                "ResourceAssignmentPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "IssueHistoryService_IssueHistoryPort",
                "IssueHistoryService",
                "http://primavera:8206/p6ws/services/IssueHistoryService?wsdl",
                "IssueHistoryService",
                "IssueHistoryPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "JobServiceService_JobServicePort",
                "JobServiceService",
                "http://primavera:8206/p6ws/services/JobServiceService?wsdl",
                "JobServiceService",
                "JobServicePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "UnitOfMeasureService_UnitOfMeasurePort",
                "UnitOfMeasureService",
                "http://primavera:8206/p6ws/services/UnitOfMeasureService?wsdl",
                "UnitOfMeasureService",
                "UnitOfMeasurePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "JobService_JobPort",
                "JobService",
                "http://primavera:8206/p6ws/services/JobService?wsdl",
                "JobService",
                "JobPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "EPSBudgetChangeLogService_EPSBudgetChangeLogPort",
                "EPSBudgetChangeLogService",
                "http://primavera:8206/p6ws/services/EPSBudgetChangeLogService?wsdl",
                "EPSBudgetChangeLogService",
                "EPSBudgetChangeLogPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RelationshipService_RelationshipPort",
                "RelationshipService",
                "http://primavera:8206/p6ws/services/RelationshipService?wsdl",
                "RelationshipService",
                "RelationshipPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "CostAccountService_CostAccountPort",
                "CostAccountService",
                "http://primavera:8206/p6ws/services/CostAccountService?wsdl",
                "CostAccountService",
                "CostAccountPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "UserInterfaceViewService_UserInterfaceViewPort",
                "UserInterfaceViewService",
                "http://primavera:8206/p6ws/services/UserInterfaceViewService?wsdl",
                "UserInterfaceViewService",
                "UserInterfaceViewPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "UserOBSService_UserOBSPort",
                "UserOBSService",
                "http://primavera:8206/p6ws/services/UserOBSService?wsdl",
                "UserOBSService",
                "UserOBSPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ImportService_ImportPort",
                "ImportService",
                "http://primavera:8206/p6ws/services/ImportService?wsdl",
                "ImportService",
                "ImportPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceLocationService_ResourceLocationPort",
                "ResourceLocationService",
                "http://primavera:8206/p6ws/services/ResourceLocationService?wsdl",
                "ResourceLocationService",
                "ResourceLocationPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ThresholdParameterService_ThresholdParameterPort",
                "ThresholdParameterService",
                "http://primavera:8206/p6ws/services/ThresholdParameterService?wsdl",
                "ThresholdParameterService",
                "ThresholdParameterPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityStepTemplateService_ActivityStepTemplatePort",
                "ActivityStepTemplateService",
                "http://primavera:8206/p6ws/services/ActivityStepTemplateService?wsdl",
                "ActivityStepTemplateService",
                "ActivityStepTemplatePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityCodeAssignmentService_ActivityCodeAssignmentPort",
                "ActivityCodeAssignmentService",
                "http://primavera:8206/p6ws/services/ActivityCodeAssignmentService?wsdl",
                "ActivityCodeAssignmentService",
                "ActivityCodeAssignmentPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectResourceQuantityService_ProjectResourceQuantityPort",
                "ProjectResourceQuantityService",
                "http://primavera:8206/p6ws/services/ProjectResourceQuantityService?wsdl",
                "ProjectResourceQuantityService",
                "ProjectResourceQuantityPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectCodeAssignmentService_ProjectCodeAssignmentPort",
                "ProjectCodeAssignmentService",
                "http://primavera:8206/p6ws/services/ProjectCodeAssignmentService?wsdl",
                "ProjectCodeAssignmentService",
                "ProjectCodeAssignmentPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RoleService_RolePort",
                "RoleService",
                "http://primavera:8206/p6ws/services/RoleService?wsdl",
                "RoleService",
                "RolePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectServiceV1_ProjectPort",
                "ProjectService",
                "http://primavera:8206/p6ws/services/V1/ProjectService?wsdl",
                "ProjectServiceV1",
                "ProjectPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceAssignmentCreateService_ResourceAssignmentCreatePort",
                "ResourceAssignmentCreateService",
                "http://primavera:8206/p6ws/services/ResourceAssignmentCreateService?wsdl",
                "ResourceAssignmentCreateService",
                "ResourceAssignmentCreatePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceCodeService_ResourceCodePort",
                "ResourceCodeService",
                "http://primavera:8206/p6ws/services/ResourceCodeService?wsdl",
                "ResourceCodeService",
                "ResourceCodePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "GlobalPreferencesServiceV1_GlobalPreferencesPort",
                "GlobalPreferencesService",
                "http://primavera:8206/p6ws/services/V1/GlobalPreferencesService?wsdl",
                "GlobalPreferencesServiceV1",
                "GlobalPreferencesPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskCategoryServiceV1_RiskCategoryPort",
                "RiskCategoryService",
                "http://primavera:8206/p6ws/services/V1/RiskCategoryService?wsdl",
                "RiskCategoryServiceV1",
                "RiskCategoryPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityCodeTypeService_ActivityCodeTypePort",
                "ActivityCodeTypeService",
                "http://primavera:8206/p6ws/services/ActivityCodeTypeService?wsdl",
                "ActivityCodeTypeService",
                "ActivityCodeTypePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "TimesheetService_TimesheetPort",
                "TimesheetService",
                "http://primavera:8206/p6ws/services/TimesheetService?wsdl",
                "TimesheetService",
                "TimesheetPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "UserFieldTitleService_UserFieldTitlePort",
                "UserFieldTitleService",
                "http://primavera:8206/p6ws/services/UserFieldTitleService?wsdl",
                "UserFieldTitleService",
                "UserFieldTitlePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceAssignmentPeriodActualService_ResourceAssignmentPeriodActualPort",
                "ResourceAssignmentPeriodActualService",
                "http://primavera:8206/p6ws/services/ResourceAssignmentPeriodActualService?wsdl",
                "ResourceAssignmentPeriodActualService",
                "ResourceAssignmentPeriodActualPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "UserService_UserPort",
                "UserService",
                "http://primavera:8206/p6ws/services/UserService?wsdl",
                "UserService",
                "UserPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ExpenseCategoryService_ExpenseCategoryPort",
                "ExpenseCategoryService",
                "http://primavera:8206/p6ws/services/ExpenseCategoryService?wsdl",
                "ExpenseCategoryService",
                "ExpenseCategoryPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "GlobalProfileService_GlobalProfilePort",
                "GlobalProfileService",
                "http://primavera:8206/p6ws/services/GlobalProfileService?wsdl",
                "GlobalProfileService",
                "GlobalProfilePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectCodeService_ProjectCodePort",
                "ProjectCodeService",
                "http://primavera:8206/p6ws/services/ProjectCodeService?wsdl",
                "ProjectCodeService",
                "ProjectCodePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "CalendarService_CalendarPort",
                "CalendarService",
                "http://primavera:8206/p6ws/services/CalendarService?wsdl",
                "CalendarService",
                "CalendarPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceAssignmentUpdateService_ResourceAssignmentUpdatePort",
                "ResourceAssignmentUpdateService",
                "http://primavera:8206/p6ws/services/ResourceAssignmentUpdateService?wsdl",
                "ResourceAssignmentUpdateService",
                "ResourceAssignmentUpdatePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityStepService_ActivityStepPort",
                "ActivityStepService",
                "http://primavera:8206/p6ws/services/ActivityStepService?wsdl",
                "ActivityStepService",
                "ActivityStepPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "TimesheetAuditService_TimesheetAuditPort",
                "TimesheetAuditService",
                "http://primavera:8206/p6ws/services/TimesheetAuditService?wsdl",
                "TimesheetAuditService",
                "TimesheetAuditPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectProfileService_ProjectProfilePort",
                "ProjectProfileService",
                "http://primavera:8206/p6ws/services/ProjectProfileService?wsdl",
                "ProjectProfileService",
                "ProjectProfilePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "GatewayDeploymentService_GatewayDeploymentPort",
                "GatewayDeploymentService",
                "http://primavera:8206/p6ws/services/GatewayDeploymentService?wsdl",
                "GatewayDeploymentService",
                "GatewayDeploymentPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "FundingSourceService_FundingSourcePort",
                "FundingSourceService",
                "http://primavera:8206/p6ws/services/FundingSourceService?wsdl",
                "FundingSourceService",
                "FundingSourcePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectResourceService_ProjectResourcePort",
                "ProjectResourceService",
                "http://primavera:8206/p6ws/services/ProjectResourceService?wsdl",
                "ProjectResourceService",
                "ProjectResourcePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "LocationService_LocationPort",
                "LocationService",
                "http://primavera:8206/p6ws/services/LocationService?wsdl",
                "LocationService",
                "LocationPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityCodeService_ActivityCodePort",
                "ActivityCodeService",
                "http://primavera:8206/p6ws/services/ActivityCodeService?wsdl",
                "ActivityCodeService",
                "ActivityCodePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ExportServiceV1_ExportPort",
                "ExportService",
                "http://primavera:8206/p6ws/services/V1/ExportService?wsdl",
                "ExportServiceV1",
                "ExportPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityRiskService_ActivityRiskPort",
                "ActivityRiskService",
                "http://primavera:8206/p6ws/services/ActivityRiskService?wsdl",
                "ActivityRiskService",
                "ActivityRiskPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "OBSService_OBSPort",
                "OBSService",
                "http://primavera:8206/p6ws/services/OBSService?wsdl",
                "OBSService",
                "OBSPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "GlobalReplaceService_GlobalReplacePort",
                "GlobalReplaceService",
                "http://primavera:8206/p6ws/services/GlobalReplaceService?wsdl",
                "GlobalReplaceService",
                "GlobalReplacePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskMatrixService_RiskMatrixPort",
                "RiskMatrixService",
                "http://primavera:8206/p6ws/services/RiskMatrixService?wsdl",
                "RiskMatrixService",
                "RiskMatrixPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "EPSService_EPSPort",
                "EPSService",
                "http://primavera:8206/p6ws/services/EPSService?wsdl",
                "EPSService",
                "EPSPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityStepTemplateItemService_ActivityStepTemplateItemPort",
                "ActivityStepTemplateItemService",
                "http://primavera:8206/p6ws/services/ActivityStepTemplateItemService?wsdl",
                "ActivityStepTemplateItemService",
                "ActivityStepTemplateItemPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "JobServiceV1_JobPort",
                "JobService",
                "http://primavera:8206/p6ws/services/V1/JobService?wsdl",
                "JobServiceV1",
                "JobPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "UpdateBaselineOptionService_UpdateBaselineOptionPort",
                "UpdateBaselineOptionService",
                "http://primavera:8206/p6ws/services/UpdateBaselineOptionService?wsdl",
                "UpdateBaselineOptionService",
                "UpdateBaselineOptionPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "CBSDurationSummaryService_CBSDurationSummaryPort",
                "CBSDurationSummaryService",
                "http://primavera:8206/p6ws/services/CBSDurationSummaryService?wsdl",
                "CBSDurationSummaryService",
                "CBSDurationSummaryPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "WBSMilestoneService_WBSMilestonePort",
                "WBSMilestoneService",
                "http://primavera:8206/p6ws/services/WBSMilestoneService?wsdl",
                "WBSMilestoneService",
                "WBSMilestonePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectBudgetChangeLogService_ProjectBudgetChangeLogPort",
                "ProjectBudgetChangeLogService",
                "http://primavera:8206/p6ws/services/ProjectBudgetChangeLogService?wsdl",
                "ProjectBudgetChangeLogService",
                "ProjectBudgetChangeLogPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectDocumentService_ProjectDocumentPort",
                "ProjectDocumentService",
                "http://primavera:8206/p6ws/services/ProjectDocumentService?wsdl",
                "ProjectDocumentService",
                "ProjectDocumentPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "WBSService_WBSPort",
                "WBSService",
                "http://primavera:8206/p6ws/services/WBSService?wsdl",
                "WBSService",
                "WBSPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectDeploymentService_ProjectDeploymentPort",
                "ProjectDeploymentService",
                "http://primavera:8206/p6ws/services/ProjectDeploymentService?wsdl",
                "ProjectDeploymentService",
                "ProjectDeploymentPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ProjectPortfolioService_ProjectPortfolioPort",
                "ProjectPortfolioService",
                "http://primavera:8206/p6ws/services/ProjectPortfolioService?wsdl",
                "ProjectPortfolioService",
                "ProjectPortfolioPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceCurveService_ResourceCurvePort",
                "ResourceCurveService",
                "http://primavera:8206/p6ws/services/ResourceCurveService?wsdl",
                "ResourceCurveService",
                "ResourceCurvePort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ResourceAccessService_ResourceAccessPort",
                "ResourceAccessService",
                "http://primavera:8206/p6ws/services/ResourceAccessService?wsdl",
                "ResourceAccessService",
                "ResourceAccessPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "GlobalPreferencesService_GlobalPreferencesPort",
                "GlobalPreferencesService",
                "http://primavera:8206/p6ws/services/GlobalPreferencesService?wsdl",
                "GlobalPreferencesService",
                "GlobalPreferencesPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskService_RiskPort",
                "RiskService",
                "http://primavera:8206/p6ws/services/RiskService?wsdl",
                "RiskService",
                "RiskPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "RiskThresholdService_RiskThresholdPort",
                "RiskThresholdService",
                "http://primavera:8206/p6ws/services/RiskThresholdService?wsdl",
                "RiskThresholdService",
                "RiskThresholdPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "ActivityOwnerService_ActivityOwnerPort",
                "ActivityOwnerService",
                "http://primavera:8206/p6ws/services/ActivityOwnerService?wsdl",
                "ActivityOwnerService",
                "ActivityOwnerPort"));

        serviceDefinitions.add(new DefaultServiceDefinition(
                "BaselineProjectService_BaselineProjectPort",
                "BaselineProjectService",
                "http://primavera:8206/p6ws/services/BaselineProjectService?wsdl",
                "BaselineProjectService",
                "BaselineProjectPort"));
        return serviceDefinitions;
    }

    @WsdlServiceEndpoint
    public String getServiceEndpoint(ServiceDefinition definition) {
        String result;
        final String id = definition.getId();
        switch(id){
                case "SpreadService_SpreadPort": {
                result = "http://primavera:8206/p6ws/services/SpreadService";
                break;
            }
                case "RiskThresholdLevelService_RiskThresholdLevelPort": {
                result = "http://primavera:8206/p6ws/services/RiskThresholdLevelService";
                break;
            }
                case "UDFCodeService_UDFCodePort": {
                result = "http://primavera:8206/p6ws/services/UDFCodeService";
                break;
            }
                case "ProjectIssueService_ProjectIssuePort": {
                result = "http://primavera:8206/p6ws/services/ProjectIssueService";
                break;
            }
                case "EPSFundingService_EPSFundingPort": {
                result = "http://primavera:8206/p6ws/services/EPSFundingService";
                break;
            }
                case "EPSNoteService_EPSNotePort": {
                result = "http://primavera:8206/p6ws/services/EPSNoteService";
                break;
            }
                case "BaselineTypeService_BaselineTypePort": {
                result = "http://primavera:8206/p6ws/services/BaselineTypeService";
                break;
            }
                case "RiskMatrixThresholdService_RiskMatrixThresholdPort": {
                result = "http://primavera:8206/p6ws/services/RiskMatrixThresholdService";
                break;
            }
                case "RiskMatrixScoreService_RiskMatrixScorePort": {
                result = "http://primavera:8206/p6ws/services/RiskMatrixScoreService";
                break;
            }
                case "CBSService_CBSPort": {
                result = "http://primavera:8206/p6ws/services/CBSService";
                break;
            }
                case "WBSCategoryService_WBSCategoryPort": {
                result = "http://primavera:8206/p6ws/services/WBSCategoryService";
                break;
            }
                case "EPSSpendingPlanService_EPSSpendingPlanPort": {
                result = "http://primavera:8206/p6ws/services/EPSSpendingPlanService";
                break;
            }
                case "ActivityPeriodActualService_ActivityPeriodActualPort": {
                result = "http://primavera:8206/p6ws/services/ActivityPeriodActualService";
                break;
            }
                case "ProjectCodeTypeService_ProjectCodeTypePort": {
                result = "http://primavera:8206/p6ws/services/ProjectCodeTypeService";
                break;
            }
                case "ResourceRoleService_ResourceRolePort": {
                result = "http://primavera:8206/p6ws/services/ResourceRoleService";
                break;
            }
                case "DocumentCategoryService_DocumentCategoryPort": {
                result = "http://primavera:8206/p6ws/services/DocumentCategoryService";
                break;
            }
                case "UDFTypeService_UDFTypePort": {
                result = "http://primavera:8206/p6ws/services/UDFTypeService";
                break;
            }
                case "ProjectResourceCategoryService_ProjectResourceCategoryPort": {
                result = "http://primavera:8206/p6ws/services/ProjectResourceCategoryService";
                break;
            }
                case "ProjectSpendingPlanService_ProjectSpendingPlanPort": {
                result = "http://primavera:8206/p6ws/services/ProjectSpendingPlanService";
                break;
            }
                case "ResourceTeamService_ResourceTeamPort": {
                result = "http://primavera:8206/p6ws/services/ResourceTeamService";
                break;
            }
                case "ExportService_ExportPort": {
                result = "http://primavera:8206/p6ws/services/ExportService";
                break;
            }
                case "ActivityExpenseService_ActivityExpensePort": {
                result = "http://primavera:8206/p6ws/services/ActivityExpenseService";
                break;
            }
                case "ProjectService_ProjectPort": {
                result = "http://primavera:8206/p6ws/services/ProjectService";
                break;
            }
                case "FinancialPeriodService_FinancialPeriodPort": {
                result = "http://primavera:8206/p6ws/services/FinancialPeriodService";
                break;
            }
                case "ResourceService_ResourcePort": {
                result = "http://primavera:8206/p6ws/services/ResourceService";
                break;
            }
                case "ProjectThresholdService_ProjectThresholdPort": {
                result = "http://primavera:8206/p6ws/services/ProjectThresholdService";
                break;
            }
                case "RiskServiceV1_RiskPort": {
                result = "http://primavera:8206/p6ws/services/V1/RiskService";
                break;
            }
                case "RiskResponsePlanService_RiskResponsePlanPort": {
                result = "http://primavera:8206/p6ws/services/RiskResponsePlanService";
                break;
            }
                case "WBSServiceV1_WBSPort": {
                result = "http://primavera:8206/p6ws/services/V1/WBSService";
                break;
            }
                case "ProjectNoteService_ProjectNotePort": {
                result = "http://primavera:8206/p6ws/services/ProjectNoteService";
                break;
            }
                case "TimesheetDelegateService_TimesheetDelegatePort": {
                result = "http://primavera:8206/p6ws/services/TimesheetDelegateService";
                break;
            }
                case "RoleTeamService_RoleTeamPort": {
                result = "http://primavera:8206/p6ws/services/RoleTeamService";
                break;
            }
                case "RoleLimitService_RoleLimitPort": {
                result = "http://primavera:8206/p6ws/services/RoleLimitService";
                break;
            }
                case "ShiftService_ShiftPort": {
                result = "http://primavera:8206/p6ws/services/ShiftService";
                break;
            }
                case "DocumentStatusCodeService_DocumentStatusCodePort": {
                result = "http://primavera:8206/p6ws/services/DocumentStatusCodeService";
                break;
            }
                case "UserLicenseService_UserLicensePort": {
                result = "http://primavera:8206/p6ws/services/UserLicenseService";
                break;
            }
                case "ResourceRateService_ResourceRatePort": {
                result = "http://primavera:8206/p6ws/services/ResourceRateService";
                break;
            }
                case "OverheadCodeService_OverheadCodePort": {
                result = "http://primavera:8206/p6ws/services/OverheadCodeService";
                break;
            }
                case "RiskCategoryService_RiskCategoryPort": {
                result = "http://primavera:8206/p6ws/services/RiskCategoryService";
                break;
            }
                case "RoleRateService_RoleRatePort": {
                result = "http://primavera:8206/p6ws/services/RoleRateService";
                break;
            }
                case "DocumentService_DocumentPort": {
                result = "http://primavera:8206/p6ws/services/DocumentService";
                break;
            }
                case "AuthenticationService_AuthenticationServiceSOAP12port_http": {
                result = "http://primavera:8206/p6ws/services/AuthenticationService";
                break;
            }
                case "ProjectFundingService_ProjectFundingPort": {
                result = "http://primavera:8206/p6ws/services/ProjectFundingService";
                break;
            }
                case "ActivityNoteService_ActivityNotePort": {
                result = "http://primavera:8206/p6ws/services/ActivityNoteService";
                break;
            }
                case "ActivityService_ActivityPort": {
                result = "http://primavera:8206/p6ws/services/ActivityService";
                break;
            }
                case "NotebookTopicService_NotebookTopicPort": {
                result = "http://primavera:8206/p6ws/services/NotebookTopicService";
                break;
            }
                case "UDFValueService_UDFValuePort": {
                result = "http://primavera:8206/p6ws/services/UDFValueService";
                break;
            }
                case "RiskResponseActionService_RiskResponseActionPort": {
                result = "http://primavera:8206/p6ws/services/RiskResponseActionService";
                break;
            }
                case "RiskThresholdServiceV1_RiskThresholdPort": {
                result = "http://primavera:8206/p6ws/services/V1/RiskThresholdService";
                break;
            }
                case "TimesheetPeriodService_TimesheetPeriodPort": {
                result = "http://primavera:8206/p6ws/services/TimesheetPeriodService";
                break;
            }
                case "ActivityCommentService_ActivityCommentPort": {
                result = "http://primavera:8206/p6ws/services/ActivityCommentService";
                break;
            }
                case "ResourceCodeTypeService_ResourceCodeTypePort": {
                result = "http://primavera:8206/p6ws/services/ResourceCodeTypeService";
                break;
            }
                case "ResourceHourService_ResourceHourPort": {
                result = "http://primavera:8206/p6ws/services/ResourceHourService";
                break;
            }
                case "CurrencyService_CurrencyPort": {
                result = "http://primavera:8206/p6ws/services/CurrencyService";
                break;
            }
                case "ScheduleOptionsService_ScheduleOptionsPort": {
                result = "http://primavera:8206/p6ws/services/ScheduleOptionsService";
                break;
            }
                case "ScheduleCheckOptionService_ScheduleCheckOptionPort": {
                result = "http://primavera:8206/p6ws/services/ScheduleCheckOptionService";
                break;
            }
                case "ResourceCodeAssignmentService_ResourceCodeAssignmentPort": {
                result = "http://primavera:8206/p6ws/services/ResourceCodeAssignmentService";
                break;
            }
                case "RiskImpactService_RiskImpactPort": {
                result = "http://primavera:8206/p6ws/services/RiskImpactService";
                break;
            }
                case "RiskResponseActionImpactService_RiskResponseActionImpactPort": {
                result = "http://primavera:8206/p6ws/services/RiskResponseActionImpactService";
                break;
            }
                case "BaselineProjectServiceV1_BaselineProjectPort": {
                result = "http://primavera:8206/p6ws/services/V1/BaselineProjectService";
                break;
            }
                case "ResourceAssignmentService_ResourceAssignmentPort": {
                result = "http://primavera:8206/p6ws/services/ResourceAssignmentService";
                break;
            }
                case "IssueHistoryService_IssueHistoryPort": {
                result = "http://primavera:8206/p6ws/services/IssueHistoryService";
                break;
            }
                case "JobServiceService_JobServicePort": {
                result = "http://primavera:8206/p6ws/services/JobServiceService";
                break;
            }
                case "UnitOfMeasureService_UnitOfMeasurePort": {
                result = "http://primavera:8206/p6ws/services/UnitOfMeasureService";
                break;
            }
                case "JobService_JobPort": {
                result = "http://primavera:8206/p6ws/services/JobService";
                break;
            }
                case "EPSBudgetChangeLogService_EPSBudgetChangeLogPort": {
                result = "http://primavera:8206/p6ws/services/EPSBudgetChangeLogService";
                break;
            }
                case "RelationshipService_RelationshipPort": {
                result = "http://primavera:8206/p6ws/services/RelationshipService";
                break;
            }
                case "CostAccountService_CostAccountPort": {
                result = "http://primavera:8206/p6ws/services/CostAccountService";
                break;
            }
                case "UserInterfaceViewService_UserInterfaceViewPort": {
                result = "http://primavera:8206/p6ws/services/UserInterfaceViewService";
                break;
            }
                case "UserOBSService_UserOBSPort": {
                result = "http://primavera:8206/p6ws/services/UserOBSService";
                break;
            }
                case "ImportService_ImportPort": {
                result = "http://primavera:8206/p6ws/services/ImportService";
                break;
            }
                case "ResourceLocationService_ResourceLocationPort": {
                result = "http://primavera:8206/p6ws/services/ResourceLocationService";
                break;
            }
                case "ThresholdParameterService_ThresholdParameterPort": {
                result = "http://primavera:8206/p6ws/services/ThresholdParameterService";
                break;
            }
                case "ActivityStepTemplateService_ActivityStepTemplatePort": {
                result = "http://primavera:8206/p6ws/services/ActivityStepTemplateService";
                break;
            }
                case "ActivityCodeAssignmentService_ActivityCodeAssignmentPort": {
                result = "http://primavera:8206/p6ws/services/ActivityCodeAssignmentService";
                break;
            }
                case "ProjectResourceQuantityService_ProjectResourceQuantityPort": {
                result = "http://primavera:8206/p6ws/services/ProjectResourceQuantityService";
                break;
            }
                case "ProjectCodeAssignmentService_ProjectCodeAssignmentPort": {
                result = "http://primavera:8206/p6ws/services/ProjectCodeAssignmentService";
                break;
            }
                case "RoleService_RolePort": {
                result = "http://primavera:8206/p6ws/services/RoleService";
                break;
            }
                case "ProjectServiceV1_ProjectPort": {
                result = "http://primavera:8206/p6ws/services/V1/ProjectService";
                break;
            }
                case "ResourceAssignmentCreateService_ResourceAssignmentCreatePort": {
                result = "http://primavera:8206/p6ws/services/ResourceAssignmentCreateService";
                break;
            }
                case "ResourceCodeService_ResourceCodePort": {
                result = "http://primavera:8206/p6ws/services/ResourceCodeService";
                break;
            }
                case "GlobalPreferencesServiceV1_GlobalPreferencesPort": {
                result = "http://primavera:8206/p6ws/services/V1/GlobalPreferencesService";
                break;
            }
                case "RiskCategoryServiceV1_RiskCategoryPort": {
                result = "http://primavera:8206/p6ws/services/V1/RiskCategoryService";
                break;
            }
                case "ActivityCodeTypeService_ActivityCodeTypePort": {
                result = "http://primavera:8206/p6ws/services/ActivityCodeTypeService";
                break;
            }
                case "TimesheetService_TimesheetPort": {
                result = "http://primavera:8206/p6ws/services/TimesheetService";
                break;
            }
                case "UserFieldTitleService_UserFieldTitlePort": {
                result = "http://primavera:8206/p6ws/services/UserFieldTitleService";
                break;
            }
                case "ResourceAssignmentPeriodActualService_ResourceAssignmentPeriodActualPort": {
                result = "http://primavera:8206/p6ws/services/ResourceAssignmentPeriodActualService";
                break;
            }
                case "UserService_UserPort": {
                result = "http://primavera:8206/p6ws/services/UserService";
                break;
            }
                case "ExpenseCategoryService_ExpenseCategoryPort": {
                result = "http://primavera:8206/p6ws/services/ExpenseCategoryService";
                break;
            }
                case "GlobalProfileService_GlobalProfilePort": {
                result = "http://primavera:8206/p6ws/services/GlobalProfileService";
                break;
            }
                case "ProjectCodeService_ProjectCodePort": {
                result = "http://primavera:8206/p6ws/services/ProjectCodeService";
                break;
            }
                case "CalendarService_CalendarPort": {
                result = "http://primavera:8206/p6ws/services/CalendarService";
                break;
            }
                case "ResourceAssignmentUpdateService_ResourceAssignmentUpdatePort": {
                result = "http://primavera:8206/p6ws/services/ResourceAssignmentUpdateService";
                break;
            }
                case "ActivityStepService_ActivityStepPort": {
                result = "http://primavera:8206/p6ws/services/ActivityStepService";
                break;
            }
                case "TimesheetAuditService_TimesheetAuditPort": {
                result = "http://primavera:8206/p6ws/services/TimesheetAuditService";
                break;
            }
                case "ProjectProfileService_ProjectProfilePort": {
                result = "http://primavera:8206/p6ws/services/ProjectProfileService";
                break;
            }
                case "GatewayDeploymentService_GatewayDeploymentPort": {
                result = "http://primavera:8206/p6ws/services/GatewayDeploymentService";
                break;
            }
                case "FundingSourceService_FundingSourcePort": {
                result = "http://primavera:8206/p6ws/services/FundingSourceService";
                break;
            }
                case "ProjectResourceService_ProjectResourcePort": {
                result = "http://primavera:8206/p6ws/services/ProjectResourceService";
                break;
            }
                case "LocationService_LocationPort": {
                result = "http://primavera:8206/p6ws/services/LocationService";
                break;
            }
                case "ActivityCodeService_ActivityCodePort": {
                result = "http://primavera:8206/p6ws/services/ActivityCodeService";
                break;
            }
                case "ExportServiceV1_ExportPort": {
                result = "http://primavera:8206/p6ws/services/V1/ExportService";
                break;
            }
                case "ActivityRiskService_ActivityRiskPort": {
                result = "http://primavera:8206/p6ws/services/ActivityRiskService";
                break;
            }
                case "OBSService_OBSPort": {
                result = "http://primavera:8206/p6ws/services/OBSService";
                break;
            }
                case "GlobalReplaceService_GlobalReplacePort": {
                result = "http://primavera:8206/p6ws/services/GlobalReplaceService";
                break;
            }
                case "RiskMatrixService_RiskMatrixPort": {
                result = "http://primavera:8206/p6ws/services/RiskMatrixService";
                break;
            }
                case "EPSService_EPSPort": {
                result = "http://primavera:8206/p6ws/services/EPSService";
                break;
            }
                case "ActivityStepTemplateItemService_ActivityStepTemplateItemPort": {
                result = "http://primavera:8206/p6ws/services/ActivityStepTemplateItemService";
                break;
            }
                case "JobServiceV1_JobPort": {
                result = "http://primavera:8206/p6ws/services/V1/JobService";
                break;
            }
                case "UpdateBaselineOptionService_UpdateBaselineOptionPort": {
                result = "http://primavera:8206/p6ws/services/UpdateBaselineOptionService";
                break;
            }
                case "CBSDurationSummaryService_CBSDurationSummaryPort": {
                result = "http://primavera:8206/p6ws/services/CBSDurationSummaryService";
                break;
            }
                case "WBSMilestoneService_WBSMilestonePort": {
                result = "http://primavera:8206/p6ws/services/WBSMilestoneService";
                break;
            }
                case "ProjectBudgetChangeLogService_ProjectBudgetChangeLogPort": {
                result = "http://primavera:8206/p6ws/services/ProjectBudgetChangeLogService";
                break;
            }
                case "ProjectDocumentService_ProjectDocumentPort": {
                result = "http://primavera:8206/p6ws/services/ProjectDocumentService";
                break;
            }
                case "WBSService_WBSPort": {
                result = "http://primavera:8206/p6ws/services/WBSService";
                break;
            }
                case "ProjectDeploymentService_ProjectDeploymentPort": {
                result = "http://primavera:8206/p6ws/services/ProjectDeploymentService";
                break;
            }
                case "ProjectPortfolioService_ProjectPortfolioPort": {
                result = "http://primavera:8206/p6ws/services/ProjectPortfolioService";
                break;
            }
                case "ResourceCurveService_ResourceCurvePort": {
                result = "http://primavera:8206/p6ws/services/ResourceCurveService";
                break;
            }
                case "ResourceAccessService_ResourceAccessPort": {
                result = "http://primavera:8206/p6ws/services/ResourceAccessService";
                break;
            }
                case "GlobalPreferencesService_GlobalPreferencesPort": {
                result = "http://primavera:8206/p6ws/services/GlobalPreferencesService";
                break;
            }
                case "RiskService_RiskPort": {
                result = "http://primavera:8206/p6ws/services/RiskService";
                break;
            }
                case "RiskThresholdService_RiskThresholdPort": {
                result = "http://primavera:8206/p6ws/services/RiskThresholdService";
                break;
            }
                case "ActivityOwnerService_ActivityOwnerPort": {
                result = "http://primavera:8206/p6ws/services/ActivityOwnerService";
                break;
            }
                case "BaselineProjectService_BaselineProjectPort": {
                result = "http://primavera:8206/p6ws/services/BaselineProjectService";
                break;
            }
                default: {
                throw new IllegalArgumentException(id + " endpoint could not be resolved.");
            }
        }
        return result;
    }

    @WsdlTransportRetriever
    public WsdlTransport resolveTransport(ServiceDefinition definition){
    	return new HttpRequesterConfigWsdlTransport(getRequesterConfig());
    }
    
    /**
	 * @return the requesterConfig
	 */
	public HttpRequesterConfig getRequesterConfig() {
		return requesterConfig;
	}

	/**
	 * @param requesterConfig the requesterConfig to set
	 */
	public void setRequesterConfig(HttpRequesterConfig requesterConfig) {
		this.requesterConfig = requesterConfig;
	}

	@WsdlSecurity
    public List<WsdlSecurityStrategy> getWsdlSecurityResolver(ServiceDefinition definition) {
        List<WsdlSecurityStrategy> result = new ArrayList<WsdlSecurityStrategy>();
        result.add(new WsdlUsernameToken(getUsername(),  getPassword(), PasswordType.TEXT, true, true));
        return result;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}