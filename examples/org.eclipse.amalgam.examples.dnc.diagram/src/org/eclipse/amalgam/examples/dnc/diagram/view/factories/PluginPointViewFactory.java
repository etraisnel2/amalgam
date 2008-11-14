package org.eclipse.amalgam.examples.dnc.diagram.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PackageEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointAttributesEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointDescriptionEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointNameEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.edit.parts.PluginPointOperationsEditPart;
import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractShapeViewFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PluginPointViewFactory extends AbstractShapeViewFactory {

	/**
	 * @generated
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createShapeStyle());
		return styles;
	}

	/**
	 * @generated
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = DncVisualIDRegistry
					.getType(PluginPointEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		if (!PackageEditPart.MODEL_ID.equals(DncVisualIDRegistry
				.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put(
					"modelID", PackageEditPart.MODEL_ID); //$NON-NLS-1$
			view.getEAnnotations().add(shortcutAnnotation);
		}
		IAdaptable eObjectAdapter = null;
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			eObjectAdapter = new EObjectAdapter(eObject);
		}
		getViewService().createNode(eObjectAdapter, view,
				DncVisualIDRegistry.getType(PluginPointNameEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
		getViewService().createNode(
				eObjectAdapter,
				view,
				DncVisualIDRegistry
						.getType(PluginPointDescriptionEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
		getViewService().createNode(
				eObjectAdapter,
				view,
				DncVisualIDRegistry
						.getType(PluginPointAttributesEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
		getViewService().createNode(
				eObjectAdapter,
				view,
				DncVisualIDRegistry
						.getType(PluginPointOperationsEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());
	}
}
