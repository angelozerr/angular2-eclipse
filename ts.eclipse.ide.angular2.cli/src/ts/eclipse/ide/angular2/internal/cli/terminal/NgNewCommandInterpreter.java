/**
 *  Copyright (c) 2015-2016 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 *  
 */
package ts.eclipse.ide.angular2.internal.cli.terminal;

import java.io.File;
import java.util.List;

/**
 * "ng new myproject" interpreter to create an Eclipse project at the end of the
 * process and open the generated angular-cli.json file.
 *
 */
public class NgNewCommandInterpreter extends AbstractProjectCommandInterpreter {

	public NgNewCommandInterpreter(List<String> parameters, String workingDir) {
		super(parameters, workingDir);
	}

	@Override
	protected File getProjectDir(List<String> parameters, String workingDir) {
		if (parameters.size() < 2) {
			return null;
		}
		String projectName = parameters.get(1);
		return new File(workingDir, projectName);
	}
}