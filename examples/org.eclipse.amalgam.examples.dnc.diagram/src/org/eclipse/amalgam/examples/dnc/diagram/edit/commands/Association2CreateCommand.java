package org.eclipse.amalgam.examples.dnc.diagram.edit.commands;

import org.eclipse.amalgam.examples.dnc.Association;
import org.eclipse.amalgam.examples.dnc.DncFactory;
import org.eclipse.amalgam.examples.dnc.diagram.edit.policies.DncBaseItemSemanticEditPolicy;
import org.eclipse.amalgam.examples.dnc.diagram.providers.DncElementTypes;
import org.eclipse.amalgam.examples.oocore.Class;
import org.eclipse.amalgam.examples.oocore.Classifier;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class Association2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	public Association2CreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request);
		this.source = source;
		this.target = target;
		if (request.getContainmentFeature() == null) {
			setContainmentFeature(OocorePackage.eINSTANCE.getClass_Features());
		}

		super.setElementToEdit(source);
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof Class) {
			return false;
		}
		if (target != null && false == target instanceof Classifier) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return DncBaseItemSemanticEditPolicy.LinkConstraints
				.canCreateAssociation_4003(getSource(), getTarget());
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Association newElement = DncFactory.eINSTANCE.createAssociation();
		getSource().getFeatures().add(newElement);
		newElement.setType(getTarget());
		DncElementTypes.init_Association_4003(newElement);
		return newElement;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return OocorePackage.eINSTANCE.getClass_();
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}
		return super.doExecuteWithResult(monitor, info);
	}

	/**
	 * @generated
	 */
	protected ConfigureRequest createConfigureRequest() {
		ConfigureRequest request = super.createConfigureRequest();
		request.setParameter(CreateRelationshipRequest.SOURCE, getSource());
		request.setParameter(CreateRelationshipRequest.TARGET, getTarget());
		return request;
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected Class getSource() {
		return (Class) source;
	}

	/**
	 * @generated
	 */
	protected Classifier getTarget() {
		return (Classifier) target;
	}
}
