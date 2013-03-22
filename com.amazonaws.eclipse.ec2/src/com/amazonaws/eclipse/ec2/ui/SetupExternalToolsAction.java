/*
 * Copyright 2008-2012 Amazon Technologies, Inc. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
 * OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.amazonaws.eclipse.ec2.ui;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.dialogs.PreferencesUtil;

import com.amazonaws.eclipse.ec2.Ec2Plugin;

/**
 * Action subclass for configuring external tool preferences.
 */
public class SetupExternalToolsAction extends Action {

	/** The id of the preference page to display */
	private static final String EXTERNAL_TOOLS_PREFERENCE_PAGE_ID = 
		"com.amazonaws.eclipse.ec2.preferences.ExternalToolsPreferencePage";
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(
				null, EXTERNAL_TOOLS_PREFERENCE_PAGE_ID, new String[] {EXTERNAL_TOOLS_PREFERENCE_PAGE_ID}, null);
		dialog.open();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#getImageDescriptor()
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		return Ec2Plugin.getDefault().getImageRegistry().getDescriptor("configure");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#getText()
	 */
	@Override
	public String getText() {
		return "Configure your external tools";
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#getToolTipText()
	 */
	@Override
	public String getToolTipText() {
		return "Configure your external tools";
	}			
	
}
