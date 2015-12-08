package org.openhab.binding.ACSQLServer.internal;

import org.openhab.binding.ACDBCommon.internal.ACDBGenericBindingProvider;


/**
 * <p>
 * SQLServer binding provider
 * </p>
 *
 * @author Kazuhiro Matsuda
 * @since 1.8.0
 */
public class ACSQLServerGenericBindingProvider extends ACDBGenericBindingProvider {
	@Override
	public String getBindingType() {
		return "acsqlserver";
	}
}
