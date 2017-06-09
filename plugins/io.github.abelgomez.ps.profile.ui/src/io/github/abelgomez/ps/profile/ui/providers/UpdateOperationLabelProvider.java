package io.github.abelgomez.ps.profile.ui.providers;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.papyrus.infra.services.labelprovider.service.IFilteredLabelProvider;
import org.eclipse.papyrus.infra.ui.emf.providers.EMFLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.edit.providers.DataTypeItemProvider;
import org.eclipse.uml2.uml.edit.providers.UMLItemProviderAdapterFactory;

import io.github.abelgomez.ps.UpdateOperation;

public class UpdateOperationLabelProvider extends EMFLabelProvider implements IFilteredLabelProvider {

	private static final Image PROPERTY_IMAGE = ExtendedImageRegistry.getInstance().getImage(new DataTypeItemProvider(
			new UMLItemProviderAdapterFactory()).getImage(UMLFactory.eINSTANCE.createProperty()));

	@Override
	public String getText(Object element) {
		UpdateOperation updateOperation = (UpdateOperation) element;
		StringBuilder builder = new StringBuilder();
		builder.append("(operator='");
		builder.append(updateOperation.getOperator().getLiteral());
		builder.append("', value='");
		builder.append(updateOperation.getValue());
		builder.append("')");
		return builder.toString();
	}
	
	@Override
	public boolean accept(Object element) {
		return element instanceof UpdateOperation;
	}
	
	@Override
	public Image getImage(Object element) {
		return PROPERTY_IMAGE;
	}
}