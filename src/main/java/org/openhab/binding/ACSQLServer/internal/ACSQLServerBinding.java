/*
 * Copyright (C) 2015 NTT-AT.
 * All Rights Reserved.
 */
package org.openhab.binding.ACSQLServer.internal;

import org.openhab.binding.ACDBCommon.internal.ACDBBinding;


/**
 * <p>
 * SQLServerバインディング処理
 * </p>
 *
 * @author NTT
 * @since 1.8.0
 */
public class ACSQLServerBinding extends ACDBBinding {
	@Override
	protected String getBindingName() {
		return "ACSQLServer";
	}

	@Override
	protected String getDriverClassName() {
		return "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	}
}
