/*
 * $Id: CaseHome.java,v 1.22 2006/03/01 10:30:58 tryggvil Exp $
 * Created on Jan 6, 2006
 *
 * Copyright (C) 2006 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.block.process.data;

import java.util.Collection;
import javax.ejb.FinderException;
import com.idega.data.IDOException;
import com.idega.data.IDOHome;
import com.idega.user.data.Group;
import com.idega.user.data.User;


/**
 * <p>
 * TODO gimmi Describe Type CaseHome
 * </p>
 *  Last modified: $Date: 2006/03/01 10:30:58 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:gimmi@idega.com">gimmi</a>
 * @version $Revision: 1.22 $
 */
public interface CaseHome extends IDOHome {

	public Case create() throws javax.ejb.CreateException;

	public Case findByPrimaryKey(Object pk) throws javax.ejb.FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesByUser
	 */
	public Collection findAllCasesByUser(User user) throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesByGroup
	 */
	public Collection findAllCasesByGroup(Group group) throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesByUser
	 */
	public Collection findAllCasesByUser(User user, CaseCode caseCode) throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesByUser
	 */
	public Collection findAllCasesByUser(User user, String caseCode) throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesByUser
	 */
	public Collection findAllCasesByUser(User user, CaseCode caseCode, CaseStatus caseStatus) throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesByUser
	 */
	public Collection findAllCasesByUser(User user, String caseCode, String caseStatus) throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindSubCasesUnder
	 */
	public Collection findSubCasesUnder(Case theCase) throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeCountSubCasesUnder
	 */
	public int countSubCasesUnder(Case theCase);

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusCancelled
	 */
	public String getCaseStatusCancelled();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusDeleted
	 */
	public String getCaseStatusDeleted();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusDenied
	 */
	public String getCaseStatusDenied();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusGranted
	 */
	public String getCaseStatusGranted();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusInactive
	 */
	public String getCaseStatusInactive();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusOpen
	 */
	public String getCaseStatusOpen();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusReview
	 */
	public String getCaseStatusReview();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusWaiting
	 */
	public String getCaseStatusWaiting();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusPreliminary
	 */
	public String getCaseStatusPreliminary();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusPending
	 */
	public String getCaseStatusPending();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusContract
	 */
	public String getCaseStatusContract();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusReady
	 */
	public String getCaseStatusReady();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusRedeem
	 */
	public String getCaseStatusRedeem();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusError
	 */
	public String getCaseStatusError();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusMoved
	 */
	public String getCaseStatusMoved();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusPlaced
	 */
	public String getCaseStatusPlaced();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusInProcess
	 */
	public String getCaseStatusInProcess();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusClosed
	 */
	public String getCaseStatusClosed();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusArchived
	 */
	public String getCaseStatusArchived();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCaseStatusLocked
	 */
	public String getCaseStatusLocked();

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesForUserExceptCodes
	 */
	public Collection findAllCasesForUserExceptCodes(User user, CaseCode[] codes, int startingCase, int numberOfCases)
			throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesForUserByStatuses
	 */
	public Collection findAllCasesForUserByStatuses(User user, String[] statuses, int startingCase, int numberOfCases)
			throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCountOfAllCasesForUserByStatuses
	 */
	public int getCountOfAllCasesForUserByStatuses(User user, String[] statuses) throws IDOException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesForGroupsByStatuses
	 */
	public Collection findAllCasesForGroupsByStatuses(Collection groups, String[] statuses, int startingCase,
			int numberOfCases) throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetCountOfAllCasesForGroupsByStatuses
	 */
	public int getCountOfAllCasesForGroupsByStatuses(Collection groups, String[] statuses) throws IDOException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesForGroupsAndUserExceptCodes
	 */
	public Collection findAllCasesForGroupsAndUserExceptCodes(User user, Collection groups, CaseCode[] codes,
			int startingCase, int numberOfCases) throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbFindAllCasesForGroupExceptCodes
	 */
	public Collection findAllCasesForGroupExceptCodes(Group group, CaseCode[] codes) throws FinderException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetNumberOfCasesForUserExceptCodes
	 */
	public int getNumberOfCasesForUserExceptCodes(User user, CaseCode[] codes) throws IDOException;

	/**
	 * @see com.idega.block.process.data.CaseBMPBean#ejbHomeGetNumberOfCasesByGroupsOrUserExceptCodes
	 */
	public int getNumberOfCasesByGroupsOrUserExceptCodes(User user, Collection groups, CaseCode[] codes)
			throws IDOException;


	public Case findCaseByExternalId(String externalId) throws FinderException;
	
	public Case findCaseByUniqueId(String uniqueId) throws FinderException;
}
