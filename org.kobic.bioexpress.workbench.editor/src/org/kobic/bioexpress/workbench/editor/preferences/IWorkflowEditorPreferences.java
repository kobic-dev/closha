/*******************************************************************************
 * Sandia Analysis Workbench Integration Framework (SAW)
 * Copyright 2019 National Technology & Engineering Solutions of Sandia, LLC (NTESS).
 * Under the terms of Contract DE-NA0003525 with NTESS, the U.S. Government retains
 * certain rights in this software.
 *  
 * This software is distributed under the Eclipse Public License.  For more
 * information see the files copyright.txt and license.txt included with the software.
 ******************************************************************************/
package org.kobic.bioexpress.workbench.editor.preferences;

public interface IWorkflowEditorPreferences {
	String PREFIX = "org.kobic.bioexpress.workbench.editor.";
	String FONT = PREFIX + "font";
	String NOTES_FONT = PREFIX + "notes_font";
	String PALETTE_FILE_DIR = PREFIX + "palette_file";
	String MANHATTAN_CONNECTIONS = PREFIX + "manhattan_connection";
	String NODE_TYPE_HEADERS = PREFIX + "node_type_headers";
	String PORT_LABELS = PREFIX + "port_labels";
	String SKIP_SINGLETON_PORT_LABELS = PREFIX + "smart_port_labels";
	String REQUIRE_CTRL_FOR_POPUP = PREFIX + "require_ctrl_for_popup";
	String SHOW_MIN_MAX_ICON = PREFIX + "show_min_max_icon";
	String EDITOR_FONT = PREFIX + "editor_font";
	String CONNECTIONS_BEHIND = PREFIX + "connections_behind";
	String TRANSLUCENT_COMPONENTS = PREFIX + "translucent_components";
	String RENDER_NESTED = PREFIX + "render_nested";
	String RENDER_NESTED_INDENTED = PREFIX + "render_nested_indented";
}
