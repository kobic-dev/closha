/*******************************************************************************
 * Sandia Analysis Workbench Integration Framework (SAW)
 * Copyright 2019 National Technology & Engineering Solutions of Sandia, LLC (NTESS).
 * Under the terms of Contract DE-NA0003525 with NTESS, the U.S. Government retains
 * certain rights in this software.
 *  
 * This software is distributed under the Eclipse Public License.  For more
 * information see the files copyright.txt and license.txt included with the software.
 ******************************************************************************/
package org.kobic.bioexpress.workbench.editor.tree;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import gov.sandia.dart.workflow.domain.Property;
import gov.sandia.dart.workflow.domain.WFNode;
import org.kobic.bioexpress.workbench.editor.tree.data.FileWFTreeRoot;
import org.kobic.bioexpress.workbench.editor.tree.data.WFTreeRoot;

public class WorkflowFileAdapterFactory implements IAdapterFactory {
	
	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if(adaptableObject instanceof IFile) {
			IFile file = (IFile)adaptableObject;			
			String fileExtension = file.getFileExtension();
			
			if(fileExtension != null && WFTreeRoot.class == adapterType && fileExtension.equals("iwf")) {					
				return new FileWFTreeRoot(file.getLocation(), file);
			}
		}
		
		if(adaptableObject instanceof WFNode) {
			WFNode node = (WFNode) adaptableObject;
			
			if(node.getType().equals("nestedWorkflow")) {
				for(Property prop : node.getProperties()) {
					if(prop.getName().equals("fileName")) {						
						String fileName = prop.getValue();
						
						if(fileName == null || fileName.trim().isEmpty() || !fileName.endsWith("iwf")) {
							return null;
						}

						IPath rootFilePath = null;
						
						Resource resouce = node.eResource();			
						URI rootUri = resouce.getURI();
						if(rootUri.isPlatformResource()) {
							rootFilePath = new Path(rootUri.toPlatformString(true));
						}else if(rootUri.isFile()) {
							rootFilePath = new Path(rootUri.toFileString());						
						}

						if(rootFilePath == null) {
							return null;
						}

						
						IPath filePath = rootFilePath.removeLastSegments(1).append(fileName);
						
						return new FileWFTreeRoot(filePath, node);
						
					}
				}
					
			}
		}
				
		return null;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] {WFTreeRoot.class};
	}
	
	
}
