/*******************************************************************************
 * Copyright (c)  2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.editor;

import org.eclipse.osgi.util.NLS;

/**
 * I18n support.
 * 
 */
public class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.eclipse.amalgam.explorer.activity.ui.api.editor.messages"; //$NON-NLS-1$
  public static String ActivityExplorerEditor_1;
  public static String ActivityExplorerEditor_Error_Message;

  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
    // Private constructor.
  }
  
  public static String ActivityExplorerEditor_IEditingSessionRetrieval_ShouldAlsoImplementISaveablesSource;
  public static String ActivityExplorerEditor_IEditingSessionRetrieval_WrongNumberOfSaveables;
}
