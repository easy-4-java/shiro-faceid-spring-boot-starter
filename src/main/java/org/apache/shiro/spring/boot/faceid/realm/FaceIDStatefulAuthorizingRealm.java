package org.apache.shiro.spring.boot.faceid.realm;

import org.apache.shiro.biz.realm.AbstractAuthorizingRealm;
import org.apache.shiro.spring.boot.faceid.token.FaceIDLoginToken;

/**
 * Kisso Stateful AuthorizingRealm
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class FaceIDStatefulAuthorizingRealm extends AbstractAuthorizingRealm {

	/**
	 * Returns the authentication token class.
	 *
	 * @return the authentication token class
	 */
	@Override
	public Class<?> getAuthenticationTokenClass() {
		return FaceIDLoginToken.class;// 此Realm只支持KissoLoginToken
	}

}
