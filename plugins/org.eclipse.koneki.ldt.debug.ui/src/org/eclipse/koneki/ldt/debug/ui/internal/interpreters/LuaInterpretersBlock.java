/*******************************************************************************
 * Copyright (c) 2012 Sierra Wireless and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/
package org.eclipse.koneki.ldt.debug.ui.internal.interpreters;

import org.eclipse.dltk.internal.debug.ui.interpreters.AddScriptInterpreterDialog;
import org.eclipse.dltk.internal.debug.ui.interpreters.InterpretersBlock;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.ScriptRuntime;
import org.eclipse.koneki.ldt.core.LuaNature;

public class LuaInterpretersBlock extends InterpretersBlock {

	@Override
	protected String getCurrentNature() {
		return LuaNature.ID;
	}

	protected AddScriptInterpreterDialog createInterpreterDialog(IInterpreterInstall standin) {
		AddLuaInterpreterDialog dialog = new AddLuaInterpreterDialog(this, getShell(), ScriptRuntime.getInterpreterInstallTypes(getCurrentNature()),
				standin);
		return dialog;
	}
}
