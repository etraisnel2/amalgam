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
package org.eclipse.amalgam.explorer.activity.ui.api.editor.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.actions.OpenActivityExplorerAction2;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.HTMLHelper;
import org.eclipse.amalgam.explorer.activity.ui.internal.actions.util.FormTextPageLinkAdapter;
import org.eclipse.jface.action.IMenuListener2;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.ScrolledFormText;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

/**
 * Overview page that behaves as a Activity Explorer. That displays navigable links to
 * other pages.
 * 
 */
public class OverviewActivityExplorerPage extends AbstractActivityExplorerPage {

	private static final String PAGE_ID = "overview"; //$NON-NLS-1$

	private static final String PAGE_TITLE = Messages.OverviewActivityExplorerPage_1;

	class OverviewPageLinkAdapter extends FormTextPageLinkAdapter {

		/**
		 * @param editor_p
		 */
		private OverviewPageLinkAdapter(FormEditor editor_p) {
			super(editor_p);
		}

		/**
		 * @see org.eclipse.amalgam.explorer.activity.ui.api.actions.util.PageLinkAdapter#linkEntered(org.eclipse.ui.forms.events.HyperlinkEvent)
		 */
		@SuppressWarnings("synthetic-access")
		@Override
		public void linkEntered(HyperlinkEvent e_p) {
			super.linkEntered(e_p);
			// Replace the original image with the one used in hover mode.
			updateImage(e_p, __hoverHrefImageMappings);
		}

		/**
		 * @see org.eclipse.amalgam.explorer.activity.ui.api.actions.util.FormTextPageLinkAdapter#linkExited(org.eclipse.ui.forms.events.HyperlinkEvent)
		 */
		@SuppressWarnings("synthetic-access")
		@Override
		public void linkExited(HyperlinkEvent e_p) {
			super.linkExited(e_p);
			// Restore original image.
			updateImage(e_p, __hrefImageMappings);
		}

		private void updateImage(HyperlinkEvent e_p, Map<String, String> imageMappings_p) {
			String pageId = (String) e_p.getHref();
			// Replace image with the one got from specified map.
			String image = imageMappings_p.get(pageId);
			if (null != image) {
				((FormText) e_p.widget).setImage(pageId, ActivityExplorerActivator.getDefault().getImage(image));
			}
		}
	}

	/**
	 * Normal HREF image mappings.
	 */
	private static Map<String, String> __hrefImageMappings = new HashMap<String, String>();

	/**
	 * Hover HREF image mappings.
	 */
	private static Map<String, String> __hoverHrefImageMappings = new HashMap<String, String>();
	
	public OverviewActivityExplorerPage() {
    super(null, PAGE_ID, "");
  }

	/**
	 * Constructor.
	 * 
	 * @param editor_p
	 * @param id_p
	 * @param title_p
	 */
	public OverviewActivityExplorerPage(FormEditor editor_p) {
		super(editor_p, PAGE_ID, PAGE_TITLE);
	}

	@Override
	protected void createFormContent(IManagedForm managedForm_p) {
		super.createFormContent(managedForm_p);

		// Set the header title.
		ScrolledForm form = managedForm_p.getForm();
		form.setText(getHeaderTitle());
		// Install a default layout.
		TableWrapLayout layout = new TableWrapLayout();

		layout.leftMargin = 0;
		layout.rightMargin = 0;
		layout.topMargin = 20;
		layout.bottomMargin = 0;
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		layout.numColumns = 2;

		Composite body = form.getBody();
		body.setLayout(layout);

		// add Session Manager On Fly

		final Form formWidget = managedForm_p.getForm().getForm();

		final Session current = ((ActivityExplorerEditorInput) this.getEditorInput()).getSession();

		// init
		formWidget.getMenuManager().add(new Separator("empty-list")); //$NON-NLS-1$

		// add listener
		formWidget.getMenuManager().addMenuListener(new IMenuListener2() {

			public void menuAboutToShow(IMenuManager manager) {

				manager.removeAll();

				for (Session session : SessionManager.INSTANCE.getSessions()) {
					if (!session.equals(current))
						formWidget.getMenuManager().add(new OpenActivityExplorerAction2(session));
				}

			}

			public void menuAboutToHide(IMenuManager manager) {

			}

		});

		// Create the overview content.

		// Set image HREF.
		// FormText richText = null;

		for (AbstractActivityExplorerPage page : getContributedPages()) {

			createSubForm(managedForm_p, body, page);

		}

		form.reflow(true);
	}

  protected String getHeaderTitle() {
    return Messages.OverviewActivityExplorerPage_2 + ((ActivityExplorerEditorInput)getEditorInput()).getName();
  }

//	public Map<String, Composite> contents = new HashMap<String, Composite>();

	public Composite createSubForm(IManagedForm managedForm_p, Composite body, AbstractActivityExplorerPage page) {

		Composite composite = body;

		FormText richText = null;

		if (page.isVisible()) {
			// image

			String txt = HTMLHelper.imageLinkForm(page);
			if (!(txt == null || txt.isEmpty())) {

				richText = FormHelper.createRichText(managedForm_p.getToolkit(), composite, txt,
						new OverviewPageLinkAdapter(getEditor()));
				richText.setHyperlinkSettings(managedForm_p.getToolkit().getHyperlinkGroup());
				richText.setImage(page.getId(), page.getOverviewImageOff());

				richText.marginHeight = 0;
				richText.marginWidth = 0;
				TableWrapData layoutData = new TableWrapData();
				layoutData.align = TableWrapData.CENTER;
				layoutData.valign = TableWrapData.MIDDLE;
				richText.setLayoutData(layoutData);

				txt = HTMLHelper.overviewDescForm(page);

				// Set Layout data.

			}
			// text

			if (!(txt == null || txt.isEmpty())) {
				ScrolledFormText descriptionForm = new ScrolledFormText(composite, true);

				descriptionForm.setBackground(new Color(PlatformUI.getWorkbench().getDisplay(), 255, 255, 255));

				descriptionForm.setText(txt);

				descriptionForm.setMinWidth(600);
				TableWrapData layoutData2 = new TableWrapData();

				layoutData2.maxHeight = 100;
				layoutData2.maxWidth = 600;
				layoutData2.align = TableWrapData.CENTER;
				layoutData2.valign = TableWrapData.MIDDLE;
				descriptionForm.setLayoutData(layoutData2);

			}

			richText.marginHeight = 0;
			richText.marginWidth = 40;
		}
		return composite;
	}

//	public Composite getSubFormComposite(final String id) {
//		return contents.get(id);
//	}

	@Override
	public boolean isVisible() {
		return true;
	}

	private List<AbstractActivityExplorerPage> getContributedPages() {
		List<AbstractActivityExplorerPage> contributed = new ArrayList<AbstractActivityExplorerPage>();
		for (IFormPage page : ((ActivityExplorerEditor) getEditor()).getPages()) {
			if (page instanceof AbstractActivityExplorerPage) {
				AbstractActivityExplorerPage ap = (AbstractActivityExplorerPage) page;
				if (ap.contributeToOverview()) {
					contributed.add(ap);
					__hrefImageMappings.put(ap.getId(), ap.getOverViewImageOffPath());
					__hoverHrefImageMappings.put(ap.getId(), ap.getOverViewImageOnPath());
				}
			}

		}
		return contributed;
	}
}
