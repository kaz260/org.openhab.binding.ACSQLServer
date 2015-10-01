/*
 * Copyright (C) 2015 NTT-AT.
 * All Rights Reserved.
 */
package org.openhab.binding.ACSQLServer.internal;

import org.openhab.binding.ACDBCommon.internal.ACDBGenericBindingProvider;


/**
 * <p>
 * SQLServerバインディングのプロバイダの実装
 * </p>
 *
 * @author NTT
 * @since 1.8.0
 */
public class ACSQLServerGenericBindingProvider extends ACDBGenericBindingProvider {
	@Override
	public String getBindingType() {
		return "acsqlserver";
	}
}
